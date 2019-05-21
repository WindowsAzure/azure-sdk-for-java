/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2018_09_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WindowsOsState.
 */
public final class WindowsOsState extends ExpandableStringEnum<WindowsOsState> {
    /** Static value NonSysprepped for WindowsOsState. */
    public static final WindowsOsState NON_SYSPREPPED = fromString("NonSysprepped");

    /** Static value SysprepRequested for WindowsOsState. */
    public static final WindowsOsState SYSPREP_REQUESTED = fromString("SysprepRequested");

    /** Static value SysprepApplied for WindowsOsState. */
    public static final WindowsOsState SYSPREP_APPLIED = fromString("SysprepApplied");

    /**
     * Creates or finds a WindowsOsState from its string representation.
     * @param name a name to look for
     * @return the corresponding WindowsOsState
     */
    @JsonCreator
    public static WindowsOsState fromString(String name) {
        return fromString(name, WindowsOsState.class);
    }

    /**
     * @return known WindowsOsState values
     */
    public static Collection<WindowsOsState> values() {
        return values(WindowsOsState.class);
    }
}
