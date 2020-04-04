// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SnapshotSku model.
 */
@Fluent
public final class SnapshotSku {
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
}
