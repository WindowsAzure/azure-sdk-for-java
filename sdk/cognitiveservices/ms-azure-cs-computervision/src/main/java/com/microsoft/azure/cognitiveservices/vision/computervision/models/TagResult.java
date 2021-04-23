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
 * The results of a image tag operation, including any tags and image metadata.
 */
public class TagResult {
    /**
     * A list of tags with confidence level.
     */
    @JsonProperty(value = "tags")
    private List<ImageTag> tags;

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
     * The modelVersion property.
     */
    @JsonProperty(value = "modelVersion")
    private String modelVersion;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public List<ImageTag> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the TagResult object itself.
     */
    public TagResult withTags(List<ImageTag> tags) {
        this.tags = tags;
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
     * @return the TagResult object itself.
     */
    public TagResult withRequestId(String requestId) {
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
     * @return the TagResult object itself.
     */
    public TagResult withMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the modelVersion value.
     *
     * @return the modelVersion value
     */
    public String modelVersion() {
        return this.modelVersion;
    }

    /**
     * Set the modelVersion value.
     *
     * @param modelVersion the modelVersion value to set
     * @return the TagResult object itself.
     */
    public TagResult withModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }

}
