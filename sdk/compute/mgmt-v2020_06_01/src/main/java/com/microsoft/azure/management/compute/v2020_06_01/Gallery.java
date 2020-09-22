/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.GalleryInner;

/**
 * Type representing Gallery.
 */
public interface Gallery extends HasInner<GalleryInner>, Resource, GroupableResourceCore<ComputeManager, GalleryInner>, HasResourceGroup, Refreshable<Gallery>, Updatable<Gallery.Update>, HasManager<ComputeManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the identifier value.
     */
    GalleryIdentifier identifier();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the Gallery definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Gallery definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Gallery definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Gallery definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the gallery definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of this Shared Image Gallery resource. This property is updatable
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the gallery definition allowing to specify Identifier.
         */
        interface WithIdentifier {
            /**
             * Specifies identifier.
             * @param identifier the identifier parameter value
             * @return the next definition stage
             */
            WithCreate withIdentifier(GalleryIdentifier identifier);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Gallery>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDescription, DefinitionStages.WithIdentifier {
        }
    }
    /**
     * The template for a Gallery update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Gallery>, Resource.UpdateWithTags<Update>, UpdateStages.WithDescription, UpdateStages.WithIdentifier {
    }

    /**
     * Grouping of Gallery update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the gallery update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of this Shared Image Gallery resource. This property is updatable
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the gallery update allowing to specify Identifier.
         */
        interface WithIdentifier {
            /**
             * Specifies identifier.
             * @param identifier the identifier parameter value
             * @return the next update stage
             */
            Update withIdentifier(GalleryIdentifier identifier);
        }

    }
}
