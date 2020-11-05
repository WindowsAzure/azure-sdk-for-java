/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for UserType.
 */
public final class UserType extends ExpandableStringEnum<UserType> {
    /** Static value Share for UserType. */
    public static final UserType SHARE = fromString("Share");

    /** Static value LocalManagement for UserType. */
    public static final UserType LOCAL_MANAGEMENT = fromString("LocalManagement");

    /** Static value ARM for UserType. */
    public static final UserType ARM = fromString("ARM");

    /**
     * Creates or finds a UserType from its string representation.
     * @param name a name to look for
     * @return the corresponding UserType
     */
    @JsonCreator
    public static UserType fromString(String name) {
        return fromString(name, UserType.class);
    }

    /**
     * @return known UserType values
     */
    public static Collection<UserType> values() {
        return values(UserType.class);
    }
}
