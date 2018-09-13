/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_04_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2018_04_01.implementation.AzureFirewallInner;

/**
 * Type representing AzureFirewall.
 */
public interface AzureFirewall extends HasInner<AzureFirewallInner>, Resource, GroupableResourceCore<NetworkManager, AzureFirewallInner>, HasResourceGroup, Refreshable<AzureFirewall>, Updatable<AzureFirewall.Update>, HasManager<NetworkManager> {
    /**
     * @return the applicationRuleCollections value.
     */
    List<AzureFirewallApplicationRuleCollection> applicationRuleCollections();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the ipConfigurations value.
     */
    List<AzureFirewallIPConfiguration> ipConfigurations();

    /**
     * @return the networkRuleCollections value.
     */
    List<AzureFirewallNetworkRuleCollection> networkRuleCollections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * The entirety of the AzureFirewall definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AzureFirewall definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AzureFirewall definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AzureFirewall definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the azurefirewall update allowing to specify ApplicationRuleCollections.
         */
        interface WithApplicationRuleCollections {
            /**
             * Specifies applicationRuleCollections.
             */
            WithCreate withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections);
        }

        /**
         * The stage of the azurefirewall update allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             */
            WithCreate withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations);
        }

        /**
         * The stage of the azurefirewall update allowing to specify NetworkRuleCollections.
         */
        interface WithNetworkRuleCollections {
            /**
             * Specifies networkRuleCollections.
             */
            WithCreate withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections);
        }

        /**
         * The stage of the azurefirewall update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(ProvisioningState provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AzureFirewall>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithApplicationRuleCollections, DefinitionStages.WithIpConfigurations, DefinitionStages.WithNetworkRuleCollections, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a AzureFirewall update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AzureFirewall>, Resource.UpdateWithTags<Update>, UpdateStages.WithApplicationRuleCollections, UpdateStages.WithIpConfigurations, UpdateStages.WithNetworkRuleCollections, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of AzureFirewall update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the azurefirewall {0} allowing to specify ApplicationRuleCollections.
         */
        interface WithApplicationRuleCollections {
            /**
             * Specifies applicationRuleCollections.
             */
            Update withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections);
        }

        /**
         * The stage of the azurefirewall {0} allowing to specify IpConfigurations.
         */
        interface WithIpConfigurations {
            /**
             * Specifies ipConfigurations.
             */
            Update withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations);
        }

        /**
         * The stage of the azurefirewall {0} allowing to specify NetworkRuleCollections.
         */
        interface WithNetworkRuleCollections {
            /**
             * Specifies networkRuleCollections.
             */
            Update withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections);
        }

        /**
         * The stage of the azurefirewall {0} allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(ProvisioningState provisioningState);
        }

    }
}
