// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DomainValidationState. */
public final class DomainValidationState extends ExpandableStringEnum<DomainValidationState> {
    /** Static value Unknown for DomainValidationState. */
    public static final DomainValidationState UNKNOWN = fromString("Unknown");

    /** Static value Submitting for DomainValidationState. */
    public static final DomainValidationState SUBMITTING = fromString("Submitting");

    /** Static value Pending for DomainValidationState. */
    public static final DomainValidationState PENDING = fromString("Pending");

    /** Static value TimedOut for DomainValidationState. */
    public static final DomainValidationState TIMED_OUT = fromString("TimedOut");

    /** Static value PendingRevalidation for DomainValidationState. */
    public static final DomainValidationState PENDING_REVALIDATION = fromString("PendingRevalidation");

    /** Static value Approved for DomainValidationState. */
    public static final DomainValidationState APPROVED = fromString("Approved");

    /**
     * Creates or finds a DomainValidationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DomainValidationState.
     */
    @JsonCreator
    public static DomainValidationState fromString(String name) {
        return fromString(name, DomainValidationState.class);
    }

    /** @return known DomainValidationState values. */
    public static Collection<DomainValidationState> values() {
        return values(DomainValidationState.class);
    }
}
