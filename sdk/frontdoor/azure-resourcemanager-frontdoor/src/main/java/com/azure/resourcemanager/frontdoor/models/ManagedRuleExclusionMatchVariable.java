// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedRuleExclusionMatchVariable. */
public final class ManagedRuleExclusionMatchVariable extends ExpandableStringEnum<ManagedRuleExclusionMatchVariable> {
    /** Static value RequestHeaderNames for ManagedRuleExclusionMatchVariable. */
    public static final ManagedRuleExclusionMatchVariable REQUEST_HEADER_NAMES = fromString("RequestHeaderNames");

    /** Static value RequestCookieNames for ManagedRuleExclusionMatchVariable. */
    public static final ManagedRuleExclusionMatchVariable REQUEST_COOKIE_NAMES = fromString("RequestCookieNames");

    /** Static value QueryStringArgNames for ManagedRuleExclusionMatchVariable. */
    public static final ManagedRuleExclusionMatchVariable QUERY_STRING_ARG_NAMES = fromString("QueryStringArgNames");

    /** Static value RequestBodyPostArgNames for ManagedRuleExclusionMatchVariable. */
    public static final ManagedRuleExclusionMatchVariable REQUEST_BODY_POST_ARG_NAMES =
        fromString("RequestBodyPostArgNames");

    /** Static value RequestBodyJsonArgNames for ManagedRuleExclusionMatchVariable. */
    public static final ManagedRuleExclusionMatchVariable REQUEST_BODY_JSON_ARG_NAMES =
        fromString("RequestBodyJsonArgNames");

    /**
     * Creates or finds a ManagedRuleExclusionMatchVariable from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedRuleExclusionMatchVariable.
     */
    @JsonCreator
    public static ManagedRuleExclusionMatchVariable fromString(String name) {
        return fromString(name, ManagedRuleExclusionMatchVariable.class);
    }

    /** @return known ManagedRuleExclusionMatchVariable values. */
    public static Collection<ManagedRuleExclusionMatchVariable> values() {
        return values(ManagedRuleExclusionMatchVariable.class);
    }
}
