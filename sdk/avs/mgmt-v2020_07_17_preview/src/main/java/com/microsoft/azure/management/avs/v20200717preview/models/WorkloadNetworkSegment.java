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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * NSX Segment.
 */
@JsonFlatten
public class WorkloadNetworkSegment extends ProxyResource {
    /**
     * Display name of the segment.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Gateway which to connect segment to.
     */
    @JsonProperty(value = "properties.connectedGateway")
    private String connectedGateway;

    /**
     * Subnet which to connect segment to.
     */
    @JsonProperty(value = "properties.subnet")
    private WorkloadNetworkSegmentSubnet subnet;

    /**
     * Port Vif which segment is associated with.
     */
    @JsonProperty(value = "properties.portVif", access = JsonProperty.Access.WRITE_ONLY)
    private List<WorkloadNetworkSegmentPortVif> portVif;

    /**
     * Segment status. Possible values include: 'SUCCESS, FAILURE'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private SegmentStatusEnum status;

    /**
     * The provisioning state. Possible values include: 'Succeeded', 'Failed',
     * 'Building', 'Deleting', 'Updating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkloadNetworkSegmentProvisioningState provisioningState;

    /**
     * NSX revision number.
     */
    @JsonProperty(value = "properties.revision")
    private Long revision;

    /**
     * Get display name of the segment.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set display name of the segment.
     *
     * @param displayName the displayName value to set
     * @return the WorkloadNetworkSegment object itself.
     */
    public WorkloadNetworkSegment withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get gateway which to connect segment to.
     *
     * @return the connectedGateway value
     */
    public String connectedGateway() {
        return this.connectedGateway;
    }

    /**
     * Set gateway which to connect segment to.
     *
     * @param connectedGateway the connectedGateway value to set
     * @return the WorkloadNetworkSegment object itself.
     */
    public WorkloadNetworkSegment withConnectedGateway(String connectedGateway) {
        this.connectedGateway = connectedGateway;
        return this;
    }

    /**
     * Get subnet which to connect segment to.
     *
     * @return the subnet value
     */
    public WorkloadNetworkSegmentSubnet subnet() {
        return this.subnet;
    }

    /**
     * Set subnet which to connect segment to.
     *
     * @param subnet the subnet value to set
     * @return the WorkloadNetworkSegment object itself.
     */
    public WorkloadNetworkSegment withSubnet(WorkloadNetworkSegmentSubnet subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get port Vif which segment is associated with.
     *
     * @return the portVif value
     */
    public List<WorkloadNetworkSegmentPortVif> portVif() {
        return this.portVif;
    }

    /**
     * Get segment status. Possible values include: 'SUCCESS, FAILURE'.
     *
     * @return the status value
     */
    public SegmentStatusEnum status() {
        return this.status;
    }

    /**
     * Get the provisioning state. Possible values include: 'Succeeded', 'Failed', 'Building', 'Deleting', 'Updating'.
     *
     * @return the provisioningState value
     */
    public WorkloadNetworkSegmentProvisioningState provisioningState() {
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
     * @return the WorkloadNetworkSegment object itself.
     */
    public WorkloadNetworkSegment withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

}
