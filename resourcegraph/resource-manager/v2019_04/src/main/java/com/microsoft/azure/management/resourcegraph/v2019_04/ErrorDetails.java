/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error details.
 */
public class ErrorDetails {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Error code identifying the specific error.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * A human readable error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get error code identifying the specific error.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code identifying the specific error.
     *
     * @param code the code value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get a human readable error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set a human readable error message.
     *
     * @param message the message value to set
     * @return the ErrorDetails object itself.
     */
    public ErrorDetails withMessage(String message) {
        this.message = message;
        return this;
    }

}
