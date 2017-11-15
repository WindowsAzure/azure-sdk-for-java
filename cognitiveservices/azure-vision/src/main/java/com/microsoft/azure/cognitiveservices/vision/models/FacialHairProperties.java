/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.vision.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing facial hair attributes.
 */
public class FacialHairProperties {
    /**
     * The mustache property.
     */
    @JsonProperty(value = "mustache")
    private Double mustache;

    /**
     * The beard property.
     */
    @JsonProperty(value = "beard")
    private Double beard;

    /**
     * The sideburns property.
     */
    @JsonProperty(value = "sideburns")
    private Double sideburns;

    /**
     * Get the mustache value.
     *
     * @return the mustache value
     */
    public Double mustache() {
        return this.mustache;
    }

    /**
     * Set the mustache value.
     *
     * @param mustache the mustache value to set
     * @return the FacialHairProperties object itself.
     */
    public FacialHairProperties withMustache(Double mustache) {
        this.mustache = mustache;
        return this;
    }

    /**
     * Get the beard value.
     *
     * @return the beard value
     */
    public Double beard() {
        return this.beard;
    }

    /**
     * Set the beard value.
     *
     * @param beard the beard value to set
     * @return the FacialHairProperties object itself.
     */
    public FacialHairProperties withBeard(Double beard) {
        this.beard = beard;
        return this;
    }

    /**
     * Get the sideburns value.
     *
     * @return the sideburns value
     */
    public Double sideburns() {
        return this.sideburns;
    }

    /**
     * Set the sideburns value.
     *
     * @param sideburns the sideburns value to set
     * @return the FacialHairProperties object itself.
     */
    public FacialHairProperties withSideburns(Double sideburns) {
        this.sideburns = sideburns;
        return this;
    }

}
