/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of volumes to mount on the cluster.
 */
public class MountVolumes {
    /**
     * Azure File Shares.
     * A collection of Azure File Shares that are to be mounted to the cluster
     * nodes.
     */
    @JsonProperty(value = "azureFileShares")
    private List<AzureFileShareReference> azureFileShares;

    /**
     * Azure Blob file systems.
     * A collection of Azure Blob Containers that are to be mounted to the
     * cluster nodes.
     */
    @JsonProperty(value = "azureBlobFileSystems")
    private List<AzureBlobFileSystemReference> azureBlobFileSystems;

    /**
     * File Servers.
     * A collection of Batch AI File Servers that are to be mounted to the
     * cluster nodes.
     */
    @JsonProperty(value = "fileServers")
    private List<FileServerReference> fileServers;

    /**
     * Unmanaged file systems.
     * A collection of unmanaged file systems that are to be mounted to the
     * cluster nodes.
     */
    @JsonProperty(value = "unmanagedFileSystems")
    private List<UnmanagedFileSystemReference> unmanagedFileSystems;

    /**
     * Get a collection of Azure File Shares that are to be mounted to the cluster nodes.
     *
     * @return the azureFileShares value
     */
    public List<AzureFileShareReference> azureFileShares() {
        return this.azureFileShares;
    }

    /**
     * Set a collection of Azure File Shares that are to be mounted to the cluster nodes.
     *
     * @param azureFileShares the azureFileShares value to set
     * @return the MountVolumes object itself.
     */
    public MountVolumes withAzureFileShares(List<AzureFileShareReference> azureFileShares) {
        this.azureFileShares = azureFileShares;
        return this;
    }

    /**
     * Get a collection of Azure Blob Containers that are to be mounted to the cluster nodes.
     *
     * @return the azureBlobFileSystems value
     */
    public List<AzureBlobFileSystemReference> azureBlobFileSystems() {
        return this.azureBlobFileSystems;
    }

    /**
     * Set a collection of Azure Blob Containers that are to be mounted to the cluster nodes.
     *
     * @param azureBlobFileSystems the azureBlobFileSystems value to set
     * @return the MountVolumes object itself.
     */
    public MountVolumes withAzureBlobFileSystems(List<AzureBlobFileSystemReference> azureBlobFileSystems) {
        this.azureBlobFileSystems = azureBlobFileSystems;
        return this;
    }

    /**
     * Get a collection of Batch AI File Servers that are to be mounted to the cluster nodes.
     *
     * @return the fileServers value
     */
    public List<FileServerReference> fileServers() {
        return this.fileServers;
    }

    /**
     * Set a collection of Batch AI File Servers that are to be mounted to the cluster nodes.
     *
     * @param fileServers the fileServers value to set
     * @return the MountVolumes object itself.
     */
    public MountVolumes withFileServers(List<FileServerReference> fileServers) {
        this.fileServers = fileServers;
        return this;
    }

    /**
     * Get a collection of unmanaged file systems that are to be mounted to the cluster nodes.
     *
     * @return the unmanagedFileSystems value
     */
    public List<UnmanagedFileSystemReference> unmanagedFileSystems() {
        return this.unmanagedFileSystems;
    }

    /**
     * Set a collection of unmanaged file systems that are to be mounted to the cluster nodes.
     *
     * @param unmanagedFileSystems the unmanagedFileSystems value to set
     * @return the MountVolumes object itself.
     */
    public MountVolumes withUnmanagedFileSystems(List<UnmanagedFileSystemReference> unmanagedFileSystems) {
        this.unmanagedFileSystems = unmanagedFileSystems;
        return this;
    }

}
