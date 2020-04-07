// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The BaselineMetadata model.
 */
@Fluent
public final class BaselineMetadata {
    /*
     * Name of the baseline metadata.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Value of the baseline metadata.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name property: Name of the baseline metadata.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the baseline metadata.
     * 
     * @param name the name value to set.
     * @return the BaselineMetadata object itself.
     */
    public BaselineMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of the baseline metadata.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the baseline metadata.
     * 
     * @param value the value value to set.
     * @return the BaselineMetadata object itself.
     */
    public BaselineMetadata withValue(String value) {
        this.value = value;
        return this;
    }
}
