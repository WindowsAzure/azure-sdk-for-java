/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20.implementation;

import java.util.List;
import com.microsoft.azure.management.loganalytics.v2015_03_20.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Value object for saved search results.
 */
@JsonFlatten
public class SavedSearchInner extends ProxyResource {
    /**
     * The ETag of the saved search.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The category of the saved search. This helps the user to find a saved
     * search faster.
     */
    @JsonProperty(value = "properties.category", required = true)
    private String category;

    /**
     * Saved search display name.
     */
    @JsonProperty(value = "properties.displayName", required = true)
    private String displayName;

    /**
     * The query expression for the saved search. Please see
     * https://docs.microsoft.com/en-us/azure/log-analytics/log-analytics-search-reference
     * for reference.
     */
    @JsonProperty(value = "properties.query", required = true)
    private String query;

    /**
     * The version number of the query language. The current version is 2 and
     * is the default.
     */
    @JsonProperty(value = "properties.version")
    private Long version;

    /**
     * The tags attached to the saved search.
     */
    @JsonProperty(value = "properties.tags")
    private List<Tag> tags;

    /**
     * Get the ETag of the saved search.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the ETag of the saved search.
     *
     * @param eTag the eTag value to set
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the category of the saved search. This helps the user to find a saved search faster.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category of the saved search. This helps the user to find a saved search faster.
     *
     * @param category the category value to set
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get saved search display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set saved search display name.
     *
     * @param displayName the displayName value to set
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the query expression for the saved search. Please see https://docs.microsoft.com/en-us/azure/log-analytics/log-analytics-search-reference for reference.
     *
     * @return the query value
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query expression for the saved search. Please see https://docs.microsoft.com/en-us/azure/log-analytics/log-analytics-search-reference for reference.
     *
     * @param query the query value to set
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get the version number of the query language. The current version is 2 and is the default.
     *
     * @return the version value
     */
    public Long version() {
        return this.version;
    }

    /**
     * Set the version number of the query language. The current version is 2 and is the default.
     *
     * @param version the version value to set
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * Get the tags attached to the saved search.
     *
     * @return the tags value
     */
    public List<Tag> tags() {
        return this.tags;
    }

    /**
     * Set the tags attached to the saved search.
     *
     * @param tags the tags value to set
     * @return the SavedSearchInner object itself.
     */
    public SavedSearchInner withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

}
