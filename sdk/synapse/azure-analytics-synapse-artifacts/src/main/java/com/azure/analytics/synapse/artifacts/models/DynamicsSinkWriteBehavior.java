// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DynamicsSinkWriteBehavior. */
public final class DynamicsSinkWriteBehavior extends ExpandableStringEnum<DynamicsSinkWriteBehavior> {
    /** Static value Upsert for DynamicsSinkWriteBehavior. */
    public static final DynamicsSinkWriteBehavior UPSERT = fromString("Upsert");

    /**
     * Creates or finds a DynamicsSinkWriteBehavior from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DynamicsSinkWriteBehavior.
     */
    @JsonCreator
    public static DynamicsSinkWriteBehavior fromString(String name) {
        return fromString(name, DynamicsSinkWriteBehavior.class);
    }

    /** @return known DynamicsSinkWriteBehavior values. */
    public static Collection<DynamicsSinkWriteBehavior> values() {
        return values(DynamicsSinkWriteBehavior.class);
    }
}
