/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import org.joda.time.DateTime;
import java.util.UUID;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_07_01.StreamingLocatorContentKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A Streaming Locator resource.
 */
@JsonFlatten
public class StreamingLocatorInner extends ProxyResource {
    /**
     * Asset Name.
     */
    @JsonProperty(value = "properties.assetName", required = true)
    private String assetName;

    /**
     * The creation time of the Streaming Locator.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The start time of the Streaming Locator.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * The end time of the Streaming Locator.
     */
    @JsonProperty(value = "properties.endTime")
    private DateTime endTime;

    /**
     * The StreamingLocatorId of the Streaming Locator.
     */
    @JsonProperty(value = "properties.streamingLocatorId")
    private UUID streamingLocatorId;

    /**
     * Name of the Streaming Policy used by this Streaming Locator. Either
     * specify the name of Streaming Policy you created or use one of the
     * predefined Streaming Policies. The predefined Streaming Policies
     * available are: 'Predefined_DownloadOnly',
     * 'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming',
     * 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and
     * 'Predefined_MultiDrmStreaming'.
     */
    @JsonProperty(value = "properties.streamingPolicyName", required = true)
    private String streamingPolicyName;

    /**
     * Name of the default ContentKeyPolicy used by this Streaming Locator.
     */
    @JsonProperty(value = "properties.defaultContentKeyPolicyName")
    private String defaultContentKeyPolicyName;

    /**
     * The ContentKeys used by this Streaming Locator.
     */
    @JsonProperty(value = "properties.contentKeys")
    private List<StreamingLocatorContentKey> contentKeys;

    /**
     * Alternative Media ID of this Streaming Locator.
     */
    @JsonProperty(value = "properties.alternativeMediaId")
    private String alternativeMediaId;

    /**
     * Get asset Name.
     *
     * @return the assetName value
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Set asset Name.
     *
     * @param assetName the assetName value to set
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * Get the creation time of the Streaming Locator.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the start time of the Streaming Locator.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the start time of the Streaming Locator.
     *
     * @param startTime the startTime value to set
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the end time of the Streaming Locator.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the end time of the Streaming Locator.
     *
     * @param endTime the endTime value to set
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the StreamingLocatorId of the Streaming Locator.
     *
     * @return the streamingLocatorId value
     */
    public UUID streamingLocatorId() {
        return this.streamingLocatorId;
    }

    /**
     * Set the StreamingLocatorId of the Streaming Locator.
     *
     * @param streamingLocatorId the streamingLocatorId value to set
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStreamingLocatorId(UUID streamingLocatorId) {
        this.streamingLocatorId = streamingLocatorId;
        return this;
    }

    /**
     * Get name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and 'Predefined_MultiDrmStreaming'.
     *
     * @return the streamingPolicyName value
     */
    public String streamingPolicyName() {
        return this.streamingPolicyName;
    }

    /**
     * Set name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: 'Predefined_DownloadOnly', 'Predefined_ClearStreamingOnly', 'Predefined_DownloadAndClearStreaming', 'Predefined_ClearKey', 'Predefined_MultiDrmCencStreaming' and 'Predefined_MultiDrmStreaming'.
     *
     * @param streamingPolicyName the streamingPolicyName value to set
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withStreamingPolicyName(String streamingPolicyName) {
        this.streamingPolicyName = streamingPolicyName;
        return this;
    }

    /**
     * Get name of the default ContentKeyPolicy used by this Streaming Locator.
     *
     * @return the defaultContentKeyPolicyName value
     */
    public String defaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
    }

    /**
     * Set name of the default ContentKeyPolicy used by this Streaming Locator.
     *
     * @param defaultContentKeyPolicyName the defaultContentKeyPolicyName value to set
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withDefaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
        this.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
        return this;
    }

    /**
     * Get the ContentKeys used by this Streaming Locator.
     *
     * @return the contentKeys value
     */
    public List<StreamingLocatorContentKey> contentKeys() {
        return this.contentKeys;
    }

    /**
     * Set the ContentKeys used by this Streaming Locator.
     *
     * @param contentKeys the contentKeys value to set
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withContentKeys(List<StreamingLocatorContentKey> contentKeys) {
        this.contentKeys = contentKeys;
        return this;
    }

    /**
     * Get alternative Media ID of this Streaming Locator.
     *
     * @return the alternativeMediaId value
     */
    public String alternativeMediaId() {
        return this.alternativeMediaId;
    }

    /**
     * Set alternative Media ID of this Streaming Locator.
     *
     * @param alternativeMediaId the alternativeMediaId value to set
     * @return the StreamingLocatorInner object itself.
     */
    public StreamingLocatorInner withAlternativeMediaId(String alternativeMediaId) {
        this.alternativeMediaId = alternativeMediaId;
        return this;
    }

}
