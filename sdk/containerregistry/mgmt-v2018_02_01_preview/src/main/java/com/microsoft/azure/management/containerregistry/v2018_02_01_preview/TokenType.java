/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TokenType.
 */
public final class TokenType extends ExpandableStringEnum<TokenType> {
    /** Static value PAT for TokenType. */
    public static final TokenType PAT = fromString("PAT");

    /** Static value OAuth for TokenType. */
    public static final TokenType OAUTH = fromString("OAuth");

    /**
     * Creates or finds a TokenType from its string representation.
     * @param name a name to look for
     * @return the corresponding TokenType
     */
    @JsonCreator
    public static TokenType fromString(String name) {
        return fromString(name, TokenType.class);
    }

    /**
     * @return known TokenType values
     */
    public static Collection<TokenType> values() {
        return values(TokenType.class);
    }
}
