// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RoleScope. */
public final class RoleScope extends ExpandableStringEnum<RoleScope> {
    /** Static value / for RoleScope. */
    public static final RoleScope GLOBAL = fromString("/");

    /** Static value /keys for RoleScope. */
    public static final RoleScope KEYS = fromString("/keys");

    /**
     * Creates or finds a RoleScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RoleScope.
     */
    @JsonCreator
    public static RoleScope fromString(String name) {
        return fromString(name, RoleScope.class);
    }

    /** @return known RoleScope values. */
    public static Collection<RoleScope> values() {
        return values(RoleScope.class);
    }
}
