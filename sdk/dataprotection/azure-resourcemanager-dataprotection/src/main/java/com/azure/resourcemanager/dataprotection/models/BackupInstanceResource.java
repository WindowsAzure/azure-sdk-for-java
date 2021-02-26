// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupInstanceResourceInner;

/** An immutable client-side representation of BackupInstanceResource. */
public interface BackupInstanceResource {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the dataSourceInfo property: Gets or sets the data source information.
     *
     * @return the dataSourceInfo value.
     */
    Datasource dataSourceInfo();

    /**
     * Gets the dataSourceSetInfo property: Gets or sets the data source set information.
     *
     * @return the dataSourceSetInfo value.
     */
    DatasourceSet dataSourceSetInfo();

    /**
     * Gets the objectType property: The objectType property.
     *
     * @return the objectType value.
     */
    String objectType();

    /**
     * Gets the policyInfo property: Gets or sets the policy information.
     *
     * @return the policyInfo value.
     */
    PolicyInfo policyInfo();

    /**
     * Gets the protectionStatus property: Specifies the protection status of the resource.
     *
     * @return the protectionStatus value.
     */
    ProtectionStatusDetails protectionStatus();

    /**
     * Gets the provisioningState property: Specifies the provisioning state of the resource i.e.
     * provisioning/updating/Succeeded/Failed.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.BackupInstanceResourceInner object.
     *
     * @return the inner object.
     */
    BackupInstanceResourceInner innerModel();

    /** The entirety of the BackupInstanceResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The BackupInstanceResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the BackupInstanceResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the BackupInstanceResource definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies vaultName, resourceGroupName.
             *
             * @param vaultName The name of the backup vault.
             * @param resourceGroupName The name of the resource group where the backup vault is present.
             * @return the next definition stage.
             */
            WithCreate withExistingBackupVault(String vaultName, String resourceGroupName);
        }
        /**
         * The stage of the BackupInstanceResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithDataSourceInfo,
                DefinitionStages.WithDataSourceSetInfo,
                DefinitionStages.WithObjectType,
                DefinitionStages.WithPolicyInfo {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BackupInstanceResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BackupInstanceResource create(Context context);
        }
        /** The stage of the BackupInstanceResource definition allowing to specify dataSourceInfo. */
        interface WithDataSourceInfo {
            /**
             * Specifies the dataSourceInfo property: Gets or sets the data source information..
             *
             * @param dataSourceInfo Gets or sets the data source information.
             * @return the next definition stage.
             */
            WithCreate withDataSourceInfo(Datasource dataSourceInfo);
        }
        /** The stage of the BackupInstanceResource definition allowing to specify dataSourceSetInfo. */
        interface WithDataSourceSetInfo {
            /**
             * Specifies the dataSourceSetInfo property: Gets or sets the data source set information..
             *
             * @param dataSourceSetInfo Gets or sets the data source set information.
             * @return the next definition stage.
             */
            WithCreate withDataSourceSetInfo(DatasourceSet dataSourceSetInfo);
        }
        /** The stage of the BackupInstanceResource definition allowing to specify objectType. */
        interface WithObjectType {
            /**
             * Specifies the objectType property: The objectType property..
             *
             * @param objectType The objectType property.
             * @return the next definition stage.
             */
            WithCreate withObjectType(String objectType);
        }
        /** The stage of the BackupInstanceResource definition allowing to specify policyInfo. */
        interface WithPolicyInfo {
            /**
             * Specifies the policyInfo property: Gets or sets the policy information..
             *
             * @param policyInfo Gets or sets the policy information.
             * @return the next definition stage.
             */
            WithCreate withPolicyInfo(PolicyInfo policyInfo);
        }
    }
    /**
     * Begins update for the BackupInstanceResource resource.
     *
     * @return the stage of resource update.
     */
    BackupInstanceResource.Update update();

    /** The template for BackupInstanceResource update. */
    interface Update
        extends UpdateStages.WithDataSourceInfo,
            UpdateStages.WithDataSourceSetInfo,
            UpdateStages.WithObjectType,
            UpdateStages.WithPolicyInfo {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BackupInstanceResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BackupInstanceResource apply(Context context);
    }
    /** The BackupInstanceResource update stages. */
    interface UpdateStages {
        /** The stage of the BackupInstanceResource update allowing to specify dataSourceInfo. */
        interface WithDataSourceInfo {
            /**
             * Specifies the dataSourceInfo property: Gets or sets the data source information..
             *
             * @param dataSourceInfo Gets or sets the data source information.
             * @return the next definition stage.
             */
            Update withDataSourceInfo(Datasource dataSourceInfo);
        }
        /** The stage of the BackupInstanceResource update allowing to specify dataSourceSetInfo. */
        interface WithDataSourceSetInfo {
            /**
             * Specifies the dataSourceSetInfo property: Gets or sets the data source set information..
             *
             * @param dataSourceSetInfo Gets or sets the data source set information.
             * @return the next definition stage.
             */
            Update withDataSourceSetInfo(DatasourceSet dataSourceSetInfo);
        }
        /** The stage of the BackupInstanceResource update allowing to specify objectType. */
        interface WithObjectType {
            /**
             * Specifies the objectType property: The objectType property..
             *
             * @param objectType The objectType property.
             * @return the next definition stage.
             */
            Update withObjectType(String objectType);
        }
        /** The stage of the BackupInstanceResource update allowing to specify policyInfo. */
        interface WithPolicyInfo {
            /**
             * Specifies the policyInfo property: Gets or sets the policy information..
             *
             * @param policyInfo Gets or sets the policy information.
             * @return the next definition stage.
             */
            Update withPolicyInfo(PolicyInfo policyInfo);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BackupInstanceResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BackupInstanceResource refresh(Context context);

    /**
     * Trigger adhoc backup.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void adhocBackup(TriggerBackupRequest parameters);

    /**
     * Trigger adhoc backup.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void adhocBackup(TriggerBackupRequest parameters, Context context);

    /**
     * rehydrate recovery point for restore for a BackupInstance.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRehydrate(AzureBackupRehydrationRequest parameters);

    /**
     * rehydrate recovery point for restore for a BackupInstance.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRehydrate(AzureBackupRehydrationRequest parameters, Context context);

    /**
     * Triggers restore for a BackupInstance.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRestore(AzureBackupRestoreRequest parameters);

    /**
     * Triggers restore for a BackupInstance.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerRestore(AzureBackupRestoreRequest parameters, Context context);

    /**
     * Validates if Restore can be triggered for a DataSource.
     *
     * @param parameters Request body for operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateRestore(ValidateRestoreRequestObject parameters);

    /**
     * Validates if Restore can be triggered for a DataSource.
     *
     * @param parameters Request body for operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateRestore(ValidateRestoreRequestObject parameters, Context context);
}
