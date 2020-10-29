/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Export operation configuration information.
 */
public class ServiceExportConfigurationInfo {
    /**
     * The name of the default export storage account.
     */
    @JsonProperty(value = "storageAccountName")
    private String storageAccountName;

    /**
     * Get the name of the default export storage account.
     *
     * @return the storageAccountName value
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the name of the default export storage account.
     *
     * @param storageAccountName the storageAccountName value to set
     * @return the ServiceExportConfigurationInfo object itself.
     */
    public ServiceExportConfigurationInfo withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

}
