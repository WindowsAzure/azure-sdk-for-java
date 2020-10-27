/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_07_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volumes associated with snapshot policy.
 */
public class SnapshotPolicyVolumeListInner {
    /**
     * List of volumes.
     */
    @JsonProperty(value = "value")
    private List<Object> value;

    /**
     * Get list of volumes.
     *
     * @return the value value
     */
    public List<Object> value() {
        return this.value;
    }

    /**
     * Set list of volumes.
     *
     * @param value the value value to set
     * @return the SnapshotPolicyVolumeListInner object itself.
     */
    public SnapshotPolicyVolumeListInner withValue(List<Object> value) {
        this.value = value;
        return this;
    }

}
