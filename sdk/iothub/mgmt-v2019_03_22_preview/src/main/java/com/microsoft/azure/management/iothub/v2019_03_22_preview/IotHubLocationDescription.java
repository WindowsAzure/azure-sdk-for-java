/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Public representation of one of the locations where a resource is
 * provisioned.
 */
public class IotHubLocationDescription {
    /**
     * Azure Geo Regions.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Specific Role assigned to this location. Possible values include:
     * 'primary', 'secondary'.
     */
    @JsonProperty(value = "role")
    private IotHubReplicaRoleType role;

    /**
     * Get azure Geo Regions.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set azure Geo Regions.
     *
     * @param location the location value to set
     * @return the IotHubLocationDescription object itself.
     */
    public IotHubLocationDescription withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get specific Role assigned to this location. Possible values include: 'primary', 'secondary'.
     *
     * @return the role value
     */
    public IotHubReplicaRoleType role() {
        return this.role;
    }

    /**
     * Set specific Role assigned to this location. Possible values include: 'primary', 'secondary'.
     *
     * @param role the role value to set
     * @return the IotHubLocationDescription object itself.
     */
    public IotHubLocationDescription withRole(IotHubReplicaRoleType role) {
        this.role = role;
        return this;
    }

}
