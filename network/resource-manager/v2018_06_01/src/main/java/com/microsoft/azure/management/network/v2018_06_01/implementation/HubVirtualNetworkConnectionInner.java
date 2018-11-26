/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_06_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * HubVirtualNetworkConnection Resource.
 */
@JsonFlatten
@SkipParentValidation
public class HubVirtualNetworkConnectionInner extends Resource {
    /**
     * Reference to the remote virtual network.
     */
    @JsonProperty(value = "properties.remoteVirtualNetwork")
    private SubResource remoteVirtualNetwork;

    /**
     * VirtualHub to RemoteVnet transit to enabled or not.
     */
    @JsonProperty(value = "properties.allowHubToRemoteVnetTransit")
    private Boolean allowHubToRemoteVnetTransit;

    /**
     * Allow RemoteVnet to use Virtual Hub's gateways.
     */
    @JsonProperty(value = "properties.allowRemoteVnetToUseHubVnetGateways")
    private Boolean allowRemoteVnetToUseHubVnetGateways;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get reference to the remote virtual network.
     *
     * @return the remoteVirtualNetwork value
     */
    public SubResource remoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }

    /**
     * Set reference to the remote virtual network.
     *
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        this.remoteVirtualNetwork = remoteVirtualNetwork;
        return this;
    }

    /**
     * Get virtualHub to RemoteVnet transit to enabled or not.
     *
     * @return the allowHubToRemoteVnetTransit value
     */
    public Boolean allowHubToRemoteVnetTransit() {
        return this.allowHubToRemoteVnetTransit;
    }

    /**
     * Set virtualHub to RemoteVnet transit to enabled or not.
     *
     * @param allowHubToRemoteVnetTransit the allowHubToRemoteVnetTransit value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withAllowHubToRemoteVnetTransit(Boolean allowHubToRemoteVnetTransit) {
        this.allowHubToRemoteVnetTransit = allowHubToRemoteVnetTransit;
        return this;
    }

    /**
     * Get allow RemoteVnet to use Virtual Hub's gateways.
     *
     * @return the allowRemoteVnetToUseHubVnetGateways value
     */
    public Boolean allowRemoteVnetToUseHubVnetGateways() {
        return this.allowRemoteVnetToUseHubVnetGateways;
    }

    /**
     * Set allow RemoteVnet to use Virtual Hub's gateways.
     *
     * @param allowRemoteVnetToUseHubVnetGateways the allowRemoteVnetToUseHubVnetGateways value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withAllowRemoteVnetToUseHubVnetGateways(Boolean allowRemoteVnetToUseHubVnetGateways) {
        this.allowRemoteVnetToUseHubVnetGateways = allowRemoteVnetToUseHubVnetGateways;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withId(String id) {
        this.id = id;
        return this;
    }

}
