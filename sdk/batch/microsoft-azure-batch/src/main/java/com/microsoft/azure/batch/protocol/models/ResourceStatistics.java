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
 * Statistics related to resource consumption by Compute Nodes in a Pool.
 */
public class ResourceStatistics {
    /**
     * The start time of the time range covered by the statistics.
     */
    @JsonProperty(value = "startTime", required = true)
    private DateTime startTime;

    /**
     * The time at which the statistics were last updated. All statistics are
     * limited to the range between startTime and lastUpdateTime.
     */
    @JsonProperty(value = "lastUpdateTime", required = true)
    private DateTime lastUpdateTime;

    /**
     * The average CPU usage across all Compute Nodes in the Pool (percentage
     * per node).
     */
    @JsonProperty(value = "avgCPUPercentage", required = true)
    private double avgCPUPercentage;

    /**
     * The average memory usage in GiB across all Compute Nodes in the Pool.
     */
    @JsonProperty(value = "avgMemoryGiB", required = true)
    private double avgMemoryGiB;

    /**
     * The peak memory usage in GiB across all Compute Nodes in the Pool.
     */
    @JsonProperty(value = "peakMemoryGiB", required = true)
    private double peakMemoryGiB;

    /**
     * The average used disk space in GiB across all Compute Nodes in the Pool.
     */
    @JsonProperty(value = "avgDiskGiB", required = true)
    private double avgDiskGiB;

    /**
     * The peak used disk space in GiB across all Compute Nodes in the Pool.
     */
    @JsonProperty(value = "peakDiskGiB", required = true)
    private double peakDiskGiB;

    /**
     * The total number of disk read operations across all Compute Nodes in the
     * Pool.
     */
    @JsonProperty(value = "diskReadIOps", required = true)
    private long diskReadIOps;

    /**
     * The total number of disk write operations across all Compute Nodes in
     * the Pool.
     */
    @JsonProperty(value = "diskWriteIOps", required = true)
    private long diskWriteIOps;

    /**
     * The total amount of data in GiB of disk reads across all Compute Nodes
     * in the Pool.
     */
    @JsonProperty(value = "diskReadGiB", required = true)
    private double diskReadGiB;

    /**
     * The total amount of data in GiB of disk writes across all Compute Nodes
     * in the Pool.
     */
    @JsonProperty(value = "diskWriteGiB", required = true)
    private double diskWriteGiB;

    /**
     * The total amount of data in GiB of network reads across all Compute
     * Nodes in the Pool.
     */
    @JsonProperty(value = "networkReadGiB", required = true)
    private double networkReadGiB;

    /**
     * The total amount of data in GiB of network writes across all Compute
     * Nodes in the Pool.
     */
    @JsonProperty(value = "networkWriteGiB", required = true)
    private double networkWriteGiB;

    /**
     * Get the start time of the time range covered by the statistics.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time of the time range covered by the statistics.
     *
     * @param startTime the startTime value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the time at which the statistics were last updated. All statistics are limited to the range between startTime and lastUpdateTime.
     *
     * @return the lastUpdateTime value
     */
    public DateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Set the time at which the statistics were last updated. All statistics are limited to the range between startTime and lastUpdateTime.
     *
     * @param lastUpdateTime the lastUpdateTime value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withLastUpdateTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * Get the average CPU usage across all Compute Nodes in the Pool (percentage per node).
     *
     * @return the avgCPUPercentage value
     */
    public double avgCPUPercentage() {
        return this.avgCPUPercentage;
    }

    /**
     * Set the average CPU usage across all Compute Nodes in the Pool (percentage per node).
     *
     * @param avgCPUPercentage the avgCPUPercentage value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withAvgCPUPercentage(double avgCPUPercentage) {
        this.avgCPUPercentage = avgCPUPercentage;
        return this;
    }

    /**
     * Get the average memory usage in GiB across all Compute Nodes in the Pool.
     *
     * @return the avgMemoryGiB value
     */
    public double avgMemoryGiB() {
        return this.avgMemoryGiB;
    }

    /**
     * Set the average memory usage in GiB across all Compute Nodes in the Pool.
     *
     * @param avgMemoryGiB the avgMemoryGiB value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withAvgMemoryGiB(double avgMemoryGiB) {
        this.avgMemoryGiB = avgMemoryGiB;
        return this;
    }

    /**
     * Get the peak memory usage in GiB across all Compute Nodes in the Pool.
     *
     * @return the peakMemoryGiB value
     */
    public double peakMemoryGiB() {
        return this.peakMemoryGiB;
    }

