// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the most recent job to run under the job schedule.
 */
public class RecentJob {
    /**
     * The ID of the job.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The URL of the job.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the RecentJob object itself.
     */
    public RecentJob withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the url value.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url value.
     *
     * @param url the url value to set
     * @return the RecentJob object itself.
     */
    public RecentJob withUrl(String url) {
        this.url = url;
        return this;
    }

}
