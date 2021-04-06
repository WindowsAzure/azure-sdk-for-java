// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.fluent.models.WorkspaceInner;
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
     * Gets the etag property: The ETag of the workspace.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the provisioningState property: The provisioning state of the workspace.
     *
     * @return the provisioningState value.
     */
    WorkspaceEntityStatus provisioningState();

    /**
     * Gets the customerId property: This is a read-only property. Represents the ID associated with the workspace.
     *
     * @return the customerId value.
     */
    String customerId();

    /**
     * Gets the sku property: The SKU of the workspace.
     *
     * @return the sku value.
     */
    WorkspaceSku sku();

    /**
     * Gets the retentionInDays property: The workspace data retention in days. Allowed values are per pricing plan. See
     * pricing tiers documentation for details.
     *
     * @return the retentionInDays value.
     */
    Integer retentionInDays();

    /**
     * Gets the workspaceCapping property: The daily volume cap for ingestion.
     *
     * @return the workspaceCapping value.
     */
    WorkspaceCapping workspaceCapping();

    /**
     * Gets the createdDate property: Workspace creation date.
     *
     * @return the createdDate value.
     */
    String createdDate();

    /**
     * Gets the modifiedDate property: Workspace modification date.
     *
     * @return the modifiedDate value.
     */
    String modifiedDate();

    /**
     * Gets the publicNetworkAccessForIngestion property: The network access type for accessing Log Analytics ingestion.
     *
     * @return the publicNetworkAccessForIngestion value.
     */
    PublicNetworkAccessType publicNetworkAccessForIngestion();

    /**
     * Gets the publicNetworkAccessForQuery property: The network access type for accessing Log Analytics query.
     *
     * @return the publicNetworkAccessForQuery value.
     */
    PublicNetworkAccessType publicNetworkAccessForQuery();

    /**
     * Gets the forceCmkForQuery property: Indicates whether customer managed storage is mandatory for query management.
     *
     * @return the forceCmkForQuery value.
     */
    Boolean forceCmkForQuery();

    /**
     * Gets the privateLinkScopedResources property: List of linked private link scope resources.
     *
     * @return the privateLinkScopedResources value.
     */
    List<PrivateLinkScopedResource> privateLinkScopedResources();

    /**
     * Gets the features property: Workspace features.
     *
     * @return the features value.
     */
    Map<String, Object> features();

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
     * Gets the inner com.azure.resourcemanager.loganalytics.fluent.models.WorkspaceInner object.
     *
     * @return the inner object.
     */
    WorkspaceInner innerModel();

    /** The entirety of the Workspace definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
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
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Workspace definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithEtag,
                DefinitionStages.WithProvisioningState,
                DefinitionStages.WithSku,
                DefinitionStages.WithRetentionInDays,
                DefinitionStages.WithWorkspaceCapping,
                DefinitionStages.WithPublicNetworkAccessForIngestion,
                DefinitionStages.WithPublicNetworkAccessForQuery,
                DefinitionStages.WithForceCmkForQuery,
                DefinitionStages.WithFeatures {
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
        /** The stage of the Workspace definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The ETag of the workspace..
             *
             * @param etag The ETag of the workspace.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
        /** The stage of the Workspace definition allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning state of the workspace..
             *
             * @param provisioningState The provisioning state of the workspace.
             * @return the next definition stage.
             */
            WithCreate withProvisioningState(WorkspaceEntityStatus provisioningState);
        }
        /** The stage of the Workspace definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the workspace..
             *
             * @param sku The SKU of the workspace.
             * @return the next definition stage.
             */
            WithCreate withSku(WorkspaceSku sku);
        }
        /** The stage of the Workspace definition allowing to specify retentionInDays. */
        interface WithRetentionInDays {
            /**
             * Specifies the retentionInDays property: The workspace data retention in days. Allowed values are per
             * pricing plan. See pricing tiers documentation for details..
             *
             * @param retentionInDays The workspace data retention in days. Allowed values are per pricing plan. See
             *     pricing tiers documentation for details.
             * @return the next definition stage.
             */
            WithCreate withRetentionInDays(Integer retentionInDays);
        }
        /** The stage of the Workspace definition allowing to specify workspaceCapping. */
        interface WithWorkspaceCapping {
            /**
             * Specifies the workspaceCapping property: The daily volume cap for ingestion..
             *
             * @param workspaceCapping The daily volume cap for ingestion.
             * @return the next definition stage.
             */
            WithCreate withWorkspaceCapping(WorkspaceCapping workspaceCapping);
        }
        /** The stage of the Workspace definition allowing to specify publicNetworkAccessForIngestion. */
        interface WithPublicNetworkAccessForIngestion {
            /**
             * Specifies the publicNetworkAccessForIngestion property: The network access type for accessing Log
             * Analytics ingestion..
             *
             * @param publicNetworkAccessForIngestion The network access type for accessing Log Analytics ingestion.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion);
        }
        /** The stage of the Workspace definition allowing to specify publicNetworkAccessForQuery. */
        interface WithPublicNetworkAccessForQuery {
            /**
             * Specifies the publicNetworkAccessForQuery property: The network access type for accessing Log Analytics
             * query..
             *
             * @param publicNetworkAccessForQuery The network access type for accessing Log Analytics query.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery);
        }
        /** The stage of the Workspace definition allowing to specify forceCmkForQuery. */
        interface WithForceCmkForQuery {
            /**
             * Specifies the forceCmkForQuery property: Indicates whether customer managed storage is mandatory for
             * query management..
             *
             * @param forceCmkForQuery Indicates whether customer managed storage is mandatory for query management.
             * @return the next definition stage.
             */
            WithCreate withForceCmkForQuery(Boolean forceCmkForQuery);
        }
        /** The stage of the Workspace definition allowing to specify features. */
        interface WithFeatures {
            /**
             * Specifies the features property: Workspace features..
             *
             * @param features Workspace features.
             * @return the next definition stage.
             */
            WithCreate withFeatures(Map<String, Object> features);
        }
    }
    /**
     * Begins update for the Workspace resource.
     *
     * @return the stage of resource update.
     */
    Workspace.Update update();

    /** The template for Workspace update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithProvisioningState,
            UpdateStages.WithSku,
            UpdateStages.WithRetentionInDays,
            UpdateStages.WithWorkspaceCapping,
            UpdateStages.WithPublicNetworkAccessForIngestion,
            UpdateStages.WithPublicNetworkAccessForQuery,
            UpdateStages.WithForceCmkForQuery,
            UpdateStages.WithFeatures {
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
             * Specifies the tags property: Resource tags. Optional..
             *
             * @param tags Resource tags. Optional.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Workspace update allowing to specify provisioningState. */
        interface WithProvisioningState {
            /**
             * Specifies the provisioningState property: The provisioning state of the workspace..
             *
             * @param provisioningState The provisioning state of the workspace.
             * @return the next definition stage.
             */
            Update withProvisioningState(WorkspaceEntityStatus provisioningState);
        }
        /** The stage of the Workspace update allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The SKU of the workspace..
             *
             * @param sku The SKU of the workspace.
             * @return the next definition stage.
             */
            Update withSku(WorkspaceSku sku);
        }
        /** The stage of the Workspace update allowing to specify retentionInDays. */
        interface WithRetentionInDays {
            /**
             * Specifies the retentionInDays property: The workspace data retention in days. Allowed values are per
             * pricing plan. See pricing tiers documentation for details..
             *
             * @param retentionInDays The workspace data retention in days. Allowed values are per pricing plan. See
             *     pricing tiers documentation for details.
             * @return the next definition stage.
             */
            Update withRetentionInDays(Integer retentionInDays);
        }
        /** The stage of the Workspace update allowing to specify workspaceCapping. */
        interface WithWorkspaceCapping {
            /**
             * Specifies the workspaceCapping property: The daily volume cap for ingestion..
             *
             * @param workspaceCapping The daily volume cap for ingestion.
             * @return the next definition stage.
             */
            Update withWorkspaceCapping(WorkspaceCapping workspaceCapping);
        }
        /** The stage of the Workspace update allowing to specify publicNetworkAccessForIngestion. */
        interface WithPublicNetworkAccessForIngestion {
            /**
             * Specifies the publicNetworkAccessForIngestion property: The network access type for accessing Log
             * Analytics ingestion..
             *
             * @param publicNetworkAccessForIngestion The network access type for accessing Log Analytics ingestion.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion);
        }
        /** The stage of the Workspace update allowing to specify publicNetworkAccessForQuery. */
        interface WithPublicNetworkAccessForQuery {
            /**
             * Specifies the publicNetworkAccessForQuery property: The network access type for accessing Log Analytics
             * query..
             *
             * @param publicNetworkAccessForQuery The network access type for accessing Log Analytics query.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery);
        }
        /** The stage of the Workspace update allowing to specify forceCmkForQuery. */
        interface WithForceCmkForQuery {
            /**
             * Specifies the forceCmkForQuery property: Indicates whether customer managed storage is mandatory for
             * query management..
             *
             * @param forceCmkForQuery Indicates whether customer managed storage is mandatory for query management.
             * @return the next definition stage.
             */
            Update withForceCmkForQuery(Boolean forceCmkForQuery);
        }
        /** The stage of the Workspace update allowing to specify features. */
        interface WithFeatures {
            /**
             * Specifies the features property: Workspace features..
             *
             * @param features Workspace features.
             * @return the next definition stage.
             */
            Update withFeatures(Map<String, Object> features);
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
