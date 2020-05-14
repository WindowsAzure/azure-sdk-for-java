// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LeaseContainerRequestAction. */
public final class LeaseContainerRequestAction extends ExpandableStringEnum<LeaseContainerRequestAction> {
    /** Static value Acquire for LeaseContainerRequestAction. */
    public static final LeaseContainerRequestAction ACQUIRE = fromString("Acquire");

    /** Static value Renew for LeaseContainerRequestAction. */
    public static final LeaseContainerRequestAction RENEW = fromString("Renew");

    /** Static value Change for LeaseContainerRequestAction. */
    public static final LeaseContainerRequestAction CHANGE = fromString("Change");

    /** Static value Release for LeaseContainerRequestAction. */
    public static final LeaseContainerRequestAction RELEASE = fromString("Release");

    /** Static value Break for LeaseContainerRequestAction. */
    public static final LeaseContainerRequestAction BREAK = fromString("Break");

    /**
     * Creates or finds a LeaseContainerRequestAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LeaseContainerRequestAction.
     */
    @JsonCreator
    public static LeaseContainerRequestAction fromString(String name) {
        return fromString(name, LeaseContainerRequestAction.class);
    }

    /** @return known LeaseContainerRequestAction values. */
    public static Collection<LeaseContainerRequestAction> values() {
        return values(LeaseContainerRequestAction.class);
    }
}
