/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base type for all overlays - image, audio or video.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("Overlay")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.AudioOverlay", value = AudioOverlay.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.VideoOverlay", value = VideoOverlay.class)
})
public class Overlay {
    /**
     * The label of the job input which is to be used as an overlay. The Input
     * must specify exactly one file. You can specify an image file in JPG or
     * PNG formats, or an audio file (such as a WAV, MP3, WMA or M4A file), or
     * a video file. See https://aka.ms/mesformats for the complete list of
     * supported audio and video file formats.
     */
    @JsonProperty(value = "inputLabel")
    private String inputLabel;

    /**
     * The start position, with reference to the input video, at which the
     * overlay starts. The value should be in ISO 8601 format. For example,
     * PT05S to start the overlay at 5 seconds in to the input video. If not
     * specified the overlay starts from the beginning of the input video.
     */
    @JsonProperty(value = "start")
    private Period start;

    /**
     * The position in the input video at which the overlay ends. The value
     * should be in ISO 8601 duration format. For example, PT30S to end the
     * overlay at 30 seconds in to the input video. If not specified the
     * overlay will be applied until the end of the input video if inputLoop is
     * true. Else, if inputLoop is false, then overlay will last as long as the
     * duration of the overlay media.
     */
    @JsonProperty(value = "end")
    private Period end;

    /**
     * The duration over which the overlay fades in onto the input video. The
     * value should be in ISO 8601 duration format. If not specified the
     * default behavior is to have no fade in (same as PT0S).
     */
    @JsonProperty(value = "fadeInDuration")
    private Period fadeInDuration;

    /**
     * The duration over which the overlay fades out of the input video. The
     * value should be in ISO 8601 duration format. If not specified the
     * default behavior is to have no fade out (same as PT0S).
     */
    @JsonProperty(value = "fadeOutDuration")
    private Period fadeOutDuration;

    /**
     * The gain level of audio in the overlay. The value should be in the range
     * [0, 1.0]. The default is 1.0.
     */
    @JsonProperty(value = "audioGainLevel")
    private Double audioGainLevel;

    /**
     * Get the label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG or PNG formats, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     *
     * @return the inputLabel value
     */
    public String inputLabel() {
        return this.inputLabel;
    }

    /**
     * Set the label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG or PNG formats, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     *
     * @param inputLabel the inputLabel value to set
     * @return the Overlay object itself.
     */
    public Overlay withInputLabel(String inputLabel) {
        this.inputLabel = inputLabel;
        return this;
    }

    /**
     * Get the start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds in to the input video. If not specified the overlay starts from the beginning of the input video.
     *
     * @return the start value
     */
    public Period start() {
        return this.start;
    }

    /**
     * Set the start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds in to the input video. If not specified the overlay starts from the beginning of the input video.
     *
     * @param start the start value to set
     * @return the Overlay object itself.
     */
    public Overlay withStart(Period start) {
        this.start = start;
        return this;
    }

    /**
     * Get the position in the input video at which the overlay ends. The value should be in ISO 8601 duration format. For example, PT30S to end the overlay at 30 seconds in to the input video. If not specified the overlay will be applied until the end of the input video if inputLoop is true. Else, if inputLoop is false, then overlay will last as long as the duration of the overlay media.
     *
     * @return the end value
     */
    public Period end() {
        return this.end;
    }

    /**
     * Set the position in the input video at which the overlay ends. The value should be in ISO 8601 duration format. For example, PT30S to end the overlay at 30 seconds in to the input video. If not specified the overlay will be applied until the end of the input video if inputLoop is true. Else, if inputLoop is false, then overlay will last as long as the duration of the overlay media.
     *
     * @param end the end value to set
     * @return the Overlay object itself.
     */
    public Overlay withEnd(Period end) {
        this.end = end;
        return this;
    }

    /**
     * Get the duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     *
     * @return the fadeInDuration value
     */
    public Period fadeInDuration() {
        return this.fadeInDuration;
    }

    /**
     * Set the duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     *
     * @param fadeInDuration the fadeInDuration value to set
     * @return the Overlay object itself.
     */
    public Overlay withFadeInDuration(Period fadeInDuration) {
        this.fadeInDuration = fadeInDuration;
        return this;
    }

    /**
     * Get the duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     *
     * @return the fadeOutDuration value
     */
    public Period fadeOutDuration() {
        return this.fadeOutDuration;
    }

    /**
     * Set the duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     *
     * @param fadeOutDuration the fadeOutDuration value to set
     * @return the Overlay object itself.
     */
    public Overlay withFadeOutDuration(Period fadeOutDuration) {
        this.fadeOutDuration = fadeOutDuration;
        return this;
    }

    /**
     * Get the gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     *
     * @return the audioGainLevel value
     */
    public Double audioGainLevel() {
        return this.audioGainLevel;
    }

    /**
     * Set the gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     *
     * @param audioGainLevel the audioGainLevel value to set
     * @return the Overlay object itself.
     */
    public Overlay withAudioGainLevel(Double audioGainLevel) {
        this.audioGainLevel = audioGainLevel;
        return this;
    }

}
