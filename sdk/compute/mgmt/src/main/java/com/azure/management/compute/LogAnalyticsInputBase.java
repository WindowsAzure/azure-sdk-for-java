// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The LogAnalyticsInputBase model. */
@Fluent
public class LogAnalyticsInputBase {
    /*
     * SAS Uri of the logging blob container to which LogAnalytics Api writes
     * output logs to.
     */
    @JsonProperty(value = "blobContainerSasUri", required = true)
    private String blobContainerSasUri;

    /*
     * From time of the query
     */
    @JsonProperty(value = "fromTime", required = true)
    private OffsetDateTime fromTime;

    /*
     * To time of the query
     */
    @JsonProperty(value = "toTime", required = true)
    private OffsetDateTime toTime;

    /*
     * Group query result by Throttle Policy applied.
     */
    @JsonProperty(value = "groupByThrottlePolicy")
    private Boolean groupByThrottlePolicy;

    /*
     * Group query result by Operation Name.
     */
    @JsonProperty(value = "groupByOperationName")
    private Boolean groupByOperationName;

    /*
     * Group query result by Resource Name.
     */
    @JsonProperty(value = "groupByResourceName")
    private Boolean groupByResourceName;

    /**
     * Get the blobContainerSasUri property: SAS Uri of the logging blob container to which LogAnalytics Api writes
     * output logs to.
     *
     * @return the blobContainerSasUri value.
     */
    public String blobContainerSasUri() {
        return this.blobContainerSasUri;
    }

    /**
     * Set the blobContainerSasUri property: SAS Uri of the logging blob container to which LogAnalytics Api writes
     * output logs to.
     *
     * @param blobContainerSasUri the blobContainerSasUri value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withBlobContainerSasUri(String blobContainerSasUri) {
        this.blobContainerSasUri = blobContainerSasUri;
        return this;
    }

    /**
     * Get the fromTime property: From time of the query.
     *
     * @return the fromTime value.
     */
    public OffsetDateTime fromTime() {
        return this.fromTime;
    }

    /**
     * Set the fromTime property: From time of the query.
     *
     * @param fromTime the fromTime value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withFromTime(OffsetDateTime fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    /**
     * Get the toTime property: To time of the query.
     *
     * @return the toTime value.
     */
    public OffsetDateTime toTime() {
        return this.toTime;
    }

    /**
     * Set the toTime property: To time of the query.
     *
     * @param toTime the toTime value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withToTime(OffsetDateTime toTime) {
        this.toTime = toTime;
        return this;
    }

    /**
     * Get the groupByThrottlePolicy property: Group query result by Throttle Policy applied.
     *
     * @return the groupByThrottlePolicy value.
     */
    public Boolean groupByThrottlePolicy() {
        return this.groupByThrottlePolicy;
    }

    /**
     * Set the groupByThrottlePolicy property: Group query result by Throttle Policy applied.
     *
     * @param groupByThrottlePolicy the groupByThrottlePolicy value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByThrottlePolicy(Boolean groupByThrottlePolicy) {
        this.groupByThrottlePolicy = groupByThrottlePolicy;
        return this;
    }

    /**
     * Get the groupByOperationName property: Group query result by Operation Name.
     *
     * @return the groupByOperationName value.
     */
    public Boolean groupByOperationName() {
        return this.groupByOperationName;
    }

    /**
     * Set the groupByOperationName property: Group query result by Operation Name.
     *
     * @param groupByOperationName the groupByOperationName value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByOperationName(Boolean groupByOperationName) {
        this.groupByOperationName = groupByOperationName;
        return this;
    }

    /**
     * Get the groupByResourceName property: Group query result by Resource Name.
     *
     * @return the groupByResourceName value.
     */
    public Boolean groupByResourceName() {
        return this.groupByResourceName;
    }

    /**
     * Set the groupByResourceName property: Group query result by Resource Name.
     *
     * @param groupByResourceName the groupByResourceName value to set.
     * @return the LogAnalyticsInputBase object itself.
     */
    public LogAnalyticsInputBase withGroupByResourceName(Boolean groupByResourceName) {
        this.groupByResourceName = groupByResourceName;
        return this;
    }
}
