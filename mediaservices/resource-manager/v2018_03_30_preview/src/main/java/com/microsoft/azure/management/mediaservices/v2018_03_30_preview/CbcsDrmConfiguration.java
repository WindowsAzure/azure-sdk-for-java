/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to specify drm configurations of CommonEncryptionCbcs scheme in
 * Streaming Policy.
 */
public class CbcsDrmConfiguration {
    /**
     * Fairplay configurations.
     */
    @JsonProperty(value = "fairPlay")
    private StreamingPolicyFairPlayConfiguration fairPlay;

    /**
     * PlayReady configurations.
     */
    @JsonProperty(value = "playReady")
    private StreamingPolicyPlayReadyConfiguration playReady;

    /**
     * Widevine configurations.
     */
    @JsonProperty(value = "widevine")
    private StreamingPolicyWidevineConfiguration widevine;

    /**
     * Get fairplay configurations.
     *
     * @return the fairPlay value
     */
    public StreamingPolicyFairPlayConfiguration fairPlay() {
        return this.fairPlay;
    }

    /**
     * Set fairplay configurations.
     *
     * @param fairPlay the fairPlay value to set
     * @return the CbcsDrmConfiguration object itself.
     */
    public CbcsDrmConfiguration withFairPlay(StreamingPolicyFairPlayConfiguration fairPlay) {
        this.fairPlay = fairPlay;
        return this;
    }

    /**
     * Get playReady configurations.
     *
     * @return the playReady value
     */
    public StreamingPolicyPlayReadyConfiguration playReady() {
        return this.playReady;
    }

    /**
     * Set playReady configurations.
     *
     * @param playReady the playReady value to set
     * @return the CbcsDrmConfiguration object itself.
     */
    public CbcsDrmConfiguration withPlayReady(StreamingPolicyPlayReadyConfiguration playReady) {
        this.playReady = playReady;
        return this;
    }

    /**
     * Get widevine configurations.
     *
     * @return the widevine value
     */
    public StreamingPolicyWidevineConfiguration widevine() {
        return this.widevine;
    }

    /**
     * Set widevine configurations.
     *
     * @param widevine the widevine value to set
     * @return the CbcsDrmConfiguration object itself.
     */
    public CbcsDrmConfiguration withWidevine(StreamingPolicyWidevineConfiguration widevine) {
        this.widevine = widevine;
        return this;
    }

}
