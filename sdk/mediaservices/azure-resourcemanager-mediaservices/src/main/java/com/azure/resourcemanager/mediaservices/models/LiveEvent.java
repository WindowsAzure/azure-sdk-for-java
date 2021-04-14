// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.LiveEventInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of LiveEvent. */
public interface LiveEvent {
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
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: A description for the live event.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the input property: Live event input settings. It defines how the live event receives input from a
     * contribution encoder.
     *
     * @return the input value.
     */
    LiveEventInput input();

    /**
     * Gets the preview property: Live event preview settings. Preview allows live event producers to preview the live
     * streaming content without creating any live output.
     *
     * @return the preview value.
     */
    LiveEventPreview preview();

    /**
     * Gets the encoding property: Encoding settings for the live event. It configures whether a live encoder is used
     * for the live event and settings for the live encoder if it is used.
     *
     * @return the encoding value.
     */
    LiveEventEncoding encoding();

    /**
     * Gets the transcriptions property: Live transcription settings for the live event. See
     * https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     *
     * @return the transcriptions value.
     */
    List<LiveEventTranscription> transcriptions();

    /**
     * Gets the provisioningState property: The provisioning state of the live event.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the resourceState property: The resource state of the live event. See
     * https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     *
     * @return the resourceState value.
     */
    LiveEventResourceState resourceState();

    /**
     * Gets the crossSiteAccessPolicies property: Live event cross site access policies.
     *
     * @return the crossSiteAccessPolicies value.
     */
    CrossSiteAccessPolicies crossSiteAccessPolicies();

    /**
     * Gets the useStaticHostname property: Specifies whether a static hostname would be assigned to the live event
     * preview and ingest endpoints. This value can only be updated if the live event is in Standby state.
     *
     * @return the useStaticHostname value.
     */
    Boolean useStaticHostname();

    /**
     * Gets the hostnamePrefix property: When useStaticHostname is set to true, the hostnamePrefix specifies the first
     * part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a
     * combination of this prefix, the media service account name and a short code for the Azure Media Services data
     * center.
     *
     * @return the hostnamePrefix value.
     */
    String hostnamePrefix();

    /**
     * Gets the streamOptions property: The options to use for the LiveEvent. This value is specified at creation time
     * and cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
     *
     * @return the streamOptions value.
     */
    List<StreamOptionsFlag> streamOptions();

    /**
     * Gets the created property: The creation time for the live event.
     *
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the lastModified property: The last modified time of the live event.
     *
     * @return the lastModified value.
     */
    OffsetDateTime lastModified();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.mediaservices.fluent.models.LiveEventInner object.
     *
     * @return the inner object.
     */
    LiveEventInner innerModel();

