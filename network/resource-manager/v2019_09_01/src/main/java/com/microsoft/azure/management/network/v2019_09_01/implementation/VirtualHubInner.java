/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.VirtualHubRouteTable;
import com.microsoft.azure.management.network.v2019_09_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * VirtualHub Resource.
 */
@JsonFlatten
@SkipParentValidation
public class VirtualHubInner extends Resource {
    /**
     * The VirtualWAN to which the VirtualHub belongs.
     */
    @JsonProperty(value = "properties.virtualWan")
    private SubResource virtualWan;

    /**
     * The VpnGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.vpnGateway")
    private SubResource vpnGateway;

    /**
     * The P2SVpnGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.p2SVpnGateway")
    private SubResource p2SVpnGateway;

    /**
     * The expressRouteGateway associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.expressRouteGateway")
    private SubResource expressRouteGateway;

    /**
     * The azureFirewall associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.azureFirewall")
    private SubResource azureFirewall;

    /**
     * List of all vnet connections with this VirtualHub.
     */
    @JsonProperty(value = "properties.virtualNetworkConnections")
    private List<HubVirtualNetworkConnectionInner> virtualNetworkConnections;

    /**
     * Address-prefix for this VirtualHub.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /**
     * The routeTable associated with this virtual hub.
     */
    @JsonProperty(value = "properties.routeTable")
    private VirtualHubRouteTable routeTable;

    /**
     * The provisioning state of the virtual hub resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The Security Provider name.
     */
    @JsonProperty(value = "properties.securityProviderName")
    private String securityProviderName;

    /**
     * List of all virtual hub route table v2s associated with this VirtualHub.
     */
    @JsonProperty(value = "properties.virtualHubRouteTableV2s")
    private List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2s;

    /**
     * The sku of this VirtualHub.
     */
    @JsonProperty(value = "properties.sku")
    private String sku;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the VirtualWAN to which the VirtualHub belongs.
     *
     * @return the virtualWan value
     */
    public SubResource virtualWan() {
        return this.virtualWan;
    }

    /**
     * Set the VirtualWAN to which the VirtualHub belongs.
     *
     * @param virtualWan the virtualWan value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualWan(SubResource virtualWan) {
        this.virtualWan = virtualWan;
        return this;
    }

    /**
     * Get the VpnGateway associated with this VirtualHub.
     *
     * @return the vpnGateway value
     */
    public SubResource vpnGateway() {
        return this.vpnGateway;
    }

    /**
     * Set the VpnGateway associated with this VirtualHub.
     *
     * @param vpnGateway the vpnGateway value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVpnGateway(SubResource vpnGateway) {
        this.vpnGateway = vpnGateway;
        return this;
    }

    /**
     * Get the P2SVpnGateway associated with this VirtualHub.
     *
     * @return the p2SVpnGateway value
     */
    public SubResource p2SVpnGateway() {
        return this.p2SVpnGateway;
    }

    /**
     * Set the P2SVpnGateway associated with this VirtualHub.
     *
     * @param p2SVpnGateway the p2SVpnGateway value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withP2SVpnGateway(SubResource p2SVpnGateway) {
        this.p2SVpnGateway = p2SVpnGateway;
        return this;
    }

    /**
     * Get the expressRouteGateway associated with this VirtualHub.
     *
     * @return the expressRouteGateway value
     */
    public SubResource expressRouteGateway() {
        return this.expressRouteGateway;
    }

    /**
     * Set the expressRouteGateway associated with this VirtualHub.
     *
     * @param expressRouteGateway the expressRouteGateway value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withExpressRouteGateway(SubResource expressRouteGateway) {
        this.expressRouteGateway = expressRouteGateway;
        return this;
    }

    /**
     * Get the azureFirewall associated with this VirtualHub.
     *
     * @return the azureFirewall value
     */
    public SubResource azureFirewall() {
        return this.azureFirewall;
    }

    /**
     * Set the azureFirewall associated with this VirtualHub.
     *
     * @param azureFirewall the azureFirewall value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAzureFirewall(SubResource azureFirewall) {
        this.azureFirewall = azureFirewall;
        return this;
    }

    /**
     * Get list of all vnet connections with this VirtualHub.
     *
     * @return the virtualNetworkConnections value
     */
    public List<HubVirtualNetworkConnectionInner> virtualNetworkConnections() {
        return this.virtualNetworkConnections;
    }

    /**
     * Set list of all vnet connections with this VirtualHub.
     *
     * @param virtualNetworkConnections the virtualNetworkConnections value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualNetworkConnections(List<HubVirtualNetworkConnectionInner> virtualNetworkConnections) {
        this.virtualNetworkConnections = virtualNetworkConnections;
        return this;
    }

    /**
     * Get address-prefix for this VirtualHub.
     *
     * @return the addressPrefix value
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set address-prefix for this VirtualHub.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the routeTable associated with this virtual hub.
     *
     * @return the routeTable value
     */
    public VirtualHubRouteTable routeTable() {
        return this.routeTable;
    }

    /**
     * Set the routeTable associated with this virtual hub.
     *
     * @param routeTable the routeTable value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withRouteTable(VirtualHubRouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get the provisioning state of the virtual hub resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the Security Provider name.
     *
     * @return the securityProviderName value
     */
    public String securityProviderName() {
        return this.securityProviderName;
    }

    /**
     * Set the Security Provider name.
     *
     * @param securityProviderName the securityProviderName value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withSecurityProviderName(String securityProviderName) {
        this.securityProviderName = securityProviderName;
        return this;
    }

    /**
     * Get list of all virtual hub route table v2s associated with this VirtualHub.
     *
     * @return the virtualHubRouteTableV2s value
     */
    public List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2s() {
        return this.virtualHubRouteTableV2s;
    }

    /**
     * Set list of all virtual hub route table v2s associated with this VirtualHub.
     *
     * @param virtualHubRouteTableV2s the virtualHubRouteTableV2s value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withVirtualHubRouteTableV2s(List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2s) {
        this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
        return this;
    }

    /**
     * Get the sku of this VirtualHub.
     *
     * @return the sku value
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku of this VirtualHub.
     *
     * @param sku the sku value to set
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withSku(String sku) {
        this.sku = sku;
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
     * @return the VirtualHubInner object itself.
     */
    public VirtualHubInner withId(String id) {
        this.id = id;
        return this;
    }

}
