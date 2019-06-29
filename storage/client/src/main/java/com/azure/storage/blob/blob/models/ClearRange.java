// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The ClearRange model.
 */
@JacksonXmlRootElement(localName = "ClearRange")
public final class ClearRange {
    /*
     * The start property.
     */
    @JsonProperty(value = "Start", required = true)
    private long start;

    /*
     * The end property.
     */
    @JsonProperty(value = "End", required = true)
    private long end;

    /**
     * Get the start property: The start property.
     *
     * @return the start value.
     */
    public long start() {
        return this.start;
    }

    /**
     * Set the start property: The start property.
     *
     * @param start the start value to set.
     * @return the ClearRange object itself.
     */
    public ClearRange start(long start) {
        this.start = start;
        return this;
    }

    /**
     * Get the end property: The end property.
     *
     * @return the end value.
     */
    public long end() {
        return this.end;
    }

    /**
     * Set the end property: The end property.
     *
     * @param end the end value to set.
     * @return the ClearRange object itself.
     */
    public ClearRange end(long end) {
        this.end = end;
        return this;
    }
}
