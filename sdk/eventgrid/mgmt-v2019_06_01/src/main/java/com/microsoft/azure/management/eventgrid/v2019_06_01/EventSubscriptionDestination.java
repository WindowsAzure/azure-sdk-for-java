/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Information about the destination for an event subscription.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType", defaultImpl = EventSubscriptionDestination.class)
@JsonTypeName("EventSubscriptionDestination")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "WebHook", value = WebHookEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "EventHub", value = EventHubEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "StorageQueue", value = StorageQueueEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "HybridConnection", value = HybridConnectionEventSubscriptionDestination.class),
    @JsonSubTypes.Type(name = "ServiceBusQueue", value = ServiceBusQueueEventSubscriptionDestination.class)
})
public class EventSubscriptionDestination {
}
