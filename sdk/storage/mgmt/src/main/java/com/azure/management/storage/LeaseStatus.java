// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LeaseStatus. */
public final class LeaseStatus extends ExpandableStringEnum<LeaseStatus> {
    /** Static value Locked for LeaseStatus. */
    public static final LeaseStatus LOCKED = fromString("Locked");

    /** Static value Unlocked for LeaseStatus. */
    public static final LeaseStatus UNLOCKED = fromString("Unlocked");

    /**
     * Creates or finds a LeaseStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LeaseStatus.
     */
    @JsonCreator
    public static LeaseStatus fromString(String name) {
        return fromString(name, LeaseStatus.class);
    }

    /** @return known LeaseStatus values. */
    public static Collection<LeaseStatus> values() {
        return values(LeaseStatus.class);
    }
}
