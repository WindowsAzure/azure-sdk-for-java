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
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_12_01.implementation.P2SVpnServerConfigurationInner;
import com.microsoft.azure.management.network.v2018_12_01.implementation.VirtualWANInner;

/**
 * Type representing VirtualWAN.
 */
public interface VirtualWAN extends HasInner<VirtualWANInner>, Resource, GroupableResourceCore<NetworkManager, VirtualWANInner>, HasResourceGroup, Refreshable<VirtualWAN>, Updatable<VirtualWAN.Update>, HasManager<NetworkManager> {
    /**
     * @return the allowBranchToBranchTraffic value.
     */
    Boolean allowBranchToBranchTraffic();

    /**
     * @return the allowVnetToVnetTraffic value.
     */
    Boolean allowVnetToVnetTraffic();

    /**
     * @return the disableVpnEncryption value.
     */
    Boolean disableVpnEncryption();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the office365LocalBreakoutCategory value.
     */
    OfficeTrafficCategory office365LocalBreakoutCategory();

    /**
     * @return the p2SVpnServerConfigurations value.
     */
    List<P2SVpnServerConfiguration> p2SVpnServerConfigurations();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the securityProviderName value.
     */
    String securityProviderName();

    /**
     * @return the virtualHubs value.
     */
    List<SubResource> virtualHubs();

    /**
     * @return the vpnSites value.
     */
    List<SubResource> vpnSites();

    /**
     * The entirety of the VirtualWAN definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualWAN definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualWAN definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualWAN definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualwan definition allowing to specify AllowBranchToBranchTraffic.
         */
        interface WithAllowBranchToBranchTraffic {
            /**
             * Specifies allowBranchToBranchTraffic.
             * @param allowBranchToBranchTraffic True if branch to branch traffic is allowed
             * @return the next definition stage
             */
            WithCreate withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic);
        }

        /**
         * The stage of the virtualwan definition allowing to specify AllowVnetToVnetTraffic.
         */
        interface WithAllowVnetToVnetTraffic {
            /**
             * Specifies allowVnetToVnetTraffic.
             * @param allowVnetToVnetTraffic True if Vnet to Vnet traffic is allowed
             * @return the next definition stage
             */
            WithCreate withAllowVnetToVnetTraffic(Boolean allowVnetToVnetTraffic);
        }

        /**
         * The stage of the virtualwan definition allowing to specify DisableVpnEncryption.
         */
        interface WithDisableVpnEncryption {
            /**
             * Specifies disableVpnEncryption.
             * @param disableVpnEncryption Vpn encryption to be disabled or not
             * @return the next definition stage
             */
            WithCreate withDisableVpnEncryption(Boolean disableVpnEncryption);
        }

        /**
         * The stage of the virtualwan definition allowing to specify Office365LocalBreakoutCategory.
         */
        interface WithOffice365LocalBreakoutCategory {
            /**
             * Specifies office365LocalBreakoutCategory.
             * @param office365LocalBreakoutCategory The office local breakout category. Possible values include: 'Optimize', 'OptimizeAndAllow', 'All', 'None'
             * @return the next definition stage
             */
            WithCreate withOffice365LocalBreakoutCategory(OfficeTrafficCategory office365LocalBreakoutCategory);
        }

        /**
         * The stage of the virtualwan definition allowing to specify P2SVpnServerConfigurations.
         */
        interface WithP2SVpnServerConfigurations {
            /**
             * Specifies p2SVpnServerConfigurations.
             * @param p2SVpnServerConfigurations list of all P2SVpnServerConfigurations associated with the virtual wan
             * @return the next definition stage
             */
            WithCreate withP2SVpnServerConfigurations(List<P2SVpnServerConfigurationInner> p2SVpnServerConfigurations);
        }

        /**
         * The stage of the virtualwan definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'
             * @return the next definition stage
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the virtualwan definition allowing to specify SecurityProviderName.
         */
        interface WithSecurityProviderName {
            /**
             * Specifies securityProviderName.
             * @param securityProviderName The Security Provider name
             * @return the next definition stage
             */
            WithCreate withSecurityProviderName(String securityProviderName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualWAN>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAllowBranchToBranchTraffic, DefinitionStages.WithAllowVnetToVnetTraffic, DefinitionStages.WithDisableVpnEncryption, DefinitionStages.WithOffice365LocalBreakoutCategory, DefinitionStages.WithP2SVpnServerConfigurations, DefinitionStages.WithProvisioningState, DefinitionStages.WithSecurityProviderName {
        }
    }
    /**
     * The template for a VirtualWAN update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualWAN>, Resource.UpdateWithTags<Update>, UpdateStages.WithAllowBranchToBranchTraffic, UpdateStages.WithAllowVnetToVnetTraffic, UpdateStages.WithDisableVpnEncryption, UpdateStages.WithOffice365LocalBreakoutCategory, UpdateStages.WithP2SVpnServerConfigurations, UpdateStages.WithProvisioningState, UpdateStages.WithSecurityProviderName {
    }

    /**
     * Grouping of VirtualWAN update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualwan update allowing to specify AllowBranchToBranchTraffic.
         */
        interface WithAllowBranchToBranchTraffic {
            /**
             * Specifies allowBranchToBranchTraffic.
             * @param allowBranchToBranchTraffic True if branch to branch traffic is allowed
             * @return the next update stage
             */
            Update withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic);
        }

        /**
         * The stage of the virtualwan update allowing to specify AllowVnetToVnetTraffic.
         */
        interface WithAllowVnetToVnetTraffic {
            /**
             * Specifies allowVnetToVnetTraffic.
             * @param allowVnetToVnetTraffic True if Vnet to Vnet traffic is allowed
             * @return the next update stage
             */
            Update withAllowVnetToVnetTraffic(Boolean allowVnetToVnetTraffic);
        }

        /**
         * The stage of the virtualwan update allowing to specify DisableVpnEncryption.
         */
        interface WithDisableVpnEncryption {
            /**
             * Specifies disableVpnEncryption.
             * @param disableVpnEncryption Vpn encryption to be disabled or not
             * @return the next update stage
             */
            Update withDisableVpnEncryption(Boolean disableVpnEncryption);
        }

        /**
         * The stage of the virtualwan update allowing to specify Office365LocalBreakoutCategory.
         */
        interface WithOffice365LocalBreakoutCategory {
            /**
             * Specifies office365LocalBreakoutCategory.
             * @param office365LocalBreakoutCategory The office local breakout category. Possible values include: 'Optimize', 'OptimizeAndAllow', 'All', 'None'
             * @return the next update stage
             */
            Update withOffice365LocalBreakoutCategory(OfficeTrafficCategory office365LocalBreakoutCategory);
        }

        /**
         * The stage of the virtualwan update allowing to specify P2SVpnServerConfigurations.
         */
        interface WithP2SVpnServerConfigurations {
            /**
             * Specifies p2SVpnServerConfigurations.
             * @param p2SVpnServerConfigurations list of all P2SVpnServerConfigurations associated with the virtual wan
             * @return the next update stage
             */
            Update withP2SVpnServerConfigurations(List<P2SVpnServerConfigurationInner> p2SVpnServerConfigurations);
        }

        /**
         * The stage of the virtualwan update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'
             * @return the next update stage
             */
            Update withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the virtualwan update allowing to specify SecurityProviderName.
         */
        interface WithSecurityProviderName {
            /**
             * Specifies securityProviderName.
             * @param securityProviderName The Security Provider name
             * @return the next update stage
             */
            Update withSecurityProviderName(String securityProviderName);
        }

    }
}
