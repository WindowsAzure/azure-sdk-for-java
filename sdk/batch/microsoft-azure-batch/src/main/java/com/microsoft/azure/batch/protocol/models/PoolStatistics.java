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
 * Contains utilization and resource usage statistics for the lifetime of a
 * Pool.
 */
public class PoolStatistics {
    /**
     * The URL for the statistics.
     */
    @JsonProperty(value = "url", required = true)
    private String url;

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
     * Statistics related to Pool usage, such as the amount of core-time used.
     */
    @JsonProperty(value = "usageStats")
    private UsageStatistics usageStats;

    /**
     * Statistics related to resource consumption by Compute Nodes in the Pool.
     */
    @JsonProperty(value = "resourceStats")
    private ResourceStatistics resourceStats;

    /**
     * Get the URL for the statistics.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the URL for the statistics.
     *
     * @param url the url value to set
     * @return the PoolStatistics object itself.
     */
    public PoolStatistics withUrl(String url) {
        this.url = url;
        return this;
    }

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
     * @return the PoolStatistics object itself.
     */
    public PoolStatistics withStartTime(DateTime startTime) {
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
     * @return the PoolStatistics object itself.
     */
    public PoolStatistics withLastUpdateTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * Get statistics related to Pool usage, such as the amount of core-time used.
     *
     * @return the usageStats value
     */
    public UsageStatistics usageStats() {
        return this.usageStats;
    }

    /**
     * Set statistics related to Pool usage, such as the amount of core-time used.
     *
     * @param usageStats the usageStats value to set
     * @return the PoolStatistics object itself.
     */
    public PoolStatistics withUsageStats(UsageStatistics usageStats) {
        this.usageStats = usageStats;
        return this;
    }

    /**
     * Get statistics related to resource consumption by Compute Nodes in the Pool.
     *
     * @return the resourceStats value
     */
    public ResourceStatistics resourceStats() {
        return this.resourceStats;
    }

    /**
     * Set statistics related to resource consumption by Compute Nodes in the Pool.
     *
     * @param resourceStats the resourceStats value to set
     * @return the PoolStatistics object itself.
     */
    public PoolStatistics withResourceStats(ResourceStatistics resourceStats) {
        this.resourceStats = resourceStats;
        return this;
    }

}
