// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SearchOptions model. */
@Fluent
public final class SearchOptions {
    /*
     * A value that specifies whether to fetch the total count of results.
     * Default is false. Setting this value to true may have a performance
     * impact. Note that the count returned is an approximation.
     */
    @JsonProperty(value = "IncludeTotalResultCount")
    private Boolean includeTotalResultCount;

    /*
     * The list of facet expressions to apply to the search query. Each facet
     * expression contains a field name, optionally followed by a
     * comma-separated list of name:value pairs.
     */
    @JsonProperty(value = "Facets")
    private List<String> facets;

    /*
     * The OData $filter expression to apply to the search query.
     */
    @JsonProperty(value = "$filter")
    private String filter;

    /*
     * The list of field names to use for hit highlights. Only searchable
     * fields can be used for hit highlighting.
     */
    @JsonProperty(value = "HighlightFields")
    private List<String> highlightFields;

    /*
     * A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. Default is &lt;/em&gt;.
     */
    @JsonProperty(value = "highlightPostTag")
    private String highlightPostTag;

    /*
     * A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. Default is &lt;em&gt;.
     */
    @JsonProperty(value = "highlightPreTag")
    private String highlightPreTag;

    /*
     * A number between 0 and 100 indicating the percentage of the index that
     * must be covered by a search query in order for the query to be reported
     * as a success. This parameter can be useful for ensuring search
     * availability even for services with only one replica. The default is
     * 100.
     */
    @JsonProperty(value = "minimumCoverage")
    private Double minimumCoverage;

    /*
     * The list of OData $orderby expressions by which to sort the results.
     * Each expression can be either a field name or a call to either the
     * geo.distance() or the search.score() functions. Each expression can be
     * followed by asc to indicate ascending, and desc to indicate descending.
     * The default is ascending order. Ties will be broken by the match scores
     * of documents. If no OrderBy is specified, the default sort order is
     * descending by document match score. There can be at most 32 $orderby
     * clauses.
     */
    @JsonProperty(value = "OrderBy")
    private List<String> orderBy;

    /*
     * A value that specifies the syntax of the search query. The default is
     * 'simple'. Use 'full' if your query uses the Lucene query syntax.
     */
    @JsonProperty(value = "queryType")
    private QueryType queryType;

    /*
     * The list of parameter values to be used in scoring functions (for
     * example, referencePointParameter) using the format name-values. For
     * example, if the scoring profile defines a function with a parameter
     * called 'mylocation' the parameter string would be
     * "mylocation--122.2,44.8" (without the quotes).
     */
    @JsonProperty(value = "ScoringParameters")
    private List<String> scoringParameters;

    /*
     * The name of a scoring profile to evaluate match scores for matching
     * documents in order to sort the results.
     */
    @JsonProperty(value = "scoringProfile")
    private String scoringProfile;

    /*
     * The list of field names to which to scope the full-text search. When
     * using fielded search (fieldName:searchExpression) in a full Lucene
     * query, the field names of each fielded search expression take precedence
     * over any field names listed in this parameter.
     */
    @JsonProperty(value = "searchFields")
    private List<String> searchFields;

    /*
     * A value that specifies whether any or all of the search terms must be
     * matched in order to count the document as a match.
     */
    @JsonProperty(value = "searchMode")
    private SearchMode searchMode;

    /*
     * The list of fields to retrieve. If unspecified, all fields marked as
     * retrievable in the schema are included.
     */
    @JsonProperty(value = "$select")
    private List<String> select;

    /*
     * The number of search results to skip. This value cannot be greater than
     * 100,000. If you need to scan documents in sequence, but cannot use $skip
     * due to this limitation, consider using $orderby on a totally-ordered key
     * and $filter with a range query instead.
     */
    @JsonProperty(value = "$skip")
    private Integer skip;

    /*
     * The number of search results to retrieve. This can be used in
     * conjunction with $skip to implement client-side paging of search
     * results. If results are truncated due to server-side paging, the
     * response will include a continuation token that can be used to issue
     * another Search request for the next page of results.
     */
    @JsonProperty(value = "$top")
    private Integer top;

    /**
     * Get the includeTotalResultCount property: A value that specifies whether to fetch the total count of results.
     * Default is false. Setting this value to true may have a performance impact. Note that the count returned is an
     * approximation.
     *
     * @return the includeTotalResultCount value.
     */
    public Boolean isIncludeTotalResultCount() {
        return this.includeTotalResultCount;
    }

