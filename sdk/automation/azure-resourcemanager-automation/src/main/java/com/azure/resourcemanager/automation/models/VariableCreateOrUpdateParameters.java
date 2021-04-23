// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters supplied to the create or update variable operation. */
@JsonFlatten
@Fluent
public class VariableCreateOrUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VariableCreateOrUpdateParameters.class);

    /*
     * Gets or sets the name of the variable.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Gets or sets the value of the variable.
     */
    @JsonProperty(value = "properties.value")
    private String value;

    /*
     * Gets or sets the description of the variable.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Gets or sets the encrypted flag of the variable.
     */
    @JsonProperty(value = "properties.isEncrypted")
    private Boolean isEncrypted;

    /**
     * Get the name property: Gets or sets the name of the variable.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the variable.
     *
     * @param name the name value to set.
     * @return the VariableCreateOrUpdateParameters object itself.
     */
    public VariableCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Gets or sets the value of the variable.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets the value of the variable.
     *
     * @param value the value value to set.
     * @return the VariableCreateOrUpdateParameters object itself.
     */
    public VariableCreateOrUpdateParameters withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description of the variable.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description of the variable.
     *
     * @param description the description value to set.
     * @return the VariableCreateOrUpdateParameters object itself.
     */
    public VariableCreateOrUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the isEncrypted property: Gets or sets the encrypted flag of the variable.
     *
     * @return the isEncrypted value.
     */
    public Boolean isEncrypted() {
        return this.isEncrypted;
    }

    /**
     * Set the isEncrypted property: Gets or sets the encrypted flag of the variable.
     *
     * @param isEncrypted the isEncrypted value to set.
     * @return the VariableCreateOrUpdateParameters object itself.
     */
    public VariableCreateOrUpdateParameters withIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
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
                        "Missing required property name in model VariableCreateOrUpdateParameters"));
        }
    }
}
