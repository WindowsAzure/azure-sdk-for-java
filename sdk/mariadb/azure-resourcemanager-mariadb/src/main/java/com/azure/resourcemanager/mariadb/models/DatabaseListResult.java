// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mariadb.fluent.models.DatabaseInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A List of databases. */
@Fluent
public final class DatabaseListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseListResult.class);

    /*
     * The list of databases housed in a server
     */
    @JsonProperty(value = "value")
    private List<DatabaseInner> value;

    /**
     * Get the value property: The list of databases housed in a server.
     *
     * @return the value value.
     */
    public List<DatabaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of databases housed in a server.
     *
     * @param value the value value to set.
     * @return the DatabaseListResult object itself.
     */
    public DatabaseListResult withValue(List<DatabaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
