// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Property object for supported OS api. */
@Fluent
public final class SupportedOSProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SupportedOSProperty.class);

    /*
     * Gets the replication provider type.
     */
    @JsonProperty(value = "instanceType", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceType;

    /*
     * List of supported OS.
     */
    @JsonProperty(value = "supportedOs")
    private List<SupportedOSDetails> supportedOs;

    /**
     * Get the instanceType property: Gets the replication provider type.
     *
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the supportedOs property: List of supported OS.
     *
     * @return the supportedOs value.
     */
    public List<SupportedOSDetails> supportedOs() {
        return this.supportedOs;
    }

    /**
     * Set the supportedOs property: List of supported OS.
     *
     * @param supportedOs the supportedOs value to set.
     * @return the SupportedOSProperty object itself.
     */
    public SupportedOSProperty withSupportedOs(List<SupportedOSDetails> supportedOs) {
        this.supportedOs = supportedOs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedOs() != null) {
            supportedOs().forEach(e -> e.validate());
        }
    }
}
