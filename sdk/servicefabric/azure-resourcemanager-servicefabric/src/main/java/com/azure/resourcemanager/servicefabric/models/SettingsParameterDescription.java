// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a parameter in fabric settings of the cluster. */
@Fluent
public final class SettingsParameterDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SettingsParameterDescription.class);

    /*
     * The parameter name of fabric setting.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The parameter value of fabric setting.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name property: The parameter name of fabric setting.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The parameter name of fabric setting.
     *
     * @param name the name value to set.
     * @return the SettingsParameterDescription object itself.
     */
    public SettingsParameterDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The parameter value of fabric setting.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The parameter value of fabric setting.
     *
     * @param value the value value to set.
     * @return the SettingsParameterDescription object itself.
     */
    public SettingsParameterDescription withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model SettingsParameterDescription"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model SettingsParameterDescription"));
        }
    }
}
