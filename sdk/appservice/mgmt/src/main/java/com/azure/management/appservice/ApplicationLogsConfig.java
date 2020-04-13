// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApplicationLogsConfig model. */
@Fluent
public final class ApplicationLogsConfig {
    /*
     * Application logs to file system configuration.
     */
    @JsonProperty(value = "fileSystem")
    private FileSystemApplicationLogsConfig fileSystem;

    /*
     * Application logs to azure table storage configuration.
     */
    @JsonProperty(value = "azureTableStorage")
    private AzureTableStorageApplicationLogsConfig azureTableStorage;

    /*
     * Application logs to blob storage configuration.
     */
    @JsonProperty(value = "azureBlobStorage")
    private AzureBlobStorageApplicationLogsConfig azureBlobStorage;

    /**
     * Get the fileSystem property: Application logs to file system configuration.
     *
     * @return the fileSystem value.
     */
    public FileSystemApplicationLogsConfig fileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem property: Application logs to file system configuration.
     *
     * @param fileSystem the fileSystem value to set.
     * @return the ApplicationLogsConfig object itself.
     */
    public ApplicationLogsConfig withFileSystem(FileSystemApplicationLogsConfig fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * Get the azureTableStorage property: Application logs to azure table storage configuration.
     *
     * @return the azureTableStorage value.
     */
    public AzureTableStorageApplicationLogsConfig azureTableStorage() {
        return this.azureTableStorage;
    }

    /**
     * Set the azureTableStorage property: Application logs to azure table storage configuration.
     *
     * @param azureTableStorage the azureTableStorage value to set.
     * @return the ApplicationLogsConfig object itself.
     */
    public ApplicationLogsConfig withAzureTableStorage(AzureTableStorageApplicationLogsConfig azureTableStorage) {
        this.azureTableStorage = azureTableStorage;
        return this;
    }

    /**
     * Get the azureBlobStorage property: Application logs to blob storage configuration.
     *
     * @return the azureBlobStorage value.
     */
    public AzureBlobStorageApplicationLogsConfig azureBlobStorage() {
        return this.azureBlobStorage;
    }

    /**
     * Set the azureBlobStorage property: Application logs to blob storage configuration.
     *
     * @param azureBlobStorage the azureBlobStorage value to set.
     * @return the ApplicationLogsConfig object itself.
     */
    public ApplicationLogsConfig withAzureBlobStorage(AzureBlobStorageApplicationLogsConfig azureBlobStorage) {
        this.azureBlobStorage = azureBlobStorage;
        return this;
    }
}
