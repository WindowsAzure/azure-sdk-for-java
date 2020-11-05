/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RuleType.
 */
public final class RuleType extends ExpandableStringEnum<RuleType> {
    /** Static value MatchRule for RuleType. */
    public static final RuleType MATCH_RULE = fromString("MatchRule");

    /** Static value RateLimitRule for RuleType. */
    public static final RuleType RATE_LIMIT_RULE = fromString("RateLimitRule");

    /**
     * Creates or finds a RuleType from its string representation.
     * @param name a name to look for
     * @return the corresponding RuleType
     */
    @JsonCreator
    public static RuleType fromString(String name) {
        return fromString(name, RuleType.class);
    }

    /**
     * @return known RuleType values
     */
    public static Collection<RuleType> values() {
        return values(RuleType.class);
    }
}
