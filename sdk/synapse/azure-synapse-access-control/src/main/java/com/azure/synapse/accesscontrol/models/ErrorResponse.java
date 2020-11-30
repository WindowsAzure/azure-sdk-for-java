// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.accesscontrol.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ErrorResponse model. */
@Fluent
public final class ErrorResponse {
    /*
     * The code property.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * The message property.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * The target property.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * The details property.
     */
    @JsonProperty(value = "details")
    private List<ErrorDetail> details;

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The message property.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: The message property.
     *
     * @param message the message value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: The target property.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: The target property.
     *
     * @param target the target value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: The details property.
     *
     * @return the details value.
     */
    public List<ErrorDetail> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     *
     * @param details the details value to set.
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse setDetails(List<ErrorDetail> details) {
        this.details = details;
        return this;
    }
}
