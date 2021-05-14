// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearningcompute.models.UpdatesAvailable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about updates available for system services in a cluster. */
@Immutable
public final class CheckSystemServicesUpdatesAvailableResponseInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(CheckSystemServicesUpdatesAvailableResponseInner.class);

    /*
     * Yes if updates are available for the system services, No if not.
     */
    @JsonProperty(value = "updatesAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private UpdatesAvailable updatesAvailable;

    /**
     * Get the updatesAvailable property: Yes if updates are available for the system services, No if not.
     *
     * @return the updatesAvailable value.
     */
    public UpdatesAvailable updatesAvailable() {
        return this.updatesAvailable;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
