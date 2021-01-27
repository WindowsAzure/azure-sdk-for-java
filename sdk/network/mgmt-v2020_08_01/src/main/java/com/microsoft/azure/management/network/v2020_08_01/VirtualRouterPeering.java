/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_08_01.implementation.VirtualRouterPeeringInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_08_01.implementation.NetworkManager;

/**
 * Type representing VirtualRouterPeering.
 */
public interface VirtualRouterPeering extends HasInner<VirtualRouterPeeringInner>, Indexable, Refreshable<VirtualRouterPeering>, Updatable<VirtualRouterPeering.Update>, HasManager<NetworkManager> {
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
     * @return the peerAsn value.
     */
    Long peerAsn();

    /**
     * @return the peerIp value.
     */
    String peerIp();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the VirtualRouterPeering definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualRouter, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VirtualRouterPeering definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VirtualRouterPeering definition.
         */
        interface Blank extends WithVirtualRouter {
        }

        /**
         * The stage of the virtualrouterpeering definition allowing to specify VirtualRouter.
         */
        interface WithVirtualRouter {
           /**
            * Specifies resourceGroupName, virtualRouterName.
            * @param resourceGroupName The name of the resource group
            * @param virtualRouterName The name of the Virtual Router
            * @return the next definition stage
            */
            WithCreate withExistingVirtualRouter(String resourceGroupName, String virtualRouterName);
        }

        /**
         * The stage of the virtualrouterpeering definition allowing to specify Id.
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
         * The stage of the virtualrouterpeering definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of the virtual router peering that is unique within a virtual router
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the virtualrouterpeering definition allowing to specify PeerAsn.
         */
        interface WithPeerAsn {
            /**
             * Specifies peerAsn.
             * @param peerAsn Peer ASN
             * @return the next definition stage
             */
            WithCreate withPeerAsn(Long peerAsn);
        }

        /**
         * The stage of the virtualrouterpeering definition allowing to specify PeerIp.
         */
        interface WithPeerIp {
            /**
             * Specifies peerIp.
             * @param peerIp Peer IP
             * @return the next definition stage
             */
            WithCreate withPeerIp(String peerIp);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VirtualRouterPeering>, DefinitionStages.WithId, DefinitionStages.WithName, DefinitionStages.WithPeerAsn, DefinitionStages.WithPeerIp {
        }
    }
    /**
     * The template for a VirtualRouterPeering update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VirtualRouterPeering>, UpdateStages.WithId, UpdateStages.WithName, UpdateStages.WithPeerAsn, UpdateStages.WithPeerIp {
    }

    /**
     * Grouping of VirtualRouterPeering update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the virtualrouterpeering update allowing to specify Id.
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
         * The stage of the virtualrouterpeering update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Name of the virtual router peering that is unique within a virtual router
             * @return the next update stage
             */
            Update withName(String name);
        }

        /**
         * The stage of the virtualrouterpeering update allowing to specify PeerAsn.
         */
        interface WithPeerAsn {
            /**
             * Specifies peerAsn.
             * @param peerAsn Peer ASN
             * @return the next update stage
             */
            Update withPeerAsn(Long peerAsn);
        }

        /**
         * The stage of the virtualrouterpeering update allowing to specify PeerIp.
         */
        interface WithPeerIp {
            /**
             * Specifies peerIp.
             * @param peerIp Peer IP
             * @return the next update stage
             */
            Update withPeerIp(String peerIp);
        }

    }
}