    /**
     * Set the peak memory usage in GiB across all Compute Nodes in the Pool.
     *
     * @param peakMemoryGiB the peakMemoryGiB value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withPeakMemoryGiB(double peakMemoryGiB) {
        this.peakMemoryGiB = peakMemoryGiB;
        return this;
    }

    /**
     * Get the average used disk space in GiB across all Compute Nodes in the Pool.
     *
     * @return the avgDiskGiB value
     */
    public double avgDiskGiB() {
        return this.avgDiskGiB;
    }

    /**
     * Set the average used disk space in GiB across all Compute Nodes in the Pool.
     *
     * @param avgDiskGiB the avgDiskGiB value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withAvgDiskGiB(double avgDiskGiB) {
        this.avgDiskGiB = avgDiskGiB;
        return this;
    }

    /**
     * Get the peak used disk space in GiB across all Compute Nodes in the Pool.
     *
     * @return the peakDiskGiB value
     */
    public double peakDiskGiB() {
        return this.peakDiskGiB;
    }

    /**
     * Set the peak used disk space in GiB across all Compute Nodes in the Pool.
     *
     * @param peakDiskGiB the peakDiskGiB value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withPeakDiskGiB(double peakDiskGiB) {
        this.peakDiskGiB = peakDiskGiB;
        return this;
    }

    /**
     * Get the total number of disk read operations across all Compute Nodes in the Pool.
     *
     * @return the diskReadIOps value
     */
    public long diskReadIOps() {
        return this.diskReadIOps;
    }

    /**
     * Set the total number of disk read operations across all Compute Nodes in the Pool.
     *
     * @param diskReadIOps the diskReadIOps value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withDiskReadIOps(long diskReadIOps) {
        this.diskReadIOps = diskReadIOps;
        return this;
    }

    /**
     * Get the total number of disk write operations across all Compute Nodes in the Pool.
     *
     * @return the diskWriteIOps value
     */
    public long diskWriteIOps() {
        return this.diskWriteIOps;
    }

    /**
     * Set the total number of disk write operations across all Compute Nodes in the Pool.
     *
     * @param diskWriteIOps the diskWriteIOps value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withDiskWriteIOps(long diskWriteIOps) {
        this.diskWriteIOps = diskWriteIOps;
        return this;
    }

    /**
     * Get the total amount of data in GiB of disk reads across all Compute Nodes in the Pool.
     *
     * @return the diskReadGiB value
     */
    public double diskReadGiB() {
        return this.diskReadGiB;
    }

    /**
     * Set the total amount of data in GiB of disk reads across all Compute Nodes in the Pool.
     *
     * @param diskReadGiB the diskReadGiB value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withDiskReadGiB(double diskReadGiB) {
        this.diskReadGiB = diskReadGiB;
        return this;
    }

    /**
     * Get the total amount of data in GiB of disk writes across all Compute Nodes in the Pool.
     *
     * @return the diskWriteGiB value
     */
    public double diskWriteGiB() {
        return this.diskWriteGiB;
    }

    /**
     * Set the total amount of data in GiB of disk writes across all Compute Nodes in the Pool.
     *
     * @param diskWriteGiB the diskWriteGiB value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withDiskWriteGiB(double diskWriteGiB) {
        this.diskWriteGiB = diskWriteGiB;
        return this;
    }

    /**
     * Get the total amount of data in GiB of network reads across all Compute Nodes in the Pool.
     *
     * @return the networkReadGiB value
     */
    public double networkReadGiB() {
        return this.networkReadGiB;
    }

    /**
     * Set the total amount of data in GiB of network reads across all Compute Nodes in the Pool.
     *
     * @param networkReadGiB the networkReadGiB value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withNetworkReadGiB(double networkReadGiB) {
        this.networkReadGiB = networkReadGiB;
        return this;
    }

    /**
     * Get the total amount of data in GiB of network writes across all Compute Nodes in the Pool.
     *
     * @return the networkWriteGiB value
     */
    public double networkWriteGiB() {
        return this.networkWriteGiB;
    }

    /**
     * Set the total amount of data in GiB of network writes across all Compute Nodes in the Pool.
     *
     * @param networkWriteGiB the networkWriteGiB value to set
     * @return the ResourceStatistics object itself.
     */
    public ResourceStatistics withNetworkWriteGiB(double networkWriteGiB) {
        this.networkWriteGiB = networkWriteGiB;
        return this;
    }

}
