/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Api error.
 */
public class ApiError {
    /**
     * The Api error details.
     */
    @JsonProperty(value = "details")
    private List<ApiErrorBase> details;

    /**
     * The Api inner error.
     */
    @JsonProperty(value = "innererror")
    private InnerError innererror;

    /**
     * The error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * The target of the particular error.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the Api error details.
     *
     * @return the details value
     */
    public List<ApiErrorBase> details() {
        return this.details;
    }

    /**
     * Set the Api error details.
     *
     * @param details the details value to set
     * @return the ApiError object itself.
     */
    public ApiError withDetails(List<ApiErrorBase> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the Api inner error.
     *
     * @return the innererror value
     */
    public InnerError innererror() {
        return this.innererror;
    }

    /**
     * Set the Api inner error.
     *
     * @param innererror the innererror value to set
     * @return the ApiError object itself.
     */
    public ApiError withInnererror(InnerError innererror) {
        this.innererror = innererror;
        return this;
    }

    /**
     * Get the error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the error code.
     *
     * @param code the code value to set
     * @return the ApiError object itself.
     */
    public ApiError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the target of the particular error.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target of the particular error.
     *
     * @param target the target value to set
     * @return the ApiError object itself.
     */
    public ApiError withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the error message.
     *
     * @param message the message value to set
     * @return the ApiError object itself.
     */
    public ApiError withMessage(String message) {
        this.message = message;
        return this;
    }

}
