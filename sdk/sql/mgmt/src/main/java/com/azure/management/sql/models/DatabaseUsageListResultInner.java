// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DatabaseUsageListResult model. */
@Fluent
public final class DatabaseUsageListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseUsageListResultInner.class);

    /*
     * The list of database usages for the database.
     */
    @JsonProperty(value = "value", required = true)
    private List<DatabaseUsageInner> value;

    /**
     * Get the value property: The list of database usages for the database.
     *
     * @return the value value.
     */
    public List<DatabaseUsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of database usages for the database.
     *
     * @param value the value value to set.
     * @return the DatabaseUsageListResultInner object itself.
     */
    public DatabaseUsageListResultInner withValue(List<DatabaseUsageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model DatabaseUsageListResultInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
