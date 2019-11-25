/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Triggered Web Job Run Information.
 */
@JsonFlatten
public class TriggeredJobRun extends ProxyOnlyResource {
    /**
     * Job ID.
     */
    @JsonProperty(value = "properties.web_job_id")
    private String webJobId;

    /**
     * Job name.
     */
    @JsonProperty(value = "properties.web_job_name")
    private String webJobName;

    /**
     * Job status. Possible values include: 'Success', 'Failed', 'Error'.
     */
    @JsonProperty(value = "properties.status")
    private TriggeredWebJobStatus status;

    /**
     * Start time.
     */
    @JsonProperty(value = "properties.start_time")
    private DateTime startTime;

    /**
     * End time.
     */
    @JsonProperty(value = "properties.end_time")
    private DateTime endTime;

    /**
     * Job duration.
     */
    @JsonProperty(value = "properties.duration")
    private String duration;

    /**
     * Output URL.
     */
    @JsonProperty(value = "properties.output_url")
    private String outputUrl;

    /**
     * Error URL.
     */
    @JsonProperty(value = "properties.error_url")
    private String errorUrl;

    /**
     * Job URL.
     */
    @JsonProperty(value = "properties.url")
    private String url;

    /**
     * Job name.
     */
    @JsonProperty(value = "properties.job_name")
    private String jobName;

    /**
     * Job trigger.
     */
    @JsonProperty(value = "properties.trigger")
    private String trigger;

    /**
     * Get job ID.
     *
     * @return the webJobId value
     */
    public String webJobId() {
        return this.webJobId;
    }

    /**
     * Set job ID.
     *
     * @param webJobId the webJobId value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withWebJobId(String webJobId) {
        this.webJobId = webJobId;
        return this;
    }

    /**
     * Get job name.
     *
     * @return the webJobName value
     */
    public String webJobName() {
        return this.webJobName;
    }

    /**
     * Set job name.
     *
     * @param webJobName the webJobName value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withWebJobName(String webJobName) {
        this.webJobName = webJobName;
        return this;
    }

    /**
     * Get job status. Possible values include: 'Success', 'Failed', 'Error'.
     *
     * @return the status value
     */
    public TriggeredWebJobStatus status() {
        return this.status;
    }

    /**
     * Set job status. Possible values include: 'Success', 'Failed', 'Error'.
     *
     * @param status the status value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withStatus(TriggeredWebJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get start time.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set start time.
     *
     * @param startTime the startTime value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get end time.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set end time.
     *
     * @param endTime the endTime value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get job duration.
     *
     * @return the duration value
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set job duration.
     *
     * @param duration the duration value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get output URL.
     *
     * @return the outputUrl value
     */
    public String outputUrl() {
        return this.outputUrl;
    }

    /**
     * Set output URL.
     *
     * @param outputUrl the outputUrl value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
        return this;
    }

    /**
     * Get error URL.
     *
     * @return the errorUrl value
     */
    public String errorUrl() {
        return this.errorUrl;
    }

    /**
     * Set error URL.
     *
     * @param errorUrl the errorUrl value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
        return this;
    }

    /**
     * Get job URL.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set job URL.
     *
     * @param url the url value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get job name.
     *
     * @return the jobName value
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * Set job name.
     *
     * @param jobName the jobName value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Get job trigger.
     *
     * @return the trigger value
     */
    public String trigger() {
        return this.trigger;
    }

    /**
     * Set job trigger.
     *
     * @param trigger the trigger value to set
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

}
