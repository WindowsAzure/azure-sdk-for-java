// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.messaging.eventhubs;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Sample demonstrates how to sent events to Event Hubs, allowing the service to load-balance the events between all
 * partitions.
 */
public class PublishEventsWithCustomMetadata {
    private static final Duration OPERATION_TIMEOUT = Duration.ofSeconds(30);

    /**
     * Main method to invoke this demo about how to send a custom event list to an Azure Event Hub instance.
     *
     * @param args Unused arguments to the program.
     */
    public static void main(String[] args) {
        // The connection string value can be obtained by:
        // 1. Going to your Event Hubs namespace in Azure Portal.
        // 2. Creating an Event Hub instance.
        // 3. Creating a "Shared access policy" for your Event Hub instance.
        // 4. Copying the connection string from the policy's properties.
        String connectionString = "Endpoint={endpoint};SharedAccessKeyName={sharedAccessKeyName};SharedAccessKey={sharedAccessKey};EntityPath={eventHubName}";

        // Create a producer.
        EventHubProducerAsyncClient producer = new EventHubClientBuilder()
            .connectionString(connectionString)
            .buildAsyncProducerClient();

        // Because an event consists mainly of an opaque set of bytes, it may be difficult for consumers of those events
        // to make informed decisions about how to process them.
        //
        // In order to allow event publishers to offer better context for consumers, event data may also contain custom
        // metadata, in the form of a set of key/value pairs. This metadata is not used by, or in any way meaningful to,
        // the Event Hubs service; it exists only for coordination between event publishers and consumers.
        //
        // One common scenario for the inclusion of metadata is to provide a hint about the type of data contained by an
        // event, so that consumers understand its format and can deserialize it appropriately.
        EventData firstEvent = new EventData("EventData Sample 1".getBytes(UTF_8));
        firstEvent.getProperties().put("EventType", "com.microsoft.samples.hello-event");
        firstEvent.getProperties().put("priority", 1);
        firstEvent.getProperties().put("score", 9.0);

        EventData secondEvent = new EventData("EventData Sample 2".getBytes(UTF_8));
        secondEvent.getProperties().put("EventType", "com.microsoft.samples.goodbye-event");
        secondEvent.getProperties().put("priority", "17");
        secondEvent.getProperties().put("blob", 10);

        final Flux<EventData> data = Flux.just(firstEvent, secondEvent);

        final AtomicReference<EventDataBatch> currentBatch = new AtomicReference<>(
            producer.createBatch().block());

        // We try to add as many events as a batch can fit based on the event size and send to Event Hub when
        // the batch can hold no more events. Create a new batch for next set of events and repeat until all events
        // are sent.
        final Mono<Void> sendOperation = data.flatMap(event -> {
            final EventDataBatch batch = currentBatch.get();
            if (batch.tryAdd(event)) {
                return Mono.empty();
            }

            // The batch is full, so we create a new batch and send the batch. Mono.when completes when both operations
            // have completed.
            return Mono.when(
                producer.send(batch),
                producer.createBatch().map(newBatch -> {
                    currentBatch.set(newBatch);

                    // Add that event that we couldn't before.
                    newBatch.tryAdd(event);
                    return newBatch;
                }));
        }).then()
            .doFinally(signal -> {
                final EventDataBatch batch = currentBatch.getAndSet(null);
                if (batch != null) {
                    producer.send(batch).block(OPERATION_TIMEOUT);
                }
            });

        // The sendOperation creation and assignment is not a blocking call. It does not get invoked until there is a
        // subscriber to that operation. For the purpose of this example, we block so the program does not end before
        // the send operation is complete. Any of the `.subscribe` overloads also work to start the Mono asynchronously.
        try {
            sendOperation.block(OPERATION_TIMEOUT);
        } finally {
            // Disposing of our producer.
            producer.close();
        }
    }
}
