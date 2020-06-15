// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceNameAvailabilityRequest model. */
@Fluent
public final class ResourceNameAvailabilityRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceNameAvailabilityRequest.class);

    /*
     * Resource name to verify.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Resource type used for verification.
     */
    @JsonProperty(value = "type", required = true)
    private CheckNameResourceTypes type;

    /*
     * Is fully qualified domain name.
     */
    @JsonProperty(value = "isFqdn")
    private Boolean isFqdn;

    /**
     * Get the name property: Resource name to verify.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name to verify.
     *
     * @param name the name value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type used for verification.
     *
     * @return the type value.
     */
    public CheckNameResourceTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type used for verification.
     *
     * @param type the type value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withType(CheckNameResourceTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the isFqdn property: Is fully qualified domain name.
     *
     * @return the isFqdn value.
     */
    public Boolean isFqdn() {
        return this.isFqdn;
    }

    /**
     * Set the isFqdn property: Is fully qualified domain name.
     *
     * @param isFqdn the isFqdn value to set.
     * @return the ResourceNameAvailabilityRequest object itself.
     */
    public ResourceNameAvailabilityRequest withIsFqdn(Boolean isFqdn) {
        this.isFqdn = isFqdn;
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
                        "Missing required property name in model ResourceNameAvailabilityRequest"));
        }
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property type in model ResourceNameAvailabilityRequest"));
        }
    }
}
