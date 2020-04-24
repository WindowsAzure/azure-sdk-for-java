// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.management.network.NetworkInterfaceDnsSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The NetworkInterface model. */
@JsonFlatten
@Fluent
public class NetworkInterfaceInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The reference of a virtual machine.
     */
    @JsonProperty(value = "properties.virtualMachine", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource virtualMachine;

    /*
     * The reference of the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private NetworkSecurityGroupInner networkSecurityGroup;

    /*
     * A reference to the private endpoint to which the network interface is
     * linked.
     */
    @JsonProperty(value = "properties.privateEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateEndpointInner privateEndpoint;

    /*
     * A list of IPConfigurations of the network interface.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<NetworkInterfaceIPConfigurationInner> ipConfigurations;

    /*
     * A list of TapConfigurations of the network interface.
     */
    @JsonProperty(value = "properties.tapConfigurations")
    private List<NetworkInterfaceTapConfigurationInner> tapConfigurations;

    /*
     * The DNS settings in network interface.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private NetworkInterfaceDnsSettings dnsSettings;

    /*
     * The MAC address of the network interface.
     */
    @JsonProperty(value = "properties.macAddress")
    private String macAddress;

    /*
     * Gets whether this is a primary network interface on a virtual machine.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /*
     * If the network interface is accelerated networking enabled.
     */
    @JsonProperty(value = "properties.enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /*
     * Indicates whether IP forwarding is enabled on this network interface.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIPForwarding;

    /*
     * A list of references to linked BareMetal resources.
     */
    @JsonProperty(value = "properties.hostedWorkloads", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostedWorkloads;

    /*
     * The resource GUID property of the network interface resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
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
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the virtualMachine property: The reference of a virtual machine.
     *
     * @return the virtualMachine value.
     */
    public SubResource virtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Get the networkSecurityGroup property: The reference of the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The reference of the NetworkSecurityGroup resource.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the privateEndpoint property: A reference to the private endpoint to which the network interface is linked.
     *
     * @return the privateEndpoint value.
     */
    public PrivateEndpointInner privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Get the ipConfigurations property: A list of IPConfigurations of the network interface.
     *
     * @return the ipConfigurations value.
     */
    public List<NetworkInterfaceIPConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: A list of IPConfigurations of the network interface.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withIpConfigurations(List<NetworkInterfaceIPConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the tapConfigurations property: A list of TapConfigurations of the network interface.
     *
     * @return the tapConfigurations value.
     */
    public List<NetworkInterfaceTapConfigurationInner> tapConfigurations() {
        return this.tapConfigurations;
    }

    /**
     * Set the tapConfigurations property: A list of TapConfigurations of the network interface.
     *
     * @param tapConfigurations the tapConfigurations value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withTapConfigurations(List<NetworkInterfaceTapConfigurationInner> tapConfigurations) {
        this.tapConfigurations = tapConfigurations;
        return this;
    }

    /**
     * Get the dnsSettings property: The DNS settings in network interface.
     *
     * @return the dnsSettings value.
     */
    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The DNS settings in network interface.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the macAddress property: The MAC address of the network interface.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress property: The MAC address of the network interface.
     *
     * @param macAddress the macAddress value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get the primary property: Gets whether this is a primary network interface on a virtual machine.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Gets whether this is a primary network interface on a virtual machine.
     *
     * @param primary the primary value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking property: If the network interface is accelerated networking enabled.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking property: If the network interface is accelerated networking enabled.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the enableIPForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     *
     * @return the enableIPForwarding value.
     */
    public Boolean enableIPForwarding() {
        return this.enableIPForwarding;
    }

    /**
     * Set the enableIPForwarding property: Indicates whether IP forwarding is enabled on this network interface.
     *
     * @param enableIPForwarding the enableIPForwarding value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableIPForwarding(Boolean enableIPForwarding) {
        this.enableIPForwarding = enableIPForwarding;
        return this;
    }

    /**
     * Get the hostedWorkloads property: A list of references to linked BareMetal resources.
     *
     * @return the hostedWorkloads value.
     */
    public List<String> hostedWorkloads() {
        return this.hostedWorkloads;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the network interface resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the network interface resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withId(String id) {
        this.id = id;
        return this;
    }
}
