/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ForwardingProtocol.
 */
public final class ForwardingProtocol extends ExpandableStringEnum<ForwardingProtocol> {
    /** Static value HttpOnly for ForwardingProtocol. */
    public static final ForwardingProtocol HTTP_ONLY = fromString("HttpOnly");

    /** Static value HttpsOnly for ForwardingProtocol. */
    public static final ForwardingProtocol HTTPS_ONLY = fromString("HttpsOnly");

    /** Static value MatchRequest for ForwardingProtocol. */
    public static final ForwardingProtocol MATCH_REQUEST = fromString("MatchRequest");

    /**
     * Creates or finds a ForwardingProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding ForwardingProtocol
     */
    @JsonCreator
    public static ForwardingProtocol fromString(String name) {
        return fromString(name, ForwardingProtocol.class);
    }

    /**
     * @return known ForwardingProtocol values
     */
    public static Collection<ForwardingProtocol> values() {
        return values(ForwardingProtocol.class);
    }
}
