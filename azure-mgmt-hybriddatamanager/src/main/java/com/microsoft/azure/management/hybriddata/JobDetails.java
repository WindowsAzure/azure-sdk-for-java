/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybriddata;

import java.util.List;
import com.microsoft.azure.management.hybriddata.implementation.JobDefinitionInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Job details.
 */
public class JobDetails {
    /**
     * List of stages that ran in the job.
     */
    @JsonProperty(value = "jobStages")
    private List<JobStages> jobStages;

    /**
     * JobDefinition at the time of the run.
     */
    @JsonProperty(value = "jobDefinition")
    private JobDefinitionInner jobDefinition;

    /**
     * Error details for failure. This is optional.
     */
    @JsonProperty(value = "errorDetails")
    private List<ErrorDetails> errorDetails;

    /**
     * Item Details Link to download files or see details.
     */
    @JsonProperty(value = "itemDetailsLink")
    private String itemDetailsLink;

    /**
     * Get list of stages that ran in the job.
     *
     * @return the jobStages value
     */
    public List<JobStages> jobStages() {
        return this.jobStages;
    }

    /**
     * Set list of stages that ran in the job.
     *
     * @param jobStages the jobStages value to set
     * @return the JobDetails object itself.
     */
    public JobDetails withJobStages(List<JobStages> jobStages) {
        this.jobStages = jobStages;
        return this;
    }

    /**
     * Get jobDefinition at the time of the run.
     *
     * @return the jobDefinition value
     */
    public JobDefinitionInner jobDefinition() {
        return this.jobDefinition;
    }

    /**
     * Set jobDefinition at the time of the run.
     *
     * @param jobDefinition the jobDefinition value to set
     * @return the JobDetails object itself.
     */
    public JobDetails withJobDefinition(JobDefinitionInner jobDefinition) {
        this.jobDefinition = jobDefinition;
        return this;
    }

    /**
     * Get error details for failure. This is optional.
     *
     * @return the errorDetails value
     */
    public List<ErrorDetails> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set error details for failure. This is optional.
     *
     * @param errorDetails the errorDetails value to set
     * @return the JobDetails object itself.
     */
    public JobDetails withErrorDetails(List<ErrorDetails> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get item Details Link to download files or see details.
     *
     * @return the itemDetailsLink value
     */
    public String itemDetailsLink() {
        return this.itemDetailsLink;
    }

    /**
     * Set item Details Link to download files or see details.
     *
     * @param itemDetailsLink the itemDetailsLink value to set
     * @return the JobDetails object itself.
     */
    public JobDetails withItemDetailsLink(String itemDetailsLink) {
        this.itemDetailsLink = itemDetailsLink;
        return this;
    }

}
