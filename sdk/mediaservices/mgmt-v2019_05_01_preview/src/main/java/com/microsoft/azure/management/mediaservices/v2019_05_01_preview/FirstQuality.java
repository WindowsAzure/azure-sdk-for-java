/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filter First Quality.
 */
public class FirstQuality {
    /**
     * The first quality bitrate.
     */
    @JsonProperty(value = "bitrate", required = true)
    private int bitrate;

    /**
     * Get the first quality bitrate.
     *
     * @return the bitrate value
     */
    public int bitrate() {
        return this.bitrate;
    }

    /**
     * Set the first quality bitrate.
     *
     * @param bitrate the bitrate value to set
     * @return the FirstQuality object itself.
     */
    public FirstQuality withBitrate(int bitrate) {
        this.bitrate = bitrate;
        return this;
    }

}
