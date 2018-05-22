/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes the basic properties for encoding the input video.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.Video")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.Image", value = Image.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.H264Video", value = H264Video.class)
})
public class Video extends Codec {
    /**
     * The distance between two key frames, thereby defining a group of
     * pictures (GOP). The value should be a non-zero integer in the range [1,
     * 30] seconds, specified in ISO 8601 format. The default is 2 seconds
     * (PT2S).
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
     * Get the keyFrameInterval value.
     *
     * @return the keyFrameInterval value
     */
    public Period keyFrameInterval() {
        return this.keyFrameInterval;
    }

    /**
     * Set the keyFrameInterval value.
     *
     * @param keyFrameInterval the keyFrameInterval value to set
     * @return the Video object itself.
     */
    public Video withKeyFrameInterval(Period keyFrameInterval) {
        this.keyFrameInterval = keyFrameInterval;
        return this;
    }

    /**
     * Get the stretchMode value.
     *
     * @return the stretchMode value
     */
    public StretchMode stretchMode() {
        return this.stretchMode;
    }

    /**
     * Set the stretchMode value.
     *
     * @param stretchMode the stretchMode value to set
     * @return the Video object itself.
     */
    public Video withStretchMode(StretchMode stretchMode) {
        this.stretchMode = stretchMode;
        return this;
    }

}
