// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error information associated with operation status call. */
@Fluent
public final class OperationStatusError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationStatusError.class);

    /*
     * Error code of the operation failure.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Error message displayed if the operation failure.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: Error code of the operation failure.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Error code of the operation failure.
     *
     * @param code the code value to set.
     * @return the OperationStatusError object itself.
     */
    public OperationStatusError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message displayed if the operation failure.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Error message displayed if the operation failure.
     *
     * @param message the message value to set.
     * @return the OperationStatusError object itself.
     */
    public OperationStatusError withMessage(String message) {
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
