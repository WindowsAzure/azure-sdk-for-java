// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StorageAccountCheckNameAvailabilityParameters model.
 */
@Fluent
public final class StorageAccountCheckNameAvailabilityParameters {
    /*
     * The storage account name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource, Microsoft.Storage/storageAccounts
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of StorageAccountCheckNameAvailabilityParameters
     * class.
     */
    public StorageAccountCheckNameAvailabilityParameters() {
        type = "Microsoft.Storage/storageAccounts";
    }

    /**
     * Get the name property: The storage account name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The storage account name.
     * 
     * @param name the name value to set.
     * @return the StorageAccountCheckNameAvailabilityParameters object itself.
     */
    public StorageAccountCheckNameAvailabilityParameters setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource,
     * Microsoft.Storage/storageAccounts.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource,
     * Microsoft.Storage/storageAccounts.
     * 
     * @param type the type value to set.
     * @return the StorageAccountCheckNameAvailabilityParameters object itself.
     */
    public StorageAccountCheckNameAvailabilityParameters setType(String type) {
        this.type = type;
        return this;
    }
}
