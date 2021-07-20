// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InformationProtectionPoliciesInformationProtectionPolicyName. */
public final class InformationProtectionPoliciesInformationProtectionPolicyName
    extends ExpandableStringEnum<InformationProtectionPoliciesInformationProtectionPolicyName> {
    /** Static value effective for InformationProtectionPoliciesInformationProtectionPolicyName. */
    public static final InformationProtectionPoliciesInformationProtectionPolicyName EFFECTIVE =
        fromString("effective");

    /** Static value custom for InformationProtectionPoliciesInformationProtectionPolicyName. */
    public static final InformationProtectionPoliciesInformationProtectionPolicyName CUSTOM = fromString("custom");

    /**
     * Creates or finds a InformationProtectionPoliciesInformationProtectionPolicyName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InformationProtectionPoliciesInformationProtectionPolicyName.
     */
    @JsonCreator
    public static InformationProtectionPoliciesInformationProtectionPolicyName fromString(String name) {
        return fromString(name, InformationProtectionPoliciesInformationProtectionPolicyName.class);
    }

    /** @return known InformationProtectionPoliciesInformationProtectionPolicyName values. */
    public static Collection<InformationProtectionPoliciesInformationProtectionPolicyName> values() {
        return values(InformationProtectionPoliciesInformationProtectionPolicyName.class);
    }
}
