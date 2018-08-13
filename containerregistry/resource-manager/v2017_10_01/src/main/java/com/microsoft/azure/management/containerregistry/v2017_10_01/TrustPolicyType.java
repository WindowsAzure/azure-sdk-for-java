/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_10_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TrustPolicyType.
 */
public final class TrustPolicyType extends ExpandableStringEnum<TrustPolicyType> {
    /** Static value Notary for TrustPolicyType. */
    public static final TrustPolicyType NOTARY = fromString("Notary");

    /**
     * Creates or finds a TrustPolicyType from its string representation.
     * @param name a name to look for
     * @return the corresponding TrustPolicyType
     */
    @JsonCreator
    public static TrustPolicyType fromString(String name) {
        return fromString(name, TrustPolicyType.class);
    }

    /**
     * @return known TrustPolicyType values
     */
    public static Collection<TrustPolicyType> values() {
        return values(TrustPolicyType.class);
    }
}
