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
 * scale units definition.
 */
public class StreamingEntityScaleUnit {
    /**
     * The scale unit number of the streaming endpoint.
     */
    @JsonProperty(value = "scaleUnit")
    private Integer scaleUnit;

    /**
     * Get the scale unit number of the streaming endpoint.
     *
     * @return the scaleUnit value
     */
    public Integer scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Set the scale unit number of the streaming endpoint.
     *
     * @param scaleUnit the scaleUnit value to set
     * @return the StreamingEntityScaleUnit object itself.
     */
    public StreamingEntityScaleUnit withScaleUnit(Integer scaleUnit) {
        this.scaleUnit = scaleUnit;
        return this;
    }

}
