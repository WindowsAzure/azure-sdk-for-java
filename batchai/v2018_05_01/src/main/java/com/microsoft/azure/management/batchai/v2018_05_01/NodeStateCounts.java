/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Counts of various compute node states on the cluster.
 */
public class NodeStateCounts {
    /**
     * Number of compute nodes in idle state.
     */
    @JsonProperty(value = "idleNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer idleNodeCount;

    /**
     * Number of compute nodes which are running jobs.
     */
    @JsonProperty(value = "runningNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer runningNodeCount;

    /**
     * Number of compute nodes which are being prepared.
     */
    @JsonProperty(value = "preparingNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer preparingNodeCount;

    /**
     * Number of compute nodes which are unusable.
     */
    @JsonProperty(value = "unusableNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer unusableNodeCount;

    /**
     * Number of compute nodes which are leaving the cluster.
     */
    @JsonProperty(value = "leavingNodeCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer leavingNodeCount;

    /**
     * Get the idleNodeCount value.
     *
     * @return the idleNodeCount value
     */
    public Integer idleNodeCount() {
        return this.idleNodeCount;
    }

    /**
     * Get the runningNodeCount value.
     *
     * @return the runningNodeCount value
     */
    public Integer runningNodeCount() {
        return this.runningNodeCount;
    }

    /**
     * Get the preparingNodeCount value.
     *
     * @return the preparingNodeCount value
     */
    public Integer preparingNodeCount() {
        return this.preparingNodeCount;
    }

    /**
     * Get the unusableNodeCount value.
     *
     * @return the unusableNodeCount value
     */
    public Integer unusableNodeCount() {
        return this.unusableNodeCount;
    }

    /**
     * Get the leavingNodeCount value.
     *
     * @return the leavingNodeCount value
     */
    public Integer leavingNodeCount() {
        return this.leavingNodeCount;
    }

}
