// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChangeType. */
public final class ChangeType extends ExpandableStringEnum<ChangeType> {
    /** Static value Add for ChangeType. */
    public static final ChangeType ADD = fromString("Add");

    /** Static value Remove for ChangeType. */
    public static final ChangeType REMOVE = fromString("Remove");

    /** Static value Update for ChangeType. */
    public static final ChangeType UPDATE = fromString("Update");

    /**
     * Creates or finds a ChangeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChangeType.
     */
    @JsonCreator
    public static ChangeType fromString(String name) {
        return fromString(name, ChangeType.class);
    }

    /** @return known ChangeType values. */
    public static Collection<ChangeType> values() {
        return values(ChangeType.class);
    }
}
