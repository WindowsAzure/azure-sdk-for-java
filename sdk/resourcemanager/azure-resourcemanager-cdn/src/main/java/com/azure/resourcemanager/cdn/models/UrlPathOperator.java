// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UrlPathOperator. */
public final class UrlPathOperator extends ExpandableStringEnum<UrlPathOperator> {
    /** Static value Any for UrlPathOperator. */
    public static final UrlPathOperator ANY = fromString("Any");

    /** Static value Equal for UrlPathOperator. */
    public static final UrlPathOperator EQUAL = fromString("Equal");

    /** Static value Contains for UrlPathOperator. */
    public static final UrlPathOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for UrlPathOperator. */
    public static final UrlPathOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for UrlPathOperator. */
    public static final UrlPathOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for UrlPathOperator. */
    public static final UrlPathOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for UrlPathOperator. */
    public static final UrlPathOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for UrlPathOperator. */
    public static final UrlPathOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for UrlPathOperator. */
    public static final UrlPathOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value Wildcard for UrlPathOperator. */
    public static final UrlPathOperator WILDCARD = fromString("Wildcard");

    /** Static value RegEx for UrlPathOperator. */
    public static final UrlPathOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a UrlPathOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UrlPathOperator.
     */
    @JsonCreator
    public static UrlPathOperator fromString(String name) {
        return fromString(name, UrlPathOperator.class);
    }

    /** @return known UrlPathOperator values. */
    public static Collection<UrlPathOperator> values() {
        return values(UrlPathOperator.class);
    }
}
