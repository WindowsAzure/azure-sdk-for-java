/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for MonitoringStatus.
 */
public final class MonitoringStatus extends ExpandableStringEnum<MonitoringStatus> {
    /** Static value Enabled for MonitoringStatus. */
    public static final MonitoringStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for MonitoringStatus. */
    public static final MonitoringStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a MonitoringStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding MonitoringStatus
     */
    @JsonCreator
    public static MonitoringStatus fromString(String name) {
        return fromString(name, MonitoringStatus.class);
    }

    /**
     * @return known MonitoringStatus values
     */
    public static Collection<MonitoringStatus> values() {
        return values(MonitoringStatus.class);
    }
}
