// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;

/**
 * Additional parameters for suggestGet operation.
 */
@Fluent
public final class SuggestOptions {
    /*
     * An OData expression that filters the documents considered for
     * suggestions.
     */
    @JsonProperty(value = "")
    private String filter;

    /*
     * A value indicating whether to use fuzzy matching for the suggestions
     * query. Default is false. When set to true, the query will find terms
     * even if there's a substituted or missing character in the search text.
     * While this provides a better experience in some scenarios, it comes at a
     * performance cost as fuzzy suggestions queries are slower and consume
     * more resources.
     */
    @JsonProperty(value = "")
    private Boolean useFuzzyMatching;

    /*
     * A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting of suggestions is
     * disabled.
     */
    @JsonProperty(value = "")
    private String highlightPostTag;

    /*
     * A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting of suggestions is
     * disabled.
     */
    @JsonProperty(value = "")
    private String highlightPreTag;

    /*
     * A number between 0 and 100 indicating the percentage of the index that
     * must be covered by a suggestions query in order for the query to be
     * reported as a success. This parameter can be useful for ensuring search
     * availability even for services with only one replica. The default is 80.
     */
    @JsonProperty(value = "")
    private Double minimumCoverage;

    /*
     * The list of OData $orderby expressions by which to sort the results.
     * Each expression can be either a field name or a call to either the
     * geo.distance() or the search.score() functions. Each expression can be
     * followed by asc to indicate ascending, or desc to indicate descending.
     * The default is ascending order. Ties will be broken by the match scores
     * of documents. If no $orderby is specified, the default sort order is
     * descending by document match score. There can be at most 32 $orderby
     * clauses.
     */
    @JsonProperty(value = "")
    private List<String> orderBy;

    /*
     * The list of field names to search for the specified search text. Target
     * fields must be included in the specified suggester.
     */
    @JsonProperty(value = "")
    private List<String> searchFields;

    /*
     * The list of fields to retrieve. If unspecified, only the key field will
     * be included in the results.
     */
    @JsonProperty(value = "")
    private List<String> select;

    /*
     * The number of suggestions to retrieve. The value must be a number
     * between 1 and 100. The default is 5.
     */
    @JsonProperty(value = "")
    private Integer top;

    /**
     * Get the filter property: An OData expression that filters the documents
     * considered for suggestions.
     *
     * @return the filter value.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: An OData expression that filters the documents
     * considered for suggestions.
     *
     * @param filter the filter value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the useFuzzyMatching property: A value indicating whether to use
     * fuzzy matching for the suggestions query. Default is false. When set to
     * true, the query will find terms even if there's a substituted or missing
     * character in the search text. While this provides a better experience in
     * some scenarios, it comes at a performance cost as fuzzy suggestions
     * queries are slower and consume more resources.
     *
     * @return the useFuzzyMatching value.
     */
    public Boolean useFuzzyMatching() {
        return this.useFuzzyMatching;
    }

    /**
     * Set the useFuzzyMatching property: A value indicating whether to use
     * fuzzy matching for the suggestions query. Default is false. When set to
     * true, the query will find terms even if there's a substituted or missing
     * character in the search text. While this provides a better experience in
     * some scenarios, it comes at a performance cost as fuzzy suggestions
     * queries are slower and consume more resources.
     *
     * @param useFuzzyMatching the useFuzzyMatching value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setUseFuzzyMatching(Boolean useFuzzyMatching) {
        this.useFuzzyMatching = useFuzzyMatching;
        return this;
    }

    /**
     * Get the highlightPostTag property: A string tag that is appended to hit
     * highlights. Must be set with highlightPreTag. If omitted, hit
     * highlighting of suggestions is disabled.
     *
     * @return the highlightPostTag value.
     */
    public String getHighlightPostTag() {
        return this.highlightPostTag;
    }

    /**
     * Set the highlightPostTag property: A string tag that is appended to hit
     * highlights. Must be set with highlightPreTag. If omitted, hit
     * highlighting of suggestions is disabled.
     *
     * @param highlightPostTag the highlightPostTag value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setHighlightPostTag(String highlightPostTag) {
        this.highlightPostTag = highlightPostTag;
        return this;
    }

    /**
     * Get the highlightPreTag property: A string tag that is prepended to hit
     * highlights. Must be set with highlightPostTag. If omitted, hit
     * highlighting of suggestions is disabled.
     *
     * @return the highlightPreTag value.
     */
    public String getHighlightPreTag() {
        return this.highlightPreTag;
    }

