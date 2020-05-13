// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HttpLogsConfig model. */
@Fluent
public final class HttpLogsConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HttpLogsConfig.class);

    /*
     * Http logs to file system configuration.
     */
    @JsonProperty(value = "fileSystem")
    private FileSystemHttpLogsConfig fileSystem;

    /*
     * Http logs to azure blob storage configuration.
     */
    @JsonProperty(value = "azureBlobStorage")
    private AzureBlobStorageHttpLogsConfig azureBlobStorage;

    /**
     * Get the fileSystem property: Http logs to file system configuration.
     *
     * @return the fileSystem value.
     */
    public FileSystemHttpLogsConfig fileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem property: Http logs to file system configuration.
     *
     * @param fileSystem the fileSystem value to set.
     * @return the HttpLogsConfig object itself.
     */
    public HttpLogsConfig withFileSystem(FileSystemHttpLogsConfig fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * Get the azureBlobStorage property: Http logs to azure blob storage configuration.
     *
     * @return the azureBlobStorage value.
     */
    public AzureBlobStorageHttpLogsConfig azureBlobStorage() {
        return this.azureBlobStorage;
    }

    /**
     * Set the azureBlobStorage property: Http logs to azure blob storage configuration.
     *
     * @param azureBlobStorage the azureBlobStorage value to set.
     * @return the HttpLogsConfig object itself.
     */
    public HttpLogsConfig withAzureBlobStorage(AzureBlobStorageHttpLogsConfig azureBlobStorage) {
        this.azureBlobStorage = azureBlobStorage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fileSystem() != null) {
            fileSystem().validate();
        }
        if (azureBlobStorage() != null) {
            azureBlobStorage().validate();
        }
    }
}
