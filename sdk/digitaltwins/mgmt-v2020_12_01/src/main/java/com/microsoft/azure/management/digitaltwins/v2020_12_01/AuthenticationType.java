/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AuthenticationType.
 */
public final class AuthenticationType extends ExpandableStringEnum<AuthenticationType> {
    /** Static value KeyBased for AuthenticationType. */
    public static final AuthenticationType KEY_BASED = fromString("KeyBased");

    /** Static value IdentityBased for AuthenticationType. */
    public static final AuthenticationType IDENTITY_BASED = fromString("IdentityBased");

    /**
     * Creates or finds a AuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding AuthenticationType
     */
    @JsonCreator
    public static AuthenticationType fromString(String name) {
        return fromString(name, AuthenticationType.class);
    }

    /**
     * @return known AuthenticationType values
     */
    public static Collection<AuthenticationType> values() {
        return values(AuthenticationType.class);
    }
}
