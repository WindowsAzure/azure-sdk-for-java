// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.textanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The Error model.
 */
@Fluent
public final class Error {
    /*
     * Error code. Possible values include: 'invalidRequest',
     * 'invalidArgument', 'internalServerError', 'serviceUnavailable'
     */
    @JsonProperty(value = "code", required = true)
    private String code;

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
    private InnerError innerError;

    /*
     * Details about specific errors that led to this reported error.
     */
    @JsonProperty(value = "details")
    private List<Error> details;

    /**
     * Get the code property: Error code. Possible values include:
     * 'invalidRequest', 'invalidArgument', 'internalServerError',
     * 'serviceUnavailable'.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code. Possible values include:
     * 'invalidRequest', 'invalidArgument', 'internalServerError',
     * 'serviceUnavailable'.
     *
     * @param code the code value to set.
     * @return the Error object itself.
     */
    public Error setCode(String code) {
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
     * @return the Error object itself.
     */
    public Error setMessage(String message) {
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
     * @return the Error object itself.
     */
    public Error setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the innererror property: Inner error contains more specific
     * information.
     *
     * @return the innererror value.
     */
    public InnerError getInnerError() {
        return this.innerError;
    }

    /**
     * Set the innererror property: Inner error contains more specific
     * information.
     *
     * @param innerError the innererror value to set.
     * @return the Error object itself.
     */
    public Error setInnerError(InnerError innerError) {
        this.innerError = innerError;
        return this;
    }

    /**
     * Get the details property: Details about specific errors that led to this
     * reported error.
     *
     * @return the details value.
     */
    public List<Error> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: Details about specific errors that led to this
     * reported error.
     *
     * @param details the details value to set.
     * @return the Error object itself.
     */
    public Error setDetails(List<Error> details) {
        this.details = details;
        return this;
    }
}
