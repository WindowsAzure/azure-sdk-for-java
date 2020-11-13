/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DatadogApiKeyInner model.
 */
public class DatadogApiKeyInner {
    /**
     * The user that created the API key.
     */
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /**
     * The name of the API key.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The value of the API key.
     */
    @JsonProperty(value = "key", required = true)
    private String key;

    /**
     * The time of creation of the API key.
     */
    @JsonProperty(value = "created")
    private String created;

    /**
     * Get the user that created the API key.
     *
     * @return the createdBy value
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set the user that created the API key.
     *
     * @param createdBy the createdBy value to set
     * @return the DatadogApiKeyInner object itself.
     */
    public DatadogApiKeyInner withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the name of the API key.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the API key.
     *
     * @param name the name value to set
     * @return the DatadogApiKeyInner object itself.
     */
    public DatadogApiKeyInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value of the API key.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the value of the API key.
     *
     * @param key the key value to set
     * @return the DatadogApiKeyInner object itself.
     */
    public DatadogApiKeyInner withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the time of creation of the API key.
     *
     * @return the created value
     */
    public String created() {
        return this.created;
    }

    /**
     * Set the time of creation of the API key.
     *
     * @param created the created value to set
     * @return the DatadogApiKeyInner object itself.
     */
    public DatadogApiKeyInner withCreated(String created) {
        this.created = created;
        return this;
    }

}
