// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

/**
 * Code snippets for {@link EventProcessorBuilder}.
 */
public class EventProcessorBuilderJavaDocCodeSamples {

    /**
     * Code snippet for showing how to create a new instance of {@link EventProcessor}.
     *
     * @return A new instance of {@link EventProcessor}
     */
    // BEGIN: com.azure.messaging.eventhubs.eventprocessorbuilder.instantiation
    public EventProcessor createEventProcessor() {
        String connectionString = "Endpoint={endpoint};SharedAccessKeyName={sharedAccessKeyName};"
            + "SharedAccessKey={sharedAccessKey};EntityPath={eventHubName}";

        EventProcessor eventProcessor = new EventProcessorBuilder()
            .consumerGroup("consumer-group")
            .eventProcessorStore(new InMemoryEventProcessorStore())
            .processEvent(partitionEvent -> {
                System.out.println("Partition id = " + partitionEvent.getPartitionContext().getPartitionId() + " and "
                    + "sequence number of event = " + partitionEvent.getData().getSequenceNumber());
            })
            .processError(errorContext -> {
                System.out.printf("Error occurred in partition processor for partition {}, {}",
                    errorContext.getPartitionContext().getPartitionId(),
                    errorContext.getThrowable());
            })
            .connectionString(connectionString)
            .buildEventProcessor();
        return eventProcessor;
    }
    // END: com.azure.messaging.eventhubs.eventprocessorbuilder.instantiation

}
