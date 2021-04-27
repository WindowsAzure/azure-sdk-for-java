// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The AnomalyState model. */
@Fluent
public final class AnomalyState {
    /*
     * timestamp
     */
    @JsonProperty(value = "timestamp", required = true)
    private OffsetDateTime timestamp;

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private AnomalyValue value;

    /*
     * Error message when inference this timestamp
     */
    @JsonProperty(value = "errors")
    private List<ErrorResponse> errors;

    /**
     * Get the timestamp property: timestamp.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: timestamp.
     *
     * @param timestamp the timestamp value to set.
     * @return the AnomalyState object itself.
     */
    public AnomalyState setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public AnomalyValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the AnomalyState object itself.
     */
    public AnomalyState setValue(AnomalyValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get the errors property: Error message when inference this timestamp.
     *
     * @return the errors value.
     */
    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Set the errors property: Error message when inference this timestamp.
     *
     * @param errors the errors value to set.
     * @return the AnomalyState object itself.
     */
    public AnomalyState setErrors(List<ErrorResponse> errors) {
        this.errors = errors;
        return this;
    }
}
