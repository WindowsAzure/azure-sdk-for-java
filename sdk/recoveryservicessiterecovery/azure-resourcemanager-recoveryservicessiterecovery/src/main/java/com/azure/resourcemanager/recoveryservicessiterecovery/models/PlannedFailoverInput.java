// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input definition for planned failover. */
@Fluent
public final class PlannedFailoverInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PlannedFailoverInput.class);

    /*
     * Planned failover input properties
     */
    @JsonProperty(value = "properties")
    private PlannedFailoverInputProperties properties;

    /**
     * Get the properties property: Planned failover input properties.
     *
     * @return the properties value.
     */
    public PlannedFailoverInputProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Planned failover input properties.
     *
     * @param properties the properties value to set.
     * @return the PlannedFailoverInput object itself.
     */
    public PlannedFailoverInput withProperties(PlannedFailoverInputProperties properties) {
        this.properties = properties;
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
