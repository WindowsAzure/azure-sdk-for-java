/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of domain-specific classifications for the domain of celebrities.
 */
public class CelebrityResults {
    /**
     * List of celebrities recognized in the image.
     */
    @JsonProperty(value = "celebrities")
    private List<CelebritiesModel> celebrities;

    /**
     * Id of the REST API request.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private ImageMetadata metadata;

    /**
     * Get the celebrities value.
     *
     * @return the celebrities value
     */
    public List<CelebritiesModel> celebrities() {
        return this.celebrities;
    }

    /**
     * Set the celebrities value.
     *
     * @param celebrities the celebrities value to set
     * @return the CelebrityResults object itself.
     */
    public CelebrityResults withCelebrities(List<CelebritiesModel> celebrities) {
        this.celebrities = celebrities;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the CelebrityResults object itself.
     */
    public CelebrityResults withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public ImageMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the CelebrityResults object itself.
     */
    public CelebrityResults withMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

}
