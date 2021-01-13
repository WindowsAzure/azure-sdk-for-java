// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the error used to indicate why the target compute size is not applicable. */
@Fluent
public final class ComputeSizeErrorDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ComputeSizeErrorDetails.class);

    /*
     * The error message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The severity of the error.
     */
    @JsonProperty(value = "severity")
    private String severity;

    /**
     * Get the message property: The error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message.
     *
     * @param message the message value to set.
     * @return the ComputeSizeErrorDetails object itself.
     */
    public ComputeSizeErrorDetails withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the severity property: The severity of the error.
     *
     * @return the severity value.
     */
    public String severity() {
        return this.severity;
    }

    /**
     * Set the severity property: The severity of the error.
     *
     * @param severity the severity value to set.
     * @return the ComputeSizeErrorDetails object itself.
     */
    public ComputeSizeErrorDetails withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
