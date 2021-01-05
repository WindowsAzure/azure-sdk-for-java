// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a virtual machines scale sets network configuration's DNS settings. */
@Fluent
public final class VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings.class);

    /*
     * The Domain name label.The concatenation of the domain name label and vm
     * index will be the domain name labels of the PublicIPAddress resources
     * that will be created
     */
    @JsonProperty(value = "domainNameLabel", required = true)
    private String domainNameLabel;

    /**
     * Get the domainNameLabel property: The Domain name label.The concatenation of the domain name label and vm index
     * will be the domain name labels of the PublicIPAddress resources that will be created.
     *
     * @return the domainNameLabel value.
     */
    public String domainNameLabel() {
        return this.domainNameLabel;
    }

    /**
     * Set the domainNameLabel property: The Domain name label.The concatenation of the domain name label and vm index
     * will be the domain name labels of the PublicIPAddress resources that will be created.
     *
     * @param domainNameLabel the domainNameLabel value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings withDomainNameLabel(String domainNameLabel) {
        this.domainNameLabel = domainNameLabel;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domainNameLabel() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property domainNameLabel in model"
                            + " VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings"));
        }
    }
}
