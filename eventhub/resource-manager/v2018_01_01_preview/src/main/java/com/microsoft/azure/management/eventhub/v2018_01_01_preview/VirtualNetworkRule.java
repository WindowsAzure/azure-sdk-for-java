/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation.VirtualNetworkRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation.EventHubManager;

/**
 * Type representing VirtualNetworkRule.
 */
public interface VirtualNetworkRule extends HasInner<VirtualNetworkRuleInner>, Indexable, Refreshable<VirtualNetworkRule>, Updatable<VirtualNetworkRule.Update>, HasManager<EventHubManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the virtualNetworkSubnetId value.
     */
    String virtualNetworkSubnetId();

    /**
     * The entirety of the VirtualNetworkRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNamespace, DefinitionStages.WithVirtualNetworkSubnetId, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualNetworkRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualNetworkRule definition.
         */
        interface Blank extends WithNamespace {
        }

        /**
         * The stage of the virtualnetworkrule definition allowing to specify Namespace.
         */
        interface WithNamespace {
           /**
            * Specifies resourceGroupName, namespaceName.
            * @param resourceGroupName Name of the resource group within the Azure subscription
            * @param namespaceName The Namespace name
            * @return the next definition stage
            */
            WithVirtualNetworkSubnetId withExistingNamespace(String resourceGroupName, String namespaceName);
        }

        /**
         * The stage of the virtualnetworkrule definition allowing to specify VirtualNetworkSubnetId.
         */
        interface WithVirtualNetworkSubnetId {
           /**
            * Specifies virtualNetworkSubnetId.
            * @param virtualNetworkSubnetId ARM ID of Virtual Network Subnet
            * @return the next definition stage
            */
            WithCreate withVirtualNetworkSubnetId(String virtualNetworkSubnetId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualNetworkRule> {
        }
    }
    /**
     * The template for a VirtualNetworkRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualNetworkRule>, UpdateStages.WithVirtualNetworkSubnetId {
    }

    /**
     * Grouping of VirtualNetworkRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualnetworkrule update allowing to specify VirtualNetworkSubnetId.
         */
        interface WithVirtualNetworkSubnetId {
            /**
             * Specifies virtualNetworkSubnetId.
             * @param virtualNetworkSubnetId ARM ID of Virtual Network Subnet
             * @return the next update stage
             */
            Update withVirtualNetworkSubnetId(String virtualNetworkSubnetId);
        }

    }
}
