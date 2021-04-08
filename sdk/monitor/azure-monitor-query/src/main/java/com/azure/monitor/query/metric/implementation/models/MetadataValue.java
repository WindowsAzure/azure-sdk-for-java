// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.metric.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a metric metadata value. */
@Fluent
public final class MetadataValue {
    /*
     * the name of the metadata.
     */
    @JsonProperty(value = "name")
    private LocalizableString name;

    /*
     * the value of the metadata.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the name property: the name of the metadata.
     *
     * @return the name value.
     */
    public LocalizableString getName() {
        return this.name;
    }

    /**
     * Set the name property: the name of the metadata.
     *
     * @param name the name value to set.
     * @return the MetadataValue object itself.
     */
    public MetadataValue setName(LocalizableString name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: the value of the metadata.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: the value of the metadata.
     *
     * @param value the value value to set.
     * @return the MetadataValue object itself.
     */
    public MetadataValue setValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getName() != null) {
            getName().validate();
        }
    }
}
