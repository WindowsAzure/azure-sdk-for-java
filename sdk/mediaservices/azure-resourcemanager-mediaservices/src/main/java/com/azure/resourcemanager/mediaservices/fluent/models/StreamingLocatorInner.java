// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.models.StreamingLocatorContentKey;
import com.azure.resourcemanager.mediaservices.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** A Streaming Locator resource. */
@JsonFlatten
@Fluent
public class StreamingLocatorInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StreamingLocatorInner.class);

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Asset Name
     */
    @JsonProperty(value = "properties.assetName")
    private String assetName;

    /*
     * The creation time of the Streaming Locator.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The start time of the Streaming Locator.
     */
    @JsonProperty(value = "properties.startTime")
    private OffsetDateTime startTime;

    /*
     * The end time of the Streaming Locator.
     */
    @JsonProperty(value = "properties.endTime")
    private OffsetDateTime endTime;

    /*
     * The StreamingLocatorId of the Streaming Locator.
     */
    @JsonProperty(value = "properties.streamingLocatorId")
    private UUID streamingLocatorId;

    /*
     * Name of the Streaming Policy used by this Streaming Locator. Either
     * specify the name of Streaming Policy you created or use one of the
     * predefined Streaming Policies. The predefined Streaming Policies
     * available are: 'Predefined_DownloadOnly',
     * 'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming',
     * 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and
     * 'Predefined_MultiDrmStreaming'
     */
    @JsonProperty(value = "properties.streamingPolicyName")
    private String streamingPolicyName;

    /*
     * Name of the default ContentKeyPolicy used by this Streaming Locator.
     */
    @JsonProperty(value = "properties.defaultContentKeyPolicyName")
    private String defaultContentKeyPolicyName;

    /*
     * The ContentKeys used by this Streaming Locator.
     */
    @JsonProperty(value = "properties.contentKeys")
    private List<StreamingLocatorContentKey> contentKeys;

    /*
     * Alternative Media ID of this Streaming Locator
     */
    @JsonProperty(value = "properties.alternativeMediaId")
    private String alternativeMediaId;

    /*
     * A list of asset or account filters which apply to this streaming locator
     */
    @JsonProperty(value = "properties.filters")
    private List<String> filters;

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the assetName property: Asset Name.
     *
     * @return the assetName value.
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Set the assetName property: Asset Name.
     *
     * @param assetName the assetName value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * Get the created property: The creation time of the Streaming Locator.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the startTime property: The start time of the Streaming Locator.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start time of the Streaming Locator.
     *
     * @param startTime the startTime value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The end time of the Streaming Locator.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end time of the Streaming Locator.
     *
     * @param endTime the endTime value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the streamingLocatorId property: The StreamingLocatorId of the Streaming Locator.
     *
     * @return the streamingLocatorId value.
     */
    public UUID streamingLocatorId() {
        return this.streamingLocatorId;
    }

    /**
     * Set the streamingLocatorId property: The StreamingLocatorId of the Streaming Locator.
     *
     * @param streamingLocatorId the streamingLocatorId value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStreamingLocatorId(UUID streamingLocatorId) {
        this.streamingLocatorId = streamingLocatorId;
        return this;
    }

    /**
     * Get the streamingPolicyName property: Name of the Streaming Policy used by this Streaming Locator. Either specify
     * the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined
     * Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly',
     * 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and
     * 'Predefined_MultiDrmStreaming'.
     *
     * @return the streamingPolicyName value.
     */
    public String streamingPolicyName() {
        return this.streamingPolicyName;
    }

    /**
     * Set the streamingPolicyName property: Name of the Streaming Policy used by this Streaming Locator. Either specify
     * the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined
     * Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly',
     * 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and
     * 'Predefined_MultiDrmStreaming'.
     *
     * @param streamingPolicyName the streamingPolicyName value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStreamingPolicyName(String streamingPolicyName) {
        this.streamingPolicyName = streamingPolicyName;
        return this;
    }

    /**
     * Get the defaultContentKeyPolicyName property: Name of the default ContentKeyPolicy used by this Streaming
     * Locator.
     *
     * @return the defaultContentKeyPolicyName value.
     */
    public String defaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
    }

    /**
     * Set the defaultContentKeyPolicyName property: Name of the default ContentKeyPolicy used by this Streaming
     * Locator.
     *
     * @param defaultContentKeyPolicyName the defaultContentKeyPolicyName value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        return this;
    }

    /**
     * Get the contentKeys property: The ContentKeys used by this Streaming Locator.
     *
     * @return the contentKeys value.
     */
    public List<StreamingLocatorContentKey> contentKeys() {
        return this.contentKeys;
    }

    /**
     * Set the contentKeys property: The ContentKeys used by this Streaming Locator.
     *
     * @param contentKeys the contentKeys value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withContentKeys(List<StreamingLocatorContentKey> contentKeys) {
        this.contentKeys = contentKeys;
        return this;
    }

    /**
     * Get the alternativeMediaId property: Alternative Media ID of this Streaming Locator.
     *
     * @return the alternativeMediaId value.
     */
    public String alternativeMediaId() {
        return this.alternativeMediaId;
    }

    /**
     * Set the alternativeMediaId property: Alternative Media ID of this Streaming Locator.
     *
     * @param alternativeMediaId the alternativeMediaId value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withAlternativeMediaId(String alternativeMediaId) {
        this.alternativeMediaId = alternativeMediaId;
        return this;
    }

    /**
     * Get the filters property: A list of asset or account filters which apply to this streaming locator.
     *
     * @return the filters value.
     */
    public List<String> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: A list of asset or account filters which apply to this streaming locator.
     *
     * @param filters the filters value to set.
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withFilters(List<String> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemData() != null) {
            systemData().validate();
        }
        if (contentKeys() != null) {
            contentKeys().forEach(e -> e.validate());
        }
    }
}
