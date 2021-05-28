// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.log.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.monitor.query.models.ColumnDataType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A column in a table. */
@Fluent
public final class Column {
    /*
     * The name of this column.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The data type of this column.
     */
    @JsonProperty(value = "type")
    private ColumnDataType type;

    /**
     * Get the name property: The name of this column.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this column.
     *
     * @param name the name value to set.
     * @return the Column object itself.
     */
    public Column setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The data type of this column.
     *
     * @return the type value.
     */
    public ColumnDataType getType() {
        return this.type;
    }

    /**
     * Set the type property: The data type of this column.
     *
     * @param type the type value to set.
     * @return the Column object itself.
     */
    public Column setType(ColumnDataType type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