    /** The entirety of the LiveEvent definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The LiveEvent definition stages. */
    interface DefinitionStages {
        /** The first stage of the LiveEvent definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the LiveEvent definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the LiveEvent definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, accountName.
             *
             * @param resourceGroupName The name of the resource group within the Azure subscription.
             * @param accountName The Media Services account name.
             * @return the next definition stage.
             */
            WithCreate withExistingMediaservice(String resourceGroupName, String accountName);
        }
        /**
         * The stage of the LiveEvent definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDescription,
                DefinitionStages.WithInput,
                DefinitionStages.WithPreview,
                DefinitionStages.WithEncoding,
                DefinitionStages.WithTranscriptions,
                DefinitionStages.WithCrossSiteAccessPolicies,
                DefinitionStages.WithUseStaticHostname,
                DefinitionStages.WithHostnamePrefix,
                DefinitionStages.WithStreamOptions,
                DefinitionStages.WithAutoStart {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LiveEvent create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LiveEvent create(Context context);
        }
        /** The stage of the LiveEvent definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the LiveEvent definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description for the live event..
             *
             * @param description A description for the live event.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the LiveEvent definition allowing to specify input. */
        interface WithInput {
            /**
             * Specifies the input property: Live event input settings. It defines how the live event receives input
             * from a contribution encoder..
             *
             * @param input Live event input settings. It defines how the live event receives input from a contribution
             *     encoder.
             * @return the next definition stage.
             */
            WithCreate withInput(LiveEventInput input);
        }
        /** The stage of the LiveEvent definition allowing to specify preview. */
        interface WithPreview {
            /**
             * Specifies the preview property: Live event preview settings. Preview allows live event producers to
             * preview the live streaming content without creating any live output..
             *
             * @param preview Live event preview settings. Preview allows live event producers to preview the live
             *     streaming content without creating any live output.
             * @return the next definition stage.
             */
            WithCreate withPreview(LiveEventPreview preview);
        }
        /** The stage of the LiveEvent definition allowing to specify encoding. */
        interface WithEncoding {
            /**
             * Specifies the encoding property: Encoding settings for the live event. It configures whether a live
             * encoder is used for the live event and settings for the live encoder if it is used..
             *
             * @param encoding Encoding settings for the live event. It configures whether a live encoder is used for
             *     the live event and settings for the live encoder if it is used.
             * @return the next definition stage.
             */
            WithCreate withEncoding(LiveEventEncoding encoding);
        }
        /** The stage of the LiveEvent definition allowing to specify transcriptions. */
        interface WithTranscriptions {
            /**
             * Specifies the transcriptions property: Live transcription settings for the live event. See
             * https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription
             * feature..
             *
             * @param transcriptions Live transcription settings for the live event. See
             *     https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription
             *     feature.
             * @return the next definition stage.
             */
            WithCreate withTranscriptions(List<LiveEventTranscription> transcriptions);
        }
        /** The stage of the LiveEvent definition allowing to specify crossSiteAccessPolicies. */
        interface WithCrossSiteAccessPolicies {
            /**
             * Specifies the crossSiteAccessPolicies property: Live event cross site access policies..
             *
             * @param crossSiteAccessPolicies Live event cross site access policies.
             * @return the next definition stage.
             */
            WithCreate withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies);
        }
        /** The stage of the LiveEvent definition allowing to specify useStaticHostname. */
        interface WithUseStaticHostname {
            /**
             * Specifies the useStaticHostname property: Specifies whether a static hostname would be assigned to the
             * live event preview and ingest endpoints. This value can only be updated if the live event is in Standby
             * state.
             *
             * @param useStaticHostname Specifies whether a static hostname would be assigned to the live event preview
             *     and ingest endpoints. This value can only be updated if the live event is in Standby state.
             * @return the next definition stage.
             */
            WithCreate withUseStaticHostname(Boolean useStaticHostname);
        }
        /** The stage of the LiveEvent definition allowing to specify hostnamePrefix. */
        interface WithHostnamePrefix {
            /**
             * Specifies the hostnamePrefix property: When useStaticHostname is set to true, the hostnamePrefix
             * specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The
             * final hostname would be a combination of this prefix, the media service account name and a short code for
             * the Azure Media Services data center..
             *
             * @param hostnamePrefix When useStaticHostname is set to true, the hostnamePrefix specifies the first part
             *     of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be
             *     a combination of this prefix, the media service account name and a short code for the Azure Media
             *     Services data center.
             * @return the next definition stage.
             */
            WithCreate withHostnamePrefix(String hostnamePrefix);
        }
        /** The stage of the LiveEvent definition allowing to specify streamOptions. */
        interface WithStreamOptions {
            /**
             * Specifies the streamOptions property: The options to use for the LiveEvent. This value is specified at
             * creation time and cannot be updated. The valid values for the array entry values are 'Default' and
             * 'LowLatency'..
             *
             * @param streamOptions The options to use for the LiveEvent. This value is specified at creation time and
             *     cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
             * @return the next definition stage.
             */
            WithCreate withStreamOptions(List<StreamOptionsFlag> streamOptions);
        }
        /** The stage of the LiveEvent definition allowing to specify autoStart. */
        interface WithAutoStart {
            /**
             * Specifies the autoStart property: The flag indicates if the resource should be automatically started on
             * creation..
             *
             * @param autoStart The flag indicates if the resource should be automatically started on creation.
             * @return the next definition stage.
             */
            WithCreate withAutoStart(Boolean autoStart);
        }
    }
    /**
     * Begins update for the LiveEvent resource.
     *
     * @return the stage of resource update.
     */
    LiveEvent.Update update();

    /** The template for LiveEvent update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDescription,
            UpdateStages.WithInput,
            UpdateStages.WithPreview,
            UpdateStages.WithEncoding,
            UpdateStages.WithTranscriptions,
            UpdateStages.WithCrossSiteAccessPolicies,
            UpdateStages.WithUseStaticHostname,
            UpdateStages.WithHostnamePrefix,
            UpdateStages.WithStreamOptions {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        LiveEvent apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LiveEvent apply(Context context);
    }
    /** The LiveEvent update stages. */
    interface UpdateStages {
        /** The stage of the LiveEvent update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the LiveEvent update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: A description for the live event..
             *
             * @param description A description for the live event.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the LiveEvent update allowing to specify input. */
        interface WithInput {
            /**
             * Specifies the input property: Live event input settings. It defines how the live event receives input
             * from a contribution encoder..
             *
             * @param input Live event input settings. It defines how the live event receives input from a contribution
             *     encoder.
             * @return the next definition stage.
             */
            Update withInput(LiveEventInput input);
        }
        /** The stage of the LiveEvent update allowing to specify preview. */
        interface WithPreview {
            /**
             * Specifies the preview property: Live event preview settings. Preview allows live event producers to
             * preview the live streaming content without creating any live output..
             *
             * @param preview Live event preview settings. Preview allows live event producers to preview the live
             *     streaming content without creating any live output.
             * @return the next definition stage.
             */
            Update withPreview(LiveEventPreview preview);
        }
        /** The stage of the LiveEvent update allowing to specify encoding. */
        interface WithEncoding {
            /**
             * Specifies the encoding property: Encoding settings for the live event. It configures whether a live
             * encoder is used for the live event and settings for the live encoder if it is used..
             *
             * @param encoding Encoding settings for the live event. It configures whether a live encoder is used for
             *     the live event and settings for the live encoder if it is used.
             * @return the next definition stage.
             */
            Update withEncoding(LiveEventEncoding encoding);
        }
        /** The stage of the LiveEvent update allowing to specify transcriptions. */
        interface WithTranscriptions {
            /**
             * Specifies the transcriptions property: Live transcription settings for the live event. See
             * https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription
             * feature..
             *
             * @param transcriptions Live transcription settings for the live event. See
             *     https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription
             *     feature.
             * @return the next definition stage.
             */
            Update withTranscriptions(List<LiveEventTranscription> transcriptions);
        }
        /** The stage of the LiveEvent update allowing to specify crossSiteAccessPolicies. */
        interface WithCrossSiteAccessPolicies {
            /**
             * Specifies the crossSiteAccessPolicies property: Live event cross site access policies..
             *
             * @param crossSiteAccessPolicies Live event cross site access policies.
             * @return the next definition stage.
             */
            Update withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies);
        }
        /** The stage of the LiveEvent update allowing to specify useStaticHostname. */
        interface WithUseStaticHostname {
            /**
             * Specifies the useStaticHostname property: Specifies whether a static hostname would be assigned to the
             * live event preview and ingest endpoints. This value can only be updated if the live event is in Standby
             * state.
             *
             * @param useStaticHostname Specifies whether a static hostname would be assigned to the live event preview
             *     and ingest endpoints. This value can only be updated if the live event is in Standby state.
             * @return the next definition stage.
             */
            Update withUseStaticHostname(Boolean useStaticHostname);
        }
        /** The stage of the LiveEvent update allowing to specify hostnamePrefix. */
        interface WithHostnamePrefix {
            /**
             * Specifies the hostnamePrefix property: When useStaticHostname is set to true, the hostnamePrefix
             * specifies the first part of the hostname assigned to the live event preview and ingest endpoints. The
             * final hostname would be a combination of this prefix, the media service account name and a short code for
             * the Azure Media Services data center..
             *
             * @param hostnamePrefix When useStaticHostname is set to true, the hostnamePrefix specifies the first part
             *     of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be
             *     a combination of this prefix, the media service account name and a short code for the Azure Media
             *     Services data center.
             * @return the next definition stage.
             */
            Update withHostnamePrefix(String hostnamePrefix);
        }
        /** The stage of the LiveEvent update allowing to specify streamOptions. */
        interface WithStreamOptions {
            /**
             * Specifies the streamOptions property: The options to use for the LiveEvent. This value is specified at
             * creation time and cannot be updated. The valid values for the array entry values are 'Default' and
             * 'LowLatency'..
             *
             * @param streamOptions The options to use for the LiveEvent. This value is specified at creation time and
             *     cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
             * @return the next definition stage.
             */
            Update withStreamOptions(List<StreamOptionsFlag> streamOptions);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LiveEvent refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LiveEvent refresh(Context context);

    /**
     * A live event is in StandBy state after allocation completes, and is ready to start.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void allocate();

    /**
     * A live event is in StandBy state after allocation completes, and is ready to start.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void allocate(Context context);

    /**
     * A live event in Stopped or StandBy state will be in Running state after the start operation completes.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start();

    /**
     * A live event in Stopped or StandBy state will be in Running state after the start operation completes.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(Context context);

    /**
     * Stops a running live event.
     *
     * @param parameters LiveEvent stop parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(LiveEventActionInput parameters);

    /**
     * Stops a running live event.
     *
     * @param parameters LiveEvent stop parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(LiveEventActionInput parameters, Context context);

    /**
     * Resets an existing live event. All live outputs for the live event are deleted and the live event is stopped and
     * will be started again. All assets used by the live outputs and streaming locators created on these assets are
     * unaffected.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reset();

    /**
     * Resets an existing live event. All live outputs for the live event are deleted and the live event is stopped and
     * will be started again. All assets used by the live outputs and streaming locators created on these assets are
     * unaffected.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reset(Context context);
}
