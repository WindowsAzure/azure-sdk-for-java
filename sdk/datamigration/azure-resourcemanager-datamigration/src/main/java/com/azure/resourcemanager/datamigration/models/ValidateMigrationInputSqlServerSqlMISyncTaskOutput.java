// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Output for task that validates migration input for Azure SQL Database Managed Instance online migration. */
@Immutable
public final class ValidateMigrationInputSqlServerSqlMISyncTaskOutput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ValidateMigrationInputSqlServerSqlMISyncTaskOutput.class);

    /*
     * Database identifier
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of database
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Errors associated with a selected database object
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get the id property: Database identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of database.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the validationErrors property: Errors associated with a selected database object.
     *
     * @return the validationErrors value.
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}
