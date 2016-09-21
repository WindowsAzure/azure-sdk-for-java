/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.keyvault.KeyIdentifier;
import com.microsoft.azure.keyvault.webkey.JsonWebKey;
import com.microsoft.azure.serializer.AzureJacksonMapperAdapter;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A KeyBundle consisting of a WebKey plus its Attributes.
 */
public class KeyBundle {
    /**
     * The Json web key.
     */
    private JsonWebKey key;

    /**
     * The key management attributes.
     */
    private KeyAttributes attributes;

    /**
     * Application-specific metadata in the form of key-value pairs.
     */
    private Map<String, String> tags;

    /**
     * True if the key's lifetime is managed by key vault i.e. if this is a
     * key backing a certificate, then managed will be true.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Boolean managed;

    /**
     * Get the key value.
     *
     * @return the key value
     */
    public JsonWebKey key() {
        return this.key;
    }

    /**
     * Set the key value.
     *
     * @param key the key value to set
     * @return the KeyBundle object itself.
     */
    public KeyBundle withKey(JsonWebKey key) {
        this.key = key;
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
     * @return the KeyBundle object itself.
     */
    public KeyBundle withAttributes(KeyAttributes attributes) {
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
     * @return the KeyBundle object itself.
     */
    public KeyBundle withTags(Map<String, String> tags) {
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

    /**
     * The key identifier.
     * @return identifier for the key
     */
    public KeyIdentifier keyIdentifier() {
        if (key() == null || key().kid() == null || key().kid().length() == 0) {
            return null;
        }
        return new KeyIdentifier(key().kid());
    }

    @Override
    public String toString() {
        AzureJacksonMapperAdapter mapperAdapter = new AzureJacksonMapperAdapter();
        ObjectMapper mapper = mapperAdapter.getObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonGenerationException e) {
            throw new IllegalStateException(e);
        } catch (JsonMappingException e) {
            throw new IllegalStateException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
