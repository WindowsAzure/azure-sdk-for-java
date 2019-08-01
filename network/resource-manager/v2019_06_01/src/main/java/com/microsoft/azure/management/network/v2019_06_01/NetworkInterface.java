/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_06_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2019_06_01.implementation.NetworkInterfaceIPConfigurationInner;
import com.microsoft.azure.management.network.v2019_06_01.implementation.NetworkSecurityGroupInner;
import com.microsoft.azure.management.network.v2019_06_01.implementation.NetworkInterfaceTapConfigurationInner;
import com.microsoft.azure.management.network.v2019_06_01.implementation.NetworkInterfaceInner;

/**
 * Type representing NetworkInterface.
 */
public interface NetworkInterface extends HasInner<NetworkInterfaceInner>, Resource, GroupableResourceCore<NetworkManager, NetworkInterfaceInner>, HasResourceGroup, Refreshable<NetworkInterface>, Updatable<NetworkInterface.Update>, HasManager<NetworkManager> {
    /**
     * @return the dnsSettings value.
     */
    NetworkInterfaceDnsSettings dnsSettings();

    /**
     * @return the enableAcceleratedNetworking value.
     */
    Boolean enableAcceleratedNetworking();

    /**
     * @return the enableIPForwarding value.
     */
    Boolean enableIPForwarding();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the hostedWorkloads value.
     */
    List<String> hostedWorkloads();

    /**
     * @return the ipConfigurations value.
     */
    List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> ipConfigurations();

    /**
     * @return the macAddress value.
     */
    String macAddress();

    /**
     * @return the networkSecurityGroup value.
     */
    NetworkSecurityGroup networkSecurityGroup();

    /**
     * @return the primary value.
     */
    Boolean primary();

    /**
     * @return the privateEndpoint value.
     */
    PrivateEndpoint privateEndpoint();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * @return the tapConfigurations value.
     */
    List<NetworkInterfaceTapConfiguration> tapConfigurations();

    /**
     * @return the virtualMachine value.
     */
    SubResource virtualMachine();

    /**
     * The entirety of the NetworkInterface definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NetworkInterface definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NetworkInterface definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the NetworkInterface definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the networkinterface definition allowing to specify DnsSettings.
         */
        interface WithDnsSettings {
            /**
             * Specifies dnsSettings.
             * @param dnsSettings The DNS settings in network interface
             * @return the next definition stage
             */
            WithCreate withDnsSettings(NetworkInterfaceDnsSettings dnsSettings);
        }

