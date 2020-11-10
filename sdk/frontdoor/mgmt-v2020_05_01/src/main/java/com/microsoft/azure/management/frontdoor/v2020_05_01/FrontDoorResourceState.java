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
 * Defines values for FrontDoorResourceState.
 */
public final class FrontDoorResourceState extends ExpandableStringEnum<FrontDoorResourceState> {
    /** Static value Creating for FrontDoorResourceState. */
    public static final FrontDoorResourceState CREATING = fromString("Creating");

    /** Static value Enabling for FrontDoorResourceState. */
    public static final FrontDoorResourceState ENABLING = fromString("Enabling");

    /** Static value Enabled for FrontDoorResourceState. */
    public static final FrontDoorResourceState ENABLED = fromString("Enabled");

    /** Static value Disabling for FrontDoorResourceState. */
    public static final FrontDoorResourceState DISABLING = fromString("Disabling");

    /** Static value Disabled for FrontDoorResourceState. */
    public static final FrontDoorResourceState DISABLED = fromString("Disabled");

    /** Static value Deleting for FrontDoorResourceState. */
    public static final FrontDoorResourceState DELETING = fromString("Deleting");

    /**
     * Creates or finds a FrontDoorResourceState from its string representation.
     * @param name a name to look for
     * @return the corresponding FrontDoorResourceState
     */
    @JsonCreator
    public static FrontDoorResourceState fromString(String name) {
        return fromString(name, FrontDoorResourceState.class);
    }

    /**
     * @return known FrontDoorResourceState values
     */
    public static Collection<FrontDoorResourceState> values() {
        return values(FrontDoorResourceState.class);
    }
}
