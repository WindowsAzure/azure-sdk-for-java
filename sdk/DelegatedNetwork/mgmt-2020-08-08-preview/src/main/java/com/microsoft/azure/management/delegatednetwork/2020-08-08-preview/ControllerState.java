/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ControllerState.
 */
public final class ControllerState extends ExpandableStringEnum<ControllerState> {
    /** Static value Deleting for ControllerState. */
    public static final ControllerState DELETING = fromString("Deleting");

    /** Static value Succeeded for ControllerState. */
    public static final ControllerState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ControllerState. */
    public static final ControllerState FAILED = fromString("Failed");

    /** Static value Provisioning for ControllerState. */
    public static final ControllerState PROVISIONING = fromString("Provisioning");

    /**
     * Creates or finds a ControllerState from its string representation.
     * @param name a name to look for
     * @return the corresponding ControllerState
     */
    @JsonCreator
    public static ControllerState fromString(String name) {
        return fromString(name, ControllerState.class);
    }

    /**
     * @return known ControllerState values
     */
    public static Collection<ControllerState> values() {
        return values(ControllerState.class);
    }
}
