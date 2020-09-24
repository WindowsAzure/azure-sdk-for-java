/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerservice.v2020_06_01.implementation.PrivateEndpointConnectionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2020_06_01.implementation.ContainerServiceManager;

/**
 * Type representing PrivateEndpointConnection.
 */
public interface PrivateEndpointConnection extends HasInner<PrivateEndpointConnectionInner>, Indexable, Refreshable<PrivateEndpointConnection>, Updatable<PrivateEndpointConnection.Update>, HasManager<ContainerServiceManager> {
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
    PrivateEndpointConnectionProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The template for a PrivateEndpointConnection update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<PrivateEndpointConnection>, UpdateStages.WithPrivateEndpoint {
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

    }
}
