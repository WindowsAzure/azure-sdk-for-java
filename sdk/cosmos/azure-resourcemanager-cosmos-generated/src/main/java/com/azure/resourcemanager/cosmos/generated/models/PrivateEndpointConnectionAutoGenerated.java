// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmos.generated.fluent.models.PrivateEndpointConnectionAutoGeneratedInner;

/** An immutable client-side representation of PrivateEndpointConnectionAutoGenerated. */
public interface PrivateEndpointConnectionAutoGenerated {
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
     * Gets the privateEndpoint property: Private endpoint which the connection belongs to.
     *
     * @return the privateEndpoint value.
     */
    PrivateEndpointProperty privateEndpoint();

    /**
     * Gets the privateLinkServiceConnectionState property: Connection State of the Private Endpoint Connection.
     *
     * @return the privateLinkServiceConnectionState value.
     */
    PrivateLinkServiceConnectionStatePropertyAutoGenerated privateLinkServiceConnectionState();

    /**
     * Gets the groupId property: Group id of the private endpoint.
     *
     * @return the groupId value.
     */
    String groupId();

    /**
     * Gets the provisioningState property: Provisioning state of the private endpoint.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner
     * com.azure.resourcemanager.cosmos.generated.fluent.models.PrivateEndpointConnectionAutoGeneratedInner object.
     *
     * @return the inner object.
     */
    PrivateEndpointConnectionAutoGeneratedInner innerModel();

    /** The entirety of the PrivateEndpointConnectionAutoGenerated definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The PrivateEndpointConnectionAutoGenerated definition stages. */
    interface DefinitionStages {
        /** The first stage of the PrivateEndpointConnectionAutoGenerated definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the PrivateEndpointConnectionAutoGenerated definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param accountName Cosmos DB database account name.
             * @return the next definition stage.
             */
            WithCreate withExistingDatabaseAccount(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the PrivateEndpointConnectionAutoGenerated definition which contains all the minimum required
         * properties for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPrivateEndpoint,
                DefinitionStages.WithPrivateLinkServiceConnectionState,
                DefinitionStages.WithGroupId,
                DefinitionStages.WithProvisioningState {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            PrivateEndpointConnectionAutoGenerated create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            PrivateEndpointConnectionAutoGenerated create(Context context);
        }
        /** The stage of the PrivateEndpointConnectionAutoGenerated definition allowing to specify privateEndpoint. */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: Private endpoint which the connection belongs to..
             *
             * @param privateEndpoint Private endpoint which the connection belongs to.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpoint(PrivateEndpointProperty privateEndpoint);
        }
        /**
         * The stage of the PrivateEndpointConnectionAutoGenerated definition allowing to specify
         * privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: Connection State of the Private Endpoint
             * Connection..
             *
             * @param privateLinkServiceConnectionState Connection State of the Private Endpoint Connection.
             * @return the next definition stage.
             */
            WithCreate withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionStatePropertyAutoGenerated privateLinkServiceConnectionState);
        }
        /** The stage of the PrivateEndpointConnectionAutoGenerated definition allowing to specify groupId. */
        interface WithGroupId {
            /**
             * Specifies the groupId property: Group id of the private endpoint..
             *
             * @param groupId Group id of the private endpoint.
             * @return the next definition stage.
             */
            WithCreate withGroupId(String groupId);
        }
        /** The stage of the PrivateEndpointConnectionAutoGenerated definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Provisioning state of the private endpoint..
             *
             * @param provisioningState Provisioning state of the private endpoint.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(String provisioningState);
        }
    }
    /**
     * Begins update for the PrivateEndpointConnectionAutoGenerated resource.
     *
     * @return the stage of resource update.
     */
    PrivateEndpointConnectionAutoGenerated.Update update();

    /** The template for PrivateEndpointConnectionAutoGenerated update. */
    interface Update
        extends UpdateStages.WithPrivateEndpoint,
            UpdateStages.WithPrivateLinkServiceConnectionState,
            UpdateStages.WithGroupId,
            UpdateStages.WithProvisioningState {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        PrivateEndpointConnectionAutoGenerated apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        PrivateEndpointConnectionAutoGenerated apply(Context context);
    }
    /** The PrivateEndpointConnectionAutoGenerated update stages. */
    interface UpdateStages {
        /** The stage of the PrivateEndpointConnectionAutoGenerated update allowing to specify privateEndpoint. */
        interface WithPrivateEndpoint {
            /**
             * Specifies the privateEndpoint property: Private endpoint which the connection belongs to..
             *
             * @param privateEndpoint Private endpoint which the connection belongs to.
             * @return the next definition stage.
             */
            Update withPrivateEndpoint(PrivateEndpointProperty privateEndpoint);
        }
        /**
         * The stage of the PrivateEndpointConnectionAutoGenerated update allowing to specify
         * privateLinkServiceConnectionState.
         */
        interface WithPrivateLinkServiceConnectionState {
            /**
             * Specifies the privateLinkServiceConnectionState property: Connection State of the Private Endpoint
             * Connection..
             *
             * @param privateLinkServiceConnectionState Connection State of the Private Endpoint Connection.
             * @return the next definition stage.
             */
            Update withPrivateLinkServiceConnectionState(
                PrivateLinkServiceConnectionStatePropertyAutoGenerated privateLinkServiceConnectionState);
        }
        /** The stage of the PrivateEndpointConnectionAutoGenerated update allowing to specify groupId. */
        interface WithGroupId {
            /**
             * Specifies the groupId property: Group id of the private endpoint..
             *
             * @param groupId Group id of the private endpoint.
             * @return the next definition stage.
             */
            Update withGroupId(String groupId);
        }
        /** The stage of the PrivateEndpointConnectionAutoGenerated update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: Provisioning state of the private endpoint..
             *
             * @param provisioningState Provisioning state of the private endpoint.
             * @return the next definition stage.
             */
            Update withProvisioningState(String provisioningState);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    PrivateEndpointConnectionAutoGenerated refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    PrivateEndpointConnectionAutoGenerated refresh(Context context);
}
