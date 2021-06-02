// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScheduleType. */
public final class ScheduleType extends ExpandableStringEnum<ScheduleType> {
    /** Static value scheduledTime for ScheduleType. */
    public static final ScheduleType SCHEDULED_TIME = fromString("scheduledTime");

    /** Static value realTime for ScheduleType. */
    public static final ScheduleType REAL_TIME = fromString("realTime");

    /**
     * Creates or finds a ScheduleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScheduleType.
     */
    @JsonCreator
    public static ScheduleType fromString(String name) {
        return fromString(name, ScheduleType.class);
    }

    /** @return known ScheduleType values. */
    public static Collection<ScheduleType> values() {
        return values(ScheduleType.class);
    }
}
