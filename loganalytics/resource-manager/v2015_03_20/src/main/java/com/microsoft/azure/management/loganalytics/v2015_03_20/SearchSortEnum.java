/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SearchSortEnum.
 */
public final class SearchSortEnum extends ExpandableStringEnum<SearchSortEnum> {
    /** Static value asc for SearchSortEnum. */
    public static final SearchSortEnum ASC = fromString("asc");

    /** Static value desc for SearchSortEnum. */
    public static final SearchSortEnum DESC = fromString("desc");

    /**
     * Creates or finds a SearchSortEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding SearchSortEnum
     */
    @JsonCreator
    public static SearchSortEnum fromString(String name) {
        return fromString(name, SearchSortEnum.class);
    }

    /**
     * @return known SearchSortEnum values
     */
    public static Collection<SearchSortEnum> values() {
        return values(SearchSortEnum.class);
    }
}
