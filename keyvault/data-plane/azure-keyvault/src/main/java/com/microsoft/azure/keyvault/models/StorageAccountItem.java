// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage account item containing storage account metadata.
 */
public class StorageAccountItem {
    /**
     * Storage identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Storage account resource Id.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /**
     * The storage account management attributes.
     */
    @JsonProperty(value = "attributes", access = JsonProperty.Access.WRITE_ONLY)
    private StorageAccountAttributes attributes;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the attributes value.
     *
     * @return the attributes value
     */
    public StorageAccountAttributes attributes() {
        return this.attributes;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

}
