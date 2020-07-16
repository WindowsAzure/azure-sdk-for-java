// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TextAnalyticsError model. */
@Fluent
public final class TextAnalyticsError {
    /*
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private ErrorCodeValue code;

    /*
     * Error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Inner error contains more specific information.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /*
     * Details about specific errors that led to this reported error.
     */
    @JsonProperty(value = "details")
    private List<TextAnalyticsError> details;

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public ErrorCodeValue getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     *
     * @param code the code value to set.
     * @return the TextAnalyticsError object itself.
     */
    public TextAnalyticsError setCode(ErrorCodeValue code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     *
     * @param message the message value to set.
     * @return the TextAnalyticsError object itself.
     */
    public TextAnalyticsError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: Error target.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Error target.
     *
     * @param target the target value to set.
     * @return the TextAnalyticsError object itself.
     */
    public TextAnalyticsError setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the innererror property: Inner error contains more specific information.
     *
     * @return the innererror value.
     */
    public InnerError getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: Inner error contains more specific information.
     *
     * @param innererror the innererror value to set.
     * @return the TextAnalyticsError object itself.
     */
    public TextAnalyticsError setInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }

    /**
     * Get the details property: Details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    public List<TextAnalyticsError> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: Details about specific errors that led to this reported error.
     *
     * @param details the details value to set.
     * @return the TextAnalyticsError object itself.
     */
    public TextAnalyticsError setDetails(List<TextAnalyticsError> details) {
        this.details = details;
        return this;
    }
}
