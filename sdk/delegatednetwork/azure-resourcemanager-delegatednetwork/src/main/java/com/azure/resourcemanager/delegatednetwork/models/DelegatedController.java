// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.delegatednetwork.fluent.models.DelegatedControllerInner;
import java.util.Map;

/** An immutable client-side representation of DelegatedController. */
public interface DelegatedController {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the resourceGuid property: Resource guid.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The current state of dnc controller resource.
     *
     * @return the provisioningState value.
     */
    ControllerState provisioningState();

    /**
     * Gets the dncAppId property: dnc application id should be used by customer to authenticate with dnc gateway.
     *
     * @return the dncAppId value.
     */
    String dncAppId();

    /**
     * Gets the dncTenantId property: tenant id of dnc application id.
     *
     * @return the dncTenantId value.
     */
    String dncTenantId();

    /**
     * Gets the dncEndpoint property: dnc endpoint url that customers can use to connect to.
     *
     * @return the dncEndpoint value.
     */
    String dncEndpoint();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.delegatednetwork.fluent.models.DelegatedControllerInner object.
     *
     * @return the inner object.
     */
    DelegatedControllerInner innerModel();

    /** The entirety of the DelegatedController definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The DelegatedController definition stages. */
    interface DefinitionStages {
        /** The first stage of the DelegatedController definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DelegatedController definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the DelegatedController definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the DelegatedController definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DelegatedController create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DelegatedController create(Context context);
        }
        /** The stage of the DelegatedController definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the DelegatedController resource.
     *
     * @return the stage of resource update.
     */
    DelegatedController.Update update();

    /** The template for DelegatedController update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DelegatedController apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DelegatedController apply(Context context);
    }
    /** The DelegatedController update stages. */
    interface UpdateStages {
        /** The stage of the DelegatedController update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The resource tags..
             *
             * @param tags The resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    DelegatedController refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DelegatedController refresh(Context context);
}
