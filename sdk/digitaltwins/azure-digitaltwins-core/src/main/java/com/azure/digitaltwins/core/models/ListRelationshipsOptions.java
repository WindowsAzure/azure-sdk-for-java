// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Context;
import com.azure.digitaltwins.core.implementation.models.DigitalTwinsListRelationshipsOptions;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The optional parameters for
 * {@link com.azure.digitaltwins.core.DigitalTwinsClient#listRelationships(String, String, Class, ListRelationshipsOptions, Context)} and
 * {@link com.azure.digitaltwins.core.DigitalTwinsAsyncClient#listRelationships(String, String, Class, ListRelationshipsOptions)}
 */
@Fluent
public final class ListRelationshipsOptions {
    /*
     * Identifies the request in a distributed tracing system.
     */
    @JsonProperty(value = "traceparent")
    private String traceparent;

    /*
     * Provides vendor-specific trace identification information and is a
     * companion to traceparent.
     */
    @JsonProperty(value = "tracestate")
    private String tracestate;

    /**
     * Get the traceparent property: Identifies the request in a distributed tracing system.
     *
     * @return the traceparent value.
     */
    public String getTraceparent() {
        return this.traceparent;
    }

    /**
     * Set the traceparent property: Identifies the request in a distributed tracing system.
     *
     * @param traceparent the traceparent value to set.
     * @return the ListRelationshipsOptions object itself.
     */
    public ListRelationshipsOptions setTraceparent(String traceparent) {
        this.traceparent = traceparent;
        return this;
    }

    /**
     * Get the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     *
     * @return the tracestate value.
     */
    public String getTracestate() {
        return this.tracestate;
    }

    /**
     * Set the tracestate property: Provides vendor-specific trace identification information and is a companion to
     * traceparent.
     *
     * @param tracestate the tracestate value to set.
     * @return the ListRelationshipsOptions object itself.
     */
    public ListRelationshipsOptions setTracestate(String tracestate) {
        this.tracestate = tracestate;
        return this;
    }
}
