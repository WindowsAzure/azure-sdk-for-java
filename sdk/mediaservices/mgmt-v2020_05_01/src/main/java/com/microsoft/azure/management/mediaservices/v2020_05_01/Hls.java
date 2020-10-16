/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HTTP Live Streaming (HLS) packing setting for the live output.
 */
public class Hls {
    /**
     * The number of fragments in an HTTP Live Streaming (HLS) TS segment in
     * the output of the live event. This value does not affect the packing
     * ratio for HLS CMAF output.
     */
    @JsonProperty(value = "fragmentsPerTsSegment")
    private Integer fragmentsPerTsSegment;

    /**
     * Get the number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value does not affect the packing ratio for HLS CMAF output.
     *
     * @return the fragmentsPerTsSegment value
     */
    public Integer fragmentsPerTsSegment() {
        return this.fragmentsPerTsSegment;
    }

    /**
     * Set the number of fragments in an HTTP Live Streaming (HLS) TS segment in the output of the live event. This value does not affect the packing ratio for HLS CMAF output.
     *
     * @param fragmentsPerTsSegment the fragmentsPerTsSegment value to set
     * @return the Hls object itself.
     */
    public Hls withFragmentsPerTsSegment(Integer fragmentsPerTsSegment) {
        this.fragmentsPerTsSegment = fragmentsPerTsSegment;
        return this;
    }

}
