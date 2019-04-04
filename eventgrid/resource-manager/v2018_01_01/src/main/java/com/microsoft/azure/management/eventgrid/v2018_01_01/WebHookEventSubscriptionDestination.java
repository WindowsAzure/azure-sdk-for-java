/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Information about the webhook destination for an event subscription.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("WebHook")
@JsonFlatten
public class WebHookEventSubscriptionDestination extends EventSubscriptionDestination {
    /**
     * The URL that represents the endpoint of the destination of an event
     * subscription.
     */
    @JsonProperty(value = "properties.endpointUrl")
    private String endpointUrl;

    /**
     * The base URL that represents the endpoint of the destination of an event
     * subscription.
     */
    @JsonProperty(value = "properties.endpointBaseUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String endpointBaseUrl;

    /**
     * Get the URL that represents the endpoint of the destination of an event subscription.
     *
     * @return the endpointUrl value
     */
    public String endpointUrl() {
        return this.endpointUrl;
    }

    /**
     * Set the URL that represents the endpoint of the destination of an event subscription.
     *
     * @param endpointUrl the endpointUrl value to set
     * @return the WebHookEventSubscriptionDestination object itself.
     */
    public WebHookEventSubscriptionDestination withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * Get the base URL that represents the endpoint of the destination of an event subscription.
     *
     * @return the endpointBaseUrl value
     */
    public String endpointBaseUrl() {
        return this.endpointBaseUrl;
    }

}
