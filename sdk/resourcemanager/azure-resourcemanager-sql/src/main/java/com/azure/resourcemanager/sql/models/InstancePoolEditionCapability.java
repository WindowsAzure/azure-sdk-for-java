// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The instance pool capability. */
@Fluent
public final class InstancePoolEditionCapability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InstancePoolEditionCapability.class);

    /*
     * The instance pool version name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The supported families.
     */
    @JsonProperty(value = "supportedFamilies", access = JsonProperty.Access.WRITE_ONLY)
    private List<InstancePoolFamilyCapability> supportedFamilies;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the name property: The instance pool version name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedFamilies property: The supported families.
     *
     * @return the supportedFamilies value.
     */
    public List<InstancePoolFamilyCapability> supportedFamilies() {
        return this.supportedFamilies;
    }

    /**
     * Get the status property: The status of the capability.
     *
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being available.
     *
     * @param reason the reason value to set.
     * @return the InstancePoolEditionCapability object itself.
     */
    public InstancePoolEditionCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedFamilies() != null) {
            supportedFamilies().forEach(e -> e.validate());
        }
    }
}
