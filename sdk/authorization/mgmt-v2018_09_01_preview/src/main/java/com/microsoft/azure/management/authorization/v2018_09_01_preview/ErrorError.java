/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object to be thrown in case of an unsuccessful response.
 */
public class ErrorError {
    /**
     * Brief error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Longer message explaining the details of the error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get brief error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set brief error code.
     *
     * @param code the code value to set
     * @return the ErrorError object itself.
     */
    public ErrorError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get longer message explaining the details of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set longer message explaining the details of the error.
     *
     * @param message the message value to set
     * @return the ErrorError object itself.
     */
    public ErrorError withMessage(String message) {
        this.message = message;
        return this;
    }

}
