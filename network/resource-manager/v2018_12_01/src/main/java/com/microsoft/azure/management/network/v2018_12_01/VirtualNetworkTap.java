/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_12_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_12_01.implementation.FrontendIPConfigurationInner;
import com.microsoft.azure.management.network.v2018_12_01.implementation.NetworkInterfaceIPConfigurationInner;
import com.microsoft.azure.management.network.v2018_12_01.implementation.VirtualNetworkTapInner;

/**
 * Type representing VirtualNetworkTap.
 */
public interface VirtualNetworkTap extends HasInner<VirtualNetworkTapInner>, Resource, GroupableResourceCore<NetworkManager, VirtualNetworkTapInner>, HasResourceGroup, Refreshable<VirtualNetworkTap>, Updatable<VirtualNetworkTap.Update>, HasManager<NetworkManager> {
    /**
     * @return the destinationLoadBalancerFrontEndIPConfiguration value.
     */
    FrontendIPConfiguration destinationLoadBalancerFrontEndIPConfiguration();

    /**
     * @return the destinationNetworkInterfaceIPConfiguration value.
     */
    VirtualMachineScaleSetNetworkInterfaceIPConfiguration destinationNetworkInterfaceIPConfiguration();

    /**
     * @return the destinationPort value.
     */
    Integer destinationPort();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the networkInterfaceTapConfigurations value.
     */
    List<NetworkInterfaceTapConfiguration> networkInterfaceTapConfigurations();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * The entirety of the VirtualNetworkTap definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetworkTap definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetworkTap definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualNetworkTap definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualnetworktap definition allowing to specify DestinationLoadBalancerFrontEndIPConfiguration.
         */
        interface WithDestinationLoadBalancerFrontEndIPConfiguration {
            /**
             * Specifies destinationLoadBalancerFrontEndIPConfiguration.
             * @param destinationLoadBalancerFrontEndIPConfiguration The reference to the private IP address on the internal Load Balancer that will receive the tap
             * @return the next definition stage
             */
            WithCreate withDestinationLoadBalancerFrontEndIPConfiguration(FrontendIPConfigurationInner destinationLoadBalancerFrontEndIPConfiguration);
        }

        /**
         * The stage of the virtualnetworktap definition allowing to specify DestinationNetworkInterfaceIPConfiguration.
         */
        interface WithDestinationNetworkInterfaceIPConfiguration {
            /**
             * Specifies destinationNetworkInterfaceIPConfiguration.
             * @param destinationNetworkInterfaceIPConfiguration The reference to the private IP Address of the collector nic that will receive the tap
             * @return the next definition stage
             */
            WithCreate withDestinationNetworkInterfaceIPConfiguration(NetworkInterfaceIPConfigurationInner destinationNetworkInterfaceIPConfiguration);
        }

        /**
         * The stage of the virtualnetworktap definition allowing to specify DestinationPort.
         */
        interface WithDestinationPort {
            /**
             * Specifies destinationPort.
             * @param destinationPort The VXLAN destination port that will receive the tapped traffic
             * @return the next definition stage
             */
            WithCreate withDestinationPort(Integer destinationPort);
        }

        /**
         * The stage of the virtualnetworktap definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag Gets a unique read-only string that changes whenever the resource is updated
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetworkTap>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDestinationLoadBalancerFrontEndIPConfiguration, DefinitionStages.WithDestinationNetworkInterfaceIPConfiguration, DefinitionStages.WithDestinationPort, DefinitionStages.WithEtag {
        }
    }
    /**
     * The template for a VirtualNetworkTap update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetworkTap>, Resource.UpdateWithTags<Update>, UpdateStages.WithDestinationLoadBalancerFrontEndIPConfiguration, UpdateStages.WithDestinationNetworkInterfaceIPConfiguration, UpdateStages.WithDestinationPort, UpdateStages.WithEtag {
    }

    /**
     * Grouping of VirtualNetworkTap update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetworktap update allowing to specify DestinationLoadBalancerFrontEndIPConfiguration.
         */
        interface WithDestinationLoadBalancerFrontEndIPConfiguration {
            /**
             * Specifies destinationLoadBalancerFrontEndIPConfiguration.
             * @param destinationLoadBalancerFrontEndIPConfiguration The reference to the private IP address on the internal Load Balancer that will receive the tap
             * @return the next update stage
             */
            Update withDestinationLoadBalancerFrontEndIPConfiguration(FrontendIPConfigurationInner destinationLoadBalancerFrontEndIPConfiguration);
        }

        /**
         * The stage of the virtualnetworktap update allowing to specify DestinationNetworkInterfaceIPConfiguration.
         */
        interface WithDestinationNetworkInterfaceIPConfiguration {
            /**
             * Specifies destinationNetworkInterfaceIPConfiguration.
             * @param destinationNetworkInterfaceIPConfiguration The reference to the private IP Address of the collector nic that will receive the tap
             * @return the next update stage
             */
            Update withDestinationNetworkInterfaceIPConfiguration(NetworkInterfaceIPConfigurationInner destinationNetworkInterfaceIPConfiguration);
        }

        /**
         * The stage of the virtualnetworktap update allowing to specify DestinationPort.
         */
        interface WithDestinationPort {
            /**
             * Specifies destinationPort.
             * @param destinationPort The VXLAN destination port that will receive the tapped traffic
             * @return the next update stage
             */
            Update withDestinationPort(Integer destinationPort);
        }

        /**
         * The stage of the virtualnetworktap update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag Gets a unique read-only string that changes whenever the resource is updated
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

    }
}
