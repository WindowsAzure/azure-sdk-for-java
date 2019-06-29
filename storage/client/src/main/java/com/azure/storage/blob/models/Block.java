// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Represents a single block in a block blob.  It describes the block's ID and
 * size.
 */
@JacksonXmlRootElement(localName = "Block")
public final class Block {
    /*
     * The base64 encoded block ID.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The block size in bytes.
     */
    @JsonProperty(value = "Size", required = true)
    private int size;

    /**
     * Get the name property: The base64 encoded block ID.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The base64 encoded block ID.
     *
     * @param name the name value to set.
     * @return the Block object itself.
     */
    public Block name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the size property: The block size in bytes.
     *
     * @return the size value.
     */
    public int size() {
        return this.size;
    }

    /**
     * Set the size property: The block size in bytes.
     *
     * @param size the size value to set.
     * @return the Block object itself.
     */
    public Block size(int size) {
        this.size = size;
        return this;
    }
}
