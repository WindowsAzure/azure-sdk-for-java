// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of a single variable for a Pipeline. */
@Fluent
public final class VariableSpecification {
    /*
     * Variable type.
     */
    @JsonProperty(value = "type", required = true)
    private VariableType type;

    /*
     * Default value of variable.
     */
    @JsonProperty(value = "defaultValue")
    private Object defaultValue;

    /**
     * Get the type property: Variable type.
     *
     * @return the type value.
     */
    public VariableType getType() {
        return this.type;
    }

    /**
     * Set the type property: Variable type.
     *
     * @param type the type value to set.
     * @return the VariableSpecification object itself.
     */
    public VariableSpecification setType(VariableType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the defaultValue property: Default value of variable.
     *
     * @return the defaultValue value.
     */
    public Object getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the defaultValue property: Default value of variable.
     *
     * @param defaultValue the defaultValue value to set.
     * @return the VariableSpecification object itself.
     */
    public VariableSpecification setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
}
