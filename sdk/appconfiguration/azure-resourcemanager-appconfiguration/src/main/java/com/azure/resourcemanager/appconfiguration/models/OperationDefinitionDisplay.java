// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The display information for a configuration store operation. */
@Fluent
public final class OperationDefinitionDisplay {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationDefinitionDisplay.class);

    /*
     * The resource provider name: Microsoft App Configuration."
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /*
     * The resource on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * The operation that users can perform.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * The description for the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the provider property: The resource provider name: Microsoft App Configuration.".
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the resource property: The resource on which the operation is performed.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource on which the operation is performed.
     *
     * @param resource the resource value to set.
     * @return the OperationDefinitionDisplay object itself.
     */
    public OperationDefinitionDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: The operation that users can perform.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The operation that users can perform.
     *
     * @param operation the operation value to set.
     * @return the OperationDefinitionDisplay object itself.
     */
    public OperationDefinitionDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the description property: The description for the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for the operation.
     *
     * @param description the description value to set.
     * @return the OperationDefinitionDisplay object itself.
     */
    public OperationDefinitionDisplay withDescription(String description) {
        this.description = description;
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
