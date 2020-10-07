// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Validation result for custom domain. */
@Fluent
public final class CustomDomainValidateResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomDomainValidateResult.class);

    /*
     * Indicates if domain name is valid.
     */
    @JsonProperty(value = "isValid")
    private Boolean isValid;

    /*
     * Message of why domain name is invalid.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the isValid property: Indicates if domain name is valid.
     *
     * @return the isValid value.
     */
    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * Set the isValid property: Indicates if domain name is valid.
     *
     * @param isValid the isValid value to set.
     * @return the CustomDomainValidateResult object itself.
     */
    public CustomDomainValidateResult withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    /**
     * Get the message property: Message of why domain name is invalid.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Message of why domain name is invalid.
     *
     * @param message the message value to set.
     * @return the CustomDomainValidateResult object itself.
     */
    public CustomDomainValidateResult withMessage(String message) {
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
