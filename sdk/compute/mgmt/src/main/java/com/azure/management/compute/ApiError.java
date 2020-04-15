// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApiError model. */
@Fluent
public final class ApiError {
    /*
     * The Api error details
     */
    @JsonProperty(value = "details")
    private List<ApiErrorBase> details;

    /*
     * The Api inner error
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /*
     * The error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The target of the particular error.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the details property: The Api error details.
     *
     * @return the details value.
     */
    public List<ApiErrorBase> details() {
        return this.details;
    }

    /**
     * Set the details property: The Api error details.
     *
     * @param details the details value to set.
     * @return the ApiError object itself.
     */
    public ApiError withDetails(List<ApiErrorBase> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innererror property: The Api inner error.
     *
     * @return the innererror value.
     */
    public InnerError innererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: The Api inner error.
     *
     * @param innererror the innererror value to set.
     * @return the ApiError object itself.
     */
    public ApiError withInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }

    /**
     * Get the code property: The error code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The error code.
     *
     * @param code the code value to set.
     * @return the ApiError object itself.
     */
    public ApiError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the target property: The target of the particular error.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target of the particular error.
     *
     * @param target the target value to set.
     * @return the ApiError object itself.
     */
    public ApiError withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the ApiError object itself.
     */
    public ApiError withMessage(String message) {
        this.message = message;
        return this;
    }
}
