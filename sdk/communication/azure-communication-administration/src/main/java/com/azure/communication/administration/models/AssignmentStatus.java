// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AssignmentStatus. */
public final class AssignmentStatus extends ExpandableStringEnum<AssignmentStatus> {
    /** Static value Unassigned for AssignmentStatus. */
    public static final AssignmentStatus UNASSIGNED = fromString("Unassigned");

    /** Static value Unknown for AssignmentStatus. */
    public static final AssignmentStatus UNKNOWN = fromString("Unknown");

    /** Static value UserAssigned for AssignmentStatus. */
    public static final AssignmentStatus USER_ASSIGNED = fromString("UserAssigned");

    /** Static value ConferenceAssigned for AssignmentStatus. */
    public static final AssignmentStatus CONFERENCE_ASSIGNED = fromString("ConferenceAssigned");

    /** Static value FirstPartyAppAssigned for AssignmentStatus. */
    public static final AssignmentStatus FIRST_PARTY_APP_ASSIGNED = fromString("FirstPartyAppAssigned");

    /** Static value ThirdPartyAppAssigned for AssignmentStatus. */
    public static final AssignmentStatus THIRD_PARTY_APP_ASSIGNED = fromString("ThirdPartyAppAssigned");

    /**
     * Creates or finds a AssignmentStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AssignmentStatus.
     */
    @JsonCreator
    public static AssignmentStatus fromString(String name) {
        return fromString(name, AssignmentStatus.class);
    }

    /** @return known AssignmentStatus values. */
    public static Collection<AssignmentStatus> values() {
        return values(AssignmentStatus.class);
    }
}
