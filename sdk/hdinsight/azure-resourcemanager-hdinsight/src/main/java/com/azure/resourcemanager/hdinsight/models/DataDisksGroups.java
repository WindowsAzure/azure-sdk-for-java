// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The data disks groups for the role. */
@Fluent
public final class DataDisksGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataDisksGroups.class);

    /*
     * The number of disks per node.
     */
    @JsonProperty(value = "disksPerNode")
    private Integer disksPerNode;

    /*
     * ReadOnly. The storage account type. Do not set this value.
     */
    @JsonProperty(value = "storageAccountType", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccountType;

    /*
     * ReadOnly. The DiskSize in GB. Do not set this value.
     */
    @JsonProperty(value = "diskSizeGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer diskSizeGB;

    /**
     * Get the disksPerNode property: The number of disks per node.
     *
     * @return the disksPerNode value.
     */
    public Integer disksPerNode() {
        return this.disksPerNode;
    }

    /**
     * Set the disksPerNode property: The number of disks per node.
     *
     * @param disksPerNode the disksPerNode value to set.
     * @return the DataDisksGroups object itself.
     */
    public DataDisksGroups withDisksPerNode(Integer disksPerNode) {
        this.disksPerNode = disksPerNode;
        return this;
    }

    /**
     * Get the storageAccountType property: ReadOnly. The storage account type. Do not set this value.
     *
     * @return the storageAccountType value.
     */
    public String storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Get the diskSizeGB property: ReadOnly. The DiskSize in GB. Do not set this value.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
