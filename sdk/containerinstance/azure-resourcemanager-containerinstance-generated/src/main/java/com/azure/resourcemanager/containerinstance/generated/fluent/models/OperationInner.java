// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerinstance.generated.models.ContainerInstanceOperationsOrigin;
import com.azure.resourcemanager.containerinstance.generated.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An operation for Azure Container Instance service. */
@Fluent
public final class OperationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInner.class);

    /*
     * The name of the operation.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The display information of the operation.
     */
    @JsonProperty(value = "display", required = true)
    private OperationDisplay display;

    /*
     * The additional properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /*
     * The intended executor of the operation.
     */
    @JsonProperty(value = "origin")
    private ContainerInstanceOperationsOrigin origin;

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
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The display information of the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The display information of the operation.
     *
     * @param display the display value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the properties property: The additional properties.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The additional properties.
     *
     * @param properties the properties value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the origin property: The intended executor of the operation.
     *
     * @return the origin value.
     */
    public ContainerInstanceOperationsOrigin origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The intended executor of the operation.
     *
     * @param origin the origin value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(ContainerInstanceOperationsOrigin origin) {
        this.origin = origin;
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
                    new IllegalArgumentException("Missing required property name in model OperationInner"));
        }
        if (display() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property display in model OperationInner"));
        } else {
            display().validate();
        }
    }
}
