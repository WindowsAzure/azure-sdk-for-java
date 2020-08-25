/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volume details using the backup policy.
 */
public class VolumeBackups {
    /**
     * Volume name.
     */
    @JsonProperty(value = "volumeName")
    private String volumeName;

    /**
     * Total count of backups for volume.
     */
    @JsonProperty(value = "backupsCount")
    private Integer backupsCount;

    /**
     * Policy enabled.
     */
    @JsonProperty(value = "policyEnabled")
    private Boolean policyEnabled;

    /**
     * Get volume name.
     *
     * @return the volumeName value
     */
    public String volumeName() {
        return this.volumeName;
    }

    /**
     * Set volume name.
     *
     * @param volumeName the volumeName value to set
     * @return the VolumeBackups object itself.
     */
    public VolumeBackups withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    /**
     * Get total count of backups for volume.
     *
     * @return the backupsCount value
     */
    public Integer backupsCount() {
        return this.backupsCount;
    }

    /**
     * Set total count of backups for volume.
     *
     * @param backupsCount the backupsCount value to set
     * @return the VolumeBackups object itself.
     */
    public VolumeBackups withBackupsCount(Integer backupsCount) {
        this.backupsCount = backupsCount;
        return this;
    }

    /**
     * Get policy enabled.
     *
     * @return the policyEnabled value
     */
    public Boolean policyEnabled() {
        return this.policyEnabled;
    }

    /**
     * Set policy enabled.
     *
     * @param policyEnabled the policyEnabled value to set
     * @return the VolumeBackups object itself.
     */
    public VolumeBackups withPolicyEnabled(Boolean policyEnabled) {
        this.policyEnabled = policyEnabled;
        return this;
    }

}
