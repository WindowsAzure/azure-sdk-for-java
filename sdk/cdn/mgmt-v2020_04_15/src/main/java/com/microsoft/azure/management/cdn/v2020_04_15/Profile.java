/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cdn.v2020_04_15.implementation.CdnManager;
import com.microsoft.azure.management.cdn.v2020_04_15.implementation.ProfileInner;

/**
 * Type representing Profile.
 */
public interface Profile extends HasInner<ProfileInner>, Resource, GroupableResourceCore<CdnManager, ProfileInner>, HasResourceGroup, Refreshable<Profile>, Updatable<Profile.Update>, HasManager<CdnManager> {
    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the resourceState value.
     */
    ProfileResourceState resourceState();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * The entirety of the Profile definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Profile definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Profile definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Profile definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the profile definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile
            * @return the next definition stage
*/
            WithCreate withSku(Sku sku);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Profile>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a Profile update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Profile>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of Profile update stages.
     */
    interface UpdateStages {
    }
}
