/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Period;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A metric result data.
 */
public class MetricsResultInfo {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Start time of the metric.
     */
    @JsonProperty(value = "start")
    private DateTime start;

    /**
     * Start time of the metric.
     */
    @JsonProperty(value = "end")
    private DateTime end;

    /**
     * The interval used to segment the metric data.
     */
    @JsonProperty(value = "interval")
    private Period interval;

    /**
     * Segmented metric data (if segmented).
     */
    @JsonProperty(value = "segments")
    private List<MetricsSegmentInfo> segments;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the MetricsResultInfo object itself.
     */
    public MetricsResultInfo withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get start time of the metric.
     *
     * @return the start value
     */
    public DateTime start() {
        return this.start;
    }

    /**
     * Set start time of the metric.
     *
     * @param start the start value to set
     * @return the MetricsResultInfo object itself.
     */
    public MetricsResultInfo withStart(DateTime start) {
        this.start = start;
        return this;
    }

    /**
     * Get start time of the metric.
     *
     * @return the end value
     */
    public DateTime end() {
        return this.end;
    }

    /**
     * Set start time of the metric.
     *
     * @param end the end value to set
     * @return the MetricsResultInfo object itself.
     */
    public MetricsResultInfo withEnd(DateTime end) {
        this.end = end;
        return this;
    }

    /**
     * Get the interval used to segment the metric data.
     *
     * @return the interval value
     */
    public Period interval() {
        return this.interval;
    }

    /**
     * Set the interval used to segment the metric data.
     *
     * @param interval the interval value to set
     * @return the MetricsResultInfo object itself.
     */
    public MetricsResultInfo withInterval(Period interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get segmented metric data (if segmented).
     *
     * @return the segments value
     */
    public List<MetricsSegmentInfo> segments() {
        return this.segments;
    }

    /**
     * Set segmented metric data (if segmented).
     *
     * @param segments the segments value to set
     * @return the MetricsResultInfo object itself.
     */
    public MetricsResultInfo withSegments(List<MetricsSegmentInfo> segments) {
        this.segments = segments;
        return this;
    }

}
