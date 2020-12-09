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
 * Defines values for IdentityType.
 */
public final class IdentityType extends ExpandableStringEnum<IdentityType> {
    /** Static value user for IdentityType. */
    public static final IdentityType USER = fromString("user");

    /** Static value application for IdentityType. */
    public static final IdentityType APPLICATION = fromString("application");

    /** Static value managedIdentity for IdentityType. */
    public static final IdentityType MANAGED_IDENTITY = fromString("managedIdentity");

    /** Static value key for IdentityType. */
    public static final IdentityType KEY = fromString("key");

    /**
     * Creates or finds a IdentityType from its string representation.
     * @param name a name to look for
     * @return the corresponding IdentityType
     */
    @JsonCreator
    public static IdentityType fromString(String name) {
        return fromString(name, IdentityType.class);
    }

    /**
     * @return known IdentityType values
     */
    public static Collection<IdentityType> values() {
        return values(IdentityType.class);
    }
}
