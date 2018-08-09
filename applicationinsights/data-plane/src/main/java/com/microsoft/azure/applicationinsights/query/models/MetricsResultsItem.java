/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MetricsResultsItem model.
 */
public class MetricsResultsItem {
    /**
     * The specified ID for this metric.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The HTTP status code of this metric query.
     */
    @JsonProperty(value = "status", required = true)
    private int status;

    /**
     * The results of this metric query.
     */
    @JsonProperty(value = "body", required = true)
    private MetricsResult body;

    /**
     * Get the specified ID for this metric.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the specified ID for this metric.
     *
     * @param id the id value to set
     * @return the MetricsResultsItem object itself.
     */
    public MetricsResultsItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the HTTP status code of this metric query.
     *
     * @return the status value
     */
    public int status() {
        return this.status;
    }

    /**
     * Set the HTTP status code of this metric query.
     *
     * @param status the status value to set
     * @return the MetricsResultsItem object itself.
     */
    public MetricsResultsItem withStatus(int status) {
        this.status = status;
        return this;
    }

    /**
     * Get the results of this metric query.
     *
     * @return the body value
     */
    public MetricsResult body() {
        return this.body;
    }

    /**
     * Set the results of this metric query.
     *
     * @param body the body value to set
     * @return the MetricsResultsItem object itself.
     */
    public MetricsResultsItem withBody(MetricsResult body) {
        this.body = body;
        return this;
    }

}
