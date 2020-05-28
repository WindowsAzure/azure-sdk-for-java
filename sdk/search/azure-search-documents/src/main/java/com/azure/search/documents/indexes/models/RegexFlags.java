// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for RegexFlags.
 */
public final class RegexFlags extends ExpandableStringEnum<RegexFlags> {
    /**
     * Static value CANON_EQ for RegexFlags.
     */
    public static final RegexFlags CANON_EQ = fromString("CANON_EQ");

    /**
     * Static value CASE_INSENSITIVE for RegexFlags.
     */
    public static final RegexFlags CASE_INSENSITIVE = fromString("CASE_INSENSITIVE");

    /**
     * Static value COMMENTS for RegexFlags.
     */
    public static final RegexFlags COMMENTS = fromString("COMMENTS");

    /**
     * Static value DOTALL for RegexFlags.
     */
    public static final RegexFlags DOT_ALL = fromString("DOTALL");

    /**
     * Static value LITERAL for RegexFlags.
     */
    public static final RegexFlags LITERAL = fromString("LITERAL");

    /**
     * Static value MULTILINE for RegexFlags.
     */
    public static final RegexFlags MULTILINE = fromString("MULTILINE");

    /**
     * Static value UNICODE_CASE for RegexFlags.
     */
    public static final RegexFlags UNICODE_CASE = fromString("UNICODE_CASE");

    /**
     * Static value UNIX_LINES for RegexFlags.
     */
    public static final RegexFlags UNIX_LINES = fromString("UNIX_LINES");

    /**
     * Creates or finds a RegexFlags from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RegexFlags.
     */
    @JsonCreator
    public static RegexFlags fromString(String name) {
        return fromString(name, RegexFlags.class);
    }

    /**
     * @return known RegexFlags values.
     */
    public static Collection<RegexFlags> values() {
        return values(RegexFlags.class);
    }
}
