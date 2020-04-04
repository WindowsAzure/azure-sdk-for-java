// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ErrorDetails model.
 */
@Fluent
public final class ErrorDetails {
    /*
     * Error code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: Error code.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     * 
     * @param code the code value to set.
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the target property: Error target.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: Error target.
     * 
     * @param target the target value to set.
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the message property: Error message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     * 
     * @param message the message value to set.
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withMessage(String message) {
        this.message = message;
        return this;
    }
}
