// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine scale set network profile's network configurations. */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSetUpdateNetworkConfiguration extends SubResource {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetUpdateNetworkConfiguration.class);

    /*
     * The network configuration name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Whether this is a primary NIC on a virtual machine.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /*
     * Specifies whether the network interface is accelerated
     * networking-enabled.
     */
    @JsonProperty(value = "properties.enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /*
     * Specifies whether the network interface is FPGA networking-enabled.
     */
    @JsonProperty(value = "properties.enableFpga")
    private Boolean enableFpga;

    /*
     * The network security group.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private SubResource networkSecurityGroup;

    /*
     * The dns settings to be applied on the network interfaces.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings;

    /*
     * The virtual machine scale set IP Configuration.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<VirtualMachineScaleSetUpdateIpConfiguration> ipConfigurations;

    /*
     * Whether IP forwarding enabled on this NIC.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIpForwarding;

    /*
     * Specify what happens to the network interface when the VM is deleted
     */
    @JsonProperty(value = "properties.deleteOption")
    private DeleteOptions deleteOption;

    /**
     * Get the name property: The network configuration name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The network configuration name.
     *
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the primary property: Whether this is a primary NIC on a virtual machine.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Whether this is a primary NIC on a virtual machine.
     *
     * @param primary the primary value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: Specifies whether the network interface is accelerated
     * networking-enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withEnableAcceleratedNetworking(
        Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     *
     * @return the enableFpga value.
     */
    public Boolean enableFpga() {
        return this.enableFpga;
    }

    /**
     * Set the enableFpga property: Specifies whether the network interface is FPGA networking-enabled.
     *
     * @param enableFpga the enableFpga value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withEnableFpga(Boolean enableFpga) {
        this.enableFpga = enableFpga;
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The network security group.
     *
     * @return the networkSecurityGroup value.
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The network security group.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the network interfaces.
     *
     * @return the dnsSettings value.
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the network interfaces.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withDnsSettings(
        VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipConfigurations property: The virtual machine scale set IP Configuration.
     *
     * @return the ipConfigurations value.
     */
    public List<VirtualMachineScaleSetUpdateIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: The virtual machine scale set IP Configuration.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withIpConfigurations(
        List<VirtualMachineScaleSetUpdateIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     *
     * @return the enableIpForwarding value.
     */
    public Boolean enableIpForwarding() {
        return this.enableIpForwarding;
    }

    /**
     * Set the enableIpForwarding property: Whether IP forwarding enabled on this NIC.
     *
     * @param enableIpForwarding the enableIpForwarding value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withEnableIpForwarding(Boolean enableIpForwarding) {
        this.enableIpForwarding = enableIpForwarding;
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     *
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specify what happens to the network interface when the VM is deleted.
     *
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineScaleSetUpdateNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetUpdateNetworkConfiguration withDeleteOption(DeleteOptions deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetUpdateNetworkConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