        /**
         * The stage of the networkinterface definition allowing to specify EnableAcceleratedNetworking.
         */
        interface WithEnableAcceleratedNetworking {
            /**
             * Specifies enableAcceleratedNetworking.
             * @param enableAcceleratedNetworking If the network interface is accelerated networking enabled
             * @return the next definition stage
             */
            WithCreate withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking);
        }

        /**
         * The stage of the networkinterface definition allowing to specify EnableIPForwarding.
         */
        interface WithEnableIPForwarding {
            /**
             * Specifies enableIPForwarding.
             * @param enableIPForwarding Indicates whether IP forwarding is enabled on this network interface
             * @return the next definition stage
             */
            WithCreate withEnableIPForwarding(Boolean enableIPForwarding);
        }

        /**
         * The stage of the networkinterface definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the networkinterface definition allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations A list of IPConfigurations of the network interface
             * @return the next definition stage
             */
            WithCreate withIpConfigurations(List<NetworkInterfaceIPConfigurationInner> ipConfigurations);
        }

        /**
         * The stage of the networkinterface definition allowing to specify MacAddress.
         */
        interface WithMacAddress {
            /**
             * Specifies macAddress.
             * @param macAddress The MAC address of the network interface
             * @return the next definition stage
             */
            WithCreate withMacAddress(String macAddress);
        }

        /**
         * The stage of the networkinterface definition allowing to specify NetworkSecurityGroup.
         */
        interface WithNetworkSecurityGroup {
            /**
             * Specifies networkSecurityGroup.
             * @param networkSecurityGroup The reference of the NetworkSecurityGroup resource
             * @return the next definition stage
             */
            WithCreate withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup);
        }

        /**
         * The stage of the networkinterface definition allowing to specify Primary.
         */
        interface WithPrimary {
            /**
             * Specifies primary.
             * @param primary Gets whether this is a primary network interface on a virtual machine
             * @return the next definition stage
             */
            WithCreate withPrimary(Boolean primary);
        }

        /**
         * The stage of the networkinterface definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the networkinterface definition allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             * @param resourceGuid The resource GUID property of the network interface resource
             * @return the next definition stage
             */
            WithCreate withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the networkinterface definition allowing to specify TapConfigurations.
         */
        interface WithTapConfigurations {
            /**
             * Specifies tapConfigurations.
             * @param tapConfigurations A list of TapConfigurations of the network interface
             * @return the next definition stage
             */
            WithCreate withTapConfigurations(List<NetworkInterfaceTapConfigurationInner> tapConfigurations);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NetworkInterface>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDnsSettings, DefinitionStages.WithEnableAcceleratedNetworking, DefinitionStages.WithEnableIPForwarding, DefinitionStages.WithEtag, DefinitionStages.WithIpConfigurations, DefinitionStages.WithMacAddress, DefinitionStages.WithNetworkSecurityGroup, DefinitionStages.WithPrimary, DefinitionStages.WithProvisioningState, DefinitionStages.WithResourceGuid, DefinitionStages.WithTapConfigurations {
        }
    }
    /**
     * The template for a NetworkInterface update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NetworkInterface>, Resource.UpdateWithTags<Update>, UpdateStages.WithDnsSettings, UpdateStages.WithEnableAcceleratedNetworking, UpdateStages.WithEnableIPForwarding, UpdateStages.WithEtag, UpdateStages.WithIpConfigurations, UpdateStages.WithMacAddress, UpdateStages.WithNetworkSecurityGroup, UpdateStages.WithPrimary, UpdateStages.WithProvisioningState, UpdateStages.WithResourceGuid, UpdateStages.WithTapConfigurations {
    }

    /**
     * Grouping of NetworkInterface update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the networkinterface update allowing to specify DnsSettings.
         */
        interface WithDnsSettings {
            /**
             * Specifies dnsSettings.
             * @param dnsSettings The DNS settings in network interface
             * @return the next update stage
             */
            Update withDnsSettings(NetworkInterfaceDnsSettings dnsSettings);
        }

        /**
         * The stage of the networkinterface update allowing to specify EnableAcceleratedNetworking.
         */
        interface WithEnableAcceleratedNetworking {
            /**
             * Specifies enableAcceleratedNetworking.
             * @param enableAcceleratedNetworking If the network interface is accelerated networking enabled
             * @return the next update stage
             */
            Update withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking);
        }

        /**
         * The stage of the networkinterface update allowing to specify EnableIPForwarding.
         */
        interface WithEnableIPForwarding {
            /**
             * Specifies enableIPForwarding.
             * @param enableIPForwarding Indicates whether IP forwarding is enabled on this network interface
             * @return the next update stage
             */
            Update withEnableIPForwarding(Boolean enableIPForwarding);
        }

        /**
         * The stage of the networkinterface update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag A unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the networkinterface update allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             * @param ipConfigurations A list of IPConfigurations of the network interface
             * @return the next update stage
             */
            Update withIpConfigurations(List<NetworkInterfaceIPConfigurationInner> ipConfigurations);
        }

        /**
         * The stage of the networkinterface update allowing to specify MacAddress.
         */
        interface WithMacAddress {
            /**
             * Specifies macAddress.
             * @param macAddress The MAC address of the network interface
             * @return the next update stage
             */
            Update withMacAddress(String macAddress);
        }

        /**
         * The stage of the networkinterface update allowing to specify NetworkSecurityGroup.
         */
        interface WithNetworkSecurityGroup {
            /**
             * Specifies networkSecurityGroup.
             * @param networkSecurityGroup The reference of the NetworkSecurityGroup resource
             * @return the next update stage
             */
            Update withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup);
        }

        /**
         * The stage of the networkinterface update allowing to specify Primary.
         */
        interface WithPrimary {
            /**
             * Specifies primary.
             * @param primary Gets whether this is a primary network interface on a virtual machine
             * @return the next update stage
             */
            Update withPrimary(Boolean primary);
        }

        /**
         * The stage of the networkinterface update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the public IP resource. Possible values are: 'Updating', 'Deleting', and 'Failed'
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the networkinterface update allowing to specify ResourceGuid.
         */
        interface WithResourceGuid {
            /**
             * Specifies resourceGuid.
             * @param resourceGuid The resource GUID property of the network interface resource
             * @return the next update stage
             */
            Update withResourceGuid(String resourceGuid);
        }

        /**
         * The stage of the networkinterface update allowing to specify TapConfigurations.
         */
        interface WithTapConfigurations {
            /**
             * Specifies tapConfigurations.
             * @param tapConfigurations A list of TapConfigurations of the network interface
             * @return the next update stage
             */
            Update withTapConfigurations(List<NetworkInterfaceTapConfigurationInner> tapConfigurations);
        }

    }
}
