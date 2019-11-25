/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a virtual machines scale sets network configuration's DNS
 * settings.
 */
public class VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings {
    /**
     * The Domain name label.The concatenation of the domain name label and vm
     * index will be the domain name labels of the PublicIPAddress resources
     * that will be created.
     */
    @JsonProperty(value = "domainNameLabel", required = true)
    private String domainNameLabel;

    /**
     * Get the domainNameLabel value.
     *
     * @return the domainNameLabel value
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    /**
     * Set the domainNameLabel value.
     *
     * @param domainNameLabel the domainNameLabel value to set
     * @return the VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings object itself.
     */
    public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettings withDomainNameLabel(String domainNameLabel) {
        this.domainNameLabel = domainNameLabel;
        return this;
    }

}
