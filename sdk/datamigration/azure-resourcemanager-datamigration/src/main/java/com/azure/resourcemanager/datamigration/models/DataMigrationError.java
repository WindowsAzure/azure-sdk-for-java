// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Migration Task errors. */
@Fluent
public final class DataMigrationError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataMigrationError.class);

    /*
     * Error description
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Type of error.
     */
    @JsonProperty(value = "type")
    private ErrorType type;

    /**
     * Get the message property: Error description.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the type property: Type of error.
     *
     * @return the type value.
     */
    public ErrorType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of error.
     *
     * @param type the type value to set.
     * @return the DataMigrationError object itself.
     */
    public DataMigrationError withType(ErrorType type) {
        this.type = type;
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
