package com.azure.search.documents.implementation.converters;

import com.azure.search.documents.implementation.models.SearchIndexerStatus;

/**
 * Auto generated code for default converter.
 * Update {@code convert} methods if {@link com.azure.search.documents.models.IndexerExecutionInfo} and
 * {@link SearchIndexerStatus} mismatch.
 */
public final class IndexerExecutionInfoConverter {
    public static SearchIndexerStatus convert(com.azure.search.documents.models.IndexerExecutionInfo obj) {
        return DefaultConverter.convert(obj, SearchIndexerStatus.class);
    }

    public static com.azure.search.documents.models.SearchIndexerStatus convert(SearchIndexerStatus obj) {
        return DefaultConverter.convert(obj, com.azure.search.documents.models.SearchIndexerStatus.class);
    }
}
