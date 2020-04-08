// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ElasticPoolPerformanceLevelCapability model. */
@Fluent
public final class ElasticPoolPerformanceLevelCapability {
    /*
     * The performance level for the pool.
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
     * The maximum number of databases supported.
     */
    @JsonProperty(value = "maxDatabaseCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxDatabaseCount;

    /*
     * The included (free) max size for this performance level.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /*
     * The list of supported max sizes.
     */
    @JsonProperty(value = "supportedMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeRangeCapability> supportedMaxSizes;

    /*
     * The list of supported per database max sizes.
     */
    @JsonProperty(value = "supportedPerDatabaseMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeRangeCapability> supportedPerDatabaseMaxSizes;

    /*
     * The list of supported per database max performance levels.
     */
    @JsonProperty(value = "supportedPerDatabaseMaxPerformanceLevels", access = JsonProperty.Access.WRITE_ONLY)
    private List<ElasticPoolPerDatabaseMaxPerformanceLevelCapability> supportedPerDatabaseMaxPerformanceLevels;

    /*
     * Whether or not zone redundancy is supported for the performance level.
     */
    @JsonProperty(value = "zoneRedundant", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean zoneRedundant;

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
     * Get the performanceLevel property: The performance level for the pool.
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
     * Get the maxDatabaseCount property: The maximum number of databases supported.
     *
     * @return the maxDatabaseCount value.
     */
    public Integer maxDatabaseCount() {
        return this.maxDatabaseCount;
    }

    /**
     * Get the includedMaxSize property: The included (free) max size for this performance level.
     *
     * @return the includedMaxSize value.
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

    /**
     * Get the supportedMaxSizes property: The list of supported max sizes.
     *
     * @return the supportedMaxSizes value.
     */
    public List<MaxSizeRangeCapability> supportedMaxSizes() {
        return this.supportedMaxSizes;
    }

    /**
     * Get the supportedPerDatabaseMaxSizes property: The list of supported per database max sizes.
     *
     * @return the supportedPerDatabaseMaxSizes value.
     */
    public List<MaxSizeRangeCapability> supportedPerDatabaseMaxSizes() {
        return this.supportedPerDatabaseMaxSizes;
    }

    /**
     * Get the supportedPerDatabaseMaxPerformanceLevels property: The list of supported per database max performance
     * levels.
     *
     * @return the supportedPerDatabaseMaxPerformanceLevels value.
     */
    public List<ElasticPoolPerDatabaseMaxPerformanceLevelCapability> supportedPerDatabaseMaxPerformanceLevels() {
        return this.supportedPerDatabaseMaxPerformanceLevels;
    }

    /**
     * Get the zoneRedundant property: Whether or not zone redundancy is supported for the performance level.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
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
     * @return the ElasticPoolPerformanceLevelCapability object itself.
     */
    public ElasticPoolPerformanceLevelCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }
}
