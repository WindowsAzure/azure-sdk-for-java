/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.implementation.ContainerRegistryManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2017_06_01_preview.implementation.RegistryInner;

/**
 * Type representing Registry.
 */
public interface Registry extends HasInner<RegistryInner>, Resource, GroupableResourceCore<ContainerRegistryManager, RegistryInner>, HasResourceGroup, Refreshable<Registry>, Updatable<Registry.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the adminUserEnabled value.
     */
    Boolean adminUserEnabled();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the loginServer value.
     */
    String loginServer();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the status value.
     */
    Status status();

    /**
     * @return the storageAccount value.
     */
    StorageAccountProperties storageAccount();

    /**
     * The entirety of the Registry definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Registry definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Registry definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Registry definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the registry definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The SKU of the container registry
            * @return the next definition stage
*/
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the registry definition allowing to specify AdminUserEnabled.
         */
        interface WithAdminUserEnabled {
            /**
             * Specifies adminUserEnabled.
             * @param adminUserEnabled The value that indicates whether the admin user is enabled
             * @return the next definition stage
             */
            WithCreate withAdminUserEnabled(Boolean adminUserEnabled);
        }

        /**
         * The stage of the registry definition allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
            /**
             * Specifies storageAccount.
             * @param storageAccount The properties of the storage account for the container registry. Only applicable to Basic SKU
             * @return the next definition stage
             */
            WithCreate withStorageAccount(StorageAccountProperties storageAccount);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Registry>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdminUserEnabled, DefinitionStages.WithStorageAccount {
        }
    }
    /**
     * The template for a Registry update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Registry>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdminUserEnabled, UpdateStages.WithSku, UpdateStages.WithStorageAccount {
    }

    /**
     * Grouping of Registry update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the registry update allowing to specify AdminUserEnabled.
         */
        interface WithAdminUserEnabled {
            /**
             * Specifies adminUserEnabled.
             * @param adminUserEnabled The value that indicates whether the admin user is enabled
             * @return the next update stage
             */
            Update withAdminUserEnabled(Boolean adminUserEnabled);
        }

        /**
         * The stage of the registry update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             * @param sku The SKU of the container registry
             * @return the next update stage
             */
            Update withSku(Sku sku);
        }

        /**
         * The stage of the registry update allowing to specify StorageAccount.
         */
        interface WithStorageAccount {
            /**
             * Specifies storageAccount.
             * @param storageAccount The parameters of a storage account for the container registry. Only applicable to Basic SKU. If specified, the storage account must be in the same physical location as the container registry
             * @return the next update stage
             */
            Update withStorageAccount(StorageAccountProperties storageAccount);
        }

    }
}
