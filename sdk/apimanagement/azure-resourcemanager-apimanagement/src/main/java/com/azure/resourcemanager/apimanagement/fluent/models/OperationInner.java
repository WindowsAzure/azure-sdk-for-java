// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** REST API operation. */
@Fluent
public final class OperationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInner.class);

    /*
     * Operation name: {provider}/{resource}/{operation}
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The object that describes the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * The operation origin.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * The operation properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The object that describes the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The object that describes the operation.
     *
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The operation origin.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The operation origin.
     *
     * @param origin the origin value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: The operation properties.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The operation properties.
     *
     * @param properties the properties value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(Object properties) {
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
