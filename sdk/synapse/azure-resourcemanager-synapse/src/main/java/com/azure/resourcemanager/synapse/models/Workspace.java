// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.synapse.fluent.models.WorkspaceInner;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
     * Gets the identity property: Identity of the workspace.
     *
     * @return the identity value.
     */
    ManagedIdentity identity();

    /**
     * Gets the defaultDataLakeStorage property: Workspace default data lake storage account details.
     *
     * @return the defaultDataLakeStorage value.
     */
    DataLakeStorageAccountDetails defaultDataLakeStorage();

    /**
     * Gets the sqlAdministratorLoginPassword property: SQL administrator login password.
     *
     * @return the sqlAdministratorLoginPassword value.
     */
    String sqlAdministratorLoginPassword();

    /**
     * Gets the managedResourceGroupName property: Workspace managed resource group. The resource group name uniquely
     * identifies the resource group within the user subscriptionId. The resource group name must be no longer than 90
     * characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-', '_', '(', ')' and'.'. Note
     * that the name cannot end with '.'.
     *
     * @return the managedResourceGroupName value.
     */
    String managedResourceGroupName();

    /**
     * Gets the provisioningState property: Resource provisioning state.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the sqlAdministratorLogin property: Login for workspace SQL active directory administrator.
     *
     * @return the sqlAdministratorLogin value.
     */
    String sqlAdministratorLogin();

    /**
     * Gets the virtualNetworkProfile property: Virtual Network profile.
     *
     * @return the virtualNetworkProfile value.
     */
    VirtualNetworkProfile virtualNetworkProfile();

    /**
     * Gets the connectivityEndpoints property: Connectivity endpoints.
     *
     * @return the connectivityEndpoints value.
     */
    Map<String, String> connectivityEndpoints();

    /**
     * Gets the managedVirtualNetwork property: Setting this to 'default' will ensure that all compute for this
     * workspace is in a virtual network managed on behalf of the user.
     *
     * @return the managedVirtualNetwork value.
     */
    String managedVirtualNetwork();

    /**
     * Gets the privateEndpointConnections property: Private endpoint connections to the workspace.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the encryption property: The encryption details of the workspace.
     *
     * @return the encryption value.
     */
    EncryptionDetails encryption();

    /**
     * Gets the workspaceUid property: The workspace unique identifier.
     *
     * @return the workspaceUid value.
     */
    UUID workspaceUid();

    /**
     * Gets the extraProperties property: Workspace level configs and feature flags.
     *
     * @return the extraProperties value.
     */
    Map<String, Object> extraProperties();

    /**
     * Gets the managedVirtualNetworkSettings property: Managed Virtual Network Settings.
     *
     * @return the managedVirtualNetworkSettings value.
     */
    ManagedVirtualNetworkSettings managedVirtualNetworkSettings();

    /**
     * Gets the workspaceRepositoryConfiguration property: Git integration settings.
     *
     * @return the workspaceRepositoryConfiguration value.
     */
    WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration();

    /**
     * Gets the purviewConfiguration property: Purview Configuration.
     *
     * @return the purviewConfiguration value.
     */
    PurviewConfiguration purviewConfiguration();

    /**
     * Gets the adlaResourceId property: The ADLA resource ID.
     *
     * @return the adlaResourceId value.
     */
    String adlaResourceId();

    /**
     * Gets the publicNetworkAccess property: Enable or Disable pubic network access to workspace.
     *
     * @return the publicNetworkAccess value.
     */
    WorkspacePublicNetworkAccess publicNetworkAccess();

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
     * Gets the inner com.azure.resourcemanager.synapse.fluent.models.WorkspaceInner object.
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
                DefinitionStages.WithIdentity,
                DefinitionStages.WithDefaultDataLakeStorage,
                DefinitionStages.WithSqlAdministratorLoginPassword,
                DefinitionStages.WithManagedResourceGroupName,
                DefinitionStages.WithSqlAdministratorLogin,
                DefinitionStages.WithVirtualNetworkProfile,
                DefinitionStages.WithConnectivityEndpoints,
                DefinitionStages.WithManagedVirtualNetwork,
                DefinitionStages.WithPrivateEndpointConnections,
                DefinitionStages.WithEncryption,
                DefinitionStages.WithManagedVirtualNetworkSettings,
                DefinitionStages.WithWorkspaceRepositoryConfiguration,
                DefinitionStages.WithPurviewConfiguration,
                DefinitionStages.WithPublicNetworkAccess {
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
        /** The stage of the Workspace definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity of the workspace.
             *
             * @param identity Identity of the workspace.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedIdentity identity);
        }
        /** The stage of the Workspace definition allowing to specify defaultDataLakeStorage. */
        interface WithDefaultDataLakeStorage {
            /**
             * Specifies the defaultDataLakeStorage property: Workspace default data lake storage account details.
             *
             * @param defaultDataLakeStorage Workspace default data lake storage account details.
             * @return the next definition stage.
             */
            WithCreate withDefaultDataLakeStorage(DataLakeStorageAccountDetails defaultDataLakeStorage);
        }
        /** The stage of the Workspace definition allowing to specify sqlAdministratorLoginPassword. */
        interface WithSqlAdministratorLoginPassword {
            /**
             * Specifies the sqlAdministratorLoginPassword property: SQL administrator login password.
             *
             * @param sqlAdministratorLoginPassword SQL administrator login password.
             * @return the next definition stage.
             */
            WithCreate withSqlAdministratorLoginPassword(String sqlAdministratorLoginPassword);
        }
        /** The stage of the Workspace definition allowing to specify managedResourceGroupName. */
        interface WithManagedResourceGroupName {
            /**
             * Specifies the managedResourceGroupName property: Workspace managed resource group. The resource group
             * name uniquely identifies the resource group within the user subscriptionId. The resource group name must
             * be no longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and
             * '-', '_', '(', ')' and'.'. Note that the name cannot end with '.'.
             *
             * @param managedResourceGroupName Workspace managed resource group. The resource group name uniquely
             *     identifies the resource group within the user subscriptionId. The resource group name must be no
             *     longer than 90 characters long, and must be alphanumeric characters (Char.IsLetterOrDigit()) and '-',
             *     '_', '(', ')' and'.'. Note that the name cannot end with '.'.
             * @return the next definition stage.
             */
            WithCreate withManagedResourceGroupName(String managedResourceGroupName);
        }
        /** The stage of the Workspace definition allowing to specify sqlAdministratorLogin. */
        interface WithSqlAdministratorLogin {
            /**
             * Specifies the sqlAdministratorLogin property: Login for workspace SQL active directory administrator.
             *
             * @param sqlAdministratorLogin Login for workspace SQL active directory administrator.
             * @return the next definition stage.
             */
            WithCreate withSqlAdministratorLogin(String sqlAdministratorLogin);
        }
        /** The stage of the Workspace definition allowing to specify virtualNetworkProfile. */
        interface WithVirtualNetworkProfile {
            /**
             * Specifies the virtualNetworkProfile property: Virtual Network profile.
             *
             * @param virtualNetworkProfile Virtual Network profile.
             * @return the next definition stage.
             */
            WithCreate withVirtualNetworkProfile(VirtualNetworkProfile virtualNetworkProfile);
        }
        /** The stage of the Workspace definition allowing to specify connectivityEndpoints. */
        interface WithConnectivityEndpoints {
            /**
             * Specifies the connectivityEndpoints property: Connectivity endpoints.
             *
             * @param connectivityEndpoints Connectivity endpoints.
             * @return the next definition stage.
             */
            WithCreate withConnectivityEndpoints(Map<String, String> connectivityEndpoints);
        }
        /** The stage of the Workspace definition allowing to specify managedVirtualNetwork. */
        interface WithManagedVirtualNetwork {
            /**
             * Specifies the managedVirtualNetwork property: Setting this to 'default' will ensure that all compute for
             * this workspace is in a virtual network managed on behalf of the user..
             *
             * @param managedVirtualNetwork Setting this to 'default' will ensure that all compute for this workspace is
             *     in a virtual network managed on behalf of the user.
             * @return the next definition stage.
             */
            WithCreate withManagedVirtualNetwork(String managedVirtualNetwork);
        }
        /** The stage of the Workspace definition allowing to specify privateEndpointConnections. */
        interface WithPrivateEndpointConnections {
            /**
             * Specifies the privateEndpointConnections property: Private endpoint connections to the workspace.
             *
             * @param privateEndpointConnections Private endpoint connections to the workspace.
             * @return the next definition stage.
             */
            WithCreate withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections);
        }
        /** The stage of the Workspace definition allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The encryption details of the workspace.
             *
             * @param encryption The encryption details of the workspace.
             * @return the next definition stage.
             */
            WithCreate withEncryption(EncryptionDetails encryption);
        }
        /** The stage of the Workspace definition allowing to specify managedVirtualNetworkSettings. */
        interface WithManagedVirtualNetworkSettings {
            /**
             * Specifies the managedVirtualNetworkSettings property: Managed Virtual Network Settings.
             *
             * @param managedVirtualNetworkSettings Managed Virtual Network Settings.
             * @return the next definition stage.
             */
            WithCreate withManagedVirtualNetworkSettings(ManagedVirtualNetworkSettings managedVirtualNetworkSettings);
        }
        /** The stage of the Workspace definition allowing to specify workspaceRepositoryConfiguration. */
        interface WithWorkspaceRepositoryConfiguration {
            /**
             * Specifies the workspaceRepositoryConfiguration property: Git integration settings.
             *
             * @param workspaceRepositoryConfiguration Git integration settings.
             * @return the next definition stage.
             */
            WithCreate withWorkspaceRepositoryConfiguration(
                WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration);
        }
        /** The stage of the Workspace definition allowing to specify purviewConfiguration. */
        interface WithPurviewConfiguration {
            /**
             * Specifies the purviewConfiguration property: Purview Configuration.
             *
             * @param purviewConfiguration Purview Configuration.
             * @return the next definition stage.
             */
            WithCreate withPurviewConfiguration(PurviewConfiguration purviewConfiguration);
        }
        /** The stage of the Workspace definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Enable or Disable pubic network access to workspace.
             *
             * @param publicNetworkAccess Enable or Disable pubic network access to workspace.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(WorkspacePublicNetworkAccess publicNetworkAccess);
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
            UpdateStages.WithIdentity,
            UpdateStages.WithSqlAdministratorLoginPassword,
            UpdateStages.WithManagedVirtualNetworkSettings,
            UpdateStages.WithWorkspaceRepositoryConfiguration,
            UpdateStages.WithPurviewConfiguration,
            UpdateStages.WithEncryption,
            UpdateStages.WithPublicNetworkAccess {
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
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Workspace update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: The identity of the workspace.
             *
             * @param identity The identity of the workspace.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedIdentity identity);
        }
        /** The stage of the Workspace update allowing to specify sqlAdministratorLoginPassword. */
        interface WithSqlAdministratorLoginPassword {
            /**
             * Specifies the sqlAdministratorLoginPassword property: SQL administrator login password.
             *
             * @param sqlAdministratorLoginPassword SQL administrator login password.
             * @return the next definition stage.
             */
            Update withSqlAdministratorLoginPassword(String sqlAdministratorLoginPassword);
        }
        /** The stage of the Workspace update allowing to specify managedVirtualNetworkSettings. */
        interface WithManagedVirtualNetworkSettings {
            /**
             * Specifies the managedVirtualNetworkSettings property: Managed Virtual Network Settings.
             *
             * @param managedVirtualNetworkSettings Managed Virtual Network Settings.
             * @return the next definition stage.
             */
            Update withManagedVirtualNetworkSettings(ManagedVirtualNetworkSettings managedVirtualNetworkSettings);
        }
        /** The stage of the Workspace update allowing to specify workspaceRepositoryConfiguration. */
        interface WithWorkspaceRepositoryConfiguration {
            /**
             * Specifies the workspaceRepositoryConfiguration property: Git integration settings.
             *
             * @param workspaceRepositoryConfiguration Git integration settings.
             * @return the next definition stage.
             */
            Update withWorkspaceRepositoryConfiguration(
                WorkspaceRepositoryConfiguration workspaceRepositoryConfiguration);
        }
        /** The stage of the Workspace update allowing to specify purviewConfiguration. */
        interface WithPurviewConfiguration {
            /**
             * Specifies the purviewConfiguration property: Purview Configuration.
             *
             * @param purviewConfiguration Purview Configuration.
             * @return the next definition stage.
             */
            Update withPurviewConfiguration(PurviewConfiguration purviewConfiguration);
        }
        /** The stage of the Workspace update allowing to specify encryption. */
        interface WithEncryption {
            /**
             * Specifies the encryption property: The encryption details of the workspace.
             *
             * @param encryption The encryption details of the workspace.
             * @return the next definition stage.
             */
            Update withEncryption(EncryptionDetails encryption);
        }
        /** The stage of the Workspace update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: Enable or Disable pubic network access to workspace.
             *
             * @param publicNetworkAccess Enable or Disable pubic network access to workspace.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(WorkspacePublicNetworkAccess publicNetworkAccess);
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
