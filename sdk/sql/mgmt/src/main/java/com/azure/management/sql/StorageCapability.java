// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StorageCapability model.
 */
@Fluent
public final class StorageCapability {
    /*
     * The storage account type for the database's backups.
     */
    @JsonProperty(value = "storageAccountType", access = JsonProperty.Access.WRITE_ONLY)
    private StorageCapabilityStorageAccountType storageAccountType;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the storageAccountType property: The storage account type for the
     * database's backups.
     * 
     * @return the storageAccountType value.
     */
    public StorageCapabilityStorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Get the status property: The status of the capability.
     * 
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being
     * available.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being
     * available.
     * 
     * @param reason the reason value to set.
     * @return the StorageCapability object itself.
     */
    public StorageCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }
}
