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

/**
 * Describes Advanced Audio Codec (AAC) audio encoding settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = AacAudio.class)
@JsonTypeName("#Microsoft.Media.AacAudio")
public class AacAudio extends Audio {
    /**
     * The encoding profile to be used when encoding audio with AAC. Possible
     * values include: 'AacLc', 'HeAacV1', 'HeAacV2'.
     */
    @JsonProperty(value = "profile")
    private AacAudioProfile profile;

    /**
     * Get the encoding profile to be used when encoding audio with AAC. Possible values include: 'AacLc', 'HeAacV1', 'HeAacV2'.
     *
     * @return the profile value
     */
    public AacAudioProfile profile() {
        return this.profile;
    }

    /**
     * Set the encoding profile to be used when encoding audio with AAC. Possible values include: 'AacLc', 'HeAacV1', 'HeAacV2'.
     *
     * @param profile the profile value to set
     * @return the AacAudio object itself.
     */
    public AacAudio withProfile(AacAudioProfile profile) {
        this.profile = profile;
        return this;
    }

}
