/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error definition for managed integration runtime.
 */
public class ManagedIntegrationRuntimeError {
    /**
     * The time when the error occurred.
     */
    @JsonProperty(value = "time", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime time;

    /**
     * Error code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /**
     * Managed integration runtime error parameters.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> parameters;

    /**
     * Error message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the time when the error occurred.
     *
     * @return the time value
     */
    public DateTime time() {
        return this.time;
    }

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Get managed integration runtime error parameters.
     *
     * @return the parameters value
     */
    public List<String> parameters() {
        return this.parameters;
    }

    /**
     * Get error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

}
