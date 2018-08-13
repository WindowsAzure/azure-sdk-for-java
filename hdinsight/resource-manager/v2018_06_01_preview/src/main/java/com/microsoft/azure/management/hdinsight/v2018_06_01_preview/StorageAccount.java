/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The storage Account.
 */
public class StorageAccount {
    /**
     * The name of the storage account.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Whether or not the storage account is the default storage account.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /**
     * The container in the storage account, only to be specified for WASB
     * storage accounts.
     */
    @JsonProperty(value = "container")
    private String container;

    /**
     * The filesystem, only to be specified for Azure Data Lake Storage type
     * Gen 2.
     */
    @JsonProperty(value = "fileSystem")
    private String fileSystem;

    /**
     * The storage account access key.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Get the name of the storage account.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the storage account.
     *
     * @param name the name value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get whether or not the storage account is the default storage account.
     *
     * @return the isDefault value
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set whether or not the storage account is the default storage account.
     *
     * @param isDefault the isDefault value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the container in the storage account, only to be specified for WASB storage accounts.
     *
     * @return the container value
     */
    public String container() {
        return this.container;
    }

    /**
     * Set the container in the storage account, only to be specified for WASB storage accounts.
     *
     * @param container the container value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * Get the filesystem, only to be specified for Azure Data Lake Storage type Gen 2.
     *
     * @return the fileSystem value
     */
    public String fileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the filesystem, only to be specified for Azure Data Lake Storage type Gen 2.
     *
     * @param fileSystem the fileSystem value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withFileSystem(String fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * Get the storage account access key.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the storage account access key.
     *
     * @param key the key value to set
     * @return the StorageAccount object itself.
     */
    public StorageAccount withKey(String key) {
        this.key = key;
        return this;
    }

}
