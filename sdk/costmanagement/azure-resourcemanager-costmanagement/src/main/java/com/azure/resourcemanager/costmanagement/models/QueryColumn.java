// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The QueryColumn model. */
@Fluent
public final class QueryColumn {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryColumn.class);

    /*
     * The name of column.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The type of column.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the name property: The name of column.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of column.
     *
     * @param name the name value to set.
     * @return the QueryColumn object itself.
     */
    public QueryColumn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of column.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of column.
     *
     * @param type the type value to set.
     * @return the QueryColumn object itself.
     */
    public QueryColumn withType(String type) {
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
