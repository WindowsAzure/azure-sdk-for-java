// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.AssetFilterInner;
import java.util.List;

/** An immutable client-side representation of AssetFilter. */
public interface AssetFilter {
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
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the presentationTimeRange property: The presentation time range.
     *
     * @return the presentationTimeRange value.
     */
    PresentationTimeRange presentationTimeRange();

    /**
     * Gets the firstQuality property: The first quality.
     *
     * @return the firstQuality value.
     */
    FirstQuality firstQuality();

    /**
     * Gets the tracks property: The tracks selection conditions.
     *
     * @return the tracks value.
     */
    List<FilterTrackSelection> tracks();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.AssetFilterInner object.
     *
     * @return the inner object.
     */
    AssetFilterInner innerModel();

    /** The entirety of the AssetFilter definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The AssetFilter definition stages. */
    interface DefinitionStages {
        /** The first stage of the AssetFilter definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the AssetFilter definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName, assetName.
             *
             * @param resourceGroupName The name of the resource group within the Azure subscription.
             * @param accountName The Media Services account name.
             * @param assetName The Asset name.
             * @return the next definition stage.
             */
            WithCreate withExistingAsset(String resourceGroupName, String accountName, String assetName);
        }
        /**
         * The stage of the AssetFilter definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPresentationTimeRange,
                DefinitionStages.WithFirstQuality,
                DefinitionStages.WithTracks {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AssetFilter create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AssetFilter create(Context context);
        }
        /** The stage of the AssetFilter definition allowing to specify presentationTimeRange. */
        interface WithPresentationTimeRange {
            /**
             * Specifies the presentationTimeRange property: The presentation time range..
             *
             * @param presentationTimeRange The presentation time range.
             * @return the next definition stage.
             */
            WithCreate withPresentationTimeRange(PresentationTimeRange presentationTimeRange);
        }
        /** The stage of the AssetFilter definition allowing to specify firstQuality. */
        interface WithFirstQuality {
            /**
             * Specifies the firstQuality property: The first quality..
             *
             * @param firstQuality The first quality.
             * @return the next definition stage.
             */
            WithCreate withFirstQuality(FirstQuality firstQuality);
        }
        /** The stage of the AssetFilter definition allowing to specify tracks. */
        interface WithTracks {
            /**
             * Specifies the tracks property: The tracks selection conditions..
             *
             * @param tracks The tracks selection conditions.
             * @return the next definition stage.
             */
            WithCreate withTracks(List<FilterTrackSelection> tracks);
        }
    }
    /**
     * Begins update for the AssetFilter resource.
     *
     * @return the stage of resource update.
     */
    AssetFilter.Update update();

    /** The template for AssetFilter update. */
    interface Update
        extends UpdateStages.WithPresentationTimeRange, UpdateStages.WithFirstQuality, UpdateStages.WithTracks {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AssetFilter apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AssetFilter apply(Context context);
    }
    /** The AssetFilter update stages. */
    interface UpdateStages {
        /** The stage of the AssetFilter update allowing to specify presentationTimeRange. */
        interface WithPresentationTimeRange {
            /**
             * Specifies the presentationTimeRange property: The presentation time range..
             *
             * @param presentationTimeRange The presentation time range.
             * @return the next definition stage.
             */
            Update withPresentationTimeRange(PresentationTimeRange presentationTimeRange);
        }
        /** The stage of the AssetFilter update allowing to specify firstQuality. */
        interface WithFirstQuality {
            /**
             * Specifies the firstQuality property: The first quality..
             *
             * @param firstQuality The first quality.
             * @return the next definition stage.
             */
            Update withFirstQuality(FirstQuality firstQuality);
        }
        /** The stage of the AssetFilter update allowing to specify tracks. */
        interface WithTracks {
            /**
             * Specifies the tracks property: The tracks selection conditions..
             *
             * @param tracks The tracks selection conditions.
             * @return the next definition stage.
             */
            Update withTracks(List<FilterTrackSelection> tracks);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AssetFilter refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AssetFilter refresh(Context context);
}
