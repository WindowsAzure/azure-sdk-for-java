/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for QueryStringCachingBehavior.
 */
public enum QueryStringCachingBehavior {
    /** Enum value IgnoreQueryString. */
    IGNORE_QUERY_STRING("IgnoreQueryString"),

    /** Enum value BypassCaching. */
    BYPASS_CACHING("BypassCaching"),

    /** Enum value UseQueryString. */
    USE_QUERY_STRING("UseQueryString"),

    /** Enum value NotSet. */
    NOT_SET("NotSet");

    /** The actual serialized value for a QueryStringCachingBehavior instance. */
    private String value;

    QueryStringCachingBehavior(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a QueryStringCachingBehavior instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed QueryStringCachingBehavior object, or null if unable to parse.
     */
    @JsonCreator
    public static QueryStringCachingBehavior fromString(String value) {
        QueryStringCachingBehavior[] items = QueryStringCachingBehavior.values();
        for (QueryStringCachingBehavior item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
