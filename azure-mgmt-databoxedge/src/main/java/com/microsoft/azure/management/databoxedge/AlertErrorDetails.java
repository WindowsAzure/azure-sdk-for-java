/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details for the alert.
 */
public class AlertErrorDetails {
    /**
     * Error code.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private String errorCode;

    /**
     * Error Message.
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Number of occurrences.
     */
    @JsonProperty(value = "occurrences", access = JsonProperty.Access.WRITE_ONLY)
    private Integer occurrences;

    /**
     * Get error code.
     *
     * @return the errorCode value
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get error Message.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get number of occurrences.
     *
     * @return the occurrences value
     */
    public Integer occurrences() {
        return this.occurrences;
    }

}
