// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Custom domain validate payload. */
@Fluent
public final class CustomDomainValidatePayload {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomDomainValidatePayload.class);

    /*
     * Name to be validated
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the name property: Name to be validated.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name to be validated.
     *
     * @param name the name value to set.
     * @return the CustomDomainValidatePayload object itself.
     */
    public CustomDomainValidatePayload withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model CustomDomainValidatePayload"));
        }
    }
}
