// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.attestation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PolicyModification. */
public final class PolicyModification extends ExpandableStringEnum<PolicyModification> {
    /** Static value Updated for PolicyModification. */
    public static final PolicyModification UPDATED = fromString("Updated");

    /** Static value Removed for PolicyModification. */
    public static final PolicyModification REMOVED = fromString("Removed");

    /**
     * Creates or finds a PolicyModification from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PolicyModification.
     */
    @JsonCreator
    public static PolicyModification fromString(String name) {
        return fromString(name, PolicyModification.class);
    }

    /** @return known PolicyModification values. */
    public static Collection<PolicyModification> values() {
        return values(PolicyModification.class);
    }
}
