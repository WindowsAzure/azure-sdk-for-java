// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.ManagedVirtualNetworkResourceInner;

/** An immutable client-side representation of ManagedVirtualNetworkResource. */
public interface ManagedVirtualNetworkResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the properties property: Managed Virtual Network properties.
     *
     * @return the properties value.
     */
    ManagedVirtualNetwork properties();

    /**
     * Gets the name property: The resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: Etag identifies change in the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.ManagedVirtualNetworkResourceInner object.
     *
     * @return the inner object.
     */
    ManagedVirtualNetworkResourceInner innerModel();

    /** The entirety of the ManagedVirtualNetworkResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithProperties,
            DefinitionStages.WithCreate {
    }
    /** The ManagedVirtualNetworkResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the ManagedVirtualNetworkResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ManagedVirtualNetworkResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, factoryName.
             *
             * @param resourceGroupName The resource group name.
             * @param factoryName The factory name.
             * @return the next definition stage.
             */
            WithProperties withExistingFactory(String resourceGroupName, String factoryName);
        }
        /** The stage of the ManagedVirtualNetworkResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Managed Virtual Network properties..
             *
             * @param properties Managed Virtual Network properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(ManagedVirtualNetwork properties);
        }
        /**
         * The stage of the ManagedVirtualNetworkResource definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ManagedVirtualNetworkResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ManagedVirtualNetworkResource create(Context context);
        }
        /** The stage of the ManagedVirtualNetworkResource definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the managed Virtual Network entity. Should only be specified for
             * update, for which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the managed Virtual Network entity. Should only be specified for update, for which
             *     it should match existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the ManagedVirtualNetworkResource resource.
     *
     * @return the stage of resource update.
     */
    ManagedVirtualNetworkResource.Update update();

    /** The template for ManagedVirtualNetworkResource update. */
    interface Update extends UpdateStages.WithProperties, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ManagedVirtualNetworkResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ManagedVirtualNetworkResource apply(Context context);
    }
    /** The ManagedVirtualNetworkResource update stages. */
    interface UpdateStages {
        /** The stage of the ManagedVirtualNetworkResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Managed Virtual Network properties..
             *
             * @param properties Managed Virtual Network properties.
             * @return the next definition stage.
             */
            Update withProperties(ManagedVirtualNetwork properties);
        }
        /** The stage of the ManagedVirtualNetworkResource update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the managed Virtual Network entity. Should only be specified for
             * update, for which it should match existing entity or can be * for unconditional update..
             *
             * @param ifMatch ETag of the managed Virtual Network entity. Should only be specified for update, for which
             *     it should match existing entity or can be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ManagedVirtualNetworkResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ManagedVirtualNetworkResource refresh(Context context);
}