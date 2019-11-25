/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ServerVersionCapability;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedInstanceVersionCapability;
import com.microsoft.azure.management.sql.v2017_10_01_preview.CapabilityStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The location capability.
 */
public class LocationCapabilitiesInner {
    /**
     * The location name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The list of supported server versions.
     */
    @JsonProperty(value = "supportedServerVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServerVersionCapability> supportedServerVersions;

    /**
     * The list of supported managed instance versions.
     */
    @JsonProperty(value = "supportedManagedInstanceVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedInstanceVersionCapability> supportedManagedInstanceVersions;

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
     * Get the location name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the list of supported server versions.
     *
     * @return the supportedServerVersions value
     */
    public List<ServerVersionCapability> supportedServerVersions() {
        return this.supportedServerVersions;
    }

    /**
     * Get the list of supported managed instance versions.
     *
     * @return the supportedManagedInstanceVersions value
     */
    public List<ManagedInstanceVersionCapability> supportedManagedInstanceVersions() {
        return this.supportedManagedInstanceVersions;
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
     * @return the LocationCapabilitiesInner object itself.
     */
    public LocationCapabilitiesInner withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
