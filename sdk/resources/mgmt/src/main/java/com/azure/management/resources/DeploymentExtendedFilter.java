// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeploymentExtendedFilter model. */
@Fluent
public final class DeploymentExtendedFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentExtendedFilter.class);

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the DeploymentExtendedFilter object itself.
     */
    public DeploymentExtendedFilter withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
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
