// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagesync.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagesync.fluent.models.PrivateEndpointConnectionInner;

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
     * Gets the privateEndpoint property: The resource of private end point.
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
     * Gets the provisioningState property: The provisioning state of the private endpoint connection resource.
     *
     * @return the provisioningState value.
     */
    PrivateEndpointConnectionProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.storagesync.fluent.models.PrivateEndpointConnectionInner object.
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
             * Specifies resourceGroupName, storageSyncServiceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param storageSyncServiceName The name of the storage sync service name within the specified resource
             *     group.
             * @return the next definition stage.
             */
            WithCreate withExistingStorageSyncService(String resourceGroupName, String storageSyncServiceName);
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
             * Specifies the privateEndpoint property: The resource of private end point..
             *
             * @param privateEndpoint The resource of private end point.
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
