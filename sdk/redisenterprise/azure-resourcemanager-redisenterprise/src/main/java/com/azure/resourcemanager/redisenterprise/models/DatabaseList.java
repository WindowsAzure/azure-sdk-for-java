// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of a list-all operation. */
@Fluent
public final class DatabaseList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseList.class);

    /*
     * List of databases
     */
    @JsonProperty(value = "value")
    private List<DatabaseInner> value;

    /*
     * The URI to fetch the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of databases.
     *
     * @return the value value.
     */
    public List<DatabaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of databases.
     *
     * @param value the value value to set.
     * @return the DatabaseList object itself.
     */
    public DatabaseList withValue(List<DatabaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
