/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_07_01.implementation.HubIpConfigurationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.NetworkManager;
import com.microsoft.azure.management.network.v2020_07_01.implementation.PublicIPAddressInner;
import com.microsoft.azure.management.network.v2020_07_01.implementation.SubnetInner;

/**
 * Type representing HubIpConfiguration.
 */
public interface HubIpConfiguration extends HasInner<HubIpConfigurationInner>, Indexable, Refreshable<HubIpConfiguration>, Updatable<HubIpConfiguration.Update>, HasManager<NetworkManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the privateIPAddress value.
     */
    String privateIPAddress();

    /**
     * @return the privateIPAllocationMethod value.
     */
    IPAllocationMethod privateIPAllocationMethod();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the publicIPAddress value.
     */
    PublicIPAddress publicIPAddress();

    /**
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the HubIpConfiguration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualHub, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of HubIpConfiguration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a HubIpConfiguration definition.
         */
        interface Blank extends WithVirtualHub {
        }

        /**
         * The stage of the hubipconfiguration definition allowing to specify VirtualHub.
         */
        interface WithVirtualHub {
           /**
            * Specifies resourceGroupName, virtualHubName.
            * @param resourceGroupName The resource group name of the VirtualHub
            * @param virtualHubName The name of the VirtualHub
            * @return the next definition stage
            */
            WithCreate withExistingVirtualHub(String resourceGroupName, String virtualHubName);
        }

        /**
         * The stage of the hubipconfiguration definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next definition stage
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the hubipconfiguration definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of the Ip Configuration
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the hubipconfiguration definition allowing to specify PrivateIPAddress.
         */
        interface WithPrivateIPAddress {
            /**
             * Specifies privateIPAddress.
             * @param privateIPAddress The private IP address of the IP configuration
             * @return the next definition stage
             */
            WithCreate withPrivateIPAddress(String privateIPAddress);
        }

        /**
         * The stage of the hubipconfiguration definition allowing to specify PrivateIPAllocationMethod.
         */
        interface WithPrivateIPAllocationMethod {
            /**
             * Specifies privateIPAllocationMethod.
             * @param privateIPAllocationMethod The private IP address allocation method. Possible values include: 'Static', 'Dynamic'
             * @return the next definition stage
             */
            WithCreate withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod);
        }

        /**
         * The stage of the hubipconfiguration definition allowing to specify PublicIPAddress.
         */
        interface WithPublicIPAddress {
            /**
             * Specifies publicIPAddress.
             * @param publicIPAddress The reference to the public IP resource
             * @return the next definition stage
             */
            WithCreate withPublicIPAddress(PublicIPAddressInner publicIPAddress);
        }

        /**
         * The stage of the hubipconfiguration definition allowing to specify Subnet.
         */
        interface WithSubnet {
            /**
             * Specifies subnet.
             * @param subnet The reference to the subnet resource
             * @return the next definition stage
             */
            WithCreate withSubnet(SubnetInner subnet);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<HubIpConfiguration>, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPrivateIPAddress, DefinitionStages.WithPrivateIPAllocationMethod, DefinitionStages.WithPublicIPAddress, DefinitionStages.WithSubnet {
        }
    }
    /**
     * The template for a HubIpConfiguration update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<HubIpConfiguration>, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPrivateIPAddress, UpdateStages.WithPrivateIPAllocationMethod, UpdateStages.WithPublicIPAddress, UpdateStages.WithSubnet {
    }

    /**
     * Grouping of HubIpConfiguration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the hubipconfiguration update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             * @param id Resource ID
             * @return the next update stage
             */
            Update withId(String id);
        }

        /**
         * The stage of the hubipconfiguration update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of the Ip Configuration
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the hubipconfiguration update allowing to specify PrivateIPAddress.
         */
        interface WithPrivateIPAddress {
            /**
             * Specifies privateIPAddress.
             * @param privateIPAddress The private IP address of the IP configuration
             * @return the next update stage
             */
            Update withPrivateIPAddress(String privateIPAddress);
        }

        /**
         * The stage of the hubipconfiguration update allowing to specify PrivateIPAllocationMethod.
         */
        interface WithPrivateIPAllocationMethod {
            /**
             * Specifies privateIPAllocationMethod.
             * @param privateIPAllocationMethod The private IP address allocation method. Possible values include: 'Static', 'Dynamic'
             * @return the next update stage
             */
            Update withPrivateIPAllocationMethod(IPAllocationMethod privateIPAllocationMethod);
        }

        /**
         * The stage of the hubipconfiguration update allowing to specify PublicIPAddress.
         */
        interface WithPublicIPAddress {
            /**
             * Specifies publicIPAddress.
             * @param publicIPAddress The reference to the public IP resource
             * @return the next update stage
             */
            Update withPublicIPAddress(PublicIPAddressInner publicIPAddress);
        }

        /**
         * The stage of the hubipconfiguration update allowing to specify Subnet.
         */
        interface WithSubnet {
            /**
             * Specifies subnet.
             * @param subnet The reference to the subnet resource
             * @return the next update stage
             */
            Update withSubnet(SubnetInner subnet);
        }

    }
}
