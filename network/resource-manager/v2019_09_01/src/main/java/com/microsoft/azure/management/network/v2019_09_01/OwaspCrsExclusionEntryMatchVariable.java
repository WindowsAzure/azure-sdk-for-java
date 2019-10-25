/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OwaspCrsExclusionEntryMatchVariable.
 */
public final class OwaspCrsExclusionEntryMatchVariable extends ExpandableStringEnum<OwaspCrsExclusionEntryMatchVariable> {
    /** Static value RequestHeaderNames for OwaspCrsExclusionEntryMatchVariable. */
    public static final OwaspCrsExclusionEntryMatchVariable REQUEST_HEADER_NAMES = fromString("RequestHeaderNames");

    /** Static value RequestCookieNames for OwaspCrsExclusionEntryMatchVariable. */
    public static final OwaspCrsExclusionEntryMatchVariable REQUEST_COOKIE_NAMES = fromString("RequestCookieNames");

    /** Static value RequestArgNames for OwaspCrsExclusionEntryMatchVariable. */
    public static final OwaspCrsExclusionEntryMatchVariable REQUEST_ARG_NAMES = fromString("RequestArgNames");

    /**
     * Creates or finds a OwaspCrsExclusionEntryMatchVariable from its string representation.
     * @param name a name to look for
     * @return the corresponding OwaspCrsExclusionEntryMatchVariable
     */
    @JsonCreator
    public static OwaspCrsExclusionEntryMatchVariable fromString(String name) {
        return fromString(name, OwaspCrsExclusionEntryMatchVariable.class);
    }

    /**
     * @return known OwaspCrsExclusionEntryMatchVariable values
     */
    public static Collection<OwaspCrsExclusionEntryMatchVariable> values() {
        return values(OwaspCrsExclusionEntryMatchVariable.class);
    }
}
