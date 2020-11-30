// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.CheckNameAvailabilityReason;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result of a name availability check. */
@Immutable
public final class CheckNameAvailabilityResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilityResponseInner.class);

    /*
     * The name whose availability was checked.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * True if the name is available, otherwise false.
     */
    @JsonProperty(value = "available", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean available;

    /*
     * The reason code explaining why the name is unavailable. Will be
     * undefined if the name is available.
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private CheckNameAvailabilityReason reason;

    /*
     * A message explaining why the name is unavailable. Will be undefined if
     * the name is available.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Get the name property: The name whose availability was checked.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the available property: True if the name is available, otherwise false.
     *
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Get the reason property: The reason code explaining why the name is unavailable. Will be undefined if the name is
     * available.
     *
     * @return the reason value.
     */
    public CheckNameAvailabilityReason reason() {
        return this.reason;
    }

    /**
     * Get the message property: A message explaining why the name is unavailable. Will be undefined if the name is
     * available.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
