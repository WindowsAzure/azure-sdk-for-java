/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2016_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CognitiveServicesResourceAndSku model.
 */
public class CognitiveServicesResourceAndSku {
    /**
     * Resource Namespace and Type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType value.
     *
     * @param resourceType the resourceType value to set
     * @return the CognitiveServicesResourceAndSku object itself.
     */
    public CognitiveServicesResourceAndSku withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the CognitiveServicesResourceAndSku object itself.
     */
    public CognitiveServicesResourceAndSku withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