    /**
     * Set the includeTotalResultCount property: A value that specifies whether to fetch the total count of results.
     * Default is false. Setting this value to true may have a performance impact. Note that the count returned is an
     * approximation.
     *
     * @param includeTotalResultCount the includeTotalResultCount value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setIncludeTotalResultCount(Boolean includeTotalResultCount) {
        this.includeTotalResultCount = includeTotalResultCount;
        return this;
    }

    /**
     * Get the facets property: The list of facet expressions to apply to the search query. Each facet expression
     * contains a field name, optionally followed by a comma-separated list of name:value pairs.
     *
     * @return the facets value.
     */
    public List<String> getFacets() {
        return this.facets;
    }

    /**
     * Set the facets property: The list of facet expressions to apply to the search query. Each facet expression
     * contains a field name, optionally followed by a comma-separated list of name:value pairs.
     *
     * @param facets the facets value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setFacets(List<String> facets) {
        this.facets = facets;
        return this;
    }

    /**
     * Get the filter property: The OData $filter expression to apply to the search query.
     *
     * @return the filter value.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: The OData $filter expression to apply to the search query.
     *
     * @param filter the filter value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the highlightFields property: The list of field names to use for hit highlights. Only searchable fields can
     * be used for hit highlighting.
     *
     * @return the highlightFields value.
     */
    public List<String> getHighlightFields() {
        return this.highlightFields;
    }

    /**
     * Set the highlightFields property: The list of field names to use for hit highlights. Only searchable fields can
     * be used for hit highlighting.
     *
     * @param highlightFields the highlightFields value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setHighlightFields(List<String> highlightFields) {
        this.highlightFields = highlightFields;
        return this;
    }

    /**
     * Get the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. Default is &amp;lt;/em&amp;gt;.
     *
     * @return the highlightPostTag value.
     */
    public String getHighlightPostTag() {
        return this.highlightPostTag;
    }

    /**
     * Set the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. Default is &amp;lt;/em&amp;gt;.
     *
     * @param highlightPostTag the highlightPostTag value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setHighlightPostTag(String highlightPostTag) {
        this.highlightPostTag = highlightPostTag;
        return this;
    }

    /**
     * Get the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. Default is &amp;lt;em&amp;gt;.
     *
     * @return the highlightPreTag value.
     */
    public String getHighlightPreTag() {
        return this.highlightPreTag;
    }

    /**
     * Set the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. Default is &amp;lt;em&amp;gt;.
     *
     * @param highlightPreTag the highlightPreTag value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setHighlightPreTag(String highlightPreTag) {
        this.highlightPreTag = highlightPreTag;
        return this;
    }

    /**
     * Get the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by a search query in order for the query to be reported as a success. This parameter can be useful for
     * ensuring search availability even for services with only one replica. The default is 100.
     *
     * @return the minimumCoverage value.
     */
    public Double getMinimumCoverage() {
        return this.minimumCoverage;
    }

