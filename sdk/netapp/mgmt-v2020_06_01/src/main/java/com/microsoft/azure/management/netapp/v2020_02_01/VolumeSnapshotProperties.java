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
 * Volume Snapshot Properties.
 */
public class VolumeSnapshotProperties {
    /**
     * Snapshot Policy ResourceId.
     */
    @JsonProperty(value = "snapshotPolicyId")
    private String snapshotPolicyId;

    /**
     * Get snapshot Policy ResourceId.
     *
     * @return the snapshotPolicyId value
     */
    public String snapshotPolicyId() {
        return this.snapshotPolicyId;
    }

    /**
     * Set snapshot Policy ResourceId.
     *
     * @param snapshotPolicyId the snapshotPolicyId value to set
     * @return the VolumeSnapshotProperties object itself.
     */
    public VolumeSnapshotProperties withSnapshotPolicyId(String snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
        return this;
    }

}
