/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes the basic properties for encoding the input video.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = Video.class)
@JsonTypeName("#Microsoft.Media.Video")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.Image", value = Image.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.H264Video", value = H264Video.class)
})
public class Video extends Codec {
    /**
     * The distance between two key frames. The value should be non-zero in the
     * range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2
     * seconds(PT2S). Note that this setting is ignored if
     * VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will
     * follow the input source setting.
     */
    @JsonProperty(value = "keyFrameInterval")
    private Period keyFrameInterval;

    /**
     * The resizing mode - how the input video will be resized to fit the
     * desired output resolution(s). Default is AutoSize. Possible values
     * include: 'None', 'AutoSize', 'AutoFit'.
     */
    @JsonProperty(value = "stretchMode")
    private StretchMode stretchMode;

    /**
     * The Video Sync Mode. Possible values include: 'Auto', 'Passthrough',
     * 'Cfr', 'Vfr'.
     */
    @JsonProperty(value = "syncMode")
    private VideoSyncMode syncMode;

    /**
     * Get the distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     *
     * @return the keyFrameInterval value
     */
    public Period keyFrameInterval() {
        return this.keyFrameInterval;
    }

    /**
     * Set the distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     *
     * @param keyFrameInterval the keyFrameInterval value to set
     * @return the Video object itself.
     */
    public Video withKeyFrameInterval(Period keyFrameInterval) {
        this.keyFrameInterval = keyFrameInterval;
        return this;
    }

    /**
     * Get the resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize. Possible values include: 'None', 'AutoSize', 'AutoFit'.
     *
     * @return the stretchMode value
     */
    public StretchMode stretchMode() {
        return this.stretchMode;
    }

    /**
     * Set the resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize. Possible values include: 'None', 'AutoSize', 'AutoFit'.
     *
     * @param stretchMode the stretchMode value to set
     * @return the Video object itself.
     */
    public Video withStretchMode(StretchMode stretchMode) {
        this.stretchMode = stretchMode;
        return this;
    }

    /**
     * Get the Video Sync Mode. Possible values include: 'Auto', 'Passthrough', 'Cfr', 'Vfr'.
     *
     * @return the syncMode value
     */
    public VideoSyncMode syncMode() {
        return this.syncMode;
    }

    /**
     * Set the Video Sync Mode. Possible values include: 'Auto', 'Passthrough', 'Cfr', 'Vfr'.
     *
     * @param syncMode the syncMode value to set
     * @return the Video object itself.
     */
    public Video withSyncMode(VideoSyncMode syncMode) {
        this.syncMode = syncMode;
        return this;
    }

}
