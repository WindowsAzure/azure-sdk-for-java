// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AppConfigurationKeyValueModifiedEventData model. */
@Fluent
public final class AppConfigurationKeyValueModifiedEventData {
    /*
     * The key used to identify the key-value that was modified.
     */
    @JsonProperty(value = "key")
    private String key;

    /*
     * The label, if any, used to identify the key-value that was modified.
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * The etag representing the new state of the key-value.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the key property: The key used to identify the key-value that was modified.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key used to identify the key-value that was modified.
     *
     * @param key the key value to set.
     * @return the AppConfigurationKeyValueModifiedEventData object itself.
     */
    public AppConfigurationKeyValueModifiedEventData setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the label property: The label, if any, used to identify the key-value that was modified.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: The label, if any, used to identify the key-value that was modified.
     *
     * @param label the label value to set.
     * @return the AppConfigurationKeyValueModifiedEventData object itself.
     */
    public AppConfigurationKeyValueModifiedEventData setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the etag property: The etag representing the new state of the key-value.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag representing the new state of the key-value.
     *
     * @param etag the etag value to set.
     * @return the AppConfigurationKeyValueModifiedEventData object itself.
     */
    public AppConfigurationKeyValueModifiedEventData setEtag(String etag) {
        this.etag = etag;
        return this;
    }
}
