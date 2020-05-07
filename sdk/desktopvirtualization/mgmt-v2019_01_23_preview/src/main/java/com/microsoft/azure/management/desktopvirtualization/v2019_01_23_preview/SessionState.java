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
 * Defines values for SessionState.
 */
public final class SessionState extends ExpandableStringEnum<SessionState> {
    /** Static value Unknown for SessionState. */
    public static final SessionState UNKNOWN = fromString("Unknown");

    /** Static value Active for SessionState. */
    public static final SessionState ACTIVE = fromString("Active");

    /** Static value Disconnected for SessionState. */
    public static final SessionState DISCONNECTED = fromString("Disconnected");

    /** Static value Pending for SessionState. */
    public static final SessionState PENDING = fromString("Pending");

    /** Static value LogOff for SessionState. */
    public static final SessionState LOG_OFF = fromString("LogOff");

    /** Static value UserProfileDiskMounted for SessionState. */
    public static final SessionState USER_PROFILE_DISK_MOUNTED = fromString("UserProfileDiskMounted");

    /**
     * Creates or finds a SessionState from its string representation.
     * @param name a name to look for
     * @return the corresponding SessionState
     */
    @JsonCreator
    public static SessionState fromString(String name) {
        return fromString(name, SessionState.class);
    }

    /**
     * @return known SessionState values
     */
    public static Collection<SessionState> values() {
        return values(SessionState.class);
    }
}
