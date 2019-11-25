/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The service objectives capability.
 */
public class ServiceObjectiveCapability {
    /**
     * The unique ID of the service objective.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * The service objective name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The list of supported maximum database sizes.
     */
    @JsonProperty(value = "supportedMaxSizes", access = JsonProperty.Access.WRITE_ONLY)
    private List<MaxSizeRangeCapability> supportedMaxSizes;

    /**
     * The performance level.
     */
    @JsonProperty(value = "performanceLevel", access = JsonProperty.Access.WRITE_ONLY)
    private PerformanceLevelCapability performanceLevel;

    /**
     * The sku.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /**
     * List of supported license types.
     */
    @JsonProperty(value = "supportedLicenseTypes", access = JsonProperty.Access.WRITE_ONLY)
    private List<LicenseTypeCapability> supportedLicenseTypes;

    /**
     * The included (free) max size.
     */
    @JsonProperty(value = "includedMaxSize", access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeCapability includedMaxSize;

    /**
     * The status of the capability. Possible values include: 'Visible',
     * 'Available', 'Default', 'Disabled'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the unique ID of the service objective.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the service objective name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the list of supported maximum database sizes.
     *
     * @return the supportedMaxSizes value
     */
    public List<MaxSizeRangeCapability> supportedMaxSizes() {
        return this.supportedMaxSizes;
    }

    /**
     * Get the performance level.
     *
     * @return the performanceLevel value
     */
    public PerformanceLevelCapability performanceLevel() {
        return this.performanceLevel;
    }

    /**
     * Get the sku.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get list of supported license types.
     *
     * @return the supportedLicenseTypes value
     */
    public List<LicenseTypeCapability> supportedLicenseTypes() {
        return this.supportedLicenseTypes;
    }

    /**
     * Get the included (free) max size.
     *
     * @return the includedMaxSize value
     */
    public MaxSizeCapability includedMaxSize() {
        return this.includedMaxSize;
    }

    /**
     * Get the status of the capability. Possible values include: 'Visible', 'Available', 'Default', 'Disabled'.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason for the capability not being available.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason for the capability not being available.
     *
     * @param reason the reason value to set
     * @return the ServiceObjectiveCapability object itself.
     */
    public ServiceObjectiveCapability withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
