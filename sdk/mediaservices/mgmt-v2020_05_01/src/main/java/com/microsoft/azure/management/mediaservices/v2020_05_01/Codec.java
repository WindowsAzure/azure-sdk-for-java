/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes the basic properties of all codecs.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = Codec.class)
@JsonTypeName("Codec")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.Audio", value = Audio.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.Video", value = Video.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.CopyVideo", value = CopyVideo.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.CopyAudio", value = CopyAudio.class)
})
public class Codec {
    /**
     * An optional label for the codec. The label can be used to control muxing
     * behavior.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Get an optional label for the codec. The label can be used to control muxing behavior.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set an optional label for the codec. The label can be used to control muxing behavior.
     *
     * @param label the label value to set
     * @return the Codec object itself.
     */
    public Codec withLabel(String label) {
        this.label = label;
        return this;
    }

}
