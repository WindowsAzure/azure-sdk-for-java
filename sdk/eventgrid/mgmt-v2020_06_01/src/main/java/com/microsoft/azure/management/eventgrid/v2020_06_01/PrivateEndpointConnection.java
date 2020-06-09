/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2020_06_01.implementation.EventGridManager;
import java.util.List;

/**
 * Type representing PrivateEndpointConnection.
 */
public interface PrivateEndpointConnection extends HasInner<PrivateEndpointConnectionInner>, Indexable, Updatable<PrivateEndpointConnection.Update>, HasManager<EventGridManager> {
    /**
     * @return the groupIds value.
     */
    List<String> groupIds();

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
    ConnectionState privateLinkServiceConnectionState();

    /**
     * @return the provisioningState value.
     */
    ResourceProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a PrivateEndpointConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateEndpointConnection>, UpdateStages.WithGroupIds, UpdateStages.WithPrivateEndpoint, UpdateStages.WithPrivateLinkServiceConnectionState, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of PrivateEndpointConnection update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the privateendpointconnection update allowing to specify GroupIds.
         */
        interface WithGroupIds {
            /**
             * Specifies groupIds.
             * @param groupIds GroupIds from the private link service resource
             * @return the next update stage
             */
            Update withGroupIds(List<String> groupIds);
        }

        /**
         * The stage of the privateendpointconnection update allowing to specify PrivateEndpoint.
         */
        interface WithPrivateEndpoint {
            /**
             * Specifies privateEndpoint.
             * @param privateEndpoint The Private Endpoint resource for this Connection
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
             * @param privateLinkServiceConnectionState Details about the state of the connection
             * @return the next update stage
             */
            Update withPrivateLinkServiceConnectionState(ConnectionState privateLinkServiceConnectionState);
        }

        /**
         * The stage of the privateendpointconnection update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState Provisioning state of the Private Endpoint Connection. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Canceled', 'Failed'
             * @return the next update stage
             */
            Update withProvisioningState(ResourceProvisioningState provisioningState);
        }

    }
}
