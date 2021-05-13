// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information used to connect to an Azure Storage Container using Blobfuse. */
@Fluent
public final class AzureBlobFileSystemConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureBlobFileSystemConfiguration.class);

    /*
     * The Azure Storage Account name.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /*
     * The Azure Blob Storage Container name.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /*
     * This property is mutually exclusive with sasKey and one must be
     * specified.
     */
    @JsonProperty(value = "accountKey")
    private String accountKey;

    /*
     * This property is mutually exclusive with accountKey and one must be
     * specified.
     */
    @JsonProperty(value = "sasKey")
    private String sasKey;

    /*
     * These are 'net use' options in Windows and 'mount' options in Linux.
     */
    @JsonProperty(value = "blobfuseOptions")
    private String blobfuseOptions;

    /*
     * All file systems are mounted relative to the Batch mounts directory,
     * accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /**
     * Get the accountName property: The Azure Storage Account name.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The Azure Storage Account name.
     *
     * @param accountName the accountName value to set.
     * @return the AzureBlobFileSystemConfiguration object itself.
     */
    public AzureBlobFileSystemConfiguration withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the containerName property: The Azure Blob Storage Container name.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: The Azure Blob Storage Container name.
     *
     * @param containerName the containerName value to set.
     * @return the AzureBlobFileSystemConfiguration object itself.
     */
    public AzureBlobFileSystemConfiguration withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the accountKey property: This property is mutually exclusive with sasKey and one must be specified.
     *
     * @return the accountKey value.
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: This property is mutually exclusive with sasKey and one must be specified.
     *
     * @param accountKey the accountKey value to set.
     * @return the AzureBlobFileSystemConfiguration object itself.
     */
    public AzureBlobFileSystemConfiguration withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get the sasKey property: This property is mutually exclusive with accountKey and one must be specified.
     *
     * @return the sasKey value.
     */
    public String sasKey() {
        return this.sasKey;
    }

    /**
     * Set the sasKey property: This property is mutually exclusive with accountKey and one must be specified.
     *
     * @param sasKey the sasKey value to set.
     * @return the AzureBlobFileSystemConfiguration object itself.
     */
    public AzureBlobFileSystemConfiguration withSasKey(String sasKey) {
        this.sasKey = sasKey;
        return this;
    }

    /**
     * Get the blobfuseOptions property: These are 'net use' options in Windows and 'mount' options in Linux.
     *
     * @return the blobfuseOptions value.
     */
    public String blobfuseOptions() {
        return this.blobfuseOptions;
    }

    /**
     * Set the blobfuseOptions property: These are 'net use' options in Windows and 'mount' options in Linux.
     *
     * @param blobfuseOptions the blobfuseOptions value to set.
     * @return the AzureBlobFileSystemConfiguration object itself.
     */
    public AzureBlobFileSystemConfiguration withBlobfuseOptions(String blobfuseOptions) {
        this.blobfuseOptions = blobfuseOptions;
        return this;
    }

    /**
     * Get the relativeMountPath property: All file systems are mounted relative to the Batch mounts directory,
     * accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     *
     * @return the relativeMountPath value.
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set the relativeMountPath property: All file systems are mounted relative to the Batch mounts directory,
     * accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     *
     * @param relativeMountPath the relativeMountPath value to set.
     * @return the AzureBlobFileSystemConfiguration object itself.
     */
    public AzureBlobFileSystemConfiguration withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accountName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property accountName in model AzureBlobFileSystemConfiguration"));
        }
        if (containerName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property containerName in model AzureBlobFileSystemConfiguration"));
        }
        if (relativeMountPath() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property relativeMountPath in model AzureBlobFileSystemConfiguration"));
        }
    }
}
