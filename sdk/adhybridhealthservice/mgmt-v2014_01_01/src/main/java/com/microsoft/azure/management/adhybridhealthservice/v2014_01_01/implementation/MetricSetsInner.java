/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.MetricSet;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The metrics data represented set.
 */
public class MetricSetsInner {
    /**
     * The list of metric set.
     */
    @JsonProperty(value = "sets")
    private List<MetricSet> sets;

    /**
     * The list of timestamps for each metric in the metric set.
     */
    @JsonProperty(value = "timeStamps")
    private List<DateTime> timeStamps;

    /**
     * Get the list of metric set.
     *
     * @return the sets value
     */
    public List<MetricSet> sets() {
        return this.sets;
    }

    /**
     * Set the list of metric set.
     *
     * @param sets the sets value to set
     * @return the MetricSetsInner object itself.
     */
    public MetricSetsInner withSets(List<MetricSet> sets) {
        this.sets = sets;
        return this;
    }

    /**
     * Get the list of timestamps for each metric in the metric set.
     *
     * @return the timeStamps value
     */
    public List<DateTime> timeStamps() {
        return this.timeStamps;
    }

    /**
     * Set the list of timestamps for each metric in the metric set.
     *
     * @param timeStamps the timeStamps value to set
     * @return the MetricSetsInner object itself.
     */
    public MetricSetsInner withTimeStamps(List<DateTime> timeStamps) {
        this.timeStamps = timeStamps;
        return this;
    }

}
