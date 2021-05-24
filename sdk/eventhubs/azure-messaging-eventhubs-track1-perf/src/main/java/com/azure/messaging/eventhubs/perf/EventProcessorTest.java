// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.perf;

import com.microsoft.azure.eventhubs.ConnectionStringBuilder;
import com.microsoft.azure.eventprocessorhost.EventProcessorHost;
import com.microsoft.azure.storage.StorageCredentials;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.StorageUri;
import com.microsoft.azure.storage.blob.BlobOutputStream;
import com.microsoft.azure.storage.blob.CloudBlobClient;
import com.microsoft.azure.storage.blob.CloudBlobContainer;
import com.microsoft.azure.storage.blob.CloudBlockBlob;
import reactor.core.publisher.Mono;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EventProcessorTest extends ServiceTest<EventProcessorOptions> {
    private static final String STORAGE_PREFIX = "perf";
    private static final String HEADERS = String.join("\t", "Id", "Index", "Count",
        "Elapsed Time (ns)", "Elapsed Time (s)", "Rate (ops/sec)");
    private static final String FORMAT_STRING = "%s\t%d\t%d\t%s\t%s\t%.2f";

    private final SampleEventProcessorFactory processorFactory;
    private final ConcurrentHashMap<String, SamplePartitionProcessor> partitionProcessorMap;
    private final Duration testDuration;
    private volatile long startTime;
    private volatile long endTime;

    private String containerName;
    private StorageCredentials storageCredentials;
    private CloudBlobContainer containerReference;

    // Minimum duration is 5 minutes so we can give it time to claim all the partitions.
    private static final int MINIMUM_DURATION = 5 * 60;

    /**
     * Creates an instance of performance test.
     *
     * @param options the options configured for the test.
     */
    public EventProcessorTest(EventProcessorOptions options) {
        super(options);

        partitionProcessorMap = new ConcurrentHashMap<>();
        processorFactory = new SampleEventProcessorFactory(partitionProcessorMap);

        // End the test 2 seconds
        testDuration = Duration.ofSeconds(options.getDuration() - 1);
    }

    @Override
    public Mono<Void> globalSetupAsync() {
        // It is the default duration or less than 300 seconds.
        if (options.getDuration() < 300) {
            return Mono.error(new RuntimeException(
                "Test duration is shorter than 300 seconds. It should be at least " + MINIMUM_DURATION + " seconds"));
        }
        try {
            storageCredentials = StorageCredentials.tryParseCredentials(options.getStorageConnectionString());
            containerName = OffsetDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HHMMss"))
                .replace(":", "-")
                .replace(" ", "");

            final StorageUri storageUri = new StorageUri(URI.create(options.getStorageEndpoint()));
            final CloudBlobClient client = new CloudBlobClient(storageUri, storageCredentials);
            containerReference = client.getContainerReference(containerName);

            if (containerReference.deleteIfExists()) {
                System.out.printf("Deleting %s because it existed before.%n", containerName);
            }

            containerReference.create();
        } catch (InvalidKeyException | StorageException e) {
            return Mono.error(new RuntimeException("Unable to parse credentials or container name.", e));
        } catch (URISyntaxException e) {
            return Mono.error(new RuntimeException("Unable to create container: " + containerName, e));
        }

        return Mono.usingWhen(
            Mono.fromCompletionStage(createEventHubClientAsync()),
            client -> Mono.fromCompletionStage(client.getRuntimeInformation())
                .flatMap(runtimeInformation -> {
                    for (String id : runtimeInformation.getPartitionIds()) {
                        partitionProcessorMap.put(id, new SamplePartitionProcessor());
                    }

                    final List<Mono<Void>> allSends = Arrays.stream(runtimeInformation.getPartitionIds())
                        .map(id -> sendMessages(client, id, getTotalNumberOfEventsPerPartition()))
                        .collect(Collectors.toList());

                    return Mono.when(allSends);
                }),
            client -> Mono.fromCompletionStage(client.close()));
    }

    @Override
    public void run() {
        runAsync().block();
    }

    @Override
    public Mono<Void> runAsync() {
        final Mono<EventProcessorHost> createProcessor = Mono.defer(() -> {
            final ConnectionStringBuilder connectionStringBuilder = getConnectionStringBuilder();
            final EventProcessorHost.EventProcessorHostBuilder.OptionalStep builder =
                EventProcessorHost.EventProcessorHostBuilder.newBuilder(
                    connectionStringBuilder.getEndpoint().toString(), options.getConsumerGroup())
                    .useAzureStorageCheckpointLeaseManager(storageCredentials, containerName, STORAGE_PREFIX)
                    .useEventHubConnectionString(connectionStringBuilder.toString())
                    .setExecutor(getScheduler());

            final EventProcessorHost processor = builder.build();
            return Mono.fromCompletionStage(processor.registerEventProcessorFactory(processorFactory))
                .thenReturn(processor)
                .doFinally(signal -> this.startTime = System.nanoTime());
        });

        final Mono<Long> timeout = Mono.delay(testDuration);
        return Mono.usingWhen(
            createProcessor,
            processor -> Mono.when(timeout),
            processor -> {
                System.out.println("Stopping and cleaning up up processor.");
                this.endTime = System.nanoTime();
                return Mono.fromCompletionStage(processor.unregisterEventProcessor());
            })
            .doFinally(signal -> System.out.println("Finished cleaning up processor resources."));
    }

    @Override
    public Mono<Void> cleanupAsync() {
        System.out.println("Cleaning up.");

        if (options.getOutputFile() != null) {
            try (FileWriter writer = new FileWriter(options.getOutputFile())) {
                outputPartitionResults(content -> {
                    System.out.println(content);
                    write(writer, content);
                });
            } catch (IOException e) {
                System.err.printf("Unable to open file: %s. %s%n", options.getOutputFile(), e);
            }
        } else {
            CloudBlockBlob blob = null;
            try {
                blob = containerReference.getBlockBlobReference("results.txt");
            } catch (URISyntaxException | StorageException e) {
                System.err.println("Could not create block blob reference to write results.txt. " + e);
            }

            if (blob == null) {
                System.out.println(HEADERS);
                outputPartitionResults(System.out::println);
                return super.cleanupAsync();
            }

            try (BlobOutputStream blobOutputStream = blob.openOutputStream();
                 OutputStreamWriter writer = new OutputStreamWriter(blobOutputStream, StandardCharsets.UTF_8)) {

                outputPartitionResults(content -> {
                    System.out.println(content);
                    write(writer, content);
                });

            } catch (StorageException | IOException e) {
                System.err.println("Unable to create or write to blob. Error: " + e);
            }
        }

        System.out.println("Done.");
        return super.cleanupAsync();
    }

    private void write(Writer writer, String contents) {
        try {
            writer.write(contents);
        } catch (IOException e) {
            System.err.printf("Unable to write %s. Error: %s%n", contents, e);
        }
    }

    private void outputPartitionResults(Consumer<String> onOutput) {

        onOutput.accept(HEADERS);

        for (SamplePartitionProcessor processor : partitionProcessorMap.values()) {
            processor.onStop();
            final List<PartitionCounter> counters = processor.getCounters();
            for (int i = 0; i < counters.size(); i++) {
                final PartitionCounter partitionCounter = counters.get(i);
                final String result = getResults(i, partitionCounter);
                onOutput.accept(result);
            }
        }
    }

    private String getResults(int index, PartitionCounter partitionCounter) {
        final double seconds = partitionCounter.elapsedTime() * 0.000000001;
        final double operationsSecond = partitionCounter.totalEvents() / seconds;

        return String.format(FORMAT_STRING, partitionCounter.getPartitionId(), index,
            partitionCounter.totalEvents(), partitionCounter.elapsedTime(), seconds, operationsSecond);
    }
}
