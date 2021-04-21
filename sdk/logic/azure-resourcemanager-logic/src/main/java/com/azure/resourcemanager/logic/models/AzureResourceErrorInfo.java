// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The azure resource error info. */
@Fluent
public final class AzureResourceErrorInfo extends ErrorInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureResourceErrorInfo.class);

    /*
     * The error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * The error details.
     */
    @JsonProperty(value = "details")
    private List<AzureResourceErrorInfo> details;

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
     * @return the AzureResourceErrorInfo object itself.
     */
    public AzureResourceErrorInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the details property: The error details.
     *
     * @return the details value.
     */
    public List<AzureResourceErrorInfo> details() {
        return this.details;
    }

    /**
     * Set the details property: The error details.
     *
     * @param details the details value to set.
     * @return the AzureResourceErrorInfo object itself.
     */
    public AzureResourceErrorInfo withDetails(List<AzureResourceErrorInfo> details) {
        this.details = details;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureResourceErrorInfo withCode(String code) {
        super.withCode(code);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (message() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property message in model AzureResourceErrorInfo"));
        }
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
