/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler.v2016_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JobCollectionQuota model.
 */
public class JobCollectionQuota {
    /**
     * Gets or set the maximum job count.
     */
    @JsonProperty(value = "maxJobCount")
    private Integer maxJobCount;

    /**
     * Gets or sets the maximum job occurrence.
     */
    @JsonProperty(value = "maxJobOccurrence")
    private Integer maxJobOccurrence;

    /**
     * Gets or set the maximum recurrence.
     */
    @JsonProperty(value = "maxRecurrence")
    private JobMaxRecurrence maxRecurrence;

    /**
     * Get the maxJobCount value.
     *
     * @return the maxJobCount value
     */
    public Integer maxJobCount() {
        return this.maxJobCount;
    }

    /**
     * Set the maxJobCount value.
     *
     * @param maxJobCount the maxJobCount value to set
     * @return the JobCollectionQuota object itself.
     */
    public JobCollectionQuota withMaxJobCount(Integer maxJobCount) {
        this.maxJobCount = maxJobCount;
        return this;
    }

    /**
     * Get the maxJobOccurrence value.
     *
     * @return the maxJobOccurrence value
     */
    public Integer maxJobOccurrence() {
        return this.maxJobOccurrence;
    }

    /**
     * Set the maxJobOccurrence value.
     *
     * @param maxJobOccurrence the maxJobOccurrence value to set
     * @return the JobCollectionQuota object itself.
     */
    public JobCollectionQuota withMaxJobOccurrence(Integer maxJobOccurrence) {
        this.maxJobOccurrence = maxJobOccurrence;
        return this;
    }

    /**
     * Get the maxRecurrence value.
     *
     * @return the maxRecurrence value
     */
    public JobMaxRecurrence maxRecurrence() {
        return this.maxRecurrence;
    }

    /**
     * Set the maxRecurrence value.
     *
     * @param maxRecurrence the maxRecurrence value to set
     * @return the JobCollectionQuota object itself.
     */
    public JobCollectionQuota withMaxRecurrence(JobMaxRecurrence maxRecurrence) {
        this.maxRecurrence = maxRecurrence;
        return this;
    }

}
