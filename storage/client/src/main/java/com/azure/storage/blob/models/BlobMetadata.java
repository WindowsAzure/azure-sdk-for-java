// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Map;

/**
 * The BlobMetadata model.
 */
@JacksonXmlRootElement(localName = "Metadata")
public final class BlobMetadata {
    /*
     * Unmatched properties from the message are deserialized this collection
     */
    @JsonProperty(value = "additionalProperties")
    private Map<String, String> additionalProperties;

    /*
     * The encrypted property.
     */
    @JacksonXmlProperty(localName = "Encrypted", isAttribute = true)
    private String encrypted;

    /**
     * Get the additionalProperties property: Unmatched properties from the
     * message are deserialized this collection.
     *
     * @return the additionalProperties value.
     */
    public Map<String, String> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Unmatched properties from the
     * message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the BlobMetadata object itself.
     */
    public BlobMetadata additionalProperties(Map<String, String> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the encrypted property: The encrypted property.
     *
     * @return the encrypted value.
     */
    public String encrypted() {
        return this.encrypted;
    }

    /**
     * Set the encrypted property: The encrypted property.
     *
     * @param encrypted the encrypted value to set.
     * @return the BlobMetadata object itself.
     */
    public BlobMetadata encrypted(String encrypted) {
        this.encrypted = encrypted;
        return this;
    }
}
