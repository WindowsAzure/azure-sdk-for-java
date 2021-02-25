// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthbot.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation detail payload. */
@Fluent
public final class OperationDetailInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationDetailInner.class);

    /*
     * Name of the operation
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Indicates whether the operation is a data action
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Display of the operation
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * Origin of the operation
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Additional properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get the name property: Name of the operation.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the operation.
     *
     * @param name the name value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation is a data action.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation is a data action.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the display property: Display of the operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Display of the operation.
     *
     * @param display the display value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Additional properties.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional properties.
     *
     * @param properties the properties value to set.
     * @return the OperationDetailInner object itself.
     */
    public OperationDetailInner withProperties(Object properties) {
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
