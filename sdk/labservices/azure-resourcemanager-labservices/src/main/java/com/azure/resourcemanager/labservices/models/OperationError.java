// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error details for the operation in case of a failure. */
@Fluent
public final class OperationError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationError.class);

    /*
     * The error code of the operation error.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The error message of the operation error.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: The error code of the operation error.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The error code of the operation error.
     *
     * @param code the code value to set.
     * @return the OperationError object itself.
     */
    public OperationError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: The error message of the operation error.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The error message of the operation error.
     *
     * @param message the message value to set.
     * @return the OperationError object itself.
     */
    public OperationError withMessage(String message) {
        this.message = message;
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
