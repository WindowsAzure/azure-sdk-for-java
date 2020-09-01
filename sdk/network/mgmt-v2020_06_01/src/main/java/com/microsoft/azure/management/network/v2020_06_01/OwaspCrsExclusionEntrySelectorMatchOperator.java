/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OwaspCrsExclusionEntrySelectorMatchOperator.
 */
public final class OwaspCrsExclusionEntrySelectorMatchOperator extends ExpandableStringEnum<OwaspCrsExclusionEntrySelectorMatchOperator> {
    /** Static value Equals for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator EQUALS = fromString("Equals");

    /** Static value Contains for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator CONTAINS = fromString("Contains");

    /** Static value StartsWith for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator STARTS_WITH = fromString("StartsWith");

    /** Static value EndsWith for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator ENDS_WITH = fromString("EndsWith");

    /** Static value EqualsAny for OwaspCrsExclusionEntrySelectorMatchOperator. */
    public static final OwaspCrsExclusionEntrySelectorMatchOperator EQUALS_ANY = fromString("EqualsAny");

    /**
     * Creates or finds a OwaspCrsExclusionEntrySelectorMatchOperator from its string representation.
     * @param name a name to look for
     * @return the corresponding OwaspCrsExclusionEntrySelectorMatchOperator
     */
    @JsonCreator
    public static OwaspCrsExclusionEntrySelectorMatchOperator fromString(String name) {
        return fromString(name, OwaspCrsExclusionEntrySelectorMatchOperator.class);
    }

    /**
     * @return known OwaspCrsExclusionEntrySelectorMatchOperator values
     */
    public static Collection<OwaspCrsExclusionEntrySelectorMatchOperator> values() {
        return values(OwaspCrsExclusionEntrySelectorMatchOperator.class);
    }
}
