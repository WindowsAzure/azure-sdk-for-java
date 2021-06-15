// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ProtectedItemState. */
public final class ProtectedItemState extends ExpandableStringEnum<ProtectedItemState> {
    /** Static value Invalid for ProtectedItemState. */
    public static final ProtectedItemState INVALID = fromString("Invalid");

    /** Static value IRPending for ProtectedItemState. */
    public static final ProtectedItemState IRPENDING = fromString("IRPending");

    /** Static value Protected for ProtectedItemState. */
    public static final ProtectedItemState PROTECTED = fromString("Protected");

    /** Static value ProtectionError for ProtectedItemState. */
    public static final ProtectedItemState PROTECTION_ERROR = fromString("ProtectionError");

    /** Static value ProtectionStopped for ProtectedItemState. */
    public static final ProtectedItemState PROTECTION_STOPPED = fromString("ProtectionStopped");

    /** Static value ProtectionPaused for ProtectedItemState. */
    public static final ProtectedItemState PROTECTION_PAUSED = fromString("ProtectionPaused");

    /**
     * Creates or finds a ProtectedItemState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProtectedItemState.
     */
    @JsonCreator
    public static ProtectedItemState fromString(String name) {
        return fromString(name, ProtectedItemState.class);
    }

    /** @return known ProtectedItemState values. */
    public static Collection<ProtectedItemState> values() {
        return values(ProtectedItemState.class);
    }
}
