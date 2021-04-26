// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data Lake Store account name availability check parameters. */
@Fluent
public final class CheckNameAvailabilityParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckNameAvailabilityParameters.class);

    /*
     * The Data Lake Store name to check availability for.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The resource type. Note: This should not be set by the user, as the
     * constant value is Microsoft.DataLakeStore/accounts
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /** Creates an instance of CheckNameAvailabilityParameters class. */
    public CheckNameAvailabilityParameters() {
        type = "Microsoft.DataLakeStore/accounts";
    }

    /**
     * Get the name property: The Data Lake Store name to check availability for.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The Data Lake Store name to check availability for.
     *
     * @param name the name value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type. Note: This should not be set by the user, as the constant value is
     * Microsoft.DataLakeStore/accounts.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type. Note: This should not be set by the user, as the constant value is
     * Microsoft.DataLakeStore/accounts.
     *
     * @param type the type value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withType(String type) {
        this.type = type;
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
                        "Missing required property name in model CheckNameAvailabilityParameters"));
        }
    }
}
