/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.MonitorManager;

/**
 * Type representing PrivateEndpointConnection.
 */
public interface PrivateEndpointConnection extends HasInner<PrivateEndpointConnectionInner>, Indexable, Refreshable<PrivateEndpointConnection>, Updatable<PrivateEndpointConnection.Update>, HasManager<MonitorManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the privateEndpoint value.
     */
    PrivateEndpointProperty privateEndpoint();

    /**
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PrivateEndpointConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithPrivateLinkScope, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateEndpointConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateEndpointConnection definition.
         */
        interface Blank extends WithPrivateLinkScope {
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify PrivateLinkScope.
         */
        interface WithPrivateLinkScope {
           /**
            * Specifies resourceGroupName, scopeName.
            * @param resourceGroupName The name of the resource group
            * @param scopeName The name of the Azure Monitor PrivateLinkScope resource
            * @return the next definition stage
            */
            WithCreate withExistingPrivateLinkScope(String resourceGroupName, String scopeName);
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify PrivateEndpoint.
         */
        interface WithPrivateEndpoint {
            /**
             * Specifies privateEndpoint.
             * @param privateEndpoint Private endpoint which the connection belongs to
             * @return the next definition stage
             */
            WithCreate withPrivateEndpoint(PrivateEndpointProperty privateEndpoint);
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify PrivateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies privateLinkServiceConnectionState.
             * @param privateLinkServiceConnectionState Connection state of the private endpoint connection
             * @return the next definition stage
             */
            WithCreate withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<PrivateEndpointConnection>, DefinitionStages.WithPrivateEndpoint, DefinitionStages.WithPrivateLinkServiceConnectionState {
        }
    }
    /**
     * The template for a PrivateEndpointConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateEndpointConnection>, UpdateStages.WithPrivateEndpoint, UpdateStages.WithPrivateLinkServiceConnectionState {
    }

    /**
     * Grouping of PrivateEndpointConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privateendpointconnection update allowing to specify PrivateEndpoint.
         */
        interface WithPrivateEndpoint {
            /**
             * Specifies privateEndpoint.
             * @param privateEndpoint Private endpoint which the connection belongs to
             * @return the next update stage
             */
            Update withPrivateEndpoint(PrivateEndpointProperty privateEndpoint);
        }

        /**
         * The stage of the privateendpointconnection update allowing to specify PrivateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies privateLinkServiceConnectionState.
             * @param privateLinkServiceConnectionState Connection state of the private endpoint connection
             * @return the next update stage
             */
            Update withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState);
        }

    }
}
