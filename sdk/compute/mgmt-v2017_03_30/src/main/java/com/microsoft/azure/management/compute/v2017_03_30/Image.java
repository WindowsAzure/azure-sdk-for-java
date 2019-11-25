/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.ComputeManager;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.ImageInner;

/**
 * Type representing Image.
 */
public interface Image extends HasInner<ImageInner>, Resource, GroupableResourceCore<ComputeManager, ImageInner>, HasResourceGroup, Refreshable<Image>, Updatable<Image.Update>, HasManager<ComputeManager> {
    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the sourceVirtualMachine value.
     */
    SubResource sourceVirtualMachine();

    /**
     * @return the storageProfile value.
     */
    ImageStorageProfile storageProfile();

    /**
     * The entirety of the Image definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Image definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Image definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Image definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the image update allowing to specify SourceVirtualMachine.
         */
        interface WithSourceVirtualMachine {
            /**
             * Specifies sourceVirtualMachine.
             */
            WithCreate withSourceVirtualMachine(SubResource sourceVirtualMachine);
        }

        /**
         * The stage of the image update allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             */
            WithCreate withStorageProfile(ImageStorageProfile storageProfile);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Image>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithSourceVirtualMachine, DefinitionStages.WithStorageProfile {
        }
    }
    /**
     * The template for a Image update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Image>, Resource.UpdateWithTags<Update>, UpdateStages.WithSourceVirtualMachine, UpdateStages.WithStorageProfile {
    }

    /**
     * Grouping of Image update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the image {0} allowing to specify SourceVirtualMachine.
         */
        interface WithSourceVirtualMachine {
            /**
             * Specifies sourceVirtualMachine.
             */
            Update withSourceVirtualMachine(SubResource sourceVirtualMachine);
        }

        /**
         * The stage of the image {0} allowing to specify StorageProfile.
         */
        interface WithStorageProfile {
            /**
             * Specifies storageProfile.
             */
            Update withStorageProfile(ImageStorageProfile storageProfile);
        }

    }
}
