// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The BlobRestoreRange model. */
@Fluent
public final class BlobRestoreRange {
    /*
     * Blob start range. This is inclusive. Empty means account start.
     */
    @JsonProperty(value = "startRange", required = true)
    private String startRange;

    /*
     * Blob end range. This is exclusive. Empty means account end.
     */
    @JsonProperty(value = "endRange", required = true)
    private String endRange;

    /**
     * Get the startRange property: Blob start range. This is inclusive. Empty means account start.
     *
     * @return the startRange value.
     */
    public String startRange() {
        return this.startRange;
    }

    /**
     * Set the startRange property: Blob start range. This is inclusive. Empty means account start.
     *
     * @param startRange the startRange value to set.
     * @return the BlobRestoreRange object itself.
     */
    public BlobRestoreRange withStartRange(String startRange) {
        this.startRange = startRange;
        return this;
    }

    /**
     * Get the endRange property: Blob end range. This is exclusive. Empty means account end.
     *
     * @return the endRange value.
     */
    public String endRange() {
        return this.endRange;
    }

    /**
     * Set the endRange property: Blob end range. This is exclusive. Empty means account end.
     *
     * @param endRange the endRange value to set.
     * @return the BlobRestoreRange object itself.
     */
    public BlobRestoreRange withEndRange(String endRange) {
        this.endRange = endRange;
        return this;
    }
}
