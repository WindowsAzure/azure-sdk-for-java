// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.implementation.converters;

import com.azure.core.util.serializer.JsonSerializer;
import com.azure.core.util.serializer.ObjectSerializer;
import com.azure.search.documents.SearchDocument;
import com.azure.search.documents.models.SearchResult;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SearchResult} and {@link SearchResult}.
 */
public final class SearchResultConverter {
    /**
     * Maps from {@link com.azure.search.documents.implementation.models.SearchResult} to {@link SearchResult}.
     */
    public static SearchResult map(com.azure.search.documents.implementation.models.SearchResult obj,
        ObjectSerializer serializer) {
        if (obj == null) {
            return null;
        }
        SearchResult searchResult = new SearchResult(obj.getScore());

        if (obj.getHighlights() != null) {
            Map<String, List<String>> highlights =
                obj.getHighlights().entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                    Map.Entry::getValue));
            SearchResultHelper.setHighlights(searchResult, highlights);
        }
        SearchResultHelper.setJsonSerializer(searchResult, (JsonSerializer) serializer);

        SearchDocument additionalProperties = new SearchDocument(obj.getAdditionalProperties());
<<<<<<< HEAD
        PrivateFieldAccessHelper.set(searchResult, "additionalProperties", additionalProperties);
        return searchResult;
    }

    /**
     * Maps from {@link SearchResult} to {@link com.azure.search.documents.implementation.models.SearchResult}.
     */
    public static com.azure.search.documents.implementation.models.SearchResult map(SearchResult obj) {
        if (obj == null) {
            return null;
        }
        com.azure.search.documents.implementation.models.SearchResult searchResult =
            new com.azure.search.documents.implementation.models.SearchResult(obj.getScore());

        if (obj.getHighlights() != null) {
            Map<String, List<String>> highlights =
                obj.getHighlights().entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                    Map.Entry::getValue));
            PrivateFieldAccessHelper.set(searchResult, "highlights", highlights);
        }

        SearchDocument additionalProperties = obj.getDocument(SearchDocument.class);
        PrivateFieldAccessHelper.set(searchResult, "additionalProperties", additionalProperties);
        searchResult.validate();
=======
        SearchResultHelper.setAdditionalProperties(searchResult, additionalProperties);
>>>>>>> bfd056a1647f7232e7d7cb82ca2a5ad85b9bb6ec
        return searchResult;
    }

    private SearchResultConverter() {
    }
}
