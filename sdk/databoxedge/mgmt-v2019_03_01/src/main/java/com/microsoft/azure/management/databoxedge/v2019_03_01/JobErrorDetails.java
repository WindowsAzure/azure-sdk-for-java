/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The job error information containing the list of job errors.
 */
public class JobErrorDetails {
    /**
     * The error details.
     */
    @JsonProperty(value = "errorDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobErrorItem> errorDetails;

    /**
     * The code intended for programmatic access.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The message that describes the error in detail.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the error details.
     *
     * @return the errorDetails value
     */
    public List<JobErrorItem> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Get the code intended for programmatic access.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message that describes the error in detail.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
