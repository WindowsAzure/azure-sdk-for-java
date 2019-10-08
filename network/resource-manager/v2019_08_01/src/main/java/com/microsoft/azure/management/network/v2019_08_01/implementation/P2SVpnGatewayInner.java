/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2019_08_01.P2SConnectionConfiguration;
import com.microsoft.azure.management.network.v2019_08_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_08_01.VpnClientConnectionHealth;
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
     * List of all p2s connection configurations of the gateway.
     */
    @JsonProperty(value = "properties.p2sConnectionConfigurations")
    private List<P2SConnectionConfiguration> p2sConnectionConfigurations;

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
     * The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     */
    @JsonProperty(value = "properties.vpnServerConfiguration")
    private VpnServerConfigurationInner vpnServerConfiguration;

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
     * Get list of all p2s connection configurations of the gateway.
     *
     * @return the p2sConnectionConfigurations value
     */
    public List<P2SConnectionConfiguration> p2sConnectionConfigurations() {
        return this.p2sConnectionConfigurations;
    }

    /**
     * Set list of all p2s connection configurations of the gateway.
     *
     * @param p2sConnectionConfigurations the p2sConnectionConfigurations value to set
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withP2sConnectionConfigurations(List<P2SConnectionConfiguration> p2sConnectionConfigurations) {
        this.p2sConnectionConfigurations = p2sConnectionConfigurations;
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
     * Get the VpnServerConfiguration to which the p2sVpnGateway is attached to.
     *
     * @return the vpnServerConfiguration value
     */
    public VpnServerConfigurationInner vpnServerConfiguration() {
        return this.vpnServerConfiguration;
    }

    /**
     * Set the VpnServerConfiguration to which the p2sVpnGateway is attached to.
     *
     * @param vpnServerConfiguration the vpnServerConfiguration value to set
     * @return the P2SVpnGatewayInner object itself.
     */
    public P2SVpnGatewayInner withVpnServerConfiguration(VpnServerConfigurationInner vpnServerConfiguration) {
        this.vpnServerConfiguration = vpnServerConfiguration;
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
