/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2018_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PolicyType.
 */
public final class PolicyType extends ExpandableStringEnum<PolicyType> {
    /** Static value NotSpecified for PolicyType. */
    public static final PolicyType NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value BuiltIn for PolicyType. */
    public static final PolicyType BUILT_IN = fromString("BuiltIn");

    /** Static value Custom for PolicyType. */
    public static final PolicyType CUSTOM = fromString("Custom");

    /**
     * Creates or finds a PolicyType from its string representation.
     * @param name a name to look for
     * @return the corresponding PolicyType
     */
    @JsonCreator
    public static PolicyType fromString(String name) {
        return fromString(name, PolicyType.class);
    }

    /**
     * @return known PolicyType values
     */
    public static Collection<PolicyType> values() {
        return values(PolicyType.class);
    }
}
