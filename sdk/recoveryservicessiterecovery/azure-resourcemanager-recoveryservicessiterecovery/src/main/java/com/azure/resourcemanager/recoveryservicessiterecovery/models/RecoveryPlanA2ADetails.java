// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Recovery plan A2A specific details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("A2A")
@Fluent
public final class RecoveryPlanA2ADetails extends RecoveryPlanProviderSpecificDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPlanA2ADetails.class);

    /*
     * The primary zone.
     */
    @JsonProperty(value = "primaryZone")
    private String primaryZone;

    /*
     * The recovery zone.
     */
    @JsonProperty(value = "recoveryZone")
    private String recoveryZone;

    /**
     * Get the primaryZone property: The primary zone.
     *
     * @return the primaryZone value.
     */
    public String primaryZone() {
        return this.primaryZone;
    }

    /**
     * Set the primaryZone property: The primary zone.
     *
     * @param primaryZone the primaryZone value to set.
     * @return the RecoveryPlanA2ADetails object itself.
     */
    public RecoveryPlanA2ADetails withPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }

    /**
     * Get the recoveryZone property: The recovery zone.
     *
     * @return the recoveryZone value.
     */
    public String recoveryZone() {
        return this.recoveryZone;
    }

    /**
     * Set the recoveryZone property: The recovery zone.
     *
     * @param recoveryZone the recoveryZone value to set.
     * @return the RecoveryPlanA2ADetails object itself.
     */
    public RecoveryPlanA2ADetails withRecoveryZone(String recoveryZone) {
        this.recoveryZone = recoveryZone;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
