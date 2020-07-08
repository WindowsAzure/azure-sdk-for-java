// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeploymentInstance model. */
@Immutable
public final class DeploymentInstance {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentInstance.class);

    /*
     * Name of the deployment instance
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Status of the deployment instance
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * Failed reason of the deployment instance
     */
    @JsonProperty(value = "reason", access = JsonProperty.Access.WRITE_ONLY)
    private String reason;

    /*
     * Discovery status of the deployment instance
     */
    @JsonProperty(value = "discoveryStatus", access = JsonProperty.Access.WRITE_ONLY)
    private String discoveryStatus;

    /**
     * Get the name property: Name of the deployment instance.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the status property: Status of the deployment instance.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the reason property: Failed reason of the deployment instance.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Get the discoveryStatus property: Discovery status of the deployment instance.
     *
     * @return the discoveryStatus value.
     */
    public String discoveryStatus() {
        return this.discoveryStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
