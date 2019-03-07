// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.keyvault.models;

import com.microsoft.rest.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The secret restore parameters.
 */
public class StorageRestoreParameters {
    /**
     * The backup blob associated with a storage account.
     */
    @JsonProperty(value = "value", required = true)
    private Base64Url storageBundleBackup;

    /**
     * Get the storageBundleBackup value.
     *
     * @return the storageBundleBackup value
     */
    public byte[] storageBundleBackup() {
        if (this.storageBundleBackup == null) {
            return null;
        }
        return this.storageBundleBackup.decodedBytes();
    }

    /**
     * Set the storageBundleBackup value.
     *
     * @param storageBundleBackup the storageBundleBackup value to set
     * @return the StorageRestoreParameters object itself.
     */
    public StorageRestoreParameters withStorageBundleBackup(byte[] storageBundleBackup) {
        if (storageBundleBackup == null) {
            this.storageBundleBackup = null;
        } else {
            this.storageBundleBackup = Base64Url.encode(storageBundleBackup);
        }
        return this;
    }

}
