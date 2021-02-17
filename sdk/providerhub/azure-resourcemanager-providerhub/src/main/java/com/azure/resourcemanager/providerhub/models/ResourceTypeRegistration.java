// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceTypeRegistrationInner;

/** An immutable client-side representation of ResourceTypeRegistration. */
public interface ResourceTypeRegistration {
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
     * Gets the properties property: The properties property.
     *
     * @return the properties value.
     */
    ResourceTypeRegistrationProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.providerhub.fluent.models.ResourceTypeRegistrationInner object.
     *
     * @return the inner object.
     */
    ResourceTypeRegistrationInner innerModel();

    /** The entirety of the ResourceTypeRegistration definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The ResourceTypeRegistration definition stages. */
    interface DefinitionStages {
        /** The first stage of the ResourceTypeRegistration definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the ResourceTypeRegistration definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies providerNamespace.
             *
             * @param providerNamespace The name of the resource provider hosted within ProviderHub.
             * @return the next definition stage.
             */
            WithCreate withExistingProviderRegistration(String providerNamespace);
        }
        /**
         * The stage of the ResourceTypeRegistration definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ResourceTypeRegistration create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ResourceTypeRegistration create(Context context);
        }
        /** The stage of the ResourceTypeRegistration definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties property..
             *
             * @param properties The properties property.
             * @return the next definition stage.
             */
            WithCreate withProperties(ResourceTypeRegistrationProperties properties);
        }
    }
    /**
     * Begins update for the ResourceTypeRegistration resource.
     *
     * @return the stage of resource update.
     */
    ResourceTypeRegistration.Update update();

    /** The template for ResourceTypeRegistration update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ResourceTypeRegistration apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ResourceTypeRegistration apply(Context context);
    }
    /** The ResourceTypeRegistration update stages. */
    interface UpdateStages {
        /** The stage of the ResourceTypeRegistration update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: The properties property..
             *
             * @param properties The properties property.
             * @return the next definition stage.
             */
            Update withProperties(ResourceTypeRegistrationProperties properties);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ResourceTypeRegistration refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ResourceTypeRegistration refresh(Context context);
}
