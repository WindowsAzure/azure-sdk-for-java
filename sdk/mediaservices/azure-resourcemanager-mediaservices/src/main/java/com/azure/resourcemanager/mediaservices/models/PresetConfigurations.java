// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An object of optional configuration settings for encoder. */
@Fluent
public final class PresetConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PresetConfigurations.class);

    /*
     * Allows you to configure the encoder settings to control the balance
     * between speed and quality. Example: set Complexity as Speed for faster
     * encoding but less compression efficiency.
     */
    @JsonProperty(value = "complexity")
    private Complexity complexity;

    /*
     * Sets the interleave mode of the output to control how audio and video
     * are stored in the container format. Example: set InterleavedOutput as
     * NonInterleavedOutput to produce audio-only and video-only outputs in
     * separate MP4 files.
     */
    @JsonProperty(value = "interleaveOutput")
    private InterleaveOutput interleaveOutput;

    /*
     * The key frame interval in seconds. Example: set
     * KeyFrameIntervalInSeconds as 2 to reduce the playback buffering for some
     * players.
     */
    @JsonProperty(value = "keyFrameIntervalInSeconds")
    private Float keyFrameIntervalInSeconds;

    /*
     * The maximum bitrate in bits per second (threshold for the top video
     * layer). Example: set MaxBitrateBps as 6000000 to avoid producing very
     * high bitrate outputs for contents with high complexity.
     */
    @JsonProperty(value = "maxBitrateBps")
    private Integer maxBitrateBps;

    /*
     * The maximum height of output video layers. Example: set MaxHeight as 720
     * to produce output layers up to 720P even if the input is 4K.
     */
    @JsonProperty(value = "maxHeight")
    private Integer maxHeight;

    /*
     * The maximum number of output video layers. Example: set MaxLayers as 4
     * to make sure at most 4 output layers are produced to control the overall
     * cost of the encoding job.
     */
    @JsonProperty(value = "maxLayers")
    private Integer maxLayers;

    /*
     * The minimum bitrate in bits per second (threshold for the bottom video
     * layer). Example: set MinBitrateBps as 200000 to have a bottom layer that
     * covers users with low network bandwidth.
     */
    @JsonProperty(value = "minBitrateBps")
    private Integer minBitrateBps;

    /*
     * The minimum height of output video layers. Example: set MinHeight as 360
     * to avoid output layers of smaller resolutions like 180P.
     */
    @JsonProperty(value = "minHeight")
    private Integer minHeight;

    /**
     * Get the complexity property: Allows you to configure the encoder settings to control the balance between speed
     * and quality. Example: set Complexity as Speed for faster encoding but less compression efficiency.
     *
     * @return the complexity value.
     */
    public Complexity complexity() {
        return this.complexity;
    }

    /**
     * Set the complexity property: Allows you to configure the encoder settings to control the balance between speed
     * and quality. Example: set Complexity as Speed for faster encoding but less compression efficiency.
     *
     * @param complexity the complexity value to set.
     * @return the PresetConfigurations object itself.
     */
    public PresetConfigurations withComplexity(Complexity complexity) {
        this.complexity = complexity;
        return this;
    }

    /**
     * Get the interleaveOutput property: Sets the interleave mode of the output to control how audio and video are
     * stored in the container format. Example: set InterleavedOutput as NonInterleavedOutput to produce audio-only and
     * video-only outputs in separate MP4 files.
     *
     * @return the interleaveOutput value.
     */
    public InterleaveOutput interleaveOutput() {
        return this.interleaveOutput;
    }

    /**
     * Set the interleaveOutput property: Sets the interleave mode of the output to control how audio and video are
     * stored in the container format. Example: set InterleavedOutput as NonInterleavedOutput to produce audio-only and
     * video-only outputs in separate MP4 files.
     *
     * @param interleaveOutput the interleaveOutput value to set.
     * @return the PresetConfigurations object itself.
     */
    public PresetConfigurations withInterleaveOutput(InterleaveOutput interleaveOutput) {
        this.interleaveOutput = interleaveOutput;
        return this;
    }

    /**
     * Get the keyFrameIntervalInSeconds property: The key frame interval in seconds. Example: set
     * KeyFrameIntervalInSeconds as 2 to reduce the playback buffering for some players.
     *
     * @return the keyFrameIntervalInSeconds value.
     */
    public Float keyFrameIntervalInSeconds() {
        return this.keyFrameIntervalInSeconds;
    }

    /**
     * Set the keyFrameIntervalInSeconds property: The key frame interval in seconds. Example: set
     * KeyFrameIntervalInSeconds as 2 to reduce the playback buffering for some players.
     *
     * @param keyFrameIntervalInSeconds the keyFrameIntervalInSeconds value to set.
     * @return the PresetConfigurations object itself.
     */
    public PresetConfigurations withKeyFrameIntervalInSeconds(Float keyFrameIntervalInSeconds) {
        this.keyFrameIntervalInSeconds = keyFrameIntervalInSeconds;
        return this;
    }

    /**
     * Get the maxBitrateBps property: The maximum bitrate in bits per second (threshold for the top video layer).
     * Example: set MaxBitrateBps as 6000000 to avoid producing very high bitrate outputs for contents with high
     * complexity.
     *
     * @return the maxBitrateBps value.
     */
    public Integer maxBitrateBps() {
        return this.maxBitrateBps;
    }

    /**
     * Set the maxBitrateBps property: The maximum bitrate in bits per second (threshold for the top video layer).
     * Example: set MaxBitrateBps as 6000000 to avoid producing very high bitrate outputs for contents with high
     * complexity.
     *
     * @param maxBitrateBps the maxBitrateBps value to set.
     * @return the PresetConfigurations object itself.
     */
    public PresetConfigurations withMaxBitrateBps(Integer maxBitrateBps) {
        this.maxBitrateBps = maxBitrateBps;
        return this;
    }

    /**
     * Get the maxHeight property: The maximum height of output video layers. Example: set MaxHeight as 720 to produce
     * output layers up to 720P even if the input is 4K.
     *
     * @return the maxHeight value.
     */
    public Integer maxHeight() {
        return this.maxHeight;
    }

    /**
     * Set the maxHeight property: The maximum height of output video layers. Example: set MaxHeight as 720 to produce
     * output layers up to 720P even if the input is 4K.
     *
     * @param maxHeight the maxHeight value to set.
     * @return the PresetConfigurations object itself.
     */
    public PresetConfigurations withMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return this;
    }

    /**
     * Get the maxLayers property: The maximum number of output video layers. Example: set MaxLayers as 4 to make sure
     * at most 4 output layers are produced to control the overall cost of the encoding job.
     *
     * @return the maxLayers value.
     */
    public Integer maxLayers() {
        return this.maxLayers;
    }

    /**
     * Set the maxLayers property: The maximum number of output video layers. Example: set MaxLayers as 4 to make sure
     * at most 4 output layers are produced to control the overall cost of the encoding job.
     *
     * @param maxLayers the maxLayers value to set.
     * @return the PresetConfigurations object itself.
     */
    public PresetConfigurations withMaxLayers(Integer maxLayers) {
        this.maxLayers = maxLayers;
        return this;
    }

    /**
     * Get the minBitrateBps property: The minimum bitrate in bits per second (threshold for the bottom video layer).
     * Example: set MinBitrateBps as 200000 to have a bottom layer that covers users with low network bandwidth.
     *
     * @return the minBitrateBps value.
     */
    public Integer minBitrateBps() {
        return this.minBitrateBps;
    }

    /**
     * Set the minBitrateBps property: The minimum bitrate in bits per second (threshold for the bottom video layer).
     * Example: set MinBitrateBps as 200000 to have a bottom layer that covers users with low network bandwidth.
     *
     * @param minBitrateBps the minBitrateBps value to set.
     * @return the PresetConfigurations object itself.
     */
    public PresetConfigurations withMinBitrateBps(Integer minBitrateBps) {
        this.minBitrateBps = minBitrateBps;
        return this;
    }

    /**
     * Get the minHeight property: The minimum height of output video layers. Example: set MinHeight as 360 to avoid
     * output layers of smaller resolutions like 180P.
     *
     * @return the minHeight value.
     */
    public Integer minHeight() {
        return this.minHeight;
    }

    /**
     * Set the minHeight property: The minimum height of output video layers. Example: set MinHeight as 360 to avoid
     * output layers of smaller resolutions like 180P.
     *
     * @param minHeight the minHeight value to set.
     * @return the PresetConfigurations object itself.
     */
    public PresetConfigurations withMinHeight(Integer minHeight) {
        this.minHeight = minHeight;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
