/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.TriggerInner;

/**
 * Trigger that schedules pipeline runs for all fixed time interval windows
 * from a start time without gaps and also supports backfill scenarios (when
 * start time is in the past).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TumblingWindowTrigger")
@JsonFlatten
public class TumblingWindowTrigger extends TriggerInner {
    /**
     * Pipeline for which runs are created when an event is fired for trigger
     * window that is ready.
     */
    @JsonProperty(value = "pipeline", required = true)
    private TriggerPipelineReference pipeline;

    /**
     * The frequency of the time windows. Possible values include: 'Minute',
     * 'Hour'.
     */
    @JsonProperty(value = "typeProperties.frequency", required = true)
    private TumblingWindowFrequency frequency;

    /**
     * The interval of the time windows. The minimum interval allowed is 15
     * Minutes.
     */
    @JsonProperty(value = "typeProperties.interval", required = true)
    private int interval;

    /**
     * The start time for the time period for the trigger during which events
     * are fired for windows that are ready. Only UTC time is currently
     * supported.
     */
    @JsonProperty(value = "typeProperties.startTime", required = true)
    private DateTime startTime;

    /**
     * The end time for the time period for the trigger during which events are
     * fired for windows that are ready. Only UTC time is currently supported.
     */
    @JsonProperty(value = "typeProperties.endTime")
    private DateTime endTime;

    /**
     * Specifies how long the trigger waits past due time before triggering new
     * run. It doesn't alter window start and end time. The default is 0. Type:
     * string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "typeProperties.delay")
    private Object delay;

    /**
     * The max number of parallel time windows (ready for execution) for which
     * a new run is triggered.
     */
    @JsonProperty(value = "typeProperties.maxConcurrency", required = true)
    private int maxConcurrency;

    /**
     * Retry policy that will be applied for failed pipeline runs.
     */
    @JsonProperty(value = "typeProperties.retryPolicy")
    private RetryPolicy retryPolicy;

    /**
     * Triggers that this trigger depends on. Only tumbling window triggers are
     * supported.
     */
    @JsonProperty(value = "typeProperties.dependsOn")
    private List<DependencyReference> dependsOn;

    /**
     * Get pipeline for which runs are created when an event is fired for trigger window that is ready.
     *
     * @return the pipeline value
     */
    public TriggerPipelineReference pipeline() {
        return this.pipeline;
    }

    /**
     * Set pipeline for which runs are created when an event is fired for trigger window that is ready.
     *
     * @param pipeline the pipeline value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withPipeline(TriggerPipelineReference pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Get the frequency of the time windows. Possible values include: 'Minute', 'Hour'.
     *
     * @return the frequency value
     */
    public TumblingWindowFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency of the time windows. Possible values include: 'Minute', 'Hour'.
     *
     * @param frequency the frequency value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withFrequency(TumblingWindowFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the interval of the time windows. The minimum interval allowed is 15 Minutes.
     *
     * @return the interval value
     */
    public int interval() {
        return this.interval;
    }

    /**
     * Set the interval of the time windows. The minimum interval allowed is 15 Minutes.
     *
     * @param interval the interval value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withInterval(int interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the start time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     *
     * @param startTime the startTime value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the end time for the time period for the trigger during which events are fired for windows that are ready. Only UTC time is currently supported.
     *
     * @param endTime the endTime value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get specifies how long the trigger waits past due time before triggering new run. It doesn't alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the delay value
     */
    public Object delay() {
        return this.delay;
    }

    /**
     * Set specifies how long the trigger waits past due time before triggering new run. It doesn't alter window start and end time. The default is 0. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param delay the delay value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withDelay(Object delay) {
        this.delay = delay;
        return this;
    }

    /**
     * Get the max number of parallel time windows (ready for execution) for which a new run is triggered.
     *
     * @return the maxConcurrency value
     */
    public int maxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the max number of parallel time windows (ready for execution) for which a new run is triggered.
     *
     * @param maxConcurrency the maxConcurrency value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withMaxConcurrency(int maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * Get retry policy that will be applied for failed pipeline runs.
     *
     * @return the retryPolicy value
     */
    public RetryPolicy retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Set retry policy that will be applied for failed pipeline runs.
     *
     * @param retryPolicy the retryPolicy value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withRetryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Get triggers that this trigger depends on. Only tumbling window triggers are supported.
     *
     * @return the dependsOn value
     */
    public List<DependencyReference> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set triggers that this trigger depends on. Only tumbling window triggers are supported.
     *
     * @param dependsOn the dependsOn value to set
     * @return the TumblingWindowTrigger object itself.
     */
    public TumblingWindowTrigger withDependsOn(List<DependencyReference> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

}
