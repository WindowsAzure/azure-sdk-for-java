// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.DtlEnvironmentInner;
import java.util.Map;

/** An immutable client-side representation of DtlEnvironment. */
public interface DtlEnvironment {
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
     * Gets the deploymentProperties property: The deployment properties of the environment.
     *
     * @return the deploymentProperties value.
     */
    EnvironmentDeploymentProperties deploymentProperties();

    /**
     * Gets the armTemplateDisplayName property: The display name of the Azure Resource Manager template that produced
     * the environment.
     *
     * @return the armTemplateDisplayName value.
     */
    String armTemplateDisplayName();

    /**
     * Gets the resourceGroupId property: The identifier of the resource group containing the environment's resources.
     *
     * @return the resourceGroupId value.
     */
    String resourceGroupId();

    /**
     * Gets the createdByUser property: The creator of the environment.
     *
     * @return the createdByUser value.
     */
    String createdByUser();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

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
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.DtlEnvironmentInner object.
     *
     * @return the inner object.
     */
    DtlEnvironmentInner innerModel();

    /** The entirety of the DtlEnvironment definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The DtlEnvironment definition stages. */
    interface DefinitionStages {
        /** The first stage of the DtlEnvironment definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the DtlEnvironment definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the DtlEnvironment definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, labName, username.
             *
             * @param resourceGroupName The name of the resource group.
             * @param labName The name of the lab.
             * @param username The name of the user profile.
             * @return the next definition stage.
             */
            WithCreate withExistingUser(String resourceGroupName, String labName, String username);
        }
        /**
         * The stage of the DtlEnvironment definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDeploymentProperties,
                DefinitionStages.WithArmTemplateDisplayName {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            DtlEnvironment create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DtlEnvironment create(Context context);
        }
        /** The stage of the DtlEnvironment definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the DtlEnvironment definition allowing to specify deploymentProperties. */
        interface WithDeploymentProperties {
            /**
             * Specifies the deploymentProperties property: The deployment properties of the environment..
             *
             * @param deploymentProperties The deployment properties of the environment.
             * @return the next definition stage.
             */
            WithCreate withDeploymentProperties(EnvironmentDeploymentProperties deploymentProperties);
        }
        /** The stage of the DtlEnvironment definition allowing to specify armTemplateDisplayName. */
        interface WithArmTemplateDisplayName {
            /**
             * Specifies the armTemplateDisplayName property: The display name of the Azure Resource Manager template
             * that produced the environment..
             *
             * @param armTemplateDisplayName The display name of the Azure Resource Manager template that produced the
             *     environment.
             * @return the next definition stage.
             */
            WithCreate withArmTemplateDisplayName(String armTemplateDisplayName);
        }
    }
    /**
     * Begins update for the DtlEnvironment resource.
     *
     * @return the stage of resource update.
     */
    DtlEnvironment.Update update();

    /** The template for DtlEnvironment update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        DtlEnvironment apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DtlEnvironment apply(Context context);
    }
    /** The DtlEnvironment update stages. */
    interface UpdateStages {
        /** The stage of the DtlEnvironment update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags of the resource..
             *
             * @param tags The tags of the resource.
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
    DtlEnvironment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DtlEnvironment refresh(Context context);
}
