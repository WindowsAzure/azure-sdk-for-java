/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class for EnvelopeEncryption encryption scheme.
 */
public class EnvelopeEncryption {
    /**
     * Representing supported protocols.
     */
    @JsonProperty(value = "enabledProtocols")
    private EnabledProtocols enabledProtocols;

    /**
     * Representing which tracks should not be encrypted.
     */
    @JsonProperty(value = "clearTracks")
    private List<TrackSelection> clearTracks;

    /**
     * Representing default content key for each encryption scheme and separate
     * content keys for specific tracks.
     */
    @JsonProperty(value = "contentKeys")
    private StreamingPolicyContentKeys contentKeys;

    /**
     * KeyAcquisitionUrlTemplate is used to point to user specified service to
     * delivery content keys.
     */
    @JsonProperty(value = "customKeyAcquisitionUrlTemplate")
    private String customKeyAcquisitionUrlTemplate;

    /**
     * Get representing supported protocols.
     *
     * @return the enabledProtocols value
     */
    public EnabledProtocols enabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set representing supported protocols.
     *
     * @param enabledProtocols the enabledProtocols value to set
     * @return the EnvelopeEncryption object itself.
     */
    public EnvelopeEncryption withEnabledProtocols(EnabledProtocols enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

    /**
     * Get representing which tracks should not be encrypted.
     *
     * @return the clearTracks value
     */
    public List<TrackSelection> clearTracks() {
        return this.clearTracks;
    }

    /**
     * Set representing which tracks should not be encrypted.
     *
     * @param clearTracks the clearTracks value to set
     * @return the EnvelopeEncryption object itself.
     */
    public EnvelopeEncryption withClearTracks(List<TrackSelection> clearTracks) {
        this.clearTracks = clearTracks;
        return this;
    }

    /**
     * Get representing default content key for each encryption scheme and separate content keys for specific tracks.
     *
     * @return the contentKeys value
     */
    public StreamingPolicyContentKeys contentKeys() {
        return this.contentKeys;
    }

    /**
     * Set representing default content key for each encryption scheme and separate content keys for specific tracks.
     *
     * @param contentKeys the contentKeys value to set
     * @return the EnvelopeEncryption object itself.
     */
    public EnvelopeEncryption withContentKeys(StreamingPolicyContentKeys contentKeys) {
        this.contentKeys = contentKeys;
        return this;
    }

    /**
     * Get keyAcquisitionUrlTemplate is used to point to user specified service to delivery content keys.
     *
     * @return the customKeyAcquisitionUrlTemplate value
     */
    public String customKeyAcquisitionUrlTemplate() {
        return this.customKeyAcquisitionUrlTemplate;
    }

    /**
     * Set keyAcquisitionUrlTemplate is used to point to user specified service to delivery content keys.
     *
     * @param customKeyAcquisitionUrlTemplate the customKeyAcquisitionUrlTemplate value to set
     * @return the EnvelopeEncryption object itself.
     */
    public EnvelopeEncryption withCustomKeyAcquisitionUrlTemplate(String customKeyAcquisitionUrlTemplate) {
        this.customKeyAcquisitionUrlTemplate = customKeyAcquisitionUrlTemplate;
        return this;
    }

}
