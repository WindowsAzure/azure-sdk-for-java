/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a storage account for a container registry. Only
 * applicable to Classic SKU.
 */
public class StorageAccountProperties {
    /**
     * The resource ID of the storage account.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get the resource ID of the storage account.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the resource ID of the storage account.
     *
     * @param id the id value to set
     * @return the StorageAccountProperties object itself.
     */
    public StorageAccountProperties withId(String id) {
        this.id = id;
        return this;
    }

}
