/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HealthStatus.
 */
public final class HealthStatus extends ExpandableStringEnum<HealthStatus> {
    /** Static value Healthy for HealthStatus. */
    public static final HealthStatus HEALTHY = fromString("Healthy");

    /** Static value Warning for HealthStatus. */
    public static final HealthStatus WARNING = fromString("Warning");

    /** Static value Error for HealthStatus. */
    public static final HealthStatus ERROR = fromString("Error");

    /** Static value NotMonitored for HealthStatus. */
    public static final HealthStatus NOT_MONITORED = fromString("NotMonitored");

    /** Static value Missing for HealthStatus. */
    public static final HealthStatus MISSING = fromString("Missing");

    /**
     * Creates or finds a HealthStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding HealthStatus
     */
    @JsonCreator
    public static HealthStatus fromString(String name) {
        return fromString(name, HealthStatus.class);
    }

    /**
     * @return known HealthStatus values
     */
    public static Collection<HealthStatus> values() {
        return values(HealthStatus.class);
    }
}
