/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.imagesearch.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Defines a response. All schemas that could be returned at the root of a
 * response should inherit from this.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("Response")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Answer", value = Answer.class),
    @JsonSubTypes.Type(name = "Thing", value = Thing.class),
    @JsonSubTypes.Type(name = "ErrorResponse", value = ErrorResponse.class),
    @JsonSubTypes.Type(name = "RecognizedEntity", value = RecognizedEntity.class),
    @JsonSubTypes.Type(name = "RecognizedEntityRegion", value = RecognizedEntityRegion.class),
    @JsonSubTypes.Type(name = "ImageInsights", value = ImageInsights.class),
    @JsonSubTypes.Type(name = "TrendingImages", value = TrendingImages.class)
})
public class Response extends Identifiable {
    /**
     * The URL that returns this resource.
     */
    @JsonProperty(value = "readLink", access = JsonProperty.Access.WRITE_ONLY)
    private String readLink;

    /**
     * The URL To Bing's search result for this item.
     */
    @JsonProperty(value = "webSearchUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String webSearchUrl;

    /**
     * Get the URL that returns this resource.
     *
     * @return the readLink value
     */
    public String readLink() {
        return this.readLink;
    }

    /**
     * Get the URL To Bing's search result for this item.
     *
     * @return the webSearchUrl value
     */
    public String webSearchUrl() {
        return this.webSearchUrl;
    }

}
