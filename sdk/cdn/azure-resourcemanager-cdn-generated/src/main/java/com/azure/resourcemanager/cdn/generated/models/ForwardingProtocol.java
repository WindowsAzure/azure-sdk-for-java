// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ForwardingProtocol. */
public final class ForwardingProtocol extends ExpandableStringEnum<ForwardingProtocol> {
    /** Static value HttpOnly for ForwardingProtocol. */
    public static final ForwardingProtocol HTTP_ONLY = fromString("HttpOnly");

    /** Static value HttpsOnly for ForwardingProtocol. */
    public static final ForwardingProtocol HTTPS_ONLY = fromString("HttpsOnly");

    /** Static value MatchRequest for ForwardingProtocol. */
    public static final ForwardingProtocol MATCH_REQUEST = fromString("MatchRequest");

    /**
     * Creates or finds a ForwardingProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ForwardingProtocol.
     */
    @JsonCreator
    public static ForwardingProtocol fromString(String name) {
        return fromString(name, ForwardingProtocol.class);
    }

    /** @return known ForwardingProtocol values. */
    public static Collection<ForwardingProtocol> values() {
        return values(ForwardingProtocol.class);
    }
}
