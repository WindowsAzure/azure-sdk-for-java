// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.fluent.models.PrivateEndpointConnectionInner;

/** An immutable client-side representation of PrivateEndpointConnection. */
public interface PrivateEndpointConnection {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the provisioningState property: The provisioning status of the private endpoint connection.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the privateEndpoint property: The resource of private endpoint.
     *
     * @return the privateEndpoint value.
     */
    PrivateEndpoint privateEndpoint();

    /**
     * Gets the privateLinkServiceConnectionState property: A collection of information about the state of the
     * connection between service consumer and provider.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionState privateLinkServiceConnectionState();

    /**
     * Gets the inner com.azure.resourcemanager.appconfiguration.fluent.models.PrivateEndpointConnectionInner object.
     *
     * @return the inner object.
     */
    PrivateEndpointConnectionInner innerModel();

    /** The entirety of the PrivateEndpointConnection definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The PrivateEndpointConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the PrivateEndpointConnection definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the PrivateEndpointConnection definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, configStoreName.
             *
             * @param resourceGroupName The name of the resource group to which the container registry belongs.
             * @param configStoreName The name of the configuration store.
             * @return the next definition stage.
             */
            WithCreate withExistingConfigurationStore(String resourceGroupName, String configStoreName);
        }
        /**
         * The stage of the PrivateEndpointConnection definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPrivateEndpoint, DefinitionStages.WithPrivateLinkServiceConnectionState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PrivateEndpointConnection create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateEndpointConnection create(Context context);
        }
        /** The stage of the PrivateEndpointConnection definition allowing to specify privateEndpoint. */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: The resource of private endpoint..
             *
             * @param privateEndpoint The resource of private endpoint.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }
        /**
         * The stage of the PrivateEndpointConnection definition allowing to specify privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: A collection of information about the state of
             * the connection between service consumer and provider..
             *
             * @param privateLinkServiceConnectionState A collection of information about the state of the connection
             *     between service consumer and provider.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionState privateLinkServiceConnectionState);
        }
    }
    /**
     * Begins update for the PrivateEndpointConnection resource.
     *
     * @return the stage of resource update.
     */
    PrivateEndpointConnection.Update update();

    /** The template for PrivateEndpointConnection update. */
    interface Update extends UpdateStages.WithPrivateEndpoint, UpdateStages.WithPrivateLinkServiceConnectionState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PrivateEndpointConnection apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PrivateEndpointConnection apply(Context context);
    }
    /** The PrivateEndpointConnection update stages. */
    interface UpdateStages {
        /** The stage of the PrivateEndpointConnection update allowing to specify privateEndpoint. */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: The resource of private endpoint..
             *
             * @param privateEndpoint The resource of private endpoint.
             * @return the next definition stage.
             */
            Update withPrivateEndpoint(PrivateEndpoint privateEndpoint);
        }
        /** The stage of the PrivateEndpointConnection update allowing to specify privateLinkServiceConnectionState. */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: A collection of information about the state of
             * the connection between service consumer and provider..
             *
             * @param privateLinkServiceConnectionState A collection of information about the state of the connection
             *     between service consumer and provider.
             * @return the next definition stage.
             */
            Update withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionState privateLinkServiceConnectionState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PrivateEndpointConnection refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateEndpointConnection refresh(Context context);
}
