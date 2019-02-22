/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Wait statistics gathered during query batch execution.
 */
public class WaitStatistics {
    /**
     * Type of the Wait.
     */
    @JsonProperty(value = "waitType")
    private String waitType;

    /**
     * Total wait time in millisecond(s).
     */
    @JsonProperty(value = "waitTimeMs")
    private Double waitTimeMs;

    /**
     * Total no. of waits.
     */
    @JsonProperty(value = "waitCount")
    private Long waitCount;

    /**
     * Get type of the Wait.
     *
     * @return the waitType value
     */
    public String waitType() {
        return this.waitType;
    }

    /**
     * Set type of the Wait.
     *
     * @param waitType the waitType value to set
     * @return the WaitStatistics object itself.
     */
    public WaitStatistics withWaitType(String waitType) {
        this.waitType = waitType;
        return this;
    }

    /**
     * Get total wait time in millisecond(s).
     *
     * @return the waitTimeMs value
     */
    public Double waitTimeMs() {
        return this.waitTimeMs;
    }

    /**
     * Set total wait time in millisecond(s).
     *
     * @param waitTimeMs the waitTimeMs value to set
     * @return the WaitStatistics object itself.
     */
    public WaitStatistics withWaitTimeMs(Double waitTimeMs) {
        this.waitTimeMs = waitTimeMs;
        return this;
    }

    /**
     * Get total no. of waits.
     *
     * @return the waitCount value
     */
    public Long waitCount() {
        return this.waitCount;
    }

    /**
     * Set total no. of waits.
     *
     * @param waitCount the waitCount value to set
     * @return the WaitStatistics object itself.
     */
    public WaitStatistics withWaitCount(Long waitCount) {
        this.waitCount = waitCount;
        return this;
    }

}
