/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_11_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LeaseStatus.
 */
public final class LeaseStatus extends ExpandableStringEnum<LeaseStatus> {
    /** Static value Locked for LeaseStatus. */
    public static final LeaseStatus LOCKED = fromString("Locked");

    /** Static value Unlocked for LeaseStatus. */
    public static final LeaseStatus UNLOCKED = fromString("Unlocked");

    /**
     * Creates or finds a LeaseStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding LeaseStatus
     */
    @JsonCreator
    public static LeaseStatus fromString(String name) {
        return fromString(name, LeaseStatus.class);
    }

    /**
     * @return known LeaseStatus values
     */
    public static Collection<LeaseStatus> values() {
        return values(LeaseStatus.class);
    }
}
