/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import java.util.List;
import com.microsoft.azure.management.appservice.VirtualIPMapping;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes main public IP address and any extra virtual IPs.
 */
public class AddressResponseInner {
    /**
     * Main public virtual IP.
     */
    @JsonProperty(value = "serviceIpAddress")
    private String serviceIpAddress;

    /**
     * Virtual Network internal IP address of the App Service Environment if it
     * is in internal load-balancing mode.
     */
    @JsonProperty(value = "internalIpAddress")
    private String internalIpAddress;

    /**
     * IP addresses appearing on outbound connections.
     */
    @JsonProperty(value = "outboundIpAddresses")
    private List<String> outboundIpAddresses;

    /**
     * Additional virtual IPs.
     */
    @JsonProperty(value = "vipMappings")
    private List<VirtualIPMapping> vipMappings;

    /**
     * Get the serviceIpAddress value.
     *
     * @return the serviceIpAddress value
     */
    public String serviceIpAddress() {
        return this.serviceIpAddress;
    }

    /**
     * Set the serviceIpAddress value.
     *
     * @param serviceIpAddress the serviceIpAddress value to set
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withServiceIpAddress(String serviceIpAddress) {
        this.serviceIpAddress = serviceIpAddress;
        return this;
    }

    /**
     * Get the internalIpAddress value.
     *
     * @return the internalIpAddress value
     */
    public String internalIpAddress() {
        return this.internalIpAddress;
    }

    /**
     * Set the internalIpAddress value.
     *
     * @param internalIpAddress the internalIpAddress value to set
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withInternalIpAddress(String internalIpAddress) {
        this.internalIpAddress = internalIpAddress;
        return this;
    }

    /**
     * Get the outboundIpAddresses value.
     *
     * @return the outboundIpAddresses value
     */
    public List<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Set the outboundIpAddresses value.
     *
     * @param outboundIpAddresses the outboundIpAddresses value to set
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withOutboundIpAddresses(List<String> outboundIpAddresses) {
        this.outboundIpAddresses = outboundIpAddresses;
        return this;
    }

    /**
     * Get the vipMappings value.
     *
     * @return the vipMappings value
     */
    public List<VirtualIPMapping> vipMappings() {
        return this.vipMappings;
    }

    /**
     * Set the vipMappings value.
     *
     * @param vipMappings the vipMappings value to set
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withVipMappings(List<VirtualIPMapping> vipMappings) {
        this.vipMappings = vipMappings;
        return this;
    }

}
