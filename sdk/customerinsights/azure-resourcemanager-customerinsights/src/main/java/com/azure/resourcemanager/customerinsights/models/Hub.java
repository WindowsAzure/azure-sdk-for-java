// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customerinsights.fluent.models.HubInner;
import java.util.Map;

/** An immutable client-side representation of Hub. */
public interface Hub {
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
     * Gets the apiEndpoint property: API endpoint URL of the hub.
     *
     * @return the apiEndpoint value.
     */
    String apiEndpoint();

    /**
     * Gets the webEndpoint property: Web endpoint URL of the hub.
     *
     * @return the webEndpoint value.
     */
    String webEndpoint();

    /**
     * Gets the provisioningState property: Provisioning state of the hub.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the tenantFeatures property: The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is
     * enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set to 0.
     *
     * @return the tenantFeatures value.
     */
    Integer tenantFeatures();

    /**
     * Gets the hubBillingInfo property: Billing settings of the hub.
     *
     * @return the hubBillingInfo value.
     */
    HubBillingInfoFormat hubBillingInfo();

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
     * Gets the inner com.azure.resourcemanager.customerinsights.fluent.models.HubInner object.
     *
     * @return the inner object.
     */
    HubInner innerModel();

    /** The entirety of the Hub definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Hub definition stages. */
    interface DefinitionStages {
        /** The first stage of the Hub definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Hub definition allowing to specify location. */
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
        /** The stage of the Hub definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Hub definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithTenantFeatures,
                DefinitionStages.WithHubBillingInfo {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Hub create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Hub create(Context context);
        }
        /** The stage of the Hub definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Hub definition allowing to specify tenantFeatures. */
        interface WithTenantFeatures {
            /**
             * Specifies the tenantFeatures property: The bit flags for enabled hub features. Bit 0 is set to 1
             * indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or
             * enabled if set to 0..
             *
             * @param tenantFeatures The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is
             *     enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set
             *     to 0.
             * @return the next definition stage.
             */
            WithCreate withTenantFeatures(Integer tenantFeatures);
        }
        /** The stage of the Hub definition allowing to specify hubBillingInfo. */
        interface WithHubBillingInfo {
            /**
             * Specifies the hubBillingInfo property: Billing settings of the hub..
             *
             * @param hubBillingInfo Billing settings of the hub.
             * @return the next definition stage.
             */
            WithCreate withHubBillingInfo(HubBillingInfoFormat hubBillingInfo);
        }
    }
    /**
     * Begins update for the Hub resource.
     *
     * @return the stage of resource update.
     */
    Hub.Update update();

    /** The template for Hub update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithTenantFeatures, UpdateStages.WithHubBillingInfo {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Hub apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Hub apply(Context context);
    }
    /** The Hub update stages. */
    interface UpdateStages {
        /** The stage of the Hub update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Hub update allowing to specify tenantFeatures. */
        interface WithTenantFeatures {
            /**
             * Specifies the tenantFeatures property: The bit flags for enabled hub features. Bit 0 is set to 1
             * indicates graph is enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or
             * enabled if set to 0..
             *
             * @param tenantFeatures The bit flags for enabled hub features. Bit 0 is set to 1 indicates graph is
             *     enabled, or disabled if set to 0. Bit 1 is set to 1 indicates the hub is disabled, or enabled if set
             *     to 0.
             * @return the next definition stage.
             */
            Update withTenantFeatures(Integer tenantFeatures);
        }
        /** The stage of the Hub update allowing to specify hubBillingInfo. */
        interface WithHubBillingInfo {
            /**
             * Specifies the hubBillingInfo property: Billing settings of the hub..
             *
             * @param hubBillingInfo Billing settings of the hub.
             * @return the next definition stage.
             */
            Update withHubBillingInfo(HubBillingInfoFormat hubBillingInfo);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Hub refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Hub refresh(Context context);
}
