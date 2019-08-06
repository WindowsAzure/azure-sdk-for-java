/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_10_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for SignalR service update operation.
 */
public class SignalRUpdateParameters {
    /**
     * A list of key value pairs that describe the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The billing information of the resource.(e.g. basic vs. standard).
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /**
     * Settings used to provision or configure the resource.
     */
    @JsonProperty(value = "properties")
    private SignalRCreateOrUpdateProperties properties;

    /**
     * Get a list of key value pairs that describe the resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set a list of key value pairs that describe the resource.
     *
     * @param tags the tags value to set
     * @return the SignalRUpdateParameters object itself.
     */
    public SignalRUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the billing information of the resource.(e.g. basic vs. standard).
     *
     * @return the sku value
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the billing information of the resource.(e.g. basic vs. standard).
     *
     * @param sku the sku value to set
     * @return the SignalRUpdateParameters object itself.
     */
    public SignalRUpdateParameters withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get settings used to provision or configure the resource.
     *
     * @return the properties value
     */
    public SignalRCreateOrUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set settings used to provision or configure the resource.
     *
     * @param properties the properties value to set
     * @return the SignalRUpdateParameters object itself.
     */
    public SignalRUpdateParameters withProperties(SignalRCreateOrUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

}
