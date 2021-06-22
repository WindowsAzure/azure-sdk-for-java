// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.databricks.fluent.models.PrivateEndpointConnectionInner;

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
     * Gets the properties property: The private endpoint connection properties.
     *
     * @return the properties value.
     */
    PrivateEndpointConnectionProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.databricks.fluent.models.PrivateEndpointConnectionInner object.
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
             * Specifies resourceGroupName, workspaceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @return the next definition stage.
             */
            WithProperties withExistingWorkspace(String resourceGroupName, String workspaceName);
        }
        /** The stage of the PrivateEndpointConnection definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The private endpoint connection properties..
             *
             * @param properties The private endpoint connection properties.
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
