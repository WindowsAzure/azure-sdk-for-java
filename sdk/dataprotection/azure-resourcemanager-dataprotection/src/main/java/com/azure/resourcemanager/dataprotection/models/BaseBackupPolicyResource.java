// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.dataprotection.fluent.models.BaseBackupPolicyResourceInner;
import java.util.List;

/** An immutable client-side representation of BaseBackupPolicyResource. */
public interface BaseBackupPolicyResource {
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
     * Gets the datasourceTypes property: Type of datasource for the backup management.
     *
     * @return the datasourceTypes value.
     */
    List<String> datasourceTypes();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.BaseBackupPolicyResourceInner object.
     *
     * @return the inner object.
     */
    BaseBackupPolicyResourceInner innerModel();

    /** The entirety of the BaseBackupPolicyResource definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The BaseBackupPolicyResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the BaseBackupPolicyResource definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the BaseBackupPolicyResource definition allowing to specify parent resource. */
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
         * The stage of the BaseBackupPolicyResource definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithDatasourceTypes {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            BaseBackupPolicyResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            BaseBackupPolicyResource create(Context context);
        }
        /** The stage of the BaseBackupPolicyResource definition allowing to specify datasourceTypes. */
        interface WithDatasourceTypes {
            /**
             * Specifies the datasourceTypes property: Type of datasource for the backup management.
             *
             * @param datasourceTypes Type of datasource for the backup management.
             * @return the next definition stage.
             */
            WithCreate withDatasourceTypes(List<String> datasourceTypes);
        }
    }
    /**
     * Begins update for the BaseBackupPolicyResource resource.
     *
     * @return the stage of resource update.
     */
    BaseBackupPolicyResource.Update update();

    /** The template for BaseBackupPolicyResource update. */
    interface Update extends UpdateStages.WithDatasourceTypes {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        BaseBackupPolicyResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        BaseBackupPolicyResource apply(Context context);
    }
    /** The BaseBackupPolicyResource update stages. */
    interface UpdateStages {
        /** The stage of the BaseBackupPolicyResource update allowing to specify datasourceTypes. */
        interface WithDatasourceTypes {
            /**
             * Specifies the datasourceTypes property: Type of datasource for the backup management.
             *
             * @param datasourceTypes Type of datasource for the backup management.
             * @return the next definition stage.
             */
            Update withDatasourceTypes(List<String> datasourceTypes);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    BaseBackupPolicyResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    BaseBackupPolicyResource refresh(Context context);
}
