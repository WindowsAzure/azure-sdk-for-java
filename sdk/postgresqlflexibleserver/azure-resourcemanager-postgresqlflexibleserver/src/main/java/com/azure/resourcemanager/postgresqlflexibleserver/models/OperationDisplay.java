// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Display metadata associated with the operation. */
@Immutable
public final class OperationDisplay {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationDisplay.class);

    /*
     * Operation resource provider name.
     */
    @JsonProperty(value = "provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /*
     * Resource on which the operation is performed.
     */
    @JsonProperty(value = "resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /*
     * Localized friendly name for the operation.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /*
     * Operation description.
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the provider property: Operation resource provider name.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
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
     * Get the operation property: Localized friendly name for the operation.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the description property: Operation description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
