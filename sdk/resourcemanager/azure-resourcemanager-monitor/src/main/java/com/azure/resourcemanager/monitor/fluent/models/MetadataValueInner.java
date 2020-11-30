// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a metric metadata value. */
@Fluent
public final class MetadataValueInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MetadataValueInner.class);

    /*
     * the name of the metadata.
     */
    @JsonProperty(value = "name")
    private LocalizableStringInner name;

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
    public LocalizableStringInner name() {
        return this.name;
    }

    /**
     * Set the name property: the name of the metadata.
     *
     * @param name the name value to set.
     * @return the MetadataValueInner object itself.
     */
    public MetadataValueInner withName(LocalizableStringInner name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: the value of the metadata.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: the value of the metadata.
     *
     * @param value the value value to set.
     * @return the MetadataValueInner object itself.
     */
    public MetadataValueInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
