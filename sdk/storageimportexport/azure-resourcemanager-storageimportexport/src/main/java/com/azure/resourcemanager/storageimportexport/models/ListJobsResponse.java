// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storageimportexport.fluent.models.JobResponseInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List jobs response. */
@Fluent
public final class ListJobsResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListJobsResponse.class);

    /*
     * link to next batch of jobs
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Job list
     */
    @JsonProperty(value = "value")
    private List<JobResponseInner> value;

    /**
     * Get the nextLink property: link to next batch of jobs.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: link to next batch of jobs.
     *
     * @param nextLink the nextLink value to set.
     * @return the ListJobsResponse object itself.
     */
    public ListJobsResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Job list.
     *
     * @return the value value.
     */
    public List<JobResponseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Job list.
     *
     * @param value the value value to set.
     * @return the ListJobsResponse object itself.
     */
    public ListJobsResponse withValue(List<JobResponseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
