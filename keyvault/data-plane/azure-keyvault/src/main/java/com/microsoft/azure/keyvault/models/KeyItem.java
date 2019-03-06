// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key item containing key metadata.
 */
public class KeyItem {
    /**
     * Key identifier.
     */
    @JsonProperty(value = "kid")
    private String kid;

    /**
     * The key management attributes.
     */
    @JsonProperty(value = "attributes")
    private KeyAttributes attributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * True if the key's lifetime is managed by key vault. If this is a key
     * backing a certificate, then managed will be true.
     */
    @JsonProperty(value = "managed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean managed;

    /**
     * Get the kid value.
     *
     * @return the kid value
     */
    public String kid() {
        return this.kid;
    }

    /**
     * Set the kid value.
     *
     * @param kid the kid value to set
     * @return the KeyItem object itself.
     */
    public KeyItem withKid(String kid) {
        this.kid = kid;
        return this;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public KeyAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes value.
     *
     * @param attributes the attributes value to set
     * @return the KeyItem object itself.
     */
    public KeyItem withAttributes(KeyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the KeyItem object itself.
     */
    public KeyItem withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the managed value.
     *
     * @return the managed value
     */
    public Boolean managed() {
        return this.managed;
    }

}
