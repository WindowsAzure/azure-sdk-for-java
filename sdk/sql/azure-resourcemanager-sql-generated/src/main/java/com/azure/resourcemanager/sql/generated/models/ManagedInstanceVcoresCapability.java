// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The managed instance virtual cores capability. */
@Fluent
public final class ManagedInstanceVcoresCapability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedInstanceVcoresCapability.class);

    /*
     * The virtual cores identifier.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The virtual cores value.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Integer value;

    /*
     * Included size.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /*
     * Storage size ranges.
     */
    @JsonProperty(value = "supportedStorageSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeRangeCapability> supportedStorageSizes;

    /*
     * True if this service objective is supported for managed instances in an
     * instance pool.
     */
    @JsonProperty(value = "instancePoolSupported", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean instancePoolSupported;

    /*
     * True if this service objective is supported for standalone managed
     * instances.
     */
    @JsonProperty(value = "standaloneSupported", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean standaloneSupported;

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
     * Get the name property: The virtual cores identifier.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: The virtual cores value.
     *
     * @return the value value.
     */
    public Integer value() {
        return this.value;
    }

    /**
     * Get the includedMaxSize property: Included size.
     *
     * @return the includedMaxSize value.
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

    /**
     * Get the supportedStorageSizes property: Storage size ranges.
     *
     * @return the supportedStorageSizes value.
     */
    public List<MaxSizeRangeCapability> supportedStorageSizes() {
        return this.supportedStorageSizes;
    }

    /**
     * Get the instancePoolSupported property: True if this service objective is supported for managed instances in an
     * instance pool.
     *
     * @return the instancePoolSupported value.
     */
    public Boolean instancePoolSupported() {
        return this.instancePoolSupported;
    }

    /**
     * Get the standaloneSupported property: True if this service objective is supported for standalone managed
     * instances.
     *
     * @return the standaloneSupported value.
     */
    public Boolean standaloneSupported() {
        return this.standaloneSupported;
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
     * @return the ManagedInstanceVcoresCapability object itself.
     */
    public ManagedInstanceVcoresCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (includedMaxSize() != null) {
            includedMaxSize().validate();
        }
        if (supportedStorageSizes() != null) {
            supportedStorageSizes().forEach(e -> e.validate());
        }
    }
}
