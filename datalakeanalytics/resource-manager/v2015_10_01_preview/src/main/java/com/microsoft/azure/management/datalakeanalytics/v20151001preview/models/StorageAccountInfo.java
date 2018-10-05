/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Storage account information.
 */
public class StorageAccountInfo {
    /**
     * the account name associated with the Azure storage account.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * the properties associated with this storage account.
     */
    @JsonProperty(value = "properties", required = true)
    private StorageAccountProperties properties;

    /**
     * Get the account name associated with the Azure storage account.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the account name associated with the Azure storage account.
     *
     * @param name the name value to set
     * @return the StorageAccountInfo object itself.
     */
    public StorageAccountInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties associated with this storage account.
     *
     * @return the properties value
     */
    public StorageAccountProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties associated with this storage account.
     *
     * @param properties the properties value to set
     * @return the StorageAccountInfo object itself.
     */
    public StorageAccountInfo withProperties(StorageAccountProperties properties) {
        this.properties = properties;
        return this;
    }

}
