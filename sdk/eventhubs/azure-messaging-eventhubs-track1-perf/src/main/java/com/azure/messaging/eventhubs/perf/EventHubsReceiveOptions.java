// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs.perf;

import com.beust.jcommander.Parameter;
import com.microsoft.azure.eventhubs.EventHubClient;

public class EventHubsReceiveOptions extends EventHubsOptions {
    @Parameter(names = {"-cg", "--consumerGroup"}, description = "Name of the consumer group.")
    private String consumerGroup;

    public EventHubsReceiveOptions() {
        super();
        this.consumerGroup = EventHubClient.DEFAULT_CONSUMER_GROUP_NAME;
    }

    /**
     * Gets the consumer group for receiving messages.
     *
     * @return The consumer group for receiving messages.
     */
    public String getConsumerGroup() {
        return consumerGroup;
    }
}
