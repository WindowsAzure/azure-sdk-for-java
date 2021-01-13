// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RpInMageRecoveryPointType. */
public final class RpInMageRecoveryPointType extends ExpandableStringEnum<RpInMageRecoveryPointType> {
    /** Static value LatestTime for RpInMageRecoveryPointType. */
    public static final RpInMageRecoveryPointType LATEST_TIME = fromString("LatestTime");

    /** Static value LatestTag for RpInMageRecoveryPointType. */
    public static final RpInMageRecoveryPointType LATEST_TAG = fromString("LatestTag");

    /** Static value Custom for RpInMageRecoveryPointType. */
    public static final RpInMageRecoveryPointType CUSTOM = fromString("Custom");

    /**
     * Creates or finds a RpInMageRecoveryPointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RpInMageRecoveryPointType.
     */
    @JsonCreator
    public static RpInMageRecoveryPointType fromString(String name) {
        return fromString(name, RpInMageRecoveryPointType.class);
    }

    /** @return known RpInMageRecoveryPointType values. */
    public static Collection<RpInMageRecoveryPointType> values() {
        return values(RpInMageRecoveryPointType.class);
    }
}
