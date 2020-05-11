// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The StorageAccountProperties model. */
@Fluent
public final class StorageAccountProperties {
    /*
     * The resource ID of the storage account.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the id property: The resource ID of the storage account.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource ID of the storage account.
     *
     * @param id the id value to set.
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withId(String id) {
        this.id = id;
        return this;
    }
}
