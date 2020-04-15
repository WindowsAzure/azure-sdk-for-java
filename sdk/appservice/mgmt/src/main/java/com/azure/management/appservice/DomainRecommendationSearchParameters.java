// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DomainRecommendationSearchParameters model. */
@Fluent
public final class DomainRecommendationSearchParameters {
    /*
     * Keywords to be used for generating domain recommendations.
     */
    @JsonProperty(value = "keywords")
    private String keywords;

    /*
     * Maximum number of recommendations.
     */
    @JsonProperty(value = "maxDomainRecommendations")
    private Integer maxDomainRecommendations;

    /**
     * Get the keywords property: Keywords to be used for generating domain recommendations.
     *
     * @return the keywords value.
     */
    public String keywords() {
        return this.keywords;
    }

    /**
     * Set the keywords property: Keywords to be used for generating domain recommendations.
     *
     * @param keywords the keywords value to set.
     * @return the DomainRecommendationSearchParameters object itself.
     */
    public DomainRecommendationSearchParameters withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Get the maxDomainRecommendations property: Maximum number of recommendations.
     *
     * @return the maxDomainRecommendations value.
     */
    public Integer maxDomainRecommendations() {
        return this.maxDomainRecommendations;
    }

    /**
     * Set the maxDomainRecommendations property: Maximum number of recommendations.
     *
     * @param maxDomainRecommendations the maxDomainRecommendations value to set.
     * @return the DomainRecommendationSearchParameters object itself.
     */
    public DomainRecommendationSearchParameters withMaxDomainRecommendations(Integer maxDomainRecommendations) {
        this.maxDomainRecommendations = maxDomainRecommendations;
        return this;
    }
}
