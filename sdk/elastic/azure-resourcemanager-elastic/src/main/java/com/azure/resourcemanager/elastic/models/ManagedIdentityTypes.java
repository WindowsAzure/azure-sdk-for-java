// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedIdentityTypes. */
public final class ManagedIdentityTypes extends ExpandableStringEnum<ManagedIdentityTypes> {
    /** Static value SystemAssigned for ManagedIdentityTypes. */
    public static final ManagedIdentityTypes SYSTEM_ASSIGNED = fromString("SystemAssigned");

    /**
     * Creates or finds a ManagedIdentityTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedIdentityTypes.
     */
    @JsonCreator
    public static ManagedIdentityTypes fromString(String name) {
        return fromString(name, ManagedIdentityTypes.class);
    }

    /** @return known ManagedIdentityTypes values. */
    public static Collection<ManagedIdentityTypes> values() {
        return values(ManagedIdentityTypes.class);
    }
}
