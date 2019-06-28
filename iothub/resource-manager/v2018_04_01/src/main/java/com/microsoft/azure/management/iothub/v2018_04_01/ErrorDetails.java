/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details.
 */
public class ErrorDetails {
    /**
     * The error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * The HTTP status code.
     */
    @JsonProperty(value = "httpStatusCode", access = JsonProperty.Access.WRITE_ONLY)
    private String httpStatusCode;

    /**
     * The error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * The error details.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private String details;

    /**
     * Get the error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the HTTP status code.
     *
     * @return the httpStatusCode value
     */
    public String httpStatusCode() {
        return this.httpStatusCode;
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
     * Get the error details.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

}
