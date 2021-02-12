/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details for when validation fails.
 */
public class ValidateResponseError {
    /**
     * Validation error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Validation error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get validation error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set validation error code.
     *
     * @param code the code value to set
     * @return the ValidateResponseError object itself.
     */
    public ValidateResponseError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get validation error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set validation error message.
     *
     * @param message the message value to set
     * @return the ValidateResponseError object itself.
     */
    public ValidateResponseError withMessage(String message) {
        this.message = message;
        return this;
    }

}
