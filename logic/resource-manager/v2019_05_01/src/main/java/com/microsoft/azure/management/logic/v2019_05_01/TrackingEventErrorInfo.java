/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TrackingEventErrorInfo model.
 */
public class TrackingEventErrorInfo {
    /**
     * The message property.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the TrackingEventErrorInfo object itself.
     */
    public TrackingEventErrorInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the code value.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code value.
     *
     * @param code the code value to set
     * @return the TrackingEventErrorInfo object itself.
     */
    public TrackingEventErrorInfo withCode(String code) {
        this.code = code;
        return this;
    }

}
