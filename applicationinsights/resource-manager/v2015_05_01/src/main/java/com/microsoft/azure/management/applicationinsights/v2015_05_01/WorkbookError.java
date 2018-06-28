/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error message body that will indicate why the operation failed.
 */
public class WorkbookError {
    /**
     * Service-defined error code. This code serves as a sub-status for the
     * HTTP error code specified in the response.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Human-readable representation of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The list of invalid fields send in request, in case of validation error.
     */
    @JsonProperty(value = "details")
    private List<ErrorFieldContract> details;

    /**
     * Get service-defined error code. This code serves as a sub-status for the HTTP error code specified in the response.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set service-defined error code. This code serves as a sub-status for the HTTP error code specified in the response.
     *
     * @param code the code value to set
     * @return the WorkbookError object itself.
     */
    public WorkbookError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get human-readable representation of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set human-readable representation of the error.
     *
     * @param message the message value to set
     * @return the WorkbookError object itself.
     */
    public WorkbookError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the list of invalid fields send in request, in case of validation error.
     *
     * @return the details value
     */
    public List<ErrorFieldContract> details() {
        return this.details;
    }

    /**
     * Set the list of invalid fields send in request, in case of validation error.
     *
     * @param details the details value to set
     * @return the WorkbookError object itself.
     */
    public WorkbookError withDetails(List<ErrorFieldContract> details) {
        this.details = details;
        return this;
    }

}
