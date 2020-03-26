// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The EditionCapability model.
 */
@Fluent
public final class EditionCapability {
    /*
     * The database edition name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The list of supported service objectives for the edition.
     */
    @JsonProperty(value = "supportedServiceLevelObjectives", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServiceObjectiveCapability> supportedServiceLevelObjectives;

    /*
     * Whether or not zone redundancy is supported for the edition.
     */
    @JsonProperty(value = "zoneRedundant", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean zoneRedundant;

    /*
     * The read scale capability.
     */
    @JsonProperty(value = "readScale", access = JsonProperty.Access.WRITE_ONLY)
    private ReadScaleCapability readScale;

    /*
     * The list of supported storage capabilities for this edition
     */
    @JsonProperty(value = "supportedStorageCapabilities", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageCapability> supportedStorageCapabilities;

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
     * Get the name property: The database edition name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedServiceLevelObjectives property: The list of supported
     * service objectives for the edition.
     * 
     * @return the supportedServiceLevelObjectives value.
     */
    public List<ServiceObjectiveCapability> supportedServiceLevelObjectives() {
        return this.supportedServiceLevelObjectives;
    }

    /**
     * Get the zoneRedundant property: Whether or not zone redundancy is
     * supported for the edition.
     * 
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Get the readScale property: The read scale capability.
     * 
     * @return the readScale value.
     */
    public ReadScaleCapability readScale() {
        return this.readScale;
    }

    /**
     * Get the supportedStorageCapabilities property: The list of supported
     * storage capabilities for this edition.
     * 
     * @return the supportedStorageCapabilities value.
     */
    public List<StorageCapability> supportedStorageCapabilities() {
        return this.supportedStorageCapabilities;
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
     * Get the reason property: The reason for the capability not being
     * available.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being
     * available.
     * 
     * @param reason the reason value to set.
     * @return the EditionCapability object itself.
     */
    public EditionCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }
}
