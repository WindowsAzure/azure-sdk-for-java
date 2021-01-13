// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecoveryPlanPointType. */
public final class RecoveryPlanPointType extends ExpandableStringEnum<RecoveryPlanPointType> {
    /** Static value Latest for RecoveryPlanPointType. */
    public static final RecoveryPlanPointType LATEST = fromString("Latest");

    /** Static value LatestApplicationConsistent for RecoveryPlanPointType. */
    public static final RecoveryPlanPointType LATEST_APPLICATION_CONSISTENT = fromString("LatestApplicationConsistent");

    /** Static value LatestCrashConsistent for RecoveryPlanPointType. */
    public static final RecoveryPlanPointType LATEST_CRASH_CONSISTENT = fromString("LatestCrashConsistent");

    /** Static value LatestProcessed for RecoveryPlanPointType. */
    public static final RecoveryPlanPointType LATEST_PROCESSED = fromString("LatestProcessed");

    /**
     * Creates or finds a RecoveryPlanPointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecoveryPlanPointType.
     */
    @JsonCreator
    public static RecoveryPlanPointType fromString(String name) {
        return fromString(name, RecoveryPlanPointType.class);
    }

    /** @return known RecoveryPlanPointType values. */
    public static Collection<RecoveryPlanPointType> values() {
        return values(RecoveryPlanPointType.class);
    }
}
