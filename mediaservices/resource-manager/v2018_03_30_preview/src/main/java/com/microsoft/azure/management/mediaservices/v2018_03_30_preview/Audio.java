/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Defines the common properties for all audio codecs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.Audio")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.AacAudio", value = AacAudio.class)
})
public class Audio extends Codec {
    /**
     * The number of channels in the audio.
     */
    @JsonProperty(value = "channels")
    private Integer channels;

    /**
     * The sampling rate to use for encoding in hertz.
     */
    @JsonProperty(value = "samplingRate")
    private Integer samplingRate;

    /**
     * The bitrate, in bits per second, of the output encoded audio.
     */
    @JsonProperty(value = "bitrate")
    private Integer bitrate;

    /**
     * Get the number of channels in the audio.
     *
     * @return the channels value
     */
    public Integer channels() {
        return this.channels;
    }

    /**
     * Set the number of channels in the audio.
     *
     * @param channels the channels value to set
     * @return the Audio object itself.
     */
    public Audio withChannels(Integer channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the sampling rate to use for encoding in hertz.
     *
     * @return the samplingRate value
     */
    public Integer samplingRate() {
        return this.samplingRate;
    }

    /**
     * Set the sampling rate to use for encoding in hertz.
     *
     * @param samplingRate the samplingRate value to set
     * @return the Audio object itself.
     */
    public Audio withSamplingRate(Integer samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }

    /**
     * Get the bitrate, in bits per second, of the output encoded audio.
     *
     * @return the bitrate value
     */
    public Integer bitrate() {
        return this.bitrate;
    }

    /**
     * Set the bitrate, in bits per second, of the output encoded audio.
     *
     * @param bitrate the bitrate value to set
     * @return the Audio object itself.
     */
    public Audio withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

}
