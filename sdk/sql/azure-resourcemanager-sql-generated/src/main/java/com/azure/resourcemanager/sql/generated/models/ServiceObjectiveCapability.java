// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The service objectives capability. */
@Fluent
public final class ServiceObjectiveCapability {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceObjectiveCapability.class);

    /*
     * The unique ID of the service objective.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /*
     * The service objective name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The list of supported maximum database sizes.
     */
    @JsonProperty(value = "supportedMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeRangeCapability> supportedMaxSizes;

    /*
     * The performance level.
     */
    @JsonProperty(value = "performanceLevel", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelCapability performanceLevel;

    /*
     * The sku.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /*
     * List of supported license types.
     */
    @JsonProperty(value = "supportedLicenseTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<LicenseTypeCapability> supportedLicenseTypes;

    /*
     * The included (free) max size.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /*
     * Whether or not zone redundancy is supported for the service objective.
     */
    @JsonProperty(value = "zoneRedundant", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean zoneRedundant;

    /*
     * Supported time range for auto pause delay
     */
    @JsonProperty(value = "supportedAutoPauseDelay", access = JsonProperty.Access.WRITE_ONLY)
    private AutoPauseDelayTimeRange supportedAutoPauseDelay;

    /*
     * List of supported min capacities
     */
    @JsonProperty(value = "supportedMinCapacities", access = JsonProperty.Access.WRITE_ONLY)
    private List<MinCapacityCapability> supportedMinCapacities;

    /*
     * The compute model
     */
    @JsonProperty(value = "computeModel", access = JsonProperty.Access.WRITE_ONLY)
    private String computeModel;

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
     * Get the id property: The unique ID of the service objective.
     *
     * @return the id value.
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the name property: The service objective name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedMaxSizes property: The list of supported maximum database sizes.
     *
     * @return the supportedMaxSizes value.
     */
    public List<MaxSizeRangeCapability> supportedMaxSizes() {
        return this.supportedMaxSizes;
    }

    /**
     * Get the performanceLevel property: The performance level.
     *
     * @return the performanceLevel value.
     */
    public PerformanceLevelCapability performanceLevel() {
        return this.performanceLevel;
    }

    /**
     * Get the sku property: The sku.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the supportedLicenseTypes property: List of supported license types.
     *
     * @return the supportedLicenseTypes value.
     */
    public List<LicenseTypeCapability> supportedLicenseTypes() {
        return this.supportedLicenseTypes;
    }

    /**
     * Get the includedMaxSize property: The included (free) max size.
     *
     * @return the includedMaxSize value.
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

    /**
     * Get the zoneRedundant property: Whether or not zone redundancy is supported for the service objective.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Get the supportedAutoPauseDelay property: Supported time range for auto pause delay.
     *
     * @return the supportedAutoPauseDelay value.
     */
    public AutoPauseDelayTimeRange supportedAutoPauseDelay() {
        return this.supportedAutoPauseDelay;
    }

    /**
     * Get the supportedMinCapacities property: List of supported min capacities.
     *
     * @return the supportedMinCapacities value.
     */
    public List<MinCapacityCapability> supportedMinCapacities() {
        return this.supportedMinCapacities;
    }

    /**
     * Get the computeModel property: The compute model.
     *
     * @return the computeModel value.
     */
    public String computeModel() {
        return this.computeModel;
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
     * @return the ServiceObjectiveCapability object itself.
     */
    public ServiceObjectiveCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedMaxSizes() != null) {
            supportedMaxSizes().forEach(e -> e.validate());
        }
        if (performanceLevel() != null) {
            performanceLevel().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (supportedLicenseTypes() != null) {
            supportedLicenseTypes().forEach(e -> e.validate());
        }
        if (includedMaxSize() != null) {
            includedMaxSize().validate();
        }
        if (supportedAutoPauseDelay() != null) {
            supportedAutoPauseDelay().validate();
        }
        if (supportedMinCapacities() != null) {
            supportedMinCapacities().forEach(e -> e.validate());
        }
    }
}
