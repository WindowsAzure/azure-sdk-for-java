/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DNS settings of a network interface.
 */
public class NetworkInterfaceDnsSettings {
    /**
     * List of DNS servers IP addresses. Use 'AzureProvidedDNS' to switch to
     * azure provided DNS resolution. 'AzureProvidedDNS' value cannot be
     * combined with other IPs, it must be the only value in dnsServers
     * collection.
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /**
     * If the VM that uses this NIC is part of an Availability Set, then this
     * list will have the union of all DNS servers from all NICs that are part
     * of the Availability Set. This property is what is configured on each of
     * those VMs.
     */
    @JsonProperty(value = "appliedDnsServers")
    private List<String> appliedDnsServers;

    /**
     * Relative DNS name for this NIC used for internal communications between
     * VMs in the same virtual network.
     */
    @JsonProperty(value = "internalDnsNameLabel")
    private String internalDnsNameLabel;

    /**
     * Fully qualified DNS name supporting internal communications between VMs
     * in the same virtual network.
     */
    @JsonProperty(value = "internalFqdn")
    private String internalFqdn;

    /**
     * Even if internalDnsNameLabel is not specified, a DNS entry is created
     * for the primary NIC of the VM. This DNS name can be constructed by
     * concatenating the VM name with the value of internalDomainNameSuffix.
     */
    @JsonProperty(value = "internalDomainNameSuffix")
    private String internalDomainNameSuffix;

    /**
     * Get list of DNS servers IP addresses. Use 'AzureProvidedDNS' to switch to azure provided DNS resolution. 'AzureProvidedDNS' value cannot be combined with other IPs, it must be the only value in dnsServers collection.
     *
     * @return the dnsServers value
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set list of DNS servers IP addresses. Use 'AzureProvidedDNS' to switch to azure provided DNS resolution. 'AzureProvidedDNS' value cannot be combined with other IPs, it must be the only value in dnsServers collection.
     *
     * @param dnsServers the dnsServers value to set
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get if the VM that uses this NIC is part of an Availability Set, then this list will have the union of all DNS servers from all NICs that are part of the Availability Set. This property is what is configured on each of those VMs.
     *
     * @return the appliedDnsServers value
     */
    public List<String> appliedDnsServers() {
        return this.appliedDnsServers;
    }

    /**
     * Set if the VM that uses this NIC is part of an Availability Set, then this list will have the union of all DNS servers from all NICs that are part of the Availability Set. This property is what is configured on each of those VMs.
     *
     * @param appliedDnsServers the appliedDnsServers value to set
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withAppliedDnsServers(List<String> appliedDnsServers) {
        this.appliedDnsServers = appliedDnsServers;
        return this;
    }

    /**
     * Get relative DNS name for this NIC used for internal communications between VMs in the same virtual network.
     *
     * @return the internalDnsNameLabel value
     */
    public String internalDnsNameLabel() {
        return this.internalDnsNameLabel;
    }

    /**
     * Set relative DNS name for this NIC used for internal communications between VMs in the same virtual network.
     *
     * @param internalDnsNameLabel the internalDnsNameLabel value to set
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withInternalDnsNameLabel(String internalDnsNameLabel) {
        this.internalDnsNameLabel = internalDnsNameLabel;
        return this;
    }

    /**
     * Get fully qualified DNS name supporting internal communications between VMs in the same virtual network.
     *
     * @return the internalFqdn value
     */
    public String internalFqdn() {
        return this.internalFqdn;
    }

    /**
     * Set fully qualified DNS name supporting internal communications between VMs in the same virtual network.
     *
     * @param internalFqdn the internalFqdn value to set
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withInternalFqdn(String internalFqdn) {
        this.internalFqdn = internalFqdn;
        return this;
    }

    /**
     * Get even if internalDnsNameLabel is not specified, a DNS entry is created for the primary NIC of the VM. This DNS name can be constructed by concatenating the VM name with the value of internalDomainNameSuffix.
     *
     * @return the internalDomainNameSuffix value
     */
    public String internalDomainNameSuffix() {
        return this.internalDomainNameSuffix;
    }

    /**
     * Set even if internalDnsNameLabel is not specified, a DNS entry is created for the primary NIC of the VM. This DNS name can be constructed by concatenating the VM name with the value of internalDomainNameSuffix.
     *
     * @param internalDomainNameSuffix the internalDomainNameSuffix value to set
     * @return the NetworkInterfaceDnsSettings object itself.
     */
    public NetworkInterfaceDnsSettings withInternalDomainNameSuffix(String internalDomainNameSuffix) {
        this.internalDomainNameSuffix = internalDomainNameSuffix;
        return this;
    }

}
