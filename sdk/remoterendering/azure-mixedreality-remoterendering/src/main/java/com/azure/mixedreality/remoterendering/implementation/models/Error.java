// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.mixedreality.remoterendering.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The error object containing details of why the request failed. */
@Fluent
public final class Error {
    /*
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * A human-readable representation of the error.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * An array of details about specific errors that led to this reported
     * error.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<Error> details;

    /*
     * The target of the particular error (e.g., the name of the property in
     * error).
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /*
     * An object containing more specific information than the current object
     * about the error.
     */
    @JsonProperty(value = "innerError", access = JsonProperty.Access.WRITE_ONLY)
    private Error innerError;

    /**
     * Creates an instance of Error class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @JsonCreator
    public Error(
            @JsonProperty(value = "code", required = true) String code,
            @JsonProperty(value = "message", required = true) String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable representation of the error.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the details property: An array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    public List<Error> getDetails() {
        return this.details;
    }

    /**
     * Get the target property: The target of the particular error (e.g., the name of the property in error).
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the innerError property: An object containing more specific information than the current object about the
     * error.
     *
     * @return the innerError value.
     */
    public Error getInnerError() {
        return this.innerError;
    }
}
