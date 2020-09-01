/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_06_01.implementation.ExpressRouteCircuitAuthorizationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_06_01.implementation.NetworkManager;

/**
 * Type representing ExpressRouteCircuitAuthorization.
 */
public interface ExpressRouteCircuitAuthorization extends HasInner<ExpressRouteCircuitAuthorizationInner>, Indexable, Refreshable<ExpressRouteCircuitAuthorization>, Updatable<ExpressRouteCircuitAuthorization.Update>, HasManager<NetworkManager> {
    /**
     * @return the authorizationKey value.
     */
    String authorizationKey();

    /**
     * @return the authorizationUseStatus value.
     */
    AuthorizationUseStatus authorizationUseStatus();

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
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ExpressRouteCircuitAuthorization definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithExpressRouteCircuit, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteCircuitAuthorization definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteCircuitAuthorization definition.
         */
        interface Blank extends WithExpressRouteCircuit {
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify ExpressRouteCircuit.
         */
        interface WithExpressRouteCircuit {
           /**
            * Specifies resourceGroupName, circuitName.
            * @param resourceGroupName The name of the resource group
            * @param circuitName The name of the express route circuit
            * @return the next definition stage
            */
            WithCreate withExistingExpressRouteCircuit(String resourceGroupName, String circuitName);
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify AuthorizationKey.
         */
        interface WithAuthorizationKey {
            /**
             * Specifies authorizationKey.
             * @param authorizationKey The authorization key
             * @return the next definition stage
             */
            WithCreate withAuthorizationKey(String authorizationKey);
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify AuthorizationUseStatus.
         */
        interface WithAuthorizationUseStatus {
            /**
             * Specifies authorizationUseStatus.
             * @param authorizationUseStatus The authorization use status. Possible values include: 'Available', 'InUse'
             * @return the next definition stage
             */
            WithCreate withAuthorizationUseStatus(AuthorizationUseStatus authorizationUseStatus);
        }

        /**
         * The stage of the expressroutecircuitauthorization definition allowing to specify Id.
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
         * The stage of the expressroutecircuitauthorization definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteCircuitAuthorization>, DefinitionStages.WithAuthorizationKey, DefinitionStages.WithAuthorizationUseStatus, DefinitionStages.WithId, DefinitionStages.WithName {
        }
    }
    /**
     * The template for a ExpressRouteCircuitAuthorization update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteCircuitAuthorization>, UpdateStages.WithAuthorizationKey, UpdateStages.WithAuthorizationUseStatus, UpdateStages.WithId, UpdateStages.WithName {
    }

    /**
     * Grouping of ExpressRouteCircuitAuthorization update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressroutecircuitauthorization update allowing to specify AuthorizationKey.
         */
        interface WithAuthorizationKey {
            /**
             * Specifies authorizationKey.
             * @param authorizationKey The authorization key
             * @return the next update stage
             */
            Update withAuthorizationKey(String authorizationKey);
        }

        /**
         * The stage of the expressroutecircuitauthorization update allowing to specify AuthorizationUseStatus.
         */
        interface WithAuthorizationUseStatus {
            /**
             * Specifies authorizationUseStatus.
             * @param authorizationUseStatus The authorization use status. Possible values include: 'Available', 'InUse'
             * @return the next update stage
             */
            Update withAuthorizationUseStatus(AuthorizationUseStatus authorizationUseStatus);
        }

        /**
         * The stage of the expressroutecircuitauthorization update allowing to specify Id.
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
         * The stage of the expressroutecircuitauthorization update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource
             * @return the next update stage
             */
            Update withName(String name);
        }

    }
}
