// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionActionType;
import com.azure.resourcemanager.providerhub.models.OperationsDefinitionOrigin;
import com.azure.resourcemanager.providerhub.models.OperationsDisplayDefinition;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an Operation. */
@Fluent
public final class OperationsDefinitionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsDefinitionInner.class);

    /*
     * Name of the operation.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Indicates whether the operation applies to data-plane.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * The origin property.
     */
    @JsonProperty(value = "origin")
    private OperationsDefinitionOrigin origin;

    /*
     * Display information of the operation.
     */
    @JsonProperty(value = "display", required = true)
    private OperationsDisplayDefinition display;

    /*
     * The actionType property.
     */
    @JsonProperty(value = "actionType")
    private OperationsDefinitionActionType actionType;

    /*
     * Any object
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
     * @return the OperationsDefinitionInner object itself.
     */
    public OperationsDefinitionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationsDefinitionInner object itself.
     */
    public OperationsDefinitionInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the origin property: The origin property.
     *
     * @return the origin value.
     */
    public OperationsDefinitionOrigin origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin property.
     *
     * @param origin the origin value to set.
     * @return the OperationsDefinitionInner object itself.
     */
    public OperationsDefinitionInner withOrigin(OperationsDefinitionOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the display property: Display information of the operation.
     *
     * @return the display value.
     */
    public OperationsDisplayDefinition display() {
        return this.display;
    }

    /**
     * Set the display property: Display information of the operation.
     *
     * @param display the display value to set.
     * @return the OperationsDefinitionInner object itself.
     */
    public OperationsDefinitionInner withDisplay(OperationsDisplayDefinition display) {
        this.display = display;
        return this;
    }

    /**
     * Get the actionType property: The actionType property.
     *
     * @return the actionType value.
     */
    public OperationsDefinitionActionType actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: The actionType property.
     *
     * @param actionType the actionType value to set.
     * @return the OperationsDefinitionInner object itself.
     */
    public OperationsDefinitionInner withActionType(OperationsDefinitionActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get the properties property: Any object.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Any object.
     *
     * @param properties the properties value to set.
     * @return the OperationsDefinitionInner object itself.
     */
    public OperationsDefinitionInner withProperties(Object properties) {
        this.properties = properties;
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
                    new IllegalArgumentException("Missing required property name in model OperationsDefinitionInner"));
        }
        if (display() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property display in model OperationsDefinitionInner"));
        } else {
            display().validate();
        }
    }
}
