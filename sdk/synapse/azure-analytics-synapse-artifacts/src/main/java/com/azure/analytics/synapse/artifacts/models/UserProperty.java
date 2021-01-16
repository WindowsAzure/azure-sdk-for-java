// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** User property. */
@Fluent
public final class UserProperty {
    /*
     * User property name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * User property value. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * Get the name property: User property name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: User property name.
     *
     * @param name the name value to set.
     * @return the UserProperty object itself.
     */
    public UserProperty setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: User property value. Type: string (or Expression with resultType string).
     *
     * @return the value value.
     */
    public Object getValue() {
        return this.value;
    }

    /**
     * Set the value property: User property value. Type: string (or Expression with resultType string).
     *
     * @param value the value value to set.
     * @return the UserProperty object itself.
     */
    public UserProperty setValue(Object value) {
        this.value = value;
        return this;
    }
}
