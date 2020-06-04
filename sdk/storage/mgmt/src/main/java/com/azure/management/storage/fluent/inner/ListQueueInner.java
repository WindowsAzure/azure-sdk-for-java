// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The ListQueue model. */
@JsonFlatten
@Fluent
public class ListQueueInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListQueueInner.class);

    /*
     * A name-value pair that represents queue metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Map<String, String> metadata;

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
     * @return the ListQueueInner object itself.
     */
    public ListQueueInner withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
