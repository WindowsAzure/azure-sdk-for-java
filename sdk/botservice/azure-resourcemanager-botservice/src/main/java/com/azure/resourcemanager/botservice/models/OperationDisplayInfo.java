// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The operation supported by Bot Service Management. */
@Fluent
public final class OperationDisplayInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationDisplayInfo.class);

    /*
     * The description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The action that users can perform, based on their permission level.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /*
     * Service provider: Microsoft Bot Service.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Get the description property: The description of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the operation.
     *
     * @param description the description value to set.
     * @return the OperationDisplayInfo object itself.
     */
    public OperationDisplayInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the operation property: The action that users can perform, based on their permission level.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The action that users can perform, based on their permission level.
     *
     * @param operation the operation value to set.
     * @return the OperationDisplayInfo object itself.
     */
    public OperationDisplayInfo withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the provider property: Service provider: Microsoft Bot Service.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Service provider: Microsoft Bot Service.
     *
     * @param provider the provider value to set.
     * @return the OperationDisplayInfo object itself.
     */
    public OperationDisplayInfo withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource on which the operation is performed.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource on which the operation is performed.
     *
     * @param resource the resource value to set.
     * @return the OperationDisplayInfo object itself.
     */
    public OperationDisplayInfo withResource(String resource) {
        this.resource = resource;
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
