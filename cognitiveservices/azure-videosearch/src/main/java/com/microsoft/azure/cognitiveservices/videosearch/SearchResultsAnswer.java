/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.cognitiveservices.videosearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.cognitiveservices.videosearch.implementation.VideosInner;
/**
 * The SearchResultsAnswer model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_type")
@JsonTypeName("SearchResultsAnswer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Videos", value = VideosInner.class)
})
public class SearchResultsAnswer extends Answer {
    /**
     * The estimated number of webpages that are relevant to the query. Use
     * this number along with the count and offset query parameters to page the
     * results.
     */
    @JsonProperty(value = "totalEstimatedMatches", access = JsonProperty.Access.WRITE_ONLY)
    private Long totalEstimatedMatches;

    /**
     * The isFamilyFriendly property.
     */
    @JsonProperty(value = "isFamilyFriendly", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isFamilyFriendly;

    /**
     * Get the totalEstimatedMatches value.
     *
     * @return the totalEstimatedMatches value
     */
    public Long totalEstimatedMatches() {
        return this.totalEstimatedMatches;
    }

    /**
     * Get the isFamilyFriendly value.
     *
     * @return the isFamilyFriendly value
     */
    public Boolean isFamilyFriendly() {
        return this.isFamilyFriendly;
    }

}
