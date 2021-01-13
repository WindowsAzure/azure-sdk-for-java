// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Current job details of the migration item. */
@Fluent
public final class CurrentJobDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CurrentJobDetails.class);

    /*
     * The job name.
     */
    @JsonProperty(value = "jobName")
    private String jobName;

    /*
     * The ARM Id of the job being executed.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /*
     * The start time of the job.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /**
     * Get the jobName property: The job name.
     *
     * @return the jobName value.
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * Set the jobName property: The job name.
     *
     * @param jobName the jobName value to set.
     * @return the CurrentJobDetails object itself.
     */
    public CurrentJobDetails withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Get the jobId property: The ARM Id of the job being executed.
     *
     * @return the jobId value.
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: The ARM Id of the job being executed.
     *
     * @param jobId the jobId value to set.
     * @return the CurrentJobDetails object itself.
     */
    public CurrentJobDetails withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the startTime property: The start time of the job.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the job.
     *
     * @param startTime the startTime value to set.
     * @return the CurrentJobDetails object itself.
     */
    public CurrentJobDetails withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
