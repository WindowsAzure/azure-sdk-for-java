// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ReservationType. */
public final class ReservationType extends ExpandableStringEnum<ReservationType> {
    /** Static value Purchase for ReservationType. */
    public static final ReservationType PURCHASE = fromString("Purchase");

    /** Static value Usage Charge for ReservationType. */
    public static final ReservationType USAGE_CHARGE = fromString("Usage Charge");

    /**
     * Creates or finds a ReservationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReservationType.
     */
    @JsonCreator
    public static ReservationType fromString(String name) {
        return fromString(name, ReservationType.class);
    }

    /** @return known ReservationType values. */
    public static Collection<ReservationType> values() {
        return values(ReservationType.class);
    }
}
