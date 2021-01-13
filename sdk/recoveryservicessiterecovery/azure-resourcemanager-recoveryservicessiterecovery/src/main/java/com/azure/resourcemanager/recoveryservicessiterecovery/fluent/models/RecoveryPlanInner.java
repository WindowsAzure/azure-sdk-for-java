// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryPlanProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Recovery plan details. */
@Fluent
public final class RecoveryPlanInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPlanInner.class);

    /*
     * The custom details.
     */
    @JsonProperty(value = "properties")
    private RecoveryPlanProperties properties;

    /*
     * Resource Location
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the properties property: The custom details.
     *
     * @return the properties value.
     */
    public RecoveryPlanProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The custom details.
     *
     * @param properties the properties value to set.
     * @return the RecoveryPlanInner object itself.
     */
    public RecoveryPlanInner withProperties(RecoveryPlanProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     *
     * @param location the location value to set.
     * @return the RecoveryPlanInner object itself.
     */
    public RecoveryPlanInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
