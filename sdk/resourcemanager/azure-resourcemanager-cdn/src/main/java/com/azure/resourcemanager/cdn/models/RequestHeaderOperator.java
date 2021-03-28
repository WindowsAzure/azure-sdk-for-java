// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RequestHeaderOperator. */
public final class RequestHeaderOperator extends ExpandableStringEnum<RequestHeaderOperator> {
    /** Static value Any for RequestHeaderOperator. */
    public static final RequestHeaderOperator ANY = fromString("Any");

    /** Static value Equal for RequestHeaderOperator. */
    public static final RequestHeaderOperator EQUAL = fromString("Equal");

    /** Static value Contains for RequestHeaderOperator. */
    public static final RequestHeaderOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for RequestHeaderOperator. */
    public static final RequestHeaderOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for RequestHeaderOperator. */
    public static final RequestHeaderOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for RequestHeaderOperator. */
    public static final RequestHeaderOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for RequestHeaderOperator. */
    public static final RequestHeaderOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for RequestHeaderOperator. */
    public static final RequestHeaderOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for RequestHeaderOperator. */
    public static final RequestHeaderOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value RegEx for RequestHeaderOperator. */
    public static final RequestHeaderOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a RequestHeaderOperator from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RequestHeaderOperator.
     */
    @JsonCreator
    public static RequestHeaderOperator fromString(String name) {
        return fromString(name, RequestHeaderOperator.class);
    }

    /** @return known RequestHeaderOperator values. */
    public static Collection<RequestHeaderOperator> values() {
        return values(RequestHeaderOperator.class);
    }
}
