/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.mediaservices.v2018_07_01.JobState;
import com.microsoft.azure.management.mediaservices.v2018_07_01.JobInput;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_07_01.JobOutput;
import com.microsoft.azure.management.mediaservices.v2018_07_01.Priority;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A Job resource type. The progress and state can be obtained by polling a Job
 * or subscribing to events using EventGrid.
 */
@JsonFlatten
public class JobInner extends ProxyResource {
    /**
     * The UTC date and time when the Job was created, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The current state of the job. Possible values include: 'Canceled',
     * 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private JobState state;

    /**
     * Optional customer supplied description of the Job.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The inputs for the Job.
     */
    @JsonProperty(value = "properties.input", required = true)
    private JobInput input;

    /**
     * The UTC date and time when the Job was last updated, in
     * 'YYYY-MM-DDThh:mm:ssZ' format.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * The outputs for the Job.
     */
    @JsonProperty(value = "properties.outputs", required = true)
    private List<JobOutput> outputs;

    /**
     * Priority with which the job should be processed. Higher priority jobs
     * are processed before lower priority jobs. If not set, the default is
     * normal. Possible values include: 'Low', 'Normal', 'High'.
     */
    @JsonProperty(value = "properties.priority")
    private Priority priority;

    /**
     * Customer provided correlation data that will be returned in Job and
     * JobOutput state events.
     */
    @JsonProperty(value = "properties.correlationData")
    private Map<String, String> correlationData;

    /**
     * Get the UTC date and time when the Job was created, in 'YYYY-MM-DDThh:mm:ssZ' format.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the current state of the job. Possible values include: 'Canceled', 'Canceling', 'Error', 'Finished', 'Processing', 'Queued', 'Scheduled'.
     *
     * @return the state value
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Get optional customer supplied description of the Job.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set optional customer supplied description of the Job.
     *
     * @param description the description value to set
     * @return the JobInner object itself.
     */
    public JobInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the inputs for the Job.
     *
     * @return the input value
     */
    public JobInput input() {
        return this.input;
    }

    /**
     * Set the inputs for the Job.
     *
     * @param input the input value to set
     * @return the JobInner object itself.
     */
    public JobInner withInput(JobInput input) {
        this.input = input;
        return this;
    }

    /**
     * Get the UTC date and time when the Job was last updated, in 'YYYY-MM-DDThh:mm:ssZ' format.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the outputs for the Job.
     *
     * @return the outputs value
     */
    public List<JobOutput> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs for the Job.
     *
     * @param outputs the outputs value to set
     * @return the JobInner object itself.
     */
    public JobInner withOutputs(List<JobOutput> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * Get priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal. Possible values include: 'Low', 'Normal', 'High'.
     *
     * @return the priority value
     */
    public Priority priority() {
        return this.priority;
    }

    /**
     * Set priority with which the job should be processed. Higher priority jobs are processed before lower priority jobs. If not set, the default is normal. Possible values include: 'Low', 'Normal', 'High'.
     *
     * @param priority the priority value to set
     * @return the JobInner object itself.
     */
    public JobInner withPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get customer provided correlation data that will be returned in Job and JobOutput state events.
     *
     * @return the correlationData value
     */
    public Map<String, String> correlationData() {
        return this.correlationData;
    }

    /**
     * Set customer provided correlation data that will be returned in Job and JobOutput state events.
     *
     * @param correlationData the correlationData value to set
     * @return the JobInner object itself.
     */
    public JobInner withCorrelationData(Map<String, String> correlationData) {
        this.correlationData = correlationData;
        return this;
    }

}
