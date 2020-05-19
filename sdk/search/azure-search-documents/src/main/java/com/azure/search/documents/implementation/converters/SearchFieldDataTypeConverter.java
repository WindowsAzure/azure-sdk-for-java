package com.azure.search.documents.implementation.converters;

import com.azure.core.util.logging.ClientLogger;
import com.azure.search.documents.models.SearchFieldDataType;

/**
 * A converter between {@link com.azure.search.documents.implementation.models.SearchFieldDataType} and
 * {@link SearchFieldDataType}.
 */
public final class SearchFieldDataTypeConverter {
    private static final ClientLogger LOGGER = new ClientLogger(SearchFieldDataTypeConverter.class);

    /**
     * Maps from enum {@link com.azure.search.documents.implementation.models.SearchFieldDataType} to enum
     * {@link SearchFieldDataType}.
     */
    public static SearchFieldDataType map(com.azure.search.documents.implementation.models.SearchFieldDataType obj) {
        if (obj == null) {
            return null;
        }
        return SearchFieldDataType.fromString(obj.toString());
    }

    /**
     * Maps from enum {@link SearchFieldDataType} to enum
     * {@link com.azure.search.documents.implementation.models.SearchFieldDataType}.
     */
    public static com.azure.search.documents.implementation.models.SearchFieldDataType map(SearchFieldDataType obj) {
        if (obj == null) {
            return null;
        }
        return com.azure.search.documents.implementation.models.SearchFieldDataType.fromString(obj.toString());
    }
}
