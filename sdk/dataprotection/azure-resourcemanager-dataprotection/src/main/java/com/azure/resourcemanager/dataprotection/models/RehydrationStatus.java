// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RehydrationStatus. */
public final class RehydrationStatus extends ExpandableStringEnum<RehydrationStatus> {
    /** Static value CREATE_IN_PROGRESS for RehydrationStatus. */
    public static final RehydrationStatus CREATE_IN_PROGRESS = fromString("CREATE_IN_PROGRESS");

    /** Static value COMPLETED for RehydrationStatus. */
    public static final RehydrationStatus COMPLETED = fromString("COMPLETED");

    /** Static value DELETE_IN_PROGRESS for RehydrationStatus. */
    public static final RehydrationStatus DELETE_IN_PROGRESS = fromString("DELETE_IN_PROGRESS");

    /** Static value DELETED for RehydrationStatus. */
    public static final RehydrationStatus DELETED = fromString("DELETED");

    /** Static value FAILED for RehydrationStatus. */
    public static final RehydrationStatus FAILED = fromString("FAILED");

    /**
     * Creates or finds a RehydrationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RehydrationStatus.
     */
    @JsonCreator
    public static RehydrationStatus fromString(String name) {
        return fromString(name, RehydrationStatus.class);
    }

    /** @return known RehydrationStatus values. */
    public static Collection<RehydrationStatus> values() {
        return values(RehydrationStatus.class);
    }
}
