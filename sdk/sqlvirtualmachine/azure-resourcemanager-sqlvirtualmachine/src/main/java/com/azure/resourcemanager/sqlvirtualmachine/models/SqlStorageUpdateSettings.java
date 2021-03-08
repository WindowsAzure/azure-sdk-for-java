// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Set disk storage settings for SQL Server. */
@Fluent
public final class SqlStorageUpdateSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlStorageUpdateSettings.class);

    /*
     * Virtual machine disk count.
     */
    @JsonProperty(value = "diskCount")
    private Integer diskCount;

    /*
     * Device id of the first disk to be updated.
     */
    @JsonProperty(value = "startingDeviceId")
    private Integer startingDeviceId;

    /*
     * Disk configuration to apply to SQL Server.
     */
    @JsonProperty(value = "diskConfigurationType")
    private DiskConfigurationType diskConfigurationType;

    /**
     * Get the diskCount property: Virtual machine disk count.
     *
     * @return the diskCount value.
     */
    public Integer diskCount() {
        return this.diskCount;
    }

    /**
     * Set the diskCount property: Virtual machine disk count.
     *
     * @param diskCount the diskCount value to set.
     * @return the SqlStorageUpdateSettings object itself.
     */
    public SqlStorageUpdateSettings withDiskCount(Integer diskCount) {
        this.diskCount = diskCount;
        return this;
    }

    /**
     * Get the startingDeviceId property: Device id of the first disk to be updated.
     *
     * @return the startingDeviceId value.
     */
    public Integer startingDeviceId() {
        return this.startingDeviceId;
    }

    /**
     * Set the startingDeviceId property: Device id of the first disk to be updated.
     *
     * @param startingDeviceId the startingDeviceId value to set.
     * @return the SqlStorageUpdateSettings object itself.
     */
    public SqlStorageUpdateSettings withStartingDeviceId(Integer startingDeviceId) {
        this.startingDeviceId = startingDeviceId;
        return this;
    }

    /**
     * Get the diskConfigurationType property: Disk configuration to apply to SQL Server.
     *
     * @return the diskConfigurationType value.
     */
    public DiskConfigurationType diskConfigurationType() {
        return this.diskConfigurationType;
    }

    /**
     * Set the diskConfigurationType property: Disk configuration to apply to SQL Server.
     *
     * @param diskConfigurationType the diskConfigurationType value to set.
     * @return the SqlStorageUpdateSettings object itself.
     */
    public SqlStorageUpdateSettings withDiskConfigurationType(DiskConfigurationType diskConfigurationType) {
        this.diskConfigurationType = diskConfigurationType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
