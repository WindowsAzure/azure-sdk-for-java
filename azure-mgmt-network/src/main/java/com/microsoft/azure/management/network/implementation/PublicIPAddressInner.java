/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.management.network.IPAllocationMethod;
import com.microsoft.azure.management.network.IPVersion;
import com.microsoft.azure.management.network.PublicIPAddressDnsSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Public IP address resource.
 */
@JsonFlatten
public class PublicIPAddressInner extends Resource {
    /**
     * The public IP allocation method. Possible values are: 'Static' and
     * 'Dynamic'. Possible values include: 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.publicIPAllocationMethod")
    private IPAllocationMethod publicIPAllocationMethod;

    /**
     * The public IP address version. Possible values are: 'IPv4' and 'IPv6'.
     * Possible values include: 'IPv4', 'IPv6'.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IPVersion publicIPAddressVersion;

    /**
     * The ipConfiguration property.
     */
    @JsonProperty(value = "properties.ipConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private IPConfigurationInner ipConfiguration;

    /**
     * The FQDN of the DNS record associated with the public IP address.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private PublicIPAddressDnsSettings dnsSettings;

    /**
     * The ipAddress property.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /**
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * The resource GUID property of the public IP resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the PublicIP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the publicIPAllocationMethod value.
     *
     * @return the publicIPAllocationMethod value
     */
    public IPAllocationMethod publicIPAllocationMethod() {
        return this.publicIPAllocationMethod;
    }

    /**
     * Set the publicIPAllocationMethod value.
     *
     * @param publicIPAllocationMethod the publicIPAllocationMethod value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withPublicIPAllocationMethod(IPAllocationMethod publicIPAllocationMethod) {
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        return this;
    }

    /**
     * Get the publicIPAddressVersion value.
     *
     * @return the publicIPAddressVersion value
     */
    public IPVersion publicIPAddressVersion() {
        return this.publicIPAddressVersion;
    }

    /**
     * Set the publicIPAddressVersion value.
     *
     * @param publicIPAddressVersion the publicIPAddressVersion value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withPublicIPAddressVersion(IPVersion publicIPAddressVersion) {
        this.publicIPAddressVersion = publicIPAddressVersion;
        return this;
    }

    /**
     * Get the ipConfiguration value.
     *
     * @return the ipConfiguration value
     */
    public IPConfigurationInner ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Get the dnsSettings value.
     *
     * @return the dnsSettings value
     */
    public PublicIPAddressDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings value.
     *
     * @param dnsSettings the dnsSettings value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withDnsSettings(PublicIPAddressDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipAddress value.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress value.
     *
     * @param ipAddress the ipAddress value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes value.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes value.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
