/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for Status.
 */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value Available for Status. */
    public static final Status AVAILABLE = fromString("Available");

    /** Static value Unavailable for Status. */
    public static final Status UNAVAILABLE = fromString("Unavailable");

    /** Static value Shutdown for Status. */
    public static final Status SHUTDOWN = fromString("Shutdown");

    /** Static value Disconnected for Status. */
    public static final Status DISCONNECTED = fromString("Disconnected");

    /** Static value Upgrading for Status. */
    public static final Status UPGRADING = fromString("Upgrading");

    /** Static value UpgradeFailed for Status. */
    public static final Status UPGRADE_FAILED = fromString("UpgradeFailed");

    /**
     * Creates or finds a Status from its string representation.
     * @param name a name to look for
     * @return the corresponding Status
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /**
     * @return known Status values
     */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
