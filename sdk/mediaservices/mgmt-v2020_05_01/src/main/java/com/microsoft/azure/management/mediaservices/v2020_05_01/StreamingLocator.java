/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.StreamingLocatorInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.mediaservices.v2020_05_01.implementation.MediaManager;
import org.joda.time.DateTime;
import java.util.UUID;
import java.util.List;

/**
 * Type representing StreamingLocator.
 */
public interface StreamingLocator extends HasInner<StreamingLocatorInner>, Indexable, Refreshable<StreamingLocator>, Updatable<StreamingLocator.Update>, HasManager<MediaManager> {
    /**
     * @return the alternativeMediaId value.
     */
    String alternativeMediaId();

    /**
     * @return the assetName value.
     */
    String assetName();

    /**
     * @return the contentKeys value.
     */
    List<StreamingLocatorContentKey> contentKeys();

    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the defaultContentKeyPolicyName value.
     */
    String defaultContentKeyPolicyName();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the filters value.
     */
    List<String> filters();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the streamingLocatorId value.
     */
    UUID streamingLocatorId();

    /**
     * @return the streamingPolicyName value.
     */
    String streamingPolicyName();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StreamingLocator definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMediaservice, DefinitionStages.WithAssetName, DefinitionStages.WithStreamingPolicyName, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StreamingLocator definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StreamingLocator definition.
         */
        interface Blank extends WithMediaservice {
        }

        /**
         * The stage of the streaminglocator definition allowing to specify Mediaservice.
         */
        interface WithMediaservice {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group within the Azure subscription
            * @param accountName The Media Services account name
            * @return the next definition stage
            */
            WithAssetName withExistingMediaservice(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify AssetName.
         */
        interface WithAssetName {
           /**
            * Specifies assetName.
            * @param assetName Asset Name
            * @return the next definition stage
            */
            WithStreamingPolicyName withAssetName(String assetName);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify StreamingPolicyName.
         */
        interface WithStreamingPolicyName {
           /**
            * Specifies streamingPolicyName.
            * @param streamingPolicyName Name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and 'Predefined_MultiDrmStreaming'
            * @return the next definition stage
            */
            WithCreate withStreamingPolicyName(String streamingPolicyName);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify AlternativeMediaId.
         */
        interface WithAlternativeMediaId {
            /**
             * Specifies alternativeMediaId.
             * @param alternativeMediaId Alternative Media ID of this Streaming Locator
             * @return the next definition stage
             */
            WithCreate withAlternativeMediaId(String alternativeMediaId);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify ContentKeys.
         */
        interface WithContentKeys {
            /**
             * Specifies contentKeys.
             * @param contentKeys The ContentKeys used by this Streaming Locator
             * @return the next definition stage
             */
            WithCreate withContentKeys(List<StreamingLocatorContentKey> contentKeys);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify DefaultContentKeyPolicyName.
         */
        interface WithDefaultContentKeyPolicyName {
            /**
             * Specifies defaultContentKeyPolicyName.
             * @param defaultContentKeyPolicyName Name of the default ContentKeyPolicy used by this Streaming Locator
             * @return the next definition stage
             */
            WithCreate withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify EndTime.
         */
        interface WithEndTime {
            /**
             * Specifies endTime.
             * @param endTime The end time of the Streaming Locator
             * @return the next definition stage
             */
            WithCreate withEndTime(DateTime endTime);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify Filters.
         */
        interface WithFilters {
            /**
             * Specifies filters.
             * @param filters A list of asset or account filters which apply to this streaming locator
             * @return the next definition stage
             */
            WithCreate withFilters(List<String> filters);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify StartTime.
         */
        interface WithStartTime {
            /**
             * Specifies startTime.
             * @param startTime The start time of the Streaming Locator
             * @return the next definition stage
             */
            WithCreate withStartTime(DateTime startTime);
        }

        /**
         * The stage of the streaminglocator definition allowing to specify StreamingLocatorId.
         */
        interface WithStreamingLocatorId {
            /**
             * Specifies streamingLocatorId.
             * @param streamingLocatorId The StreamingLocatorId of the Streaming Locator
             * @return the next definition stage
             */
            WithCreate withStreamingLocatorId(UUID streamingLocatorId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StreamingLocator>, DefinitionStages.WithAlternativeMediaId, DefinitionStages.WithContentKeys, DefinitionStages.WithDefaultContentKeyPolicyName, DefinitionStages.WithEndTime, DefinitionStages.WithFilters, DefinitionStages.WithStartTime, DefinitionStages.WithStreamingLocatorId {
        }
    }
    /**
     * The template for a StreamingLocator update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StreamingLocator>, UpdateStages.WithAlternativeMediaId, UpdateStages.WithContentKeys, UpdateStages.WithDefaultContentKeyPolicyName, UpdateStages.WithEndTime, UpdateStages.WithFilters, UpdateStages.WithStartTime, UpdateStages.WithStreamingLocatorId {
    }

    /**
     * Grouping of StreamingLocator update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the streaminglocator update allowing to specify AlternativeMediaId.
         */
        interface WithAlternativeMediaId {
            /**
             * Specifies alternativeMediaId.
             * @param alternativeMediaId Alternative Media ID of this Streaming Locator
             * @return the next update stage
             */
            Update withAlternativeMediaId(String alternativeMediaId);
        }

        /**
         * The stage of the streaminglocator update allowing to specify ContentKeys.
         */
        interface WithContentKeys {
            /**
             * Specifies contentKeys.
             * @param contentKeys The ContentKeys used by this Streaming Locator
             * @return the next update stage
             */
            Update withContentKeys(List<StreamingLocatorContentKey> contentKeys);
        }

        /**
         * The stage of the streaminglocator update allowing to specify DefaultContentKeyPolicyName.
         */
        interface WithDefaultContentKeyPolicyName {
            /**
             * Specifies defaultContentKeyPolicyName.
             * @param defaultContentKeyPolicyName Name of the default ContentKeyPolicy used by this Streaming Locator
             * @return the next update stage
             */
            Update withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName);
        }

        /**
         * The stage of the streaminglocator update allowing to specify EndTime.
         */
        interface WithEndTime {
            /**
             * Specifies endTime.
             * @param endTime The end time of the Streaming Locator
             * @return the next update stage
             */
            Update withEndTime(DateTime endTime);
        }

        /**
         * The stage of the streaminglocator update allowing to specify Filters.
         */
        interface WithFilters {
            /**
             * Specifies filters.
             * @param filters A list of asset or account filters which apply to this streaming locator
             * @return the next update stage
             */
            Update withFilters(List<String> filters);
        }

        /**
         * The stage of the streaminglocator update allowing to specify StartTime.
         */
        interface WithStartTime {
            /**
             * Specifies startTime.
             * @param startTime The start time of the Streaming Locator
             * @return the next update stage
             */
            Update withStartTime(DateTime startTime);
        }

        /**
         * The stage of the streaminglocator update allowing to specify StreamingLocatorId.
         */
        interface WithStreamingLocatorId {
            /**
             * Specifies streamingLocatorId.
             * @param streamingLocatorId The StreamingLocatorId of the Streaming Locator
             * @return the next update stage
             */
            Update withStreamingLocatorId(UUID streamingLocatorId);
        }

    }
}
