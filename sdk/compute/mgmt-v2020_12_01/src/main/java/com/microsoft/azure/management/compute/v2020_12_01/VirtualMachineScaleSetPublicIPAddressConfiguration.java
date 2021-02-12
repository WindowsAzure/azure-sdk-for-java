/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a virtual machines scale set IP Configuration's PublicIPAddress
 * configuration.
 */
@JsonFlatten
public class VirtualMachineScaleSetPublicIPAddressConfiguration {
    /**
     * The publicIP address configuration name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * The dns settings to be applied on the publicIP addresses .
     */
    @JsonProperty(value = "properties.dnsSettings")
    private VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings dnsSettings;

    /**
     * The list of IP tags associated with the public IP address.
     */
    @JsonProperty(value = "properties.ipTags")
    private List<VirtualMachineScaleSetIpTag> ipTags;

    /**
     * The PublicIPPrefix from which to allocate publicIP addresses.
     */
    @JsonProperty(value = "properties.publicIPPrefix")
    private SubResource publicIPPrefix;

    /**
     * Available from Api-Version 2019-07-01 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4',
     * 'IPv6'.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IPVersion publicIPAddressVersion;

    /**
     * Get the publicIP address configuration name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the publicIP address configuration name.
     *
     * @param name the name value to set
     * @return the VirtualMachineScaleSetPublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIPAddressConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idle timeout of the public IP address.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the VirtualMachineScaleSetPublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIPAddressConfiguration withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the dns settings to be applied on the publicIP addresses .
     *
     * @return the dnsSettings value
     */
    public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dns settings to be applied on the publicIP addresses .
     *
     * @param dnsSettings the dnsSettings value to set
     * @return the VirtualMachineScaleSetPublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIPAddressConfiguration withDnsSettings(VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the list of IP tags associated with the public IP address.
     *
     * @return the ipTags value
     */
    public List<VirtualMachineScaleSetIpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the list of IP tags associated with the public IP address.
     *
     * @param ipTags the ipTags value to set
     * @return the VirtualMachineScaleSetPublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIPAddressConfiguration withIpTags(List<VirtualMachineScaleSetIpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the PublicIPPrefix from which to allocate publicIP addresses.
     *
     * @return the publicIPPrefix value
     */
    public SubResource publicIPPrefix() {
        return this.publicIPPrefix;
    }

    /**
     * Set the PublicIPPrefix from which to allocate publicIP addresses.
     *
     * @param publicIPPrefix the publicIPPrefix value to set
     * @return the VirtualMachineScaleSetPublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIPAddressConfiguration withPublicIPPrefix(SubResource publicIPPrefix) {
        this.publicIPPrefix = publicIPPrefix;
        return this;
    }

    /**
     * Get available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the publicIPAddressVersion value
     */
    public IPVersion publicIPAddressVersion() {
        return this.publicIPAddressVersion;
    }

    /**
     * Set available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param publicIPAddressVersion the publicIPAddressVersion value to set
     * @return the VirtualMachineScaleSetPublicIPAddressConfiguration object itself.
     */
    public VirtualMachineScaleSetPublicIPAddressConfiguration withPublicIPAddressVersion(IPVersion publicIPAddressVersion) {
        this.publicIPAddressVersion = publicIPAddressVersion;
        return this;
    }

}
