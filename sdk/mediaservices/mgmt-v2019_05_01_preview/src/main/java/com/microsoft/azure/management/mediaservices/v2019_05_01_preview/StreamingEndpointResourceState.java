/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StreamingEndpointResourceState.
 */
public final class StreamingEndpointResourceState extends ExpandableStringEnum<StreamingEndpointResourceState> {
    /** Static value Stopped for StreamingEndpointResourceState. */
    public static final StreamingEndpointResourceState STOPPED = fromString("Stopped");

    /** Static value Starting for StreamingEndpointResourceState. */
    public static final StreamingEndpointResourceState STARTING = fromString("Starting");

    /** Static value Running for StreamingEndpointResourceState. */
    public static final StreamingEndpointResourceState RUNNING = fromString("Running");

    /** Static value Stopping for StreamingEndpointResourceState. */
    public static final StreamingEndpointResourceState STOPPING = fromString("Stopping");

    /** Static value Deleting for StreamingEndpointResourceState. */
    public static final StreamingEndpointResourceState DELETING = fromString("Deleting");

    /** Static value Scaling for StreamingEndpointResourceState. */
    public static final StreamingEndpointResourceState SCALING = fromString("Scaling");

    /**
     * Creates or finds a StreamingEndpointResourceState from its string representation.
     * @param name a name to look for
     * @return the corresponding StreamingEndpointResourceState
     */
    @JsonCreator
    public static StreamingEndpointResourceState fromString(String name) {
        return fromString(name, StreamingEndpointResourceState.class);
    }

    /**
     * @return known StreamingEndpointResourceState values
     */
    public static Collection<StreamingEndpointResourceState> values() {
        return values(StreamingEndpointResourceState.class);
    }
}