    /**
     * Set the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by a search query in order for the query to be reported as a success. This parameter can be useful for
     * ensuring search availability even for services with only one replica. The default is 100.
     *
     * @param minimumCoverage the minimumCoverage value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setMinimumCoverage(Double minimumCoverage) {
        this.minimumCoverage = minimumCoverage;
        return this;
    }

    /**
     * Get the orderBy property: The list of OData $orderby expressions by which to sort the results. Each expression
     * can be either a field name or a call to either the geo.distance() or the search.score() functions. Each
     * expression can be followed by asc to indicate ascending, and desc to indicate descending. The default is
     * ascending order. Ties will be broken by the match scores of documents. If no OrderBy is specified, the default
     * sort order is descending by document match score. There can be at most 32 $orderby clauses.
     *
     * @return the orderBy value.
     */
    public List<String> getOrderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: The list of OData $orderby expressions by which to sort the results. Each expression
     * can be either a field name or a call to either the geo.distance() or the search.score() functions. Each
     * expression can be followed by asc to indicate ascending, and desc to indicate descending. The default is
     * ascending order. Ties will be broken by the match scores of documents. If no OrderBy is specified, the default
     * sort order is descending by document match score. There can be at most 32 $orderby clauses.
     *
     * @param orderBy the orderBy value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setOrderBy(List<String> orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the queryType property: A value that specifies the syntax of the search query. The default is 'simple'. Use
     * 'full' if your query uses the Lucene query syntax.
     *
     * @return the queryType value.
     */
    public QueryType getQueryType() {
        return this.queryType;
    }

    /**
     * Set the queryType property: A value that specifies the syntax of the search query. The default is 'simple'. Use
     * 'full' if your query uses the Lucene query syntax.
     *
     * @param queryType the queryType value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setQueryType(QueryType queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * Get the scoringParameters property: The list of parameter values to be used in scoring functions (for example,
     * referencePointParameter) using the format name-values. For example, if the scoring profile defines a function
     * with a parameter called 'mylocation' the parameter string would be "mylocation--122.2,44.8" (without the quotes).
     *
     * @return the scoringParameters value.
     */
    public List<String> getScoringParameters() {
        return this.scoringParameters;
    }

    /**
     * Set the scoringParameters property: The list of parameter values to be used in scoring functions (for example,
     * referencePointParameter) using the format name-values. For example, if the scoring profile defines a function
     * with a parameter called 'mylocation' the parameter string would be "mylocation--122.2,44.8" (without the quotes).
     *
     * @param scoringParameters the scoringParameters value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setScoringParameters(List<String> scoringParameters) {
        this.scoringParameters = scoringParameters;
        return this;
    }

    /**
     * Get the scoringProfile property: The name of a scoring profile to evaluate match scores for matching documents in
     * order to sort the results.
     *
     * @return the scoringProfile value.
     */
    public String getScoringProfile() {
        return this.scoringProfile;
    }

    /**
     * Set the scoringProfile property: The name of a scoring profile to evaluate match scores for matching documents in
     * order to sort the results.
     *
     * @param scoringProfile the scoringProfile value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setScoringProfile(String scoringProfile) {
        this.scoringProfile = scoringProfile;
        return this;
    }

    /**
     * Get the searchFields property: The list of field names to which to scope the full-text search. When using fielded
     * search (fieldName:searchExpression) in a full Lucene query, the field names of each fielded search expression
     * take precedence over any field names listed in this parameter.
     *
     * @return the searchFields value.
     */
    public List<String> getSearchFields() {
        return this.searchFields;
    }

    /**
     * Set the searchFields property: The list of field names to which to scope the full-text search. When using fielded
     * search (fieldName:searchExpression) in a full Lucene query, the field names of each fielded search expression
     * take precedence over any field names listed in this parameter.
     *
     * @param searchFields the searchFields value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setSearchFields(List<String> searchFields) {
        this.searchFields = searchFields;
        return this;
    }

    /**
     * Get the searchMode property: A value that specifies whether any or all of the search terms must be matched in
     * order to count the document as a match.
     *
     * @return the searchMode value.
     */
    public SearchMode getSearchMode() {
        return this.searchMode;
    }

    /**
     * Set the searchMode property: A value that specifies whether any or all of the search terms must be matched in
     * order to count the document as a match.
     *
     * @param searchMode the searchMode value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setSearchMode(SearchMode searchMode) {
        this.searchMode = searchMode;
        return this;
    }

    /**
     * Get the select property: The list of fields to retrieve. If unspecified, all fields marked as retrievable in the
     * schema are included.
     *
     * @return the select value.
     */
    public List<String> getSelect() {
        return this.select;
    }

    /**
     * Set the select property: The list of fields to retrieve. If unspecified, all fields marked as retrievable in the
     * schema are included.
     *
     * @param select the select value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setSelect(List<String> select) {
        this.select = select;
        return this;
    }

    /**
     * Get the skip property: The number of search results to skip. This value cannot be greater than 100,000. If you
     * need to scan documents in sequence, but cannot use $skip due to this limitation, consider using $orderby on a
     * totally-ordered key and $filter with a range query instead.
     *
     * @return the skip value.
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * Set the skip property: The number of search results to skip. This value cannot be greater than 100,000. If you
     * need to scan documents in sequence, but cannot use $skip due to this limitation, consider using $orderby on a
     * totally-ordered key and $filter with a range query instead.
     *
     * @param skip the skip value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }

    /**
     * Get the top property: The number of search results to retrieve. This can be used in conjunction with $skip to
     * implement client-side paging of search results. If results are truncated due to server-side paging, the response
     * will include a continuation token that can be used to issue another Search request for the next page of results.
     *
     * @return the top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Set the top property: The number of search results to retrieve. This can be used in conjunction with $skip to
     * implement client-side paging of search results. If results are truncated due to server-side paging, the response
     * will include a continuation token that can be used to issue another Search request for the next page of results.
     *
     * @param top the top value to set.
     * @return the SearchOptions object itself.
     */
    public SearchOptions setTop(Integer top) {
        this.top = top;
        return this;
    }
}
