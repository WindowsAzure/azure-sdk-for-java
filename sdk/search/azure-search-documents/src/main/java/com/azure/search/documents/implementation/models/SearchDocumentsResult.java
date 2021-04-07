// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Immutable;
import com.azure.search.documents.models.FacetResult;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Response containing search results from an index. */
@Immutable
public final class SearchDocumentsResult {
    /*
     * The total count of results found by the search operation, or null if the
     * count was not requested. If present, the count may be greater than the
     * number of results in this response. This can happen if you use the $top
     * or $skip parameters, or if Azure Cognitive Search can't return all the
     * requested documents in a single Search response.
     */
    @JsonProperty(value = "@odata.count", access = JsonProperty.Access.WRITE_ONLY)
    private Long count;

    /*
     * A value indicating the percentage of the index that was included in the
     * query, or null if minimumCoverage was not specified in the request.
     */
    @JsonProperty(value = "@search.coverage", access = JsonProperty.Access.WRITE_ONLY)
    private Double coverage;

    /*
     * The facet query results for the search operation, organized as a
     * collection of buckets for each faceted field; null if the query did not
     * include any facet expressions.
     */
    @JsonProperty(value = "@search.facets", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, List<FacetResult>> facets;

    /*
     * The answers query results for the search operation; null if the answers
     * query parameter was not specified or set to 'none'.
     */
    @JsonProperty(value = "@search.answers", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, List<AnswerResult>> answers;

    /*
     * Continuation JSON payload returned when Azure Cognitive Search can't
     * return all the requested results in a single Search response. You can
     * use this JSON along with @odata.nextLink to formulate another POST
     * Search request to get the next part of the search response.
     */
    @JsonProperty(value = "@search.nextPageParameters", access = JsonProperty.Access.WRITE_ONLY)
    private SearchRequest nextPageParameters;

    /*
     * The sequence of results returned by the query.
     */
    @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchResult> results;

    /*
     * Continuation URL returned when Azure Cognitive Search can't return all
     * the requested results in a single Search response. You can use this URL
     * to formulate another GET or POST Search request to get the next part of
     * the search response. Make sure to use the same verb (GET or POST) as the
     * request that produced this response.
     */
    @JsonProperty(value = "@odata.nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of SearchDocumentsResult class.
     *
     * @param results the results value to set.
     */
    @JsonCreator
    public SearchDocumentsResult(
            @JsonProperty(value = "value", required = true, access = JsonProperty.Access.WRITE_ONLY)
                    List<SearchResult> results) {
        this.results = results;
    }

    /**
     * Get the count property: The total count of results found by the search operation, or null if the count was not
     * requested. If present, the count may be greater than the number of results in this response. This can happen if
     * you use the $top or $skip parameters, or if Azure Cognitive Search can't return all the requested documents in a
     * single Search response.
     *
     * @return the count value.
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * Get the coverage property: A value indicating the percentage of the index that was included in the query, or null
     * if minimumCoverage was not specified in the request.
     *
     * @return the coverage value.
     */
    public Double getCoverage() {
        return this.coverage;
    }

    /**
     * Get the facets property: The facet query results for the search operation, organized as a collection of buckets
     * for each faceted field; null if the query did not include any facet expressions.
     *
     * @return the facets value.
     */
    public Map<String, List<FacetResult>> getFacets() {
        return this.facets;
    }

    /**
     * Get the answers property: The answers query results for the search operation; null if the answers query parameter
     * was not specified or set to 'none'.
     *
     * @return the answers value.
     */
    public Map<String, List<AnswerResult>> getAnswers() {
        return this.answers;
    }

    /**
     * Get the nextPageParameters property: Continuation JSON payload returned when Azure Cognitive Search can't return
     * all the requested results in a single Search response. You can use this JSON along with @odata.nextLink to
     * formulate another POST Search request to get the next part of the search response.
     *
     * @return the nextPageParameters value.
     */
    public SearchRequest getNextPageParameters() {
        return this.nextPageParameters;
    }

    /**
     * Get the results property: The sequence of results returned by the query.
     *
     * @return the results value.
     */
    public List<SearchResult> getResults() {
        return this.results;
    }

    /**
     * Get the nextLink property: Continuation URL returned when Azure Cognitive Search can't return all the requested
     * results in a single Search response. You can use this URL to formulate another GET or POST Search request to get
     * the next part of the search response. Make sure to use the same verb (GET or POST) as the request that produced
     * this response.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
