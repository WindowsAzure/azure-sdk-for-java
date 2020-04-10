// Copyright (c) Microsoft Corporation. All rights reserved.// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UserType. */
public final class UserType extends ExpandableStringEnum<UserType> {
    /** Static value Member for UserType. */
    public static final UserType MEMBER = fromString("Member");

    /** Static value Guest for UserType. */
    public static final UserType GUEST = fromString("Guest");

    /**
     * Creates or finds a UserType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UserType.
     */
    @JsonCreator
    public static UserType fromString(String name) {
        return fromString(name, UserType.class);
    }

    /** @return known UserType values. */
    public static Collection<UserType> values() {
        return values(UserType.class);
    }
}
