/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_08_01.implementation.ExpressRouteConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_08_01.implementation.NetworkManager;

/**
 * Type representing ExpressRouteConnection.
 */
public interface ExpressRouteConnection extends HasInner<ExpressRouteConnectionInner>, Indexable, Refreshable<ExpressRouteConnection>, Updatable<ExpressRouteConnection.Update>, HasManager<NetworkManager> {
    /**
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * @return the expressRouteCircuitPeering value.
     */
    ExpressRouteCircuitPeeringId expressRouteCircuitPeering();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the routingWeight value.
     */
    Integer routingWeight();

    /**
     * The entirety of the ExpressRouteConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithExpressRouteGateway, DefinitionStages.WithExpressRouteCircuitPeering, DefinitionStages.WithName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteConnection definition.
         */
        interface Blank extends WithExpressRouteGateway {
        }

        /**
         * The stage of the expressrouteconnection definition allowing to specify ExpressRouteGateway.
         */
        interface WithExpressRouteGateway {
           /**
            * Specifies resourceGroupName, expressRouteGatewayName.
            * @param resourceGroupName The name of the resource group
            * @param expressRouteGatewayName The name of the ExpressRoute gateway
            * @return the next definition stage
            */
            WithExpressRouteCircuitPeering withExistingExpressRouteGateway(String resourceGroupName, String expressRouteGatewayName);
        }

        /**
         * The stage of the expressrouteconnection definition allowing to specify ExpressRouteCircuitPeering.
         */
        interface WithExpressRouteCircuitPeering {
           /**
            * Specifies expressRouteCircuitPeering.
            * @param expressRouteCircuitPeering The ExpressRoute circuit peering
            * @return the next definition stage
            */
            WithName withExpressRouteCircuitPeering(ExpressRouteCircuitPeeringId expressRouteCircuitPeering);
        }

        /**
         * The stage of the expressrouteconnection definition allowing to specify Name.
         */
        interface WithName {
           /**
            * Specifies name.
            * @param name The name of the resource
            * @return the next definition stage
            */
            WithCreate withName(String name);
        }

        /**
         * The stage of the expressrouteconnection definition allowing to specify AuthorizationKey.
         */
        interface WithAuthorizationKey {
            /**
             * Specifies authorizationKey.
             * @param authorizationKey Authorization key to establish the connection
             * @return the next definition stage
             */
            WithCreate withAuthorizationKey(String authorizationKey);
        }

        /**
         * The stage of the expressrouteconnection definition allowing to specify Id.
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
         * The stage of the expressrouteconnection definition allowing to specify RoutingWeight.
         */
        interface WithRoutingWeight {
            /**
             * Specifies routingWeight.
             * @param routingWeight The routing weight associated to the connection
             * @return the next definition stage
             */
            WithCreate withRoutingWeight(Integer routingWeight);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteConnection>, DefinitionStages.WithAuthorizationKey, DefinitionStages.WithId, DefinitionStages.WithRoutingWeight {
        }
    }
    /**
     * The template for a ExpressRouteConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteConnection>, UpdateStages.WithAuthorizationKey, UpdateStages.WithId, UpdateStages.WithRoutingWeight {
    }

    /**
     * Grouping of ExpressRouteConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressrouteconnection update allowing to specify AuthorizationKey.
         */
        interface WithAuthorizationKey {
            /**
             * Specifies authorizationKey.
             * @param authorizationKey Authorization key to establish the connection
             * @return the next update stage
             */
            Update withAuthorizationKey(String authorizationKey);
        }

        /**
         * The stage of the expressrouteconnection update allowing to specify Id.
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
         * The stage of the expressrouteconnection update allowing to specify RoutingWeight.
         */
        interface WithRoutingWeight {
            /**
             * Specifies routingWeight.
             * @param routingWeight The routing weight associated to the connection
             * @return the next update stage
             */
            Update withRoutingWeight(Integer routingWeight);
        }

    }
}
