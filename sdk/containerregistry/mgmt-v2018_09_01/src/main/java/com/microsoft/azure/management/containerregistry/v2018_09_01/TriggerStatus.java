/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TriggerStatus.
 */
public final class TriggerStatus extends ExpandableStringEnum<TriggerStatus> {
    /** Static value Disabled for TriggerStatus. */
    public static final TriggerStatus DISABLED = fromString("Disabled");

    /** Static value Enabled for TriggerStatus. */
    public static final TriggerStatus ENABLED = fromString("Enabled");

    /**
     * Creates or finds a TriggerStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding TriggerStatus
     */
    @JsonCreator
    public static TriggerStatus fromString(String name) {
        return fromString(name, TriggerStatus.class);
    }

    /**
     * @return known TriggerStatus values
     */
    public static Collection<TriggerStatus> values() {
        return values(TriggerStatus.class);
    }
}
