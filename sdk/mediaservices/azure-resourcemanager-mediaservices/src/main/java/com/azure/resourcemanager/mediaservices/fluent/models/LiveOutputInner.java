// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.models.Hls;
import com.azure.resourcemanager.mediaservices.models.LiveOutputResourceState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** The Live Output. */
@JsonFlatten
@Fluent
public class LiveOutputInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LiveOutputInner.class);

    /*
     * The description of the live output.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The asset that the live output will write to.
     */
    @JsonProperty(value = "properties.assetName")
    private String assetName;

    /*
     * ISO 8601 time between 1 minute to 25 hours to indicate the maximum
     * content length that can be archived in the asset for this live output.
     * This also sets the maximum content length for the rewind window. For
     * example, use PT1H30M to indicate 1 hour and 30 minutes of archive
     * window.
     */
    @JsonProperty(value = "properties.archiveWindowLength")
    private Duration archiveWindowLength;

    /*
     * The manifest file name. If not provided, the service will generate one
     * automatically.
     */
    @JsonProperty(value = "properties.manifestName")
    private String manifestName;

    /*
     * HTTP Live Streaming (HLS) packing setting for the live output.
     */
    @JsonProperty(value = "properties.hls")
    private Hls hls;

    /*
     * The initial timestamp that the live output will start at, any content
     * before this value will not be archived.
     */
    @JsonProperty(value = "properties.outputSnapTime")
    private Long outputSnapTime;

    /*
     * The creation time the live output.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The time the live output was last modified.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The provisioning state of the live output.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The resource state of the live output.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private LiveOutputResourceState resourceState;

    /**
     * Get the description property: The description of the live output.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the live output.
     *
     * @param description the description value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the assetName property: The asset that the live output will write to.
     *
     * @return the assetName value.
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Set the assetName property: The asset that the live output will write to.
     *
     * @param assetName the assetName value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * Get the archiveWindowLength property: ISO 8601 time between 1 minute to 25 hours to indicate the maximum content
     * length that can be archived in the asset for this live output. This also sets the maximum content length for the
     * rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     *
     * @return the archiveWindowLength value.
     */
    public Duration archiveWindowLength() {
        return this.archiveWindowLength;
    }

    /**
     * Set the archiveWindowLength property: ISO 8601 time between 1 minute to 25 hours to indicate the maximum content
     * length that can be archived in the asset for this live output. This also sets the maximum content length for the
     * rewind window. For example, use PT1H30M to indicate 1 hour and 30 minutes of archive window.
     *
     * @param archiveWindowLength the archiveWindowLength value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withArchiveWindowLength(Duration archiveWindowLength) {
        this.archiveWindowLength = archiveWindowLength;
        return this;
    }

    /**
     * Get the manifestName property: The manifest file name. If not provided, the service will generate one
     * automatically.
     *
     * @return the manifestName value.
     */
    public String manifestName() {
        return this.manifestName;
    }

    /**
     * Set the manifestName property: The manifest file name. If not provided, the service will generate one
     * automatically.
     *
     * @param manifestName the manifestName value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }

    /**
     * Get the hls property: HTTP Live Streaming (HLS) packing setting for the live output.
     *
     * @return the hls value.
     */
    public Hls hls() {
        return this.hls;
    }

    /**
     * Set the hls property: HTTP Live Streaming (HLS) packing setting for the live output.
     *
     * @param hls the hls value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withHls(Hls hls) {
        this.hls = hls;
        return this;
    }

    /**
     * Get the outputSnapTime property: The initial timestamp that the live output will start at, any content before
     * this value will not be archived.
     *
     * @return the outputSnapTime value.
     */
    public Long outputSnapTime() {
        return this.outputSnapTime;
    }

    /**
     * Set the outputSnapTime property: The initial timestamp that the live output will start at, any content before
     * this value will not be archived.
     *
     * @param outputSnapTime the outputSnapTime value to set.
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withOutputSnapTime(Long outputSnapTime) {
        this.outputSnapTime = outputSnapTime;
        return this;
    }

    /**
     * Get the created property: The creation time the live output.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified property: The time the live output was last modified.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the provisioningState property: The provisioning state of the live output.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceState property: The resource state of the live output.
     *
     * @return the resourceState value.
     */
    public LiveOutputResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hls() != null) {
            hls().validate();
        }
    }
}
