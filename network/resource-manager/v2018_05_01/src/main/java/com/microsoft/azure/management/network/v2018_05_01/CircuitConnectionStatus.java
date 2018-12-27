/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CircuitConnectionStatus.
 */
public final class CircuitConnectionStatus extends ExpandableStringEnum<CircuitConnectionStatus> {
    /** Static value Connected for CircuitConnectionStatus. */
    public static final CircuitConnectionStatus CONNECTED = fromString("Connected");

    /** Static value Connecting for CircuitConnectionStatus. */
    public static final CircuitConnectionStatus CONNECTING = fromString("Connecting");

    /** Static value Disconnected for CircuitConnectionStatus. */
    public static final CircuitConnectionStatus DISCONNECTED = fromString("Disconnected");

    /**
     * Creates or finds a CircuitConnectionStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding CircuitConnectionStatus
     */
    @JsonCreator
    public static CircuitConnectionStatus fromString(String name) {
        return fromString(name, CircuitConnectionStatus.class);
    }

    /**
     * @return known CircuitConnectionStatus values
     */
    public static Collection<CircuitConnectionStatus> values() {
        return values(CircuitConnectionStatus.class);
    }
}
