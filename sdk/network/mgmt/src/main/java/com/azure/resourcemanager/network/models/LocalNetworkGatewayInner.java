// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.AddressSpace;
import com.azure.resourcemanager.network.BgpSettings;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LocalNetworkGateway model. */
@JsonFlatten
@Fluent
public class LocalNetworkGatewayInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocalNetworkGatewayInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Local network site address space.
     */
    @JsonProperty(value = "properties.localNetworkAddressSpace")
    private AddressSpace localNetworkAddressSpace;

    /*
     * IP address of local network gateway.
     */
    @JsonProperty(value = "properties.gatewayIpAddress")
    private String gatewayIpAddress;

    /*
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /*
     * The resource GUID property of the LocalNetworkGateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the LocalNetworkGateway resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

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
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the localNetworkAddressSpace property: Local network site address space.
     *
     * @return the localNetworkAddressSpace value.
     */
    public AddressSpace localNetworkAddressSpace() {
        return this.localNetworkAddressSpace;
    }

    /**
     * Set the localNetworkAddressSpace property: Local network site address space.
     *
     * @param localNetworkAddressSpace the localNetworkAddressSpace value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace) {
        this.localNetworkAddressSpace = localNetworkAddressSpace;
        return this;
    }

    /**
     * Get the gatewayIpAddress property: IP address of local network gateway.
     *
     * @return the gatewayIpAddress value.
     */
    public String gatewayIpAddress() {
        return this.gatewayIpAddress;
    }

    /**
     * Set the gatewayIpAddress property: IP address of local network gateway.
     *
     * @param gatewayIpAddress the gatewayIpAddress value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
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
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the LocalNetworkGateway resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the LocalNetworkGateway resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the LocalNetworkGateway resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
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
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (localNetworkAddressSpace() != null) {
            localNetworkAddressSpace().validate();
        }
        if (bgpSettings() != null) {
            bgpSettings().validate();
        }
    }
}
