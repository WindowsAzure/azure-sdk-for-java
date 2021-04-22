// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningservices.models.ValueFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Workspace connection. */
@JsonFlatten
@Fluent
public class WorkspaceConnectionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspaceConnectionInner.class);

    /*
     * Category of the workspace connection.
     */
    @JsonProperty(value = "properties.category")
    private String category;

    /*
     * Target of the workspace connection.
     */
    @JsonProperty(value = "properties.target")
    private String target;

    /*
     * Authorization type of the workspace connection.
     */
    @JsonProperty(value = "properties.authType")
    private String authType;

    /*
     * Value details of the workspace connection.
     */
    @JsonProperty(value = "properties.value")
    private String value;

    /*
     * format for the workspace connection value
     */
    @JsonProperty(value = "properties.valueFormat")
    private ValueFormat valueFormat;

    /**
     * Get the category property: Category of the workspace connection.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Category of the workspace connection.
     *
     * @param category the category value to set.
     * @return the WorkspaceConnectionInner object itself.
     */
    public WorkspaceConnectionInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the target property: Target of the workspace connection.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: Target of the workspace connection.
     *
     * @param target the target value to set.
     * @return the WorkspaceConnectionInner object itself.
     */
    public WorkspaceConnectionInner withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the authType property: Authorization type of the workspace connection.
     *
     * @return the authType value.
     */
    public String authType() {
        return this.authType;
    }

    /**
     * Set the authType property: Authorization type of the workspace connection.
     *
     * @param authType the authType value to set.
     * @return the WorkspaceConnectionInner object itself.
     */
    public WorkspaceConnectionInner withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get the value property: Value details of the workspace connection.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value details of the workspace connection.
     *
     * @param value the value value to set.
     * @return the WorkspaceConnectionInner object itself.
     */
    public WorkspaceConnectionInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the valueFormat property: format for the workspace connection value.
     *
     * @return the valueFormat value.
     */
    public ValueFormat valueFormat() {
        return this.valueFormat;
    }

    /**
     * Set the valueFormat property: format for the workspace connection value.
     *
     * @param valueFormat the valueFormat value to set.
     * @return the WorkspaceConnectionInner object itself.
     */
    public WorkspaceConnectionInner withValueFormat(ValueFormat valueFormat) {
        this.valueFormat = valueFormat;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}