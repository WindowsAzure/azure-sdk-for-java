/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TokenStatus.
 */
public final class TokenStatus extends ExpandableStringEnum<TokenStatus> {
    /** Static value enabled for TokenStatus. */
    public static final TokenStatus ENABLED = fromString("enabled");

    /** Static value disabled for TokenStatus. */
    public static final TokenStatus DISABLED = fromString("disabled");

    /**
     * Creates or finds a TokenStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding TokenStatus
     */
    @JsonCreator
    public static TokenStatus fromString(String name) {
        return fromString(name, TokenStatus.class);
    }

    /**
     * @return known TokenStatus values
     */
    public static Collection<TokenStatus> values() {
        return values(TokenStatus.class);
    }
}
