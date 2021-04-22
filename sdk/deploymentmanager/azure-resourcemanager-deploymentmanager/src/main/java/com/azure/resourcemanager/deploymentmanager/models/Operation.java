// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents an operation that can be performed on the service. */
@Fluent
public final class Operation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Operation.class);

    /*
     * The name of the operation.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The display name of the operation.
     */
    @JsonProperty(value = "display")
    private OperationDetail display;

    /*
     * The origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * The properties of the operation.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get the name property: The name of the operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the operation.
     *
     * @param name the name value to set.
     * @return the Operation object itself.
     */
    public Operation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The display name of the operation.
     *
     * @return the display value.
     */
    public OperationDetail display() {
        return this.display;
    }

    /**
     * Set the display property: The display name of the operation.
     *
     * @param display the display value to set.
     * @return the Operation object itself.
     */
    public Operation withDisplay(OperationDetail display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the Operation object itself.
     */
    public Operation withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: The properties of the operation.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of the operation.
     *
     * @param properties the properties value to set.
     * @return the Operation object itself.
     */
    public Operation withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}