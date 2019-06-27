/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for X12TimeFormat.
 */
public final class X12TimeFormat extends ExpandableStringEnum<X12TimeFormat> {
    /** Static value NotSpecified for X12TimeFormat. */
    public static final X12TimeFormat NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value HHMM for X12TimeFormat. */
    public static final X12TimeFormat HHMM = fromString("HHMM");

    /** Static value HHMMSS for X12TimeFormat. */
    public static final X12TimeFormat HHMMSS = fromString("HHMMSS");

    /** Static value HHMMSSdd for X12TimeFormat. */
    public static final X12TimeFormat HHMMSSDD = fromString("HHMMSSdd");

    /** Static value HHMMSSd for X12TimeFormat. */
    public static final X12TimeFormat HHMMSSD = fromString("HHMMSSd");

    /**
     * Creates or finds a X12TimeFormat from its string representation.
     * @param name a name to look for
     * @return the corresponding X12TimeFormat
     */
    @JsonCreator
    public static X12TimeFormat fromString(String name) {
        return fromString(name, X12TimeFormat.class);
    }

    /**
     * @return known X12TimeFormat values
     */
    public static Collection<X12TimeFormat> values() {
        return values(X12TimeFormat.class);
    }
}
