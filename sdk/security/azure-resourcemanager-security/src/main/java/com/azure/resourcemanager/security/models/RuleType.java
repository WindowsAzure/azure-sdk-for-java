// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RuleType. */
public final class RuleType extends ExpandableStringEnum<RuleType> {
    /** Static value Binary for RuleType. */
    public static final RuleType BINARY = fromString("Binary");

    /** Static value BaselineExpected for RuleType. */
    public static final RuleType BASELINE_EXPECTED = fromString("BaselineExpected");

    /** Static value PositiveList for RuleType. */
    public static final RuleType POSITIVE_LIST = fromString("PositiveList");

    /** Static value NegativeList for RuleType. */
    public static final RuleType NEGATIVE_LIST = fromString("NegativeList");

    /**
     * Creates or finds a RuleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RuleType.
     */
    @JsonCreator
    public static RuleType fromString(String name) {
        return fromString(name, RuleType.class);
    }

    /** @return known RuleType values. */
    public static Collection<RuleType> values() {
        return values(RuleType.class);
    }
}
