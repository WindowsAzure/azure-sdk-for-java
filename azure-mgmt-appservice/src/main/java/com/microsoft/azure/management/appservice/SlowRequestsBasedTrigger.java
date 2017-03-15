/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Trigger based on request execution time.
 */
public class SlowRequestsBasedTrigger {
    /**
     * Time taken.
     */
    @JsonProperty(value = "timeTaken")
    private String timeTaken;

    /**
     * Count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /**
     * Time interval.
     */
    @JsonProperty(value = "timeInterval")
    private String timeInterval;

    /**
     * Get the timeTaken value.
     *
     * @return the timeTaken value
     */
    public String timeTaken() {
        return this.timeTaken;
    }

    /**
     * Set the timeTaken value.
     *
     * @param timeTaken the timeTaken value to set
     * @return the SlowRequestsBasedTrigger object itself.
     */
    public SlowRequestsBasedTrigger withTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
        return this;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     * @return the SlowRequestsBasedTrigger object itself.
     */
    public SlowRequestsBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the timeInterval value.
     *
     * @return the timeInterval value
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval value.
     *
     * @param timeInterval the timeInterval value to set
     * @return the SlowRequestsBasedTrigger object itself.
     */
    public SlowRequestsBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

}
