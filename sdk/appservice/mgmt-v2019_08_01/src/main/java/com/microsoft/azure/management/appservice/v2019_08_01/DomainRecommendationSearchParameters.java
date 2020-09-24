/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain recommendation search parameters.
 */
public class DomainRecommendationSearchParameters {
    /**
     * Keywords to be used for generating domain recommendations.
     */
    @JsonProperty(value = "keywords")
    private String keywords;

    /**
     * Maximum number of recommendations.
     */
    @JsonProperty(value = "maxDomainRecommendations")
    private Integer maxDomainRecommendations;

    /**
     * Get keywords to be used for generating domain recommendations.
     *
     * @return the keywords value
     */
    public String keywords() {
        return this.keywords;
    }

    /**
     * Set keywords to be used for generating domain recommendations.
     *
     * @param keywords the keywords value to set
     * @return the DomainRecommendationSearchParameters object itself.
     */
    public DomainRecommendationSearchParameters withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Get maximum number of recommendations.
     *
     * @return the maxDomainRecommendations value
     */
    public Integer maxDomainRecommendations() {
        return this.maxDomainRecommendations;
    }

    /**
     * Set maximum number of recommendations.
     *
     * @param maxDomainRecommendations the maxDomainRecommendations value to set
     * @return the DomainRecommendationSearchParameters object itself.
     */
    public DomainRecommendationSearchParameters withMaxDomainRecommendations(Integer maxDomainRecommendations) {
        this.maxDomainRecommendations = maxDomainRecommendations;
        return this;
    }

}
