// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AccessPolicyRsaAlgo. */
public final class AccessPolicyRsaAlgo extends ExpandableStringEnum<AccessPolicyRsaAlgo> {
    /** Static value RS256 for AccessPolicyRsaAlgo. */
    public static final AccessPolicyRsaAlgo RS256 = fromString("RS256");

    /** Static value RS384 for AccessPolicyRsaAlgo. */
    public static final AccessPolicyRsaAlgo RS384 = fromString("RS384");

    /** Static value RS512 for AccessPolicyRsaAlgo. */
    public static final AccessPolicyRsaAlgo RS512 = fromString("RS512");

    /**
     * Creates or finds a AccessPolicyRsaAlgo from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AccessPolicyRsaAlgo.
     */
    @JsonCreator
    public static AccessPolicyRsaAlgo fromString(String name) {
        return fromString(name, AccessPolicyRsaAlgo.class);
    }

    /** @return known AccessPolicyRsaAlgo values. */
    public static Collection<AccessPolicyRsaAlgo> values() {
        return values(AccessPolicyRsaAlgo.class);
    }
}
