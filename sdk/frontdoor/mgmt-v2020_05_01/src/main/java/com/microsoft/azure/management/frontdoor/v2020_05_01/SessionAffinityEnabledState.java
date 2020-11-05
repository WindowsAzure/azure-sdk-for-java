/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SessionAffinityEnabledState.
 */
public final class SessionAffinityEnabledState extends ExpandableStringEnum<SessionAffinityEnabledState> {
    /** Static value Enabled for SessionAffinityEnabledState. */
    public static final SessionAffinityEnabledState ENABLED = fromString("Enabled");

    /** Static value Disabled for SessionAffinityEnabledState. */
    public static final SessionAffinityEnabledState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a SessionAffinityEnabledState from its string representation.
     * @param name a name to look for
     * @return the corresponding SessionAffinityEnabledState
     */
    @JsonCreator
    public static SessionAffinityEnabledState fromString(String name) {
        return fromString(name, SessionAffinityEnabledState.class);
    }

    /**
     * @return known SessionAffinityEnabledState values
     */
    public static Collection<SessionAffinityEnabledState> values() {
        return values(SessionAffinityEnabledState.class);
    }
}
