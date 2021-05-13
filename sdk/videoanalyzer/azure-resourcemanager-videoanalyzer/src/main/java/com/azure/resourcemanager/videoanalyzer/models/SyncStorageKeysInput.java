// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The input to the sync storage keys request. */
@Fluent
public final class SyncStorageKeysInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SyncStorageKeysInput.class);

    /*
     * The ID of the storage account resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the id property: The ID of the storage account resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the storage account resource.
     *
     * @param id the id value to set.
     * @return the SyncStorageKeysInput object itself.
     */
    public SyncStorageKeysInput withId(String id) {
        this.id = id;
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
