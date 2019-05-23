/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_03_30_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to specify properties of content key.
 */
public class StreamingPolicyContentKey {
    /**
     * Label can be used to specify Content Key when creating Streaming
     * Locator.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Policy used by Content Key.
     */
    @JsonProperty(value = "policyName")
    private String policyName;

    /**
     * Tracks which use this content key.
     */
    @JsonProperty(value = "tracks")
    private List<TrackSelection> tracks;

    /**
     * Get label can be used to specify Content Key when creating Streaming Locator.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set label can be used to specify Content Key when creating Streaming Locator.
     *
     * @param label the label value to set
     * @return the StreamingPolicyContentKey object itself.
     */
    public StreamingPolicyContentKey withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get policy used by Content Key.
     *
     * @return the policyName value
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set policy used by Content Key.
     *
     * @param policyName the policyName value to set
     * @return the StreamingPolicyContentKey object itself.
     */
    public StreamingPolicyContentKey withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get tracks which use this content key.
     *
     * @return the tracks value
     */
    public List<TrackSelection> tracks() {
        return this.tracks;
    }

    /**
     * Set tracks which use this content key.
     *
     * @param tracks the tracks value to set
     * @return the StreamingPolicyContentKey object itself.
     */
    public StreamingPolicyContentKey withTracks(List<TrackSelection> tracks) {
        this.tracks = tracks;
        return this;
    }

}
