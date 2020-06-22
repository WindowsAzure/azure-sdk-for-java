// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ConnectionStatus. */
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
     *
     * @param name a name to look for.
     * @return the corresponding ConnectionStatus.
     */
    @JsonCreator
    public static ConnectionStatus fromString(String name) {
        return fromString(name, ConnectionStatus.class);
    }

    /** @return known ConnectionStatus values. */
    public static Collection<ConnectionStatus> values() {
        return values(ConnectionStatus.class);
    }
}