    /**
     * Set the highlightPreTag property: A string tag that is prepended to hit
     * highlights. Must be set with highlightPostTag. If omitted, hit
     * highlighting of suggestions is disabled.
     *
     * @param highlightPreTag the highlightPreTag value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setHighlightPreTag(String highlightPreTag) {
        this.highlightPreTag = highlightPreTag;
        return this;
    }

    /**
     * Get the minimumCoverage property: A number between 0 and 100 indicating
     * the percentage of the index that must be covered by a suggestions query
     * in order for the query to be reported as a success. This parameter can
     * be useful for ensuring search availability even for services with only
     * one replica. The default is 80.
     *
     * @return the minimumCoverage value.
     */
    public Double getMinimumCoverage() {
        return this.minimumCoverage;
    }

    /**
     * Set the minimumCoverage property: A number between 0 and 100 indicating
     * the percentage of the index that must be covered by a suggestions query
     * in order for the query to be reported as a success. This parameter can
     * be useful for ensuring search availability even for services with only
     * one replica. The default is 80.
     *
     * @param minimumCoverage the minimumCoverage value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setMinimumCoverage(Double minimumCoverage) {
        this.minimumCoverage = minimumCoverage;
        return this;
    }

    /**
     * Get the orderBy property: The list of OData $orderby expressions by
     * which to sort the results. Each expression can be either a field name or
     * a call to either the geo.distance() or the search.score() functions.
     * Each expression can be followed by asc to indicate ascending, or desc to
     * indicate descending. The default is ascending order. Ties will be broken
     * by the match scores of documents. If no $orderby is specified, the
     * default sort order is descending by document match score. There can be
     * at most 32 $orderby clauses.
     *
     * @return the orderBy value.
     */
    public List<String> getOrderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: The list of OData $orderby expressions by
     * which to sort the results. Each expression can be either a field name or
     * a call to either the geo.distance() or the search.score() functions.
     * Each expression can be followed by asc to indicate ascending, or desc to
     * indicate descending. The default is ascending order. Ties will be broken
     * by the match scores of documents. If no $orderby is specified, the
     * default sort order is descending by document match score. There can be
     * at most 32 $orderby clauses.
     *
     * @param orderBy the orderBy value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setOrderBy(String... orderBy) {
        this.orderBy = (orderBy == null) ? null : Arrays.asList(orderBy);
        return this;
    }

    /**
     * Get the searchFields property: The list of field names to search for the
     * specified search text. Target fields must be included in the specified
     * suggester.
     *
     * @return the searchFields value.
     */
    public List<String> getSearchFields() {
        return this.searchFields;
    }

    /**
     * Set the searchFields property: The list of field names to search for the
     * specified search text. Target fields must be included in the specified
     * suggester.
     *
     * @param searchFields the searchFields value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setSearchFields(String... searchFields) {
        this.searchFields = (searchFields == null) ? null : Arrays.asList(searchFields);
        return this;
    }

    /**
     * Get the select property: The list of fields to retrieve. If unspecified,
     * only the key field will be included in the results.
     *
     * @return the select value.
     */
    public List<String> getSelect() {
        return this.select;
    }

    /**
     * Set the select property: The list of fields to retrieve. If unspecified,
     * only the key field will be included in the results.
     *
     * @param select the select value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setSelect(String... select) {
        this.select = (select == null) ? null : Arrays.asList(select);
        return this;
    }

    /**
     * Get the top property: The number of suggestions to retrieve. The value
     * must be a number between 1 and 100. The default is 5.
     *
     * @return the top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Set the top property: The number of suggestions to retrieve. The value
     * must be a number between 1 and 100. The default is 5.
     *
     * @param top the top value to set.
     * @return the SuggestOptions object itself.
     */
    public SuggestOptions setTop(Integer top) {
        this.top = top;
        return this;
    }
}
