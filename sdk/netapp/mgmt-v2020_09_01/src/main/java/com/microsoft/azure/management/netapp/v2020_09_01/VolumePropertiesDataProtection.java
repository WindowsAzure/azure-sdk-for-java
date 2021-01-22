/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DataProtection.
 * DataProtection type volumes include an object containing details of the
 * replication.
 */
public class VolumePropertiesDataProtection {
    /**
     * Backup.
     * Backup Properties.
     */
    @JsonProperty(value = "backup")
    private VolumeBackupProperties backup;

    /**
     * Replication.
     * Replication properties.
     */
    @JsonProperty(value = "replication")
    private ReplicationObject replication;

    /**
     * Snapshot.
     * Snapshot properties.
     */
    @JsonProperty(value = "snapshot")
    private VolumeSnapshotProperties snapshot;

    /**
     * Get backup Properties.
     *
     * @return the backup value
     */
    public VolumeBackupProperties backup() {
        return this.backup;
    }

    /**
     * Set backup Properties.
     *
     * @param backup the backup value to set
     * @return the VolumePropertiesDataProtection object itself.
     */
    public VolumePropertiesDataProtection withBackup(VolumeBackupProperties backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Get replication properties.
     *
     * @return the replication value
     */
    public ReplicationObject replication() {
        return this.replication;
    }

    /**
     * Set replication properties.
     *
     * @param replication the replication value to set
     * @return the VolumePropertiesDataProtection object itself.
     */
    public VolumePropertiesDataProtection withReplication(ReplicationObject replication) {
        this.replication = replication;
        return this;
    }

    /**
     * Get snapshot properties.
     *
     * @return the snapshot value
     */
    public VolumeSnapshotProperties snapshot() {
        return this.snapshot;
    }

    /**
     * Set snapshot properties.
     *
     * @param snapshot the snapshot value to set
     * @return the VolumePropertiesDataProtection object itself.
     */
    public VolumePropertiesDataProtection withSnapshot(VolumeSnapshotProperties snapshot) {
        this.snapshot = snapshot;
        return this;
    }

}
