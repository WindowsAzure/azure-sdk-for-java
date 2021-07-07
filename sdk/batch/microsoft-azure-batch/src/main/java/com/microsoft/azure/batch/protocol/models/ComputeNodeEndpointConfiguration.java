/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The endpoint configuration for the Compute Node.
 */
public class ComputeNodeEndpointConfiguration {
    /**
     * The list of inbound endpoints that are accessible on the Compute Node.
     */
    @JsonProperty(value = "inboundEndpoints", required = true)
    private List<InboundEndpoint> inboundEndpoints;

    /**
     * Get the list of inbound endpoints that are accessible on the Compute Node.
     *
     * @return the inboundEndpoints value
     */
    public List<InboundEndpoint> inboundEndpoints() {
        return this.inboundEndpoints;
    }

    /**
     * Set the list of inbound endpoints that are accessible on the Compute Node.
     *
     * @param inboundEndpoints the inboundEndpoints value to set
     * @return the ComputeNodeEndpointConfiguration object itself.
     */
    public ComputeNodeEndpointConfiguration withInboundEndpoints(List<InboundEndpoint> inboundEndpoints) {
        this.inboundEndpoints = inboundEndpoints;
        return this;
    }

}
