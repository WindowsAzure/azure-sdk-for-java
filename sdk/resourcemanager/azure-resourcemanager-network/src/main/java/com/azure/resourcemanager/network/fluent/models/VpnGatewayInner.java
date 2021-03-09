// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.BgpSettings;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnGatewayIpConfiguration;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** VpnGateway Resource. */
@JsonFlatten
@Fluent
public class VpnGatewayInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnGatewayInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /*
     * List of all vpn connections to the gateway.
     */
    @JsonProperty(value = "properties.connections")
    private List<VpnConnectionInner> connections;

    /*
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /*
     * The provisioning state of the VPN gateway resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The scale unit for this vpn gateway.
     */
    @JsonProperty(value = "properties.vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

    /*
     * List of all IPs configured on the gateway.
     */
    @JsonProperty(value = "properties.ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<VpnGatewayIpConfiguration> ipConfigurations;

    /*
     * Enable Routing Preference property for the Public IP Interface of the
     * VpnGateway.
     */
    @JsonProperty(value = "properties.isRoutingPreferenceInternet")
    private Boolean isRoutingPreferenceInternet;

    /*
     * List of all the nat Rules associated with the gateway.
     */
    @JsonProperty(value = "properties.natRules")
    private List<VpnGatewayNatRuleInner> natRules;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the connections property: List of all vpn connections to the gateway.
     *
     * @return the connections value.
     */
    public List<VpnConnectionInner> connections() {
        return this.connections;
    }

    /**
     * Set the connections property: List of all vpn connections to the gateway.
     *
     * @param connections the connections value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withConnections(List<VpnConnectionInner> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get the ipConfigurations property: List of all IPs configured on the gateway.
     *
     * @return the ipConfigurations value.
     */
    public List<VpnGatewayIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     *
     * @return the isRoutingPreferenceInternet value.
     */
    public Boolean isRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet;
    }

    /**
     * Set the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     *
     * @param isRoutingPreferenceInternet the isRoutingPreferenceInternet value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet) {
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        return this;
    }

    /**
     * Get the natRules property: List of all the nat Rules associated with the gateway.
     *
     * @return the natRules value.
     */
    public List<VpnGatewayNatRuleInner> natRules() {
        return this.natRules;
    }

    /**
     * Set the natRules property: List of all the nat Rules associated with the gateway.
     *
     * @param natRules the natRules value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withNatRules(List<VpnGatewayNatRuleInner> natRules) {
        this.natRules = natRules;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VpnGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VpnGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connections() != null) {
            connections().forEach(e -> e.validate());
        }
        if (bgpSettings() != null) {
            bgpSettings().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (natRules() != null) {
            natRules().forEach(e -> e.validate());
        }
    }
}
