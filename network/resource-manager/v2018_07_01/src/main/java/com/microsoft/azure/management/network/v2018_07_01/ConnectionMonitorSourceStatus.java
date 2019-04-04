/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ConnectionMonitorSourceStatus.
 */
public final class ConnectionMonitorSourceStatus extends ExpandableStringEnum<ConnectionMonitorSourceStatus> {
    /** Static value Uknown for ConnectionMonitorSourceStatus. */
    public static final ConnectionMonitorSourceStatus UKNOWN = fromString("Uknown");

    /** Static value Active for ConnectionMonitorSourceStatus. */
    public static final ConnectionMonitorSourceStatus ACTIVE = fromString("Active");

    /** Static value Inactive for ConnectionMonitorSourceStatus. */
    public static final ConnectionMonitorSourceStatus INACTIVE = fromString("Inactive");

    /**
     * Creates or finds a ConnectionMonitorSourceStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ConnectionMonitorSourceStatus
     */
    @JsonCreator
    public static ConnectionMonitorSourceStatus fromString(String name) {
        return fromString(name, ConnectionMonitorSourceStatus.class);
    }

    /**
     * @return known ConnectionMonitorSourceStatus values
     */
    public static Collection<ConnectionMonitorSourceStatus> values() {
        return values(ConnectionMonitorSourceStatus.class);
    }
}
