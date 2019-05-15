/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for an
 * Microsoft.AppConfiguration.KeyValueModified event.
 */
public class AppConfigurationKeyValueModifiedEventData {
    /**
     * The key used to identify the key-value that was modified.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * The label, if any, used to identify the key-value that was modified.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * The etag representing the new state of the key-value.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the key used to identify the key-value that was modified.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key used to identify the key-value that was modified.
     *
     * @param key the key value to set
     * @return the AppConfigurationKeyValueModifiedEventData object itself.
     */
    public AppConfigurationKeyValueModifiedEventData withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the label, if any, used to identify the key-value that was modified.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label, if any, used to identify the key-value that was modified.
     *
     * @param label the label value to set
     * @return the AppConfigurationKeyValueModifiedEventData object itself.
     */
    public AppConfigurationKeyValueModifiedEventData withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the etag representing the new state of the key-value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag representing the new state of the key-value.
     *
     * @param etag the etag value to set
     * @return the AppConfigurationKeyValueModifiedEventData object itself.
     */
    public AppConfigurationKeyValueModifiedEventData withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
