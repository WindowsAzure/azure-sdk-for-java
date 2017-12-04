/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing noise level of the image.
 */
public class NoiseProperties {
    /**
     * An enum value indicating level of noise. Possible values include: 'Low',
     * 'Medium', 'High'.
     */
    @JsonProperty(value = "noiseLevel")
    private NoiseLevels noiseLevel;

    /**
     * A number indicating level of noise level ranging from 0 to 1. [0, 0.25)
     * is under exposure. [0.25, 0.75) is good exposure. [0.75, 1] is over
     * exposure. [0, 0.3) is low noise level. [0.3, 0.7) is medium noise level.
     * [0.7, 1] is high noise level.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get the noiseLevel value.
     *
     * @return the noiseLevel value
     */
    public NoiseLevels noiseLevel() {
        return this.noiseLevel;
    }

    /**
     * Set the noiseLevel value.
     *
     * @param noiseLevel the noiseLevel value to set
     * @return the NoiseProperties object itself.
     */
    public NoiseProperties withNoiseLevel(NoiseLevels noiseLevel) {
        this.noiseLevel = noiseLevel;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the NoiseProperties object itself.
     */
    public NoiseProperties withValue(Double value) {
        this.value = value;
        return this;
    }

}
