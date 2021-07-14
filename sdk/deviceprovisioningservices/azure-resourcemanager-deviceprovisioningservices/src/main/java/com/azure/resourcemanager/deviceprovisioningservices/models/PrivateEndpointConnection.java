// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.PrivateEndpointConnectionInner;

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
     * Gets the properties property: The properties of a private endpoint connection.
     *
     * @return the properties value.
     */
    PrivateEndpointConnectionProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.deviceprovisioningservices.fluent.models.PrivateEndpointConnectionInner
     * object.
     *
     * @return the inner object.
     */
    PrivateEndpointConnectionInner innerModel();

    /** The entirety of the PrivateEndpointConnection definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The PrivateEndpointConnection definition stages. */
    interface DefinitionStages {
        /** The first stage of the PrivateEndpointConnection definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the PrivateEndpointConnection definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             *
             * @param resourceGroupName The name of the resource group that contains the provisioning service.
             * @param resourceName The name of the provisioning service.
             * @return the next definition stage.
             */
            WithProperties withExistingProvisioningService(String resourceGroupName, String resourceName);
        }
        /** The stage of the PrivateEndpointConnection definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties of a private endpoint connection.
             *
             * @param properties The properties of a private endpoint connection.
             * @return the next definition stage.
             */
            WithCreate withProperties(PrivateEndpointConnectionProperties properties);
        }
        /**
         * The stage of the PrivateEndpointConnection definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
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
    }
    /**
     * Begins update for the PrivateEndpointConnection resource.
     *
     * @return the stage of resource update.
     */
    PrivateEndpointConnection.Update update();

    /** The template for PrivateEndpointConnection update. */
    interface Update extends UpdateStages.WithProperties {
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
        /** The stage of the PrivateEndpointConnection update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties of a private endpoint connection.
             *
             * @param properties The properties of a private endpoint connection.
             * @return the next definition stage.
             */
            Update withProperties(PrivateEndpointConnectionProperties properties);
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
