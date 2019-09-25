// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Map;

/**
 * An Azure Storage Queue.
 */
@JacksonXmlRootElement(localName = "Queue")
@Fluent
public final class QueueItem {
    /*
     * The name of the Queue.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The metadata property.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get the name property: The name of the Queue.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Queue.
     *
     * @param name the name value to set.
     * @return the QueueItem object itself.
     */
    public QueueItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the QueueItem object itself.
     */
    public QueueItem setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
