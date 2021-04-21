// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.models.OperationMetadataDisplay;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The REST API operation supported by DevTestLab ResourceProvider. */
@Fluent
public final class OperationMetadataInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationMetadataInner.class);

    /*
     * Operation name: {provider}/{resource}/{operation}
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The object that describes the operations
     */
    @JsonProperty(value = "display")
    private OperationMetadataDisplay display;

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
     * @return the OperationMetadataInner object itself.
     */
    public OperationMetadataInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The object that describes the operations.
     *
     * @return the display value.
     */
    public OperationMetadataDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The object that describes the operations.
     *
     * @param display the display value to set.
     * @return the OperationMetadataInner object itself.
     */
    public OperationMetadataInner withDisplay(OperationMetadataDisplay display) {
        this.display = display;
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
