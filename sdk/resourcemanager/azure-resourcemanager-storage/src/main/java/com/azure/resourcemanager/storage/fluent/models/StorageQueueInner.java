// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The StorageQueue model. */
@JsonFlatten
@Fluent
public class StorageQueueInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageQueueInner.class);

    /*
     * A name-value pair that represents queue metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

    /*
     * Integer indicating an approximate number of messages in the queue. This
     * number is not lower than the actual number of messages in the queue, but
     * could be higher.
     */
    @JsonProperty(value = "properties.approximateMessageCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer approximateMessageCount;

    /**
     * Get the metadata property: A name-value pair that represents queue metadata.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A name-value pair that represents queue metadata.
     *
     * @param metadata the metadata value to set.
     * @return the StorageQueueInner object itself.
     */
    public StorageQueueInner withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the approximateMessageCount property: Integer indicating an approximate number of messages in the queue. This
     * number is not lower than the actual number of messages in the queue, but could be higher.
     *
     * @return the approximateMessageCount value.
     */
    public Integer approximateMessageCount() {
        return this.approximateMessageCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
