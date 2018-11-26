/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_06_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2018_06_01.implementation.HubVirtualNetworkConnectionInner;
import com.microsoft.azure.management.network.v2018_06_01.implementation.VirtualHubInner;

/**
 * Type representing VirtualHub.
 */
public interface VirtualHub extends HasInner<VirtualHubInner>, Resource, GroupableResourceCore<NetworkManager, VirtualHubInner>, HasResourceGroup, Refreshable<VirtualHub>, Updatable<VirtualHub.Update>, HasManager<NetworkManager> {
    /**
     * @return the addressPrefix value.
     */
    String addressPrefix();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the hubVirtualNetworkConnections value.
     */
    List<HubVirtualNetworkConnection> hubVirtualNetworkConnections();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the virtualWan value.
     */
    SubResource virtualWan();

    /**
     * The entirety of the VirtualHub definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualHub definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualHub definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VirtualHub definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the virtualhub definition allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix Address-prefix for this VirtualHub
             * @return the next definition stage
             */
            WithCreate withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the virtualhub definition allowing to specify HubVirtualNetworkConnections.
         */
        interface WithHubVirtualNetworkConnections {
            /**
             * Specifies hubVirtualNetworkConnections.
             * @param hubVirtualNetworkConnections list of all vnet connections with this VirtualHub
             * @return the next definition stage
             */
            WithCreate withHubVirtualNetworkConnections(List<HubVirtualNetworkConnectionInner> hubVirtualNetworkConnections);
        }

        /**
         * The stage of the virtualhub definition allowing to specify ProvisioningState.
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
         * The stage of the virtualhub definition allowing to specify VirtualWan.
         */
        interface WithVirtualWan {
            /**
             * Specifies virtualWan.
             * @param virtualWan The VirtualWAN to which the VirtualHub belongs
             * @return the next definition stage
             */
            WithCreate withVirtualWan(SubResource virtualWan);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualHub>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAddressPrefix, DefinitionStages.WithHubVirtualNetworkConnections, DefinitionStages.WithProvisioningState, DefinitionStages.WithVirtualWan {
        }
    }
    /**
     * The template for a VirtualHub update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualHub>, Resource.UpdateWithTags<Update>, UpdateStages.WithAddressPrefix, UpdateStages.WithHubVirtualNetworkConnections, UpdateStages.WithProvisioningState, UpdateStages.WithVirtualWan {
    }

    /**
     * Grouping of VirtualHub update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualhub update allowing to specify AddressPrefix.
         */
        interface WithAddressPrefix {
            /**
             * Specifies addressPrefix.
             * @param addressPrefix Address-prefix for this VirtualHub
             * @return the next update stage
             */
            Update withAddressPrefix(String addressPrefix);
        }

        /**
         * The stage of the virtualhub update allowing to specify HubVirtualNetworkConnections.
         */
        interface WithHubVirtualNetworkConnections {
            /**
             * Specifies hubVirtualNetworkConnections.
             * @param hubVirtualNetworkConnections list of all vnet connections with this VirtualHub
             * @return the next update stage
             */
            Update withHubVirtualNetworkConnections(List<HubVirtualNetworkConnectionInner> hubVirtualNetworkConnections);
        }

        /**
         * The stage of the virtualhub update allowing to specify ProvisioningState.
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
         * The stage of the virtualhub update allowing to specify VirtualWan.
         */
        interface WithVirtualWan {
            /**
             * Specifies virtualWan.
             * @param virtualWan The VirtualWAN to which the VirtualHub belongs
             * @return the next update stage
             */
            Update withVirtualWan(SubResource virtualWan);
        }

    }
}
