// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The HealthcareJobState model.
 */
@Fluent
public final class HealthcareJobState extends JobMetadata {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private HealthcareResult results;

    /*
     * The errors property.
     */
    @JsonProperty(value = "errors")
    private List<TextAnalyticsError> errors;

    /*
     * The @nextLink property.
     */
    @JsonProperty(value = "@nextLink")
    private String nextLink;

    /**
     * Get the results property: The results property.
     * 
     * @return the results value.
     */
    public HealthcareResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     * 
     * @param results the results value to set.
     * @return the HealthcareJobState object itself.
     */
    public HealthcareJobState setResults(HealthcareResult results) {
        this.results = results;
        return this;
    }

    /**
     * Get the errors property: The errors property.
     * 
     * @return the errors value.
     */
    public List<TextAnalyticsError> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: The errors property.
     * 
     * @param errors the errors value to set.
     * @return the HealthcareJobState object itself.
     */
    public HealthcareJobState setErrors(List<TextAnalyticsError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the nextLink property: The @nextLink property.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The @nextLink property.
     * 
     * @param nextLink the nextLink value to set.
     * @return the HealthcareJobState object itself.
     */
    public HealthcareJobState setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
