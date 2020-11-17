/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for WorkloadNetworkDhcpServer and WorkloadNetworkDhcpRelay to
 * inherit from.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dhcpType", defaultImpl = WorkloadNetworkDhcpEntity.class)
@JsonTypeName("WorkloadNetworkDhcpEntity")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SERVER", value = WorkloadNetworkDhcpServer.class),
    @JsonSubTypes.Type(name = "RELAY", value = WorkloadNetworkDhcpRelay.class)
})
public class WorkloadNetworkDhcpEntity {
    /**
     * Display name of the DHCP entity.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * NSX Segments consuming DHCP.
     */
    @JsonProperty(value = "segments", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> segments;

    /**
     * The provisioning state. Possible values include: 'Succeeded', 'Failed',
     * 'Building', 'Deleting', 'Updating'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkloadNetworkDhcpProvisioningState provisioningState;

    /**
     * NSX revision number.
     */
    @JsonProperty(value = "revision")
    private Long revision;

    /**
     * Get display name of the DHCP entity.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set display name of the DHCP entity.
     *
     * @param displayName the displayName value to set
     * @return the WorkloadNetworkDhcpEntity object itself.
     */
    public WorkloadNetworkDhcpEntity withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get nSX Segments consuming DHCP.
     *
     * @return the segments value
     */
    public List<String> segments() {
        return this.segments;
    }

    /**
     * Get the provisioning state. Possible values include: 'Succeeded', 'Failed', 'Building', 'Deleting', 'Updating'.
     *
     * @return the provisioningState value
     */
    public WorkloadNetworkDhcpProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get nSX revision number.
     *
     * @return the revision value
     */
    public Long revision() {
        return this.revision;
    }

    /**
     * Set nSX revision number.
     *
     * @param revision the revision value to set
     * @return the WorkloadNetworkDhcpEntity object itself.
     */
    public WorkloadNetworkDhcpEntity withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

}
