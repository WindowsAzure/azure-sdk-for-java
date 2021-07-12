// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for UpdateStatus. */
public final class UpdateStatus extends ExpandableStringEnum<UpdateStatus> {
    /** Static value Pending for UpdateStatus. */
    public static final UpdateStatus PENDING = fromString("Pending");

    /** Static value InProgress for UpdateStatus. */
    public static final UpdateStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Completed for UpdateStatus. */
    public static final UpdateStatus COMPLETED = fromString("Completed");

    /** Static value RetryNow for UpdateStatus. */
    public static final UpdateStatus RETRY_NOW = fromString("RetryNow");

    /** Static value RetryLater for UpdateStatus. */
    public static final UpdateStatus RETRY_LATER = fromString("RetryLater");

    /**
     * Creates or finds a UpdateStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding UpdateStatus.
     */
    @JsonCreator
    public static UpdateStatus fromString(String name) {
        return fromString(name, UpdateStatus.class);
    }

    /** @return known UpdateStatus values. */
    public static Collection<UpdateStatus> values() {
        return values(UpdateStatus.class);
    }
}
