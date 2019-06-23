/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Usage metrics for a Pool across an aggregation interval.
 */
public class PoolUsageMetrics {
    /**
     * The ID of the Pool whose metrics are aggregated in this entry.
     */
    @JsonProperty(value = "poolId", required = true)
    private String poolId;

    /**
     * The start time of the aggregation interval covered by this entry.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * The end time of the aggregation interval covered by this entry.
     */
    @JsonProperty(value = "endTime", required = true)
    private DateTime endTime;

    /**
     * The size of virtual machines in the Pool. All VMs in a Pool are the same
     * size.
     * For information about available sizes of virtual machines in Pools, see
     * Choose a VM size for Compute Nodes in an Azure Batch Pool
     * (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     */
    @JsonProperty(value = "vmSize", required = true)
    private String vmSize;

    /**
     * The total core hours used in the Pool during this aggregation interval.
     */
    @JsonProperty(value = "totalCoreHours", required = true)
    private double totalCoreHours;

    /**
     * Get the poolId value.
     *
     * @return the poolId value
     */
    public String poolId() {
        return this.poolId;
    }

    /**
     * Set the poolId value.
     *
     * @param poolId the poolId value to set
     * @return the PoolUsageMetrics object itself.
     */
    public PoolUsageMetrics withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the PoolUsageMetrics object itself.
     */
    public PoolUsageMetrics withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime value.
     *
     * @param endTime the endTime value to set
     * @return the PoolUsageMetrics object itself.
     */
    public PoolUsageMetrics withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get for information about available sizes of virtual machines in Pools, see Choose a VM size for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @return the vmSize value
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set for information about available sizes of virtual machines in Pools, see Choose a VM size for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @param vmSize the vmSize value to set
     * @return the PoolUsageMetrics object itself.
     */
    public PoolUsageMetrics withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the totalCoreHours value.
     *
     * @return the totalCoreHours value
     */
    public double totalCoreHours() {
        return this.totalCoreHours;
    }

    /**
     * Set the totalCoreHours value.
     *
     * @param totalCoreHours the totalCoreHours value to set
     * @return the PoolUsageMetrics object itself.
     */
    public PoolUsageMetrics withTotalCoreHours(double totalCoreHours) {
        this.totalCoreHours = totalCoreHours;
        return this;
    }

}
