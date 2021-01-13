// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resolve health errors input properties. */
@Fluent
public final class ResolveHealthError {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResolveHealthError.class);

    /*
     * Health error id.
     */
    @JsonProperty(value = "healthErrorId")
    private String healthErrorId;

    /**
     * Get the healthErrorId property: Health error id.
     *
     * @return the healthErrorId value.
     */
    public String healthErrorId() {
        return this.healthErrorId;
    }

    /**
     * Set the healthErrorId property: Health error id.
     *
     * @param healthErrorId the healthErrorId value to set.
     * @return the ResolveHealthError object itself.
     */
    public ResolveHealthError withHealthErrorId(String healthErrorId) {
        this.healthErrorId = healthErrorId;
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
