// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.amqp.implementation.TracerProvider;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.tracing.Tracer;
import com.azure.messaging.eventhubs.models.EventHubConsumerOptions;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.messaging.eventhubs.models.EventProcessingErrorContext;
import com.azure.messaging.eventhubs.models.PartitionContext;
import com.azure.messaging.eventhubs.models.PartitionEvent;
import com.azure.messaging.eventhubs.models.PartitionOwnership;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests for {@link PartitionBasedLoadBalancer}.
 */
public class PartitionBasedLoadBalancerTest {

    private final String fqNamespace = "fq-namespace";
    private final String eventHubName = "test-event-hub";
    private final String consumerGroupName = "test-consumer-group";
    private final ClientLogger logger = new ClientLogger(PartitionBasedLoadBalancerTest.class);

    private List<EventData> eventDataList;
    private EventProcessorStore eventProcessorStore;

    @Mock
    private EventHubClientBuilder eventHubClientBuilder;

    @Mock
    private EventHubAsyncClient eventHubAsyncClient;

    @Mock
    private EventHubConsumerAsyncClient eventHubConsumer;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);

        final Date enqueuedTime = Date.from(Instant.now());
        final byte[] contents = "Hello, world".getBytes(StandardCharsets.UTF_8);
        eventDataList = new ArrayList<>();
        IntStream.range(0, 25)
            .forEach(index -> {
                final EventData eventData = TestUtils.getEventData(contents, (long) index, (long) index, enqueuedTime);
                eventDataList.add(eventData);
            });
        when(eventHubClientBuilder.buildAsyncClient()).thenReturn(eventHubAsyncClient);
        this.eventProcessorStore = new InMemoryEventProcessorStore();
    }

    @AfterEach
    public void teardown() {
        // Tear down any inline mocks to avoid memory leaks.
        // https://github.com/mockito/mockito/wiki/What's-new-in-Mockito-2#mockito-2250
        Mockito.framework().clearInlineMocks();
    }

    @Test
    public void testSingleEventProcessor() {
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), any(EventHubConsumerOptions.class))).thenReturn(eventHubConsumer);

        when(eventHubConsumer.receive(any(), any()))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("foo", "bar", "bazz", null, null, null);
                return new PartitionEvent(partitionContext, eventDataList.get(index.intValue()));
            }));

        PartitionBasedLoadBalancer partitionBasedLoadBalancer = createPartitionLoadBalancer("owner1");

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            partitionBasedLoadBalancer.loadBalance();
            List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();

            assertNotNull(partitionOwnership);
            assertEquals(index + 1, partitionOwnership.size());
            partitionOwnership.forEach(po -> assertEquals("owner1", partitionOwnership.get(0).getOwnerId()));
            assertEquals(index + 1, partitionOwnership.stream().map(po -> po.getPartitionId()).distinct().count());
        });
    }

    private void sleep(int secondsToSleep) {
        try {
            TimeUnit.SECONDS.sleep(secondsToSleep);
        } catch (InterruptedException ignored) {

        }
    }

    @Test
    public void testTwoEventProcessors() {
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), any(EventHubConsumerOptions.class))).thenReturn(eventHubConsumer);
        when(eventHubConsumer.receive(anyString(), any(EventPosition.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("foo", "bar", "bazz", null, null, null);
                return new PartitionEvent(partitionContext, eventDataList.get(index.intValue()));
            }));

        PartitionBasedLoadBalancer partitionBasedLoadBalancer1 = createPartitionLoadBalancer("owner1");
        PartitionBasedLoadBalancer partitionBasedLoadBalancer2 = createPartitionLoadBalancer("owner2");

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            partitionBasedLoadBalancer1.loadBalance();
            partitionBasedLoadBalancer2.loadBalance();
            List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();
            assertTrue(partitionOwnership.size() <= 3);
            assertEquals(2, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());
        });

        List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();
        // because owner1 runs first, it will have the chance to claim one additional partition
        assertEquals(2, partitionOwnership.stream().filter(po -> "owner1".equals(po.getOwnerId())).count());
        // after owner1 has 2 partitions and owner2 has 1 partition, owner2 runs again but this time the load
        // is balanced and owner2 should not claim any additional partition
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner2".equals(po.getOwnerId())).count());
    }

    @Test
    public void testPartitionStealing() {
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), any(EventHubConsumerOptions.class))).thenReturn(eventHubConsumer);

        when(eventHubConsumer.receive(anyString(), any(EventPosition.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("foo", "bar", "bazz", null, null, null);
                return new PartitionEvent(partitionContext, eventDataList.get(index.intValue()));
            }));

        PartitionBasedLoadBalancer partitionBasedLoadBalancer1 = createPartitionLoadBalancer("owner1");

        // First event processor claims all partitions
        IntStream.range(0, partitionIds.size()).forEach(index -> {
            partitionBasedLoadBalancer1.loadBalance();
            List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();
            assertEquals(index + 1, partitionOwnership.size());
            partitionOwnership.forEach(po -> assertEquals("owner1", partitionOwnership.get(0).getOwnerId()));
            assertEquals(index + 1,
                partitionOwnership.stream().map(PartitionOwnership::getPartitionId).distinct().count());
        });

        // Now, second event processor comes online and steals a partition as the number of partitions
        // are not evenly distributed
        PartitionBasedLoadBalancer partitionBasedLoadBalancer2 = createPartitionLoadBalancer("owner2");
        partitionBasedLoadBalancer2.loadBalance();
        List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();
        assertEquals(3, partitionOwnership.size());
        assertEquals(2, partitionOwnership.stream().map(PartitionOwnership::getOwnerId).distinct().count());
        assertEquals(2, partitionOwnership.stream().filter(po -> po.getOwnerId().equals("owner1")).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> po.getOwnerId().equals("owner2")).count());
    }

    @Test
    public void testMoreEventProcessorsThanPartitions() {
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), any(EventHubConsumerOptions.class))).thenReturn(eventHubConsumer);

        when(eventHubConsumer.receive(anyString(), any(EventPosition.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("foo", "bar", "bazz", null, null, null);
                return new PartitionEvent(partitionContext, eventDataList.get(index.intValue()));
            }));

        List<PartitionBasedLoadBalancer> loadBalancers = new ArrayList<>();
        IntStream.range(0, 4).forEach(index -> loadBalancers.add(createPartitionLoadBalancer("owner" + index)));

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            loadBalancers.forEach(lb -> lb.loadBalance());
            List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();
            assertTrue(partitionOwnership.size() <= 3);
            assertEquals(3, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());
        });

        List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();

        assertEquals(3, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());

        // each should have 1 partition
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner0".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner1".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner2".equals(po.getOwnerId())).count());
        // owner4 should not be in the list
        assertTrue(partitionOwnership.stream().noneMatch(po -> po.getOwnerId().equals("owner4")));
    }

    @Test
    public void testEventProcessorInactive() {

        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), any(EventHubConsumerOptions.class))).thenReturn(eventHubConsumer);
        when(eventHubConsumer.receive(anyString(), any(EventPosition.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("foo", "bar", "bazz", null, null, null);
                return new PartitionEvent(partitionContext, eventDataList.get(index.intValue()));
            }));

        List<PartitionBasedLoadBalancer> loadBalancers = new ArrayList<>();
        IntStream.range(0, 4).forEach(index -> loadBalancers.add(createPartitionLoadBalancer("owner" + index)));

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            loadBalancers.forEach(lb -> lb.loadBalance());

            List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
                consumerGroupName).collectList().block();
            assertTrue(partitionOwnership.size() <= 3);
            assertEquals(3, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());
        });

        List<PartitionOwnership> partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();

        assertEquals(3, partitionOwnership.stream().map(po -> po.getOwnerId()).distinct().count());

        // each should have 1 partition
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner0".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner1".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner2".equals(po.getOwnerId())).count());
        // owner4 should not be in the list
        assertTrue(partitionOwnership.stream().noneMatch(po -> po.getOwnerId().equals("owner4")));

        sleep(10);
        IntStream.range(0, loadBalancers.size()).forEach(index -> {
            if (index != 1) {
                // run all but 2nd load balancer
                loadBalancers.get(index).loadBalance();
            }
        });

        sleep(10);
        partitionOwnership = eventProcessorStore.listOwnership(fqNamespace, eventHubName,
            consumerGroupName).collectList().block();

        assertEquals(3, partitionOwnership.stream().map(PartitionOwnership::getOwnerId).distinct().count());

        // each should have 1 partition
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner0".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner2".equals(po.getOwnerId())).count());
        assertEquals(1, partitionOwnership.stream().filter(po -> "owner3".equals(po.getOwnerId())).count());
        // owner2 should not be in the list as it was stopped
        assertTrue(partitionOwnership.stream().noneMatch(po -> "owner1".equals(po.getOwnerId())));
    }

    @Test
    public void testReceiveFailure() throws Exception {
        final Tracer tracer1 = mock(Tracer.class);
        final List<Tracer> tracers = Arrays.asList(tracer1);
        TracerProvider tracerProvider = new TracerProvider(tracers);
        PartitionProcessor partitionProcessor = mock(PartitionProcessor.class);

        when(partitionProcessor.processEvent(any(PartitionEvent.class))).thenReturn(Mono.error(new IllegalStateException()));
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), any(EventHubConsumerOptions.class))).thenReturn(eventHubConsumer);
        when(eventHubConsumer.receive(anyString(), any(EventPosition.class))).thenReturn(Flux.error(new IllegalStateException()));

        PartitionPumpManager partitionPumpManager = new PartitionPumpManager(eventProcessorStore,
            () -> partitionProcessor, EventPosition.earliest(),
            eventHubClientBuilder, tracerProvider);
        PartitionBasedLoadBalancer loadBalancer = new PartitionBasedLoadBalancer(eventProcessorStore,
            eventHubAsyncClient, fqNamespace, eventHubName, consumerGroupName, "owner", TimeUnit.SECONDS.toSeconds(5),
            partitionPumpManager);
        loadBalancer.loadBalance();
        sleep(2);
        verify(partitionProcessor, never()).processEvent(any(PartitionEvent.class));
        verify(partitionProcessor, times(1)).processError(any(EventProcessingErrorContext.class));
        verify(eventHubConsumer, times(1)).close();
    }

    @Test
    public void testEventProcessorStoreFailure() throws Exception {
        final Tracer tracer1 = mock(Tracer.class);
        final List<Tracer> tracers = Arrays.asList(tracer1);
        TracerProvider tracerProvider = new TracerProvider(tracers);
        EventProcessorStore eventProcessorStore = mock(EventProcessorStore.class);
        when(eventProcessorStore.listOwnership(any(), any(), any())).thenReturn(Flux.error(new Exception("Listing "
            + "failed")));
        PartitionProcessor partitionProcessor = mock(PartitionProcessor.class);
        when(partitionProcessor.processEvent(any(PartitionEvent.class))).thenReturn(Mono.error(new IllegalStateException()));
        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        PartitionPumpManager partitionPumpManager = new PartitionPumpManager(eventProcessorStore,
            () -> partitionProcessor, EventPosition.earliest(),
            eventHubClientBuilder, tracerProvider);
        PartitionBasedLoadBalancer loadBalancer = new PartitionBasedLoadBalancer(eventProcessorStore,
            eventHubAsyncClient, fqNamespace, eventHubName, consumerGroupName, "owner", TimeUnit.SECONDS.toSeconds(5),
            partitionPumpManager);
        loadBalancer.loadBalance();
        sleep(5);
        verify(eventHubAsyncClient, atLeast(1)).getPartitionIds();
        verify(eventHubAsyncClient, never()).createConsumer(any(), any());
        verify(eventHubConsumer, never()).receive(any());
        verify(partitionProcessor, never()).processEvent(any(PartitionEvent.class));
        verify(partitionProcessor, never()).processError(any(EventProcessingErrorContext.class));
        verify(eventHubConsumer, never()).close();
    }

    @Test
    public void testEventHubClientFailure() {
        final Tracer tracer1 = mock(Tracer.class);
        final List<Tracer> tracers = Collections.singletonList(tracer1);
        TracerProvider tracerProvider = new TracerProvider(tracers);
        PartitionProcessor partitionProcessor = mock(PartitionProcessor.class);
        when(partitionProcessor.processEvent(any(PartitionEvent.class))).thenReturn(Mono.error(new IllegalStateException()));
        List<String> partitionIds = new ArrayList<>();
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        PartitionPumpManager partitionPumpManager = new PartitionPumpManager(eventProcessorStore,
            () -> partitionProcessor, EventPosition.earliest(),
            eventHubClientBuilder, tracerProvider);
        PartitionBasedLoadBalancer loadBalancer = new PartitionBasedLoadBalancer(eventProcessorStore,
            eventHubAsyncClient, fqNamespace, eventHubName, consumerGroupName, "owner", TimeUnit.SECONDS.toSeconds(5),
            partitionPumpManager);
        loadBalancer.loadBalance();
        sleep(2);
        verify(eventHubAsyncClient, atLeast(1)).getPartitionIds();
        verify(eventHubAsyncClient, never()).createConsumer(any(), any());
        verify(eventHubConsumer, never()).receive(any());
        verify(partitionProcessor, never()).processEvent(any(PartitionEvent.class));
        verify(partitionProcessor, never()).processError(any(EventProcessingErrorContext.class));
        verify(eventHubConsumer, never()).close();
    }

    @Test
    public void testEmptyOwnerId() {
        // null owner id
        PartitionOwnership claim1 = new PartitionOwnership()
            .setEventHubName(eventHubName)
            .setConsumerGroupName(consumerGroupName)
            .setPartitionId("1")
            .setETag(UUID.randomUUID().toString())
            .setOwnerLevel(0)
            .setLastModifiedTime(System.currentTimeMillis());
        // owner id is an empty string
        PartitionOwnership claim2 = new PartitionOwnership()
            .setEventHubName(eventHubName)
            .setConsumerGroupName(consumerGroupName)
            .setPartitionId("2")
            .setETag(UUID.randomUUID().toString())
            .setOwnerLevel(0)
            .setLastModifiedTime(System.currentTimeMillis())
            .setOwnerId("");
        eventProcessorStore.claimOwnership(claim1, claim2).subscribe();

        List<String> partitionIds = Arrays.asList("1", "2", "3");
        when(eventHubAsyncClient.getPartitionIds()).thenReturn(Flux.fromIterable(partitionIds));
        when(eventHubAsyncClient.createConsumer(anyString(), any(EventHubConsumerOptions.class))).thenReturn(eventHubConsumer);
        when(eventHubConsumer.receive(anyString(), any(EventPosition.class)))
            .thenReturn(Flux.interval(Duration.ofSeconds(1)).map(index -> {
                final PartitionContext partitionContext = new PartitionContext("foo", "bar", "bazz", null, null, null);
                return new PartitionEvent(partitionContext, eventDataList.get(index.intValue()));
            }));

        String ownerName = "owner1";
        PartitionBasedLoadBalancer partitionBasedLoadBalancer = createPartitionLoadBalancer(ownerName);

        IntStream.range(0, partitionIds.size()).forEach(index -> {
            partitionBasedLoadBalancer.loadBalance();
        });

        final Set<String> allPartitionIds = new HashSet<>(partitionIds);

        // Act & Assert
        StepVerifier.create(eventProcessorStore.listOwnership(fqNamespace, eventHubName, consumerGroupName))
            .assertNext(po -> {
                assertEquals(ownerName, po.getOwnerId());
                assertTrue(allPartitionIds.remove(po.getPartitionId()));
            })
            .assertNext(po -> {
                assertEquals(ownerName, po.getOwnerId());
                assertTrue(allPartitionIds.remove(po.getPartitionId()));
            })
            .assertNext(po -> {
                assertEquals(ownerName, po.getOwnerId());
                assertTrue(allPartitionIds.remove(po.getPartitionId()));
            })
            .expectComplete()
            .verify(Duration.ofSeconds(10));

        assertTrue(allPartitionIds.isEmpty(), "Expected it to claim all partitions.");
    }

    private PartitionBasedLoadBalancer createPartitionLoadBalancer(String owner) {
        final Tracer tracer1 = mock(Tracer.class);
        final List<Tracer> tracers = Collections.singletonList(tracer1);
        TracerProvider tracerProvider = new TracerProvider(tracers);
        PartitionPumpManager partitionPumpManager = new PartitionPumpManager(eventProcessorStore,
            () -> new PartitionProcessor() {
                @Override
                public Mono<Void> processEvent(PartitionEvent partitionEvent) {
                    logger.info(
                        "Processing event: Event Hub name = {}; consumer group name = {}; partition id = {}; sequence number = {}",
                        partitionEvent.getPartitionContext().getEventHubName(), partitionEvent.getPartitionContext().getConsumerGroup(),
                        partitionEvent.getPartitionContext().getPartitionId(),
                        partitionEvent.getData().getSequenceNumber());
                    return partitionEvent.getPartitionContext().updateCheckpoint(partitionEvent.getData());
                }
            }, EventPosition.earliest(), eventHubClientBuilder, tracerProvider);
        return new PartitionBasedLoadBalancer(eventProcessorStore, eventHubAsyncClient, fqNamespace,
            eventHubName, consumerGroupName, owner, TimeUnit.SECONDS.toSeconds(5), partitionPumpManager);
    }
}
