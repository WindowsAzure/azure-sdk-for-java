/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage account details.
 */
public class StorageAccount {
    /**
     * The ID of the storage account resource. Media Services relies on tables
     * and queues as well as blobs, so the primary storage account must be a
     * Standard Storage account (either Microsoft.ClassicStorage or
     * Microsoft.Storage). Blob only storage accounts can be added as secondary
     * storage accounts.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The type of the storage account. Possible values include: 'Primary',
     * 'Secondary'.
     */
    @JsonProperty(value = "type", required = true)
    private StorageAccountType type;

    /**
     * Get the ID of the storage account resource. Media Services relies on tables and queues as well as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the storage account resource. Media Services relies on tables and queues as well as blobs, so the primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or Microsoft.Storage). Blob only storage accounts can be added as secondary storage accounts.
     *
     * @param id the id value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type of the storage account. Possible values include: 'Primary', 'Secondary'.
     *
     * @return the type value
     */
    public StorageAccountType type() {
        return this.type;
    }

    /**
     * Set the type of the storage account. Possible values include: 'Primary', 'Secondary'.
     *
     * @param type the type value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withType(StorageAccountType type) {
        this.type = type;
        return this;
    }

}
