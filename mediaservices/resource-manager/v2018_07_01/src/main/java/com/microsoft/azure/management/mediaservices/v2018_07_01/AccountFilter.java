/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.AccountFilterInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2018_07_01.implementation.MediaManager;
import java.util.List;

/**
 * Type representing AccountFilter.
 */
public interface AccountFilter extends HasInner<AccountFilterInner>, Indexable, Refreshable<AccountFilter>, Updatable<AccountFilter.Update>, HasManager<MediaManager> {
    /**
     * @return the firstQuality value.
     */
    FirstQuality firstQuality();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the presentationTimeRange value.
     */
    PresentationTimeRange presentationTimeRange();

    /**
     * @return the tracks value.
     */
    List<FilterTrackSelection> tracks();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the AccountFilter definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AccountFilter definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AccountFilter definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the accountfilter definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            */
            WithCreate withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the accountfilter definition allowing to specify FirstQuality.
         */
        interface WithFirstQuality {
            /**
             * Specifies firstQuality.
             */
            WithCreate withFirstQuality(FirstQuality firstQuality);
        }

        /**
         * The stage of the accountfilter definition allowing to specify PresentationTimeRange.
         */
        interface WithPresentationTimeRange {
            /**
             * Specifies presentationTimeRange.
             */
            WithCreate withPresentationTimeRange(PresentationTimeRange presentationTimeRange);
        }

        /**
         * The stage of the accountfilter definition allowing to specify Tracks.
         */
        interface WithTracks {
            /**
             * Specifies tracks.
             */
            WithCreate withTracks(List<FilterTrackSelection> tracks);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AccountFilter>, DefinitionStages.WithFirstQuality, DefinitionStages.WithPresentationTimeRange, DefinitionStages.WithTracks {
        }
    }
    /**
     * The template for a AccountFilter update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AccountFilter>, UpdateStages.WithFirstQuality, UpdateStages.WithPresentationTimeRange, UpdateStages.WithTracks {
    }

    /**
     * Grouping of AccountFilter update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the accountfilter update allowing to specify FirstQuality.
         */
        interface WithFirstQuality {
            /**
             * Specifies firstQuality.
             */
            Update withFirstQuality(FirstQuality firstQuality);
        }

        /**
         * The stage of the accountfilter update allowing to specify PresentationTimeRange.
         */
        interface WithPresentationTimeRange {
            /**
             * Specifies presentationTimeRange.
             */
            Update withPresentationTimeRange(PresentationTimeRange presentationTimeRange);
        }

        /**
         * The stage of the accountfilter update allowing to specify Tracks.
         */
        interface WithTracks {
            /**
             * Specifies tracks.
             */
            Update withTracks(List<FilterTrackSelection> tracks);
        }

    }
}
