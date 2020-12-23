// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedClusterPodIdentityProvisioningInfo model. */
@Fluent
public final class ManagedClusterPodIdentityProvisioningInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterPodIdentityProvisioningInfo.class);

    /*
     * Pod identity assignment error (if any).
     */
    @JsonProperty(value = "error")
    private ManagementError error;

    /**
     * Get the error property: Pod identity assignment error (if any).
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.error;
    }

    /**
     * Set the error property: Pod identity assignment error (if any).
     *
     * @param error the error value to set.
     * @return the ManagedClusterPodIdentityProvisioningInfo object itself.
     */
    public ManagedClusterPodIdentityProvisioningInfo withError(ManagementError error) {
        this.error = error;
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
