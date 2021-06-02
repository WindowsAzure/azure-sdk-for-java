// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TimeType. */
public final class TimeType extends ExpandableStringEnum<TimeType> {
    /** Static value arrival for TimeType. */
    public static final TimeType ARRIVAL = fromString("arrival");

    /** Static value departure for TimeType. */
    public static final TimeType DEPARTURE = fromString("departure");

    /** Static value last for TimeType. */
    public static final TimeType LAST = fromString("last");

    /**
     * Creates or finds a TimeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TimeType.
     */
    @JsonCreator
    public static TimeType fromString(String name) {
        return fromString(name, TimeType.class);
    }

    /** @return known TimeType values. */
    public static Collection<TimeType> values() {
        return values(TimeType.class);
    }
}
