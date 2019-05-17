/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information about the HybridConnection destination for an event
 * subscription.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("HybridConnection")
@JsonFlatten
public class HybridConnectionEventSubscriptionDestination extends EventSubscriptionDestination {
    /**
     * The Azure Resource ID of an hybrid connection that is the destination of
     * an event subscription.
     */
    @JsonProperty(value = "properties.resourceId")
    private String resourceId;

    /**
     * Get the Azure Resource ID of an hybrid connection that is the destination of an event subscription.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the Azure Resource ID of an hybrid connection that is the destination of an event subscription.
     *
     * @param resourceId the resourceId value to set
     * @return the HybridConnectionEventSubscriptionDestination object itself.
     */
    public HybridConnectionEventSubscriptionDestination withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
