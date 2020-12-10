// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OriginResourceState. */
public final class OriginResourceState extends ExpandableStringEnum<OriginResourceState> {
    /** Static value Creating for OriginResourceState. */
    public static final OriginResourceState CREATING = fromString("Creating");

    /** Static value Active for OriginResourceState. */
    public static final OriginResourceState ACTIVE = fromString("Active");

    /** Static value Deleting for OriginResourceState. */
    public static final OriginResourceState DELETING = fromString("Deleting");

    /**
     * Creates or finds a OriginResourceState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OriginResourceState.
     */
    @JsonCreator
    public static OriginResourceState fromString(String name) {
        return fromString(name, OriginResourceState.class);
    }

    /** @return known OriginResourceState values. */
    public static Collection<OriginResourceState> values() {
        return values(OriginResourceState.class);
    }
}
