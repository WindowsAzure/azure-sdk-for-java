// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TimeGrainType. */
public final class TimeGrainType extends ExpandableStringEnum<TimeGrainType> {
    /** Static value Monthly for TimeGrainType. */
    public static final TimeGrainType MONTHLY = fromString("Monthly");

    /** Static value Quarterly for TimeGrainType. */
    public static final TimeGrainType QUARTERLY = fromString("Quarterly");

    /** Static value Annually for TimeGrainType. */
    public static final TimeGrainType ANNUALLY = fromString("Annually");

    /** Static value BillingMonth for TimeGrainType. */
    public static final TimeGrainType BILLING_MONTH = fromString("BillingMonth");

    /** Static value BillingQuarter for TimeGrainType. */
    public static final TimeGrainType BILLING_QUARTER = fromString("BillingQuarter");

    /** Static value BillingAnnual for TimeGrainType. */
    public static final TimeGrainType BILLING_ANNUAL = fromString("BillingAnnual");

    /**
     * Creates or finds a TimeGrainType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TimeGrainType.
     */
    @JsonCreator
    public static TimeGrainType fromString(String name) {
        return fromString(name, TimeGrainType.class);
    }

    /** @return known TimeGrainType values. */
    public static Collection<TimeGrainType> values() {
        return values(TimeGrainType.class);
    }
}
