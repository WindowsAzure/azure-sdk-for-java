/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.MediaManager;
import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.MediaServiceInner;

/**
 * Type representing MediaService.
 */
public interface MediaService extends HasInner<MediaServiceInner>, Resource, GroupableResourceCore<MediaManager, MediaServiceInner>, HasResourceGroup, Refreshable<MediaService>, Updatable<MediaService.Update>, HasManager<MediaManager> {
    /**
     * @return the mediaServiceId value.
     */
    UUID mediaServiceId();

    /**
     * @return the storageAccounts value.
     */
    List<StorageAccount> storageAccounts();

    /**
     * The entirety of the MediaService definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of MediaService definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a MediaService definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the MediaService definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the mediaservice definition allowing to specify StorageAccounts.
         */
        interface WithStorageAccounts {
            /**
             * Specifies storageAccounts.
             * @param storageAccounts The storage accounts for this resource
             * @return the next definition stage
             */
            WithCreate withStorageAccounts(List<StorageAccount> storageAccounts);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<MediaService>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithStorageAccounts {
        }
    }
    /**
     * The template for a MediaService update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<MediaService>, Resource.UpdateWithTags<Update>, UpdateStages.WithStorageAccounts {
    }

    /**
     * Grouping of MediaService update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the mediaservice update allowing to specify StorageAccounts.
         */
        interface WithStorageAccounts {
            /**
             * Specifies storageAccounts.
             * @param storageAccounts The storage accounts for this resource
             * @return the next update stage
             */
            Update withStorageAccounts(List<StorageAccount> storageAccounts);
        }

    }
}
