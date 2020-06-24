// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SnapshotSku model. */
@Fluent
public final class SnapshotSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SnapshotSku.class);

    /*
     * The sku name.
     */
    @JsonProperty(value = "name")
    private SnapshotStorageAccountTypes name;

    /*
     * The sku tier.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /**
     * Get the name property: The sku name.
     *
     * @return the name value.
     */
    public SnapshotStorageAccountTypes name() {
        return this.name;
    }

    /**
     * Set the name property: The sku name.
     *
     * @param name the name value to set.
     * @return the SnapshotSku object itself.
     */
    public SnapshotSku withName(SnapshotStorageAccountTypes name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The sku tier.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
