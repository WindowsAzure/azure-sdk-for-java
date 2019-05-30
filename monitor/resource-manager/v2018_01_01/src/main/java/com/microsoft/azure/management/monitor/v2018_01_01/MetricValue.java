/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_01_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a metric value.
 */
public class MetricValue {
    /**
     * the timestamp for the metric value in ISO 8601 format.
     */
    @JsonProperty(value = "timeStamp", required = true)
    private DateTime timeStamp;

    /**
     * the average value in the time range.
     */
    @JsonProperty(value = "average")
    private Double average;

    /**
     * the least value in the time range.
     */
    @JsonProperty(value = "minimum")
    private Double minimum;

    /**
     * the greatest value in the time range.
     */
    @JsonProperty(value = "maximum")
    private Double maximum;

    /**
     * the sum of all of the values in the time range.
     */
    @JsonProperty(value = "total")
    private Double total;

    /**
     * the number of samples in the time range. Can be used to determine the
     * number of values that contributed to the average value.
     */
    @JsonProperty(value = "count")
    private Long count;

    /**
     * Get the timestamp for the metric value in ISO 8601 format.
     *
     * @return the timeStamp value
     */
    public DateTime timeStamp() {
        return this.timeStamp;
    }

    /**
     * Set the timestamp for the metric value in ISO 8601 format.
     *
     * @param timeStamp the timeStamp value to set
     * @return the MetricValue object itself.
     */
    public MetricValue withTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * Get the average value in the time range.
     *
     * @return the average value
     */
    public Double average() {
        return this.average;
    }

    /**
     * Set the average value in the time range.
     *
     * @param average the average value to set
     * @return the MetricValue object itself.
     */
    public MetricValue withAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * Get the least value in the time range.
     *
     * @return the minimum value
     */
    public Double minimum() {
        return this.minimum;
    }

    /**
     * Set the least value in the time range.
     *
     * @param minimum the minimum value to set
     * @return the MetricValue object itself.
     */
    public MetricValue withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the greatest value in the time range.
     *
     * @return the maximum value
     */
    public Double maximum() {
        return this.maximum;
    }

    /**
     * Set the greatest value in the time range.
     *
     * @param maximum the maximum value to set
     * @return the MetricValue object itself.
     */
    public MetricValue withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the sum of all of the values in the time range.
     *
     * @return the total value
     */
    public Double total() {
        return this.total;
    }

    /**
     * Set the sum of all of the values in the time range.
     *
     * @param total the total value to set
     * @return the MetricValue object itself.
     */
    public MetricValue withTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Get the number of samples in the time range. Can be used to determine the number of values that contributed to the average value.
     *
     * @return the count value
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the number of samples in the time range. Can be used to determine the number of values that contributed to the average value.
     *
     * @param count the count value to set
     * @return the MetricValue object itself.
     */
    public MetricValue withCount(Long count) {
        this.count = count;
        return this;
    }

}
