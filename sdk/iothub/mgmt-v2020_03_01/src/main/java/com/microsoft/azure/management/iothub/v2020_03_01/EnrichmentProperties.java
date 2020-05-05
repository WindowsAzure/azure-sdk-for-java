/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an enrichment that your IoT hub applies to messages
 * delivered to endpoints.
 */
public class EnrichmentProperties {
    /**
     * The key or name for the enrichment property.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /**
     * The value for the enrichment property.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * The list of endpoints for which the enrichment is applied to the
     * message.
     */
    @JsonProperty(value = "endpointNames", required = true)
    private List<String> endpointNames;

    /**
     * Get the key or name for the enrichment property.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key or name for the enrichment property.
     *
     * @param key the key value to set
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value for the enrichment property.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value for the enrichment property.
     *
     * @param value the value value to set
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the list of endpoints for which the enrichment is applied to the message.
     *
     * @return the endpointNames value
     */
    public List<String> endpointNames() {
        return this.endpointNames;
    }

    /**
     * Set the list of endpoints for which the enrichment is applied to the message.
     *
     * @param endpointNames the endpointNames value to set
     * @return the EnrichmentProperties object itself.
     */
    public EnrichmentProperties withEndpointNames(List<String> endpointNames) {
        this.endpointNames = endpointNames;
        return this;
    }

}
