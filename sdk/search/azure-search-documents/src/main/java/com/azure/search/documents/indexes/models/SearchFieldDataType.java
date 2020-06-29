// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SearchFieldDataType.
 */
public final class SearchFieldDataType extends ExpandableStringEnum<SearchFieldDataType> {
    /**
     * Static value Edm.String for SearchFieldDataType.
     */
    public static final SearchFieldDataType STRING = fromString("Edm.String");

    /**
     * Static value Edm.Int32 for SearchFieldDataType.
     */
    public static final SearchFieldDataType INT32 = fromString("Edm.Int32");

    /**
     * Static value Edm.Int64 for SearchFieldDataType.
     */
    public static final SearchFieldDataType INT64 = fromString("Edm.Int64");

    /**
     * Static value Edm.Double for SearchFieldDataType.
     */
    public static final SearchFieldDataType DOUBLE = fromString("Edm.Double");

    /**
     * Static value Edm.Boolean for SearchFieldDataType.
     */
    public static final SearchFieldDataType BOOLEAN = fromString("Edm.Boolean");

    /**
     * Static value Edm.DateTimeOffset for SearchFieldDataType.
     */
    public static final SearchFieldDataType DATE_TIME_OFFSET = fromString("Edm.DateTimeOffset");

    /**
     * Static value Edm.GeographyPoint for SearchFieldDataType.
     */
    public static final SearchFieldDataType GEOGRAPHY_POINT = fromString("Edm.GeographyPoint");

    /**
     * Static value Edm.ComplexType for SearchFieldDataType.
     */
    public static final SearchFieldDataType COMPLEX = fromString("Edm.ComplexType");

    /**
     * Returns a collection of a specific SearchFieldDataType
     * @param dataType the corresponding SearchFieldDataType
     * @return a Collection of the corresponding SearchFieldDataType
     */
    @JsonCreator
    public static SearchFieldDataType collection(SearchFieldDataType dataType) {
        return fromString(String.format("Collection(%s)", dataType.toString()));
    }

    /**
     * Creates or finds a SearchFieldDataType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SearchFieldDataType.
     */
    @JsonCreator
    public static SearchFieldDataType fromString(String name) {
        return fromString(name, SearchFieldDataType.class);
    }

    /**
     * @return known SearchFieldDataType values.
     */
    public static Collection<SearchFieldDataType> values() {
        return values(SearchFieldDataType.class);
    }
}
