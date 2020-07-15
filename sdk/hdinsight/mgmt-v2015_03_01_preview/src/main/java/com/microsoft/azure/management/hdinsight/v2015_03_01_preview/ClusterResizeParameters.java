/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Resize Cluster request parameters.
 */
public class ClusterResizeParameters {
    /**
     * The target instance count for the operation.
     */
    @JsonProperty(value = "targetInstanceCount")
    private Integer targetInstanceCount;

    /**
     * Get the target instance count for the operation.
     *
     * @return the targetInstanceCount value
     */
    public Integer targetInstanceCount() {
        return this.targetInstanceCount;
    }

    /**
     * Set the target instance count for the operation.
     *
     * @param targetInstanceCount the targetInstanceCount value to set
     * @return the ClusterResizeParameters object itself.
     */
    public ClusterResizeParameters withTargetInstanceCount(Integer targetInstanceCount) {
        this.targetInstanceCount = targetInstanceCount;
        return this;
    }

}
