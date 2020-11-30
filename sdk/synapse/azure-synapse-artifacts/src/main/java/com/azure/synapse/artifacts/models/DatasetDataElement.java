// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Columns that define the structure of the dataset. */
@Fluent
public final class DatasetDataElement {
    /*
     * Name of the column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "name")
    private Object name;

    /*
     * Type of the column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "type")
    private Object type;

    /**
     * Get the name property: Name of the column. Type: string (or Expression with resultType string).
     *
     * @return the name value.
     */
    public Object getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the column. Type: string (or Expression with resultType string).
     *
     * @param name the name value to set.
     * @return the DatasetDataElement object itself.
     */
    public DatasetDataElement setName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the column. Type: string (or Expression with resultType string).
     *
     * @return the type value.
     */
    public Object getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of the column. Type: string (or Expression with resultType string).
     *
     * @param type the type value to set.
     * @return the DatasetDataElement object itself.
     */
    public DatasetDataElement setType(Object type) {
        this.type = type;
        return this;
    }
}
