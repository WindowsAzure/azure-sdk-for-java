// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ProxyOnlyResource;
import com.azure.management.appservice.VirtualIPMapping;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AddressResponse model. */
@JsonFlatten
@Fluent
public class AddressResponseInner extends ProxyOnlyResource {
    /*
     * Main public virtual IP.
     */
    @JsonProperty(value = "properties.serviceIpAddress")
    private String serviceIpAddress;

    /*
     * Virtual Network internal IP address of the App Service Environment if it
     * is in internal load-balancing mode.
     */
    @JsonProperty(value = "properties.internalIpAddress")
    private String internalIpAddress;

    /*
     * IP addresses appearing on outbound connections.
     */
    @JsonProperty(value = "properties.outboundIpAddresses")
    private List<String> outboundIpAddresses;

    /*
     * Additional virtual IPs.
     */
    @JsonProperty(value = "properties.vipMappings")
    private List<VirtualIPMapping> vipMappings;

    /**
     * Get the serviceIpAddress property: Main public virtual IP.
     *
     * @return the serviceIpAddress value.
     */
    public String serviceIpAddress() {
        return this.serviceIpAddress;
    }

    /**
     * Set the serviceIpAddress property: Main public virtual IP.
     *
     * @param serviceIpAddress the serviceIpAddress value to set.
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withServiceIpAddress(String serviceIpAddress) {
        this.serviceIpAddress = serviceIpAddress;
        return this;
    }

    /**
     * Get the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     *
     * @return the internalIpAddress value.
     */
    public String internalIpAddress() {
        return this.internalIpAddress;
    }

    /**
     * Set the internalIpAddress property: Virtual Network internal IP address of the App Service Environment if it is
     * in internal load-balancing mode.
     *
     * @param internalIpAddress the internalIpAddress value to set.
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withInternalIpAddress(String internalIpAddress) {
        this.internalIpAddress = internalIpAddress;
        return this;
    }

    /**
     * Get the outboundIpAddresses property: IP addresses appearing on outbound connections.
     *
     * @return the outboundIpAddresses value.
     */
    public List<String> outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Set the outboundIpAddresses property: IP addresses appearing on outbound connections.
     *
     * @param outboundIpAddresses the outboundIpAddresses value to set.
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withOutboundIpAddresses(List<String> outboundIpAddresses) {
        this.outboundIpAddresses = outboundIpAddresses;
        return this;
    }

    /**
     * Get the vipMappings property: Additional virtual IPs.
     *
     * @return the vipMappings value.
     */
    public List<VirtualIPMapping> vipMappings() {
        return this.vipMappings;
    }

    /**
     * Set the vipMappings property: Additional virtual IPs.
     *
     * @param vipMappings the vipMappings value to set.
     * @return the AddressResponseInner object itself.
     */
    public AddressResponseInner withVipMappings(List<VirtualIPMapping> vipMappings) {
        this.vipMappings = vipMappings;
        return this;
    }
}
