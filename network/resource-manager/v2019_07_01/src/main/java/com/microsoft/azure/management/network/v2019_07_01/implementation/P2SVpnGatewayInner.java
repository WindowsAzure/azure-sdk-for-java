/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_07_01.AddressSpace;
import com.microsoft.azure.management.network.v2019_07_01.VpnClientConnectionHealth;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * P2SVpnGateway Resource.
 */
@JsonFlatten
@SkipParentValidation
public class P2SVpnGatewayInner extends Resource {
    /**
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /**
     * The provisioning state of the P2S VPN gateway resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The scale unit for this p2s vpn gateway.
     */
    @JsonProperty(value = "properties.vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

    /**
     * The P2SVpnServerConfiguration to which the p2sVpnGateway is attached to.
     */
    @JsonProperty(value = "properties.p2SVpnServerConfiguration")
    private SubResource p2SVpnServerConfiguration;

    /**
     * The reference of the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "properties.vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /**
     * The reference of the address space resource which represents the custom
     * routes specified by the customer for P2SVpnGateway and P2S VpnClient.
     */
    @JsonProperty(value = "properties.customRoutes")
    private AddressSpace customRoutes;

    /**
     * All P2S VPN clients' connection health status.
     */
    @JsonProperty(value = "properties.vpnClientConnectionHealth", access = JsonProperty.Access.WRITE_ONLY)
    private VpnClientConnectionHealth vpnClientConnectionHealth;

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
     * Get the VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the provisioning state of the P2S VPN gateway resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the P2S VPN gateway resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the scale unit for this p2s vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the scale unit for this p2s vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get the P2SVpnServerConfiguration to which the p2sVpnGateway is attached to.
     *
     * @return the p2SVpnServerConfiguration value
     */
    public SubResource p2SVpnServerConfiguration() {
        return this.p2SVpnServerConfiguration;
    }

    /**
     * Set the P2SVpnServerConfiguration to which the p2sVpnGateway is attached to.
     *
     * @param p2SVpnServerConfiguration the p2SVpnServerConfiguration value to set
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withP2SVpnServerConfiguration(SubResource p2SVpnServerConfiguration) {
        this.p2SVpnServerConfiguration = p2SVpnServerConfiguration;
        return this;
    }

    /**
     * Get the reference of the address space resource which represents Address space for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the reference of the address space resource which represents Address space for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get the reference of the address space resource which represents the custom routes specified by the customer for P2SVpnGateway and P2S VpnClient.
     *
     * @return the customRoutes value
     */
    public AddressSpace customRoutes() {
        return this.customRoutes;
    }

    /**
     * Set the reference of the address space resource which represents the custom routes specified by the customer for P2SVpnGateway and P2S VpnClient.
     *
     * @param customRoutes the customRoutes value to set
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withCustomRoutes(AddressSpace customRoutes) {
        this.customRoutes = customRoutes;
        return this;
    }

    /**
     * Get all P2S VPN clients' connection health status.
     *
     * @return the vpnClientConnectionHealth value
     */
    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.vpnClientConnectionHealth;
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
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

}
