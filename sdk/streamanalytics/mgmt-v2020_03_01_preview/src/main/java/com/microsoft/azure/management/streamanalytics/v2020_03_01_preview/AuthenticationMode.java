/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AuthenticationMode.
 */
public final class AuthenticationMode extends ExpandableStringEnum<AuthenticationMode> {
    /** Static value Msi for AuthenticationMode. */
    public static final AuthenticationMode MSI = fromString("Msi");

    /** Static value UserToken for AuthenticationMode. */
    public static final AuthenticationMode USER_TOKEN = fromString("UserToken");

    /** Static value ConnectionString for AuthenticationMode. */
    public static final AuthenticationMode CONNECTION_STRING = fromString("ConnectionString");

    /**
     * Creates or finds a AuthenticationMode from its string representation.
     * @param name a name to look for
     * @return the corresponding AuthenticationMode
     */
    @JsonCreator
    public static AuthenticationMode fromString(String name) {
        return fromString(name, AuthenticationMode.class);
    }

    /**
     * @return known AuthenticationMode values
     */
    public static Collection<AuthenticationMode> values() {
        return values(AuthenticationMode.class);
    }
}
