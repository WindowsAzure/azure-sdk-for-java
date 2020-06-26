/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.messaging.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Encoder connection rejected event data.
 */
public class MediaLiveEventConnectionRejectedEventData {
    /**
     * Gets the ingest URL provided by the live event.
     */
    @JsonProperty(value = "ingestUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String ingestUrl;

    /**
     * Gets the stream Id.
     */
    @JsonProperty(value = "streamId", access = JsonProperty.Access.WRITE_ONLY)
    private String streamId;

    /**
     * Gets the remote IP.
     */
    @JsonProperty(value = "encoderIp", access = JsonProperty.Access.WRITE_ONLY)
    private String encoderIp;

    /**
     * Gets the remote port.
     */
    @JsonProperty(value = "encoderPort", access = JsonProperty.Access.WRITE_ONLY)
    private String encoderPort;

    /**
     * Gets the result code.
     */
    @JsonProperty(value = "resultCode", access = JsonProperty.Access.WRITE_ONLY)
    private String resultCode;

    /**
     * Get gets the ingest URL provided by the live event.
     *
     * @return the ingestUrl value
     */
    public String ingestUrl() {
        return this.ingestUrl;
    }

    /**
     * Get gets the stream Id.
     *
     * @return the streamId value
     */
    public String streamId() {
        return this.streamId;
    }

    /**
     * Get gets the remote IP.
     *
     * @return the encoderIp value
     */
    public String encoderIp() {
        return this.encoderIp;
    }

    /**
     * Get gets the remote port.
     *
     * @return the encoderPort value
     */
    public String encoderPort() {
        return this.encoderPort;
    }

    /**
     * Get gets the result code.
     *
     * @return the resultCode value
     */
    public String resultCode() {
        return this.resultCode;
    }

}
