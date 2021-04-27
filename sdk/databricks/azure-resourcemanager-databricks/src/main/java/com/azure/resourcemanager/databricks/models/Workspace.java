// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databricks.fluent.models.WorkspaceInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Workspace. */
public interface Workspace {
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
     * Gets the sku property: The SKU of the resource.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the managedResourceGroupId property: The managed resource group Id.
     *
     * @return the managedResourceGroupId value.
     */
    String managedResourceGroupId();

    /**
     * Gets the parameters property: The workspace's custom parameters.
     *
     * @return the parameters value.
     */
    WorkspaceCustomParameters parameters();

    /**
     * Gets the provisioningState property: The workspace provisioning state.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the uiDefinitionUri property: The blob URI where the UI definition file is located.
     *
     * @return the uiDefinitionUri value.
     */
    String uiDefinitionUri();

    /**
     * Gets the authorizations property: The workspace provider authorizations.
     *
     * @return the authorizations value.
     */
    List<WorkspaceProviderAuthorization> authorizations();

    /**
     * Gets the createdBy property: Indicates the Object ID, PUID and Application ID of entity that created the
     * workspace.
     *
     * @return the createdBy value.
     */
    CreatedBy createdBy();

    /**
     * Gets the updatedBy property: Indicates the Object ID, PUID and Application ID of entity that last updated the
     * workspace.
     *
     * @return the updatedBy value.
     */
    CreatedBy updatedBy();

    /**
     * Gets the createdDateTime property: Specifies the date and time when the workspace is created.
     *
     * @return the createdDateTime value.
     */
    OffsetDateTime createdDateTime();

    /**
     * Gets the workspaceId property: The unique identifier of the databricks workspace in databricks control plane.
     *
     * @return the workspaceId value.
     */
    String workspaceId();

    /**
     * Gets the workspaceUrl property: The workspace URL which is of the format
     * 'adb-{workspaceId}.{random}.azuredatabricks.net'.
     *
     * @return the workspaceUrl value.
     */
    String workspaceUrl();

    /**
     * Gets the storageAccountIdentity property: The details of Managed Identity of Storage Account.
     *
     * @return the storageAccountIdentity value.
     */
    ManagedIdentityConfiguration storageAccountIdentity();

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
     * Gets the inner com.azure.resourcemanager.databricks.fluent.models.WorkspaceInner object.
     *
     * @return the inner object.
     */
    WorkspaceInner innerModel();

    /** The entirety of the Workspace definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithManagedResourceGroupId,
            DefinitionStages.WithCreate {
    }
    /** The Workspace definition stages. */
    interface DefinitionStages {
        /** The first stage of the Workspace definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Workspace definition allowing to specify location. */
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
        /** The stage of the Workspace definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithManagedResourceGroupId withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the Workspace definition allowing to specify managedResourceGroupId. */
        interface WithManagedResourceGroupId {
            /**
             * Specifies the managedResourceGroupId property: The managed resource group Id..
             *
             * @param managedResourceGroupId The managed resource group Id.
             * @return the next definition stage.
             */
            WithCreate withManagedResourceGroupId(String managedResourceGroupId);
        }
        /**
         * The stage of the Workspace definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithSku,
                DefinitionStages.WithParameters,
                DefinitionStages.WithUiDefinitionUri,
                DefinitionStages.WithAuthorizations,
                DefinitionStages.WithCreatedBy,
                DefinitionStages.WithUpdatedBy,
                DefinitionStages.WithStorageAccountIdentity {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Workspace create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Workspace create(Context context);
        }
        /** The stage of the Workspace definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Workspace definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the resource..
             *
             * @param sku The SKU of the resource.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /** The stage of the Workspace definition allowing to specify parameters. */
        interface WithParameters {
            /**
             * Specifies the parameters property: The workspace's custom parameters..
             *
             * @param parameters The workspace's custom parameters.
             * @return the next definition stage.
             */
            WithCreate withParameters(WorkspaceCustomParameters parameters);
        }
        /** The stage of the Workspace definition allowing to specify uiDefinitionUri. */
        interface WithUiDefinitionUri {
            /**
             * Specifies the uiDefinitionUri property: The blob URI where the UI definition file is located..
             *
             * @param uiDefinitionUri The blob URI where the UI definition file is located.
             * @return the next definition stage.
             */
            WithCreate withUiDefinitionUri(String uiDefinitionUri);
        }
        /** The stage of the Workspace definition allowing to specify authorizations. */
        interface WithAuthorizations {
            /**
             * Specifies the authorizations property: The workspace provider authorizations..
             *
             * @param authorizations The workspace provider authorizations.
             * @return the next definition stage.
             */
            WithCreate withAuthorizations(List<WorkspaceProviderAuthorization> authorizations);
        }
        /** The stage of the Workspace definition allowing to specify createdBy. */
        interface WithCreatedBy {
            /**
             * Specifies the createdBy property: Indicates the Object ID, PUID and Application ID of entity that created
             * the workspace..
             *
             * @param createdBy Indicates the Object ID, PUID and Application ID of entity that created the workspace.
             * @return the next definition stage.
             */
            WithCreate withCreatedBy(CreatedBy createdBy);
        }
        /** The stage of the Workspace definition allowing to specify updatedBy. */
        interface WithUpdatedBy {
            /**
             * Specifies the updatedBy property: Indicates the Object ID, PUID and Application ID of entity that last
             * updated the workspace..
             *
             * @param updatedBy Indicates the Object ID, PUID and Application ID of entity that last updated the
             *     workspace.
             * @return the next definition stage.
             */
            WithCreate withUpdatedBy(CreatedBy updatedBy);
        }
        /** The stage of the Workspace definition allowing to specify storageAccountIdentity. */
        interface WithStorageAccountIdentity {
            /**
             * Specifies the storageAccountIdentity property: The details of Managed Identity of Storage Account.
             *
             * @param storageAccountIdentity The details of Managed Identity of Storage Account.
             * @return the next definition stage.
             */
            WithCreate withStorageAccountIdentity(ManagedIdentityConfiguration storageAccountIdentity);
        }
    }
    /**
     * Begins update for the Workspace resource.
     *
     * @return the stage of resource update.
     */
    Workspace.Update update();

    /** The template for Workspace update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Workspace apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Workspace apply(Context context);
    }
    /** The Workspace update stages. */
    interface UpdateStages {
        /** The stage of the Workspace update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
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
    Workspace refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Workspace refresh(Context context);
}
