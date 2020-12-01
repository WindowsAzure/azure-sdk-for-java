/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.AddressSpace;
import com.microsoft.azure.management.network.v2020_07_01.BgpSettings;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A common class for general resource information.
 */
@JsonFlatten
@SkipParentValidation
public class LocalNetworkGatewayInner extends Resource {
    /**
     * Local network site address space.
     */
    @JsonProperty(value = "properties.localNetworkAddressSpace")
    private AddressSpace localNetworkAddressSpace;

    /**
     * IP address of local network gateway.
     */
    @JsonProperty(value = "properties.gatewayIpAddress")
    private String gatewayIpAddress;

    /**
     * FQDN of local network gateway.
     */
    @JsonProperty(value = "properties.fqdn")
    private String fqdn;

    /**
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /**
     * The resource GUID property of the local network gateway resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * The provisioning state of the local network gateway resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

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
     * Get local network site address space.
     *
     * @return the localNetworkAddressSpace value
     */
    public AddressSpace localNetworkAddressSpace() {
        return this.localNetworkAddressSpace;
    }

    /**
     * Set local network site address space.
     *
     * @param localNetworkAddressSpace the localNetworkAddressSpace value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace) {
        this.localNetworkAddressSpace = localNetworkAddressSpace;
        return this;
    }

    /**
     * Get iP address of local network gateway.
     *
     * @return the gatewayIpAddress value
     */
    public String gatewayIpAddress() {
        return this.gatewayIpAddress;
    }

    /**
     * Set iP address of local network gateway.
     *
     * @param gatewayIpAddress the gatewayIpAddress value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withGatewayIpAddress(String gatewayIpAddress) {
        this.gatewayIpAddress = gatewayIpAddress;
        return this;
    }

    /**
     * Get fQDN of local network gateway.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set fQDN of local network gateway.
     *
     * @param fqdn the fqdn value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set local network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the resource GUID property of the local network gateway resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioning state of the local network gateway resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
     * @return the LocalNetworkGatewayInner object itself.
     */
    public LocalNetworkGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

}
