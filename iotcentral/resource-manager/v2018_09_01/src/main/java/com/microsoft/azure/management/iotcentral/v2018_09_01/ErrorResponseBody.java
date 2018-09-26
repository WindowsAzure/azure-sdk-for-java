/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of error response.
 */
public class ErrorResponseBody {
    /**
     * Error code, intended to be consumed programmatically.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Description of the error, intended for display in user interface.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Target of the particular error, for example name of the property.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /**
     * A list of additional details about the error.
     */
    @JsonProperty(value = "details")
    private List<ErrorResponseBody> details;

    /**
     * Get error code, intended to be consumed programmatically.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get description of the error, intended for display in user interface.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get target of the particular error, for example name of the property.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Get a list of additional details about the error.
     *
     * @return the details value
     */
    public List<ErrorResponseBody> details() {
        return this.details;
    }

    /**
     * Set a list of additional details about the error.
     *
     * @param details the details value to set
     * @return the ErrorResponseBody object itself.
     */
    public ErrorResponseBody withDetails(List<ErrorResponseBody> details) {
        this.details = details;
        return this;
    }

}
