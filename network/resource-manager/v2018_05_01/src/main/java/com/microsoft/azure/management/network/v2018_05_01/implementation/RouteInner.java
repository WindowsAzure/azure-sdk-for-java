/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import com.microsoft.azure.management.network.v2018_05_01.RouteNextHopType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Route resource.
 */
@JsonFlatten
public class RouteInner extends SubResource {
    /**
     * The destination CIDR to which the route applies.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /**
     * The type of Azure hop the packet should be sent to. Possible values are:
     * 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance',
     * and 'None'. Possible values include: 'VirtualNetworkGateway',
     * 'VnetLocal', 'Internet', 'VirtualAppliance', 'None'.
     */
    @JsonProperty(value = "properties.nextHopType", required = true)
    private RouteNextHopType nextHopType;

    /**
     * The IP address packets should be forwarded to. Next hop values are only
     * allowed in routes where the next hop type is VirtualAppliance.
     */
    @JsonProperty(value = "properties.nextHopIpAddress")
    private String nextHopIpAddress;

    /**
     * The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the destination CIDR to which the route applies.
     *
     * @return the addressPrefix value
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the destination CIDR to which the route applies.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the RouteInner object itself.
     */
    public RouteInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the type of Azure hop the packet should be sent to. Possible values are: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', and 'None'. Possible values include: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', 'None'.
     *
     * @return the nextHopType value
     */
    public RouteNextHopType nextHopType() {
        return this.nextHopType;
    }

    /**
     * Set the type of Azure hop the packet should be sent to. Possible values are: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', and 'None'. Possible values include: 'VirtualNetworkGateway', 'VnetLocal', 'Internet', 'VirtualAppliance', 'None'.
     *
     * @param nextHopType the nextHopType value to set
     * @return the RouteInner object itself.
     */
    public RouteInner withNextHopType(RouteNextHopType nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }

    /**
     * Get the IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     *
     * @return the nextHopIpAddress value
     */
    public String nextHopIpAddress() {
        return this.nextHopIpAddress;
    }

    /**
     * Set the IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     *
     * @param nextHopIpAddress the nextHopIpAddress value to set
     * @return the RouteInner object itself.
     */
    public RouteInner withNextHopIpAddress(String nextHopIpAddress) {
        this.nextHopIpAddress = nextHopIpAddress;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the RouteInner object itself.
     */
    public RouteInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the RouteInner object itself.
     */
    public RouteInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the RouteInner object itself.
     */
    public RouteInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
