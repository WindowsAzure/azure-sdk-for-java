/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_12_01_preview.implementation.ContainerRegistryManager;

/**
 * Type representing PrivateEndpointConnection.
 */
public interface PrivateEndpointConnection extends HasInner<PrivateEndpointConnectionInner>, Indexable, Refreshable<PrivateEndpointConnection>, Updatable<PrivateEndpointConnection.Update>, HasManager<ContainerRegistryManager> {
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
    PrivateEndpoint privateEndpoint();

    /**
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionState privateLinkServiceConnectionState();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the PrivateEndpointConnection definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of PrivateEndpointConnection definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a PrivateEndpointConnection definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithCreate withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify PrivateEndpoint.
         */
        interface WithPrivateEndpoint {
            /**
             * Specifies privateEndpoint.
             * @param privateEndpoint The resource of private endpoint
             * @return the next definition stage
             */
            WithCreate withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }

        /**
         * The stage of the privateendpointconnection definition allowing to specify PrivateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies privateLinkServiceConnectionState.
             * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider
             * @return the next definition stage
             */
            WithCreate withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState);
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
             * @param privateEndpoint The resource of private endpoint
             * @return the next update stage
             */
            Update withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }

        /**
         * The stage of the privateendpointconnection update allowing to specify PrivateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies privateLinkServiceConnectionState.
             * @param privateLinkServiceConnectionState A collection of information about the state of the connection between service consumer and provider
             * @return the next update stage
             */
            Update withPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState);
        }

    }
}
