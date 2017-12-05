/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.faceapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing exposure level of the image.
 */
public class ExposureProperties {
    /**
     * An enum value indicating level of exposure. Possible values include:
     * 'UnderExposure', 'GoodExposure', 'OverExposure'.
     */
    @JsonProperty(value = "exposureLevel")
    private ExposureLevels exposureLevel;

    /**
     * A number indicating level of exposure level ranging from 0 to 1. [0,
     * 0.25) is under exposure. [0.25, 0.75) is good exposure. [0.75, 1] is
     * over exposure.
     */
    @JsonProperty(value = "value")
    private Double value;

    /**
     * Get the exposureLevel value.
     *
     * @return the exposureLevel value
     */
    public ExposureLevels exposureLevel() {
        return this.exposureLevel;
    }

    /**
     * Set the exposureLevel value.
     *
     * @param exposureLevel the exposureLevel value to set
     * @return the ExposureProperties object itself.
     */
    public ExposureProperties withExposureLevel(ExposureLevels exposureLevel) {
        this.exposureLevel = exposureLevel;
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
     * @return the ExposureProperties object itself.
     */
    public ExposureProperties withValue(Double value) {
        this.value = value;
        return this;
    }

}
