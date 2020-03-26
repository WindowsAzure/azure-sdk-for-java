// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KeyInfo model.
 */
@Fluent
public final class KeyInfoInner {
    /*
     * Key name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Key value
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: Key name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Key name.
     * 
     * @param name the name value to set.
     * @return the KeyInfoInner object itself.
     */
    public KeyInfoInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Key value.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Key value.
     * 
     * @param value the value value to set.
     * @return the KeyInfoInner object itself.
     */
    public KeyInfoInner withValue(String value) {
        this.value = value;
        return this;
    }
}
