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
 * Defines values for TokenPasswordName.
 */
public final class TokenPasswordName extends ExpandableStringEnum<TokenPasswordName> {
    /** Static value password1 for TokenPasswordName. */
    public static final TokenPasswordName PASSWORD1 = fromString("password1");

    /** Static value password2 for TokenPasswordName. */
    public static final TokenPasswordName PASSWORD2 = fromString("password2");

    /**
     * Creates or finds a TokenPasswordName from its string representation.
     * @param name a name to look for
     * @return the corresponding TokenPasswordName
     */
    @JsonCreator
    public static TokenPasswordName fromString(String name) {
        return fromString(name, TokenPasswordName.class);
    }

    /**
     * @return known TokenPasswordName values
     */
    public static Collection<TokenPasswordName> values() {
        return values(TokenPasswordName.class);
    }
}
