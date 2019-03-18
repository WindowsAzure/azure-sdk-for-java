/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import java.util.UUID;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class for content key in Streaming Locator.
 */
public class StreamingLocatorContentKey {
    /**
     * ID of Content Key.
     */
    @JsonProperty(value = "id", required = true)
    private UUID id;

    /**
     * Encryption type of Content Key. Possible values include:
     * 'CommonEncryptionCenc', 'CommonEncryptionCbcs', 'EnvelopeEncryption'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private StreamingLocatorContentKeyType type;

    /**
     * Label of Content Key.
     */
    @JsonProperty(value = "label")
    private String label;

    /**
     * Value of Content Key.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * ContentKeyPolicy used by Content Key.
     */
    @JsonProperty(value = "policyName", access = JsonProperty.Access.WRITE_ONLY)
    private String policyName;

    /**
     * Tracks which use this Content Key.
     */
    @JsonProperty(value = "tracks")
    private List<TrackSelection> tracks;

    /**
     * Get iD of Content Key.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set iD of Content Key.
     *
     * @param id the id value to set
     * @return the StreamingLocatorContentKey object itself.
     */
    public StreamingLocatorContentKey withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get encryption type of Content Key. Possible values include: 'CommonEncryptionCenc', 'CommonEncryptionCbcs', 'EnvelopeEncryption'.
     *
     * @return the type value
     */
    public StreamingLocatorContentKeyType type() {
        return this.type;
    }

    /**
     * Get label of Content Key.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set label of Content Key.
     *
     * @param label the label value to set
     * @return the StreamingLocatorContentKey object itself.
     */
    public StreamingLocatorContentKey withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get value of Content Key.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value of Content Key.
     *
     * @param value the value value to set
     * @return the StreamingLocatorContentKey object itself.
     */
    public StreamingLocatorContentKey withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get contentKeyPolicy used by Content Key.
     *
     * @return the policyName value
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Get tracks which use this Content Key.
     *
     * @return the tracks value
     */
    public List<TrackSelection> tracks() {
        return this.tracks;
    }

    /**
     * Set tracks which use this Content Key.
     *
     * @param tracks the tracks value to set
     * @return the StreamingLocatorContentKey object itself.
     */
    public StreamingLocatorContentKey withTracks(List<TrackSelection> tracks) {
        this.tracks = tracks;
        return this;
    }

}
