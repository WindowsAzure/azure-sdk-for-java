// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AddressSpace;
import com.azure.resourcemanager.network.models.BgpSettings;
import com.azure.resourcemanager.network.models.DeviceProperties;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VpnSite Resource. */
@JsonFlatten
@Fluent
public class VpnSiteInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VpnSiteInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The VirtualWAN to which the vpnSite belongs.
     */
    @JsonProperty(value = "properties.virtualWan")
    private SubResource virtualWan;

    /*
     * The device properties.
     */
    @JsonProperty(value = "properties.deviceProperties")
    private DeviceProperties deviceProperties;

    /*
     * The ip-address for the vpn-site.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /*
     * The key for vpn-site that can be used for connections.
     */
    @JsonProperty(value = "properties.siteKey")
    private String siteKey;

    /*
     * The AddressSpace that contains an array of IP address ranges.
     */
    @JsonProperty(value = "properties.addressSpace")
    private AddressSpace addressSpace;

    /*
     * The set of bgp properties.
     */
    @JsonProperty(value = "properties.bgpProperties")
    private BgpSettings bgpProperties;

    /*
     * The provisioning state of the VPN site resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * IsSecuritySite flag.
     */
    @JsonProperty(value = "properties.isSecuritySite")
    private Boolean isSecuritySite;

    /*
     * List of all vpn site links.
     */
    @JsonProperty(value = "properties.vpnSiteLinks")
    private List<VpnSiteLinkInner> vpnSiteLinks;

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
     * Get the virtualWan property: The VirtualWAN to which the vpnSite belongs.
     *
     * @return the virtualWan value.
     */
    public SubResource virtualWan() {
        return this.virtualWan;
    }

    /**
     * Set the virtualWan property: The VirtualWAN to which the vpnSite belongs.
     *
     * @param virtualWan the virtualWan value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withVirtualWan(SubResource virtualWan) {
        this.virtualWan = virtualWan;
        return this;
    }

    /**
     * Get the deviceProperties property: The device properties.
     *
     * @return the deviceProperties value.
     */
    public DeviceProperties deviceProperties() {
        return this.deviceProperties;
    }

    /**
     * Set the deviceProperties property: The device properties.
     *
     * @param deviceProperties the deviceProperties value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withDeviceProperties(DeviceProperties deviceProperties) {
        this.deviceProperties = deviceProperties;
        return this;
    }

    /**
     * Get the ipAddress property: The ip-address for the vpn-site.
     *
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The ip-address for the vpn-site.
     *
     * @param ipAddress the ipAddress value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the siteKey property: The key for vpn-site that can be used for connections.
     *
     * @return the siteKey value.
     */
    public String siteKey() {
        return this.siteKey;
    }

    /**
     * Set the siteKey property: The key for vpn-site that can be used for connections.
     *
     * @param siteKey the siteKey value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withSiteKey(String siteKey) {
        this.siteKey = siteKey;
        return this;
    }

    /**
     * Get the addressSpace property: The AddressSpace that contains an array of IP address ranges.
     *
     * @return the addressSpace value.
     */
    public AddressSpace addressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the addressSpace property: The AddressSpace that contains an array of IP address ranges.
     *
     * @param addressSpace the addressSpace value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withAddressSpace(AddressSpace addressSpace) {
        this.addressSpace = addressSpace;
        return this;
    }

    /**
     * Get the bgpProperties property: The set of bgp properties.
     *
     * @return the bgpProperties value.
     */
    public BgpSettings bgpProperties() {
        return this.bgpProperties;
    }

    /**
     * Set the bgpProperties property: The set of bgp properties.
     *
     * @param bgpProperties the bgpProperties value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withBgpProperties(BgpSettings bgpProperties) {
        this.bgpProperties = bgpProperties;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN site resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the isSecuritySite property: IsSecuritySite flag.
     *
     * @return the isSecuritySite value.
     */
    public Boolean isSecuritySite() {
        return this.isSecuritySite;
    }

    /**
     * Set the isSecuritySite property: IsSecuritySite flag.
     *
     * @param isSecuritySite the isSecuritySite value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withIsSecuritySite(Boolean isSecuritySite) {
        this.isSecuritySite = isSecuritySite;
        return this;
    }

    /**
     * Get the vpnSiteLinks property: List of all vpn site links.
     *
     * @return the vpnSiteLinks value.
     */
    public List<VpnSiteLinkInner> vpnSiteLinks() {
        return this.vpnSiteLinks;
    }

    /**
     * Set the vpnSiteLinks property: List of all vpn site links.
     *
     * @param vpnSiteLinks the vpnSiteLinks value to set.
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withVpnSiteLinks(List<VpnSiteLinkInner> vpnSiteLinks) {
        this.vpnSiteLinks = vpnSiteLinks;
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
     * @return the VpnSiteInner object itself.
     */
    public VpnSiteInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deviceProperties() != null) {
            deviceProperties().validate();
        }
        if (addressSpace() != null) {
            addressSpace().validate();
        }
        if (bgpProperties() != null) {
            bgpProperties().validate();
        }
        if (vpnSiteLinks() != null) {
            vpnSiteLinks().forEach(e -> e.validate());
        }
    }
}
