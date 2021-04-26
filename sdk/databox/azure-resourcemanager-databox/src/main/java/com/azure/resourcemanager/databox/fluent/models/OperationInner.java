// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databox.models.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Operation entity. */
@Fluent
public final class OperationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInner.class);

    /*
     * Name of the operation. Format:
     * {resourceProviderNamespace}/{resourceType}/{read|write|delete|action}
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Operation display values.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /*
     * Operation properties.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private Object properties;

    /*
     * Origin of the operation. Can be : user|system|user,system
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private String origin;

    /*
     * Indicates whether the operation is a data action
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /**
     * Get the name property: Name of the operation. Format:
     * {resourceProviderNamespace}/{resourceType}/{read|write|delete|action}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: Operation display values.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Get the properties property: Operation properties.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Get the origin property: Origin of the operation. Can be : user|system|user,system.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
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
     * @return the OperationInner object itself.
     */
    public OperationInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
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
