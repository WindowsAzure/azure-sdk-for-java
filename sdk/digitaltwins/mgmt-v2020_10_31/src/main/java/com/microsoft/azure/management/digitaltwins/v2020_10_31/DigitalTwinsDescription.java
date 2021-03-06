/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.implementation.DigitalTwinsManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.implementation.DigitalTwinsDescriptionInner;

/**
 * Type representing DigitalTwinsDescription.
 */
public interface DigitalTwinsDescription extends HasInner<DigitalTwinsDescriptionInner>, Resource, GroupableResourceCore<DigitalTwinsManager, DigitalTwinsDescriptionInner>, HasResourceGroup, Refreshable<DigitalTwinsDescription>, Updatable<DigitalTwinsDescription.Update>, HasManager<DigitalTwinsManager> {
    /**
     * @return the createdTime value.
     */
    DateTime createdTime();

    /**
     * @return the hostName value.
     */
    String hostName();

    /**
     * @return the lastUpdatedTime value.
     */
    DateTime lastUpdatedTime();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * The entirety of the DigitalTwinsDescription definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DigitalTwinsDescription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DigitalTwinsDescription definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the DigitalTwinsDescription definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DigitalTwinsDescription>, Resource.DefinitionWithTags<WithCreate> {
        }
    }
    /**
     * The template for a DigitalTwinsDescription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DigitalTwinsDescription>, Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of DigitalTwinsDescription update stages.
     */
    interface UpdateStages {
    }
}
