/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PostArgsOperator.
 */
public final class PostArgsOperator extends ExpandableStringEnum<PostArgsOperator> {
    /** Static value Any for PostArgsOperator. */
    public static final PostArgsOperator ANY = fromString("Any");

    /** Static value Equal for PostArgsOperator. */
    public static final PostArgsOperator EQUAL = fromString("Equal");

    /** Static value Contains for PostArgsOperator. */
    public static final PostArgsOperator CONTAINS = fromString("Contains");

    /** Static value BeginsWith for PostArgsOperator. */
    public static final PostArgsOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for PostArgsOperator. */
    public static final PostArgsOperator ENDS_WITH = fromString("EndsWith");

    /** Static value LessThan for PostArgsOperator. */
    public static final PostArgsOperator LESS_THAN = fromString("LessThan");

    /** Static value LessThanOrEqual for PostArgsOperator. */
    public static final PostArgsOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThan for PostArgsOperator. */
    public static final PostArgsOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value GreaterThanOrEqual for PostArgsOperator. */
    public static final PostArgsOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value RegEx for PostArgsOperator. */
    public static final PostArgsOperator REG_EX = fromString("RegEx");

    /**
     * Creates or finds a PostArgsOperator from its string representation.
     * @param name a name to look for
     * @return the corresponding PostArgsOperator
     */
    @JsonCreator
    public static PostArgsOperator fromString(String name) {
        return fromString(name, PostArgsOperator.class);
    }

    /**
     * @return known PostArgsOperator values
     */
    public static Collection<PostArgsOperator> values() {
        return values(PostArgsOperator.class);
    }
}
