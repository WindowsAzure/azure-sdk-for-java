/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ConnectionStatus.
 */
public final class ConnectionStatus extends ExpandableStringEnum<ConnectionStatus> {
    /** Static value Unknown for ConnectionStatus. */
    public static final ConnectionStatus UNKNOWN = fromString("Unknown");

    /** Static value Connected for ConnectionStatus. */
    public static final ConnectionStatus CONNECTED = fromString("Connected");

    /** Static value Disconnected for ConnectionStatus. */
    public static final ConnectionStatus DISCONNECTED = fromString("Disconnected");

    /** Static value Degraded for ConnectionStatus. */
    public static final ConnectionStatus DEGRADED = fromString("Degraded");

    /**
     * Creates or finds a ConnectionStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding ConnectionStatus
     */
    @JsonCreator
    public static ConnectionStatus fromString(String name) {
        return fromString(name, ConnectionStatus.class);
    }

    /**
     * @return known ConnectionStatus values
     */
    public static Collection<ConnectionStatus> values() {
        return values(ConnectionStatus.class);
    }
}
