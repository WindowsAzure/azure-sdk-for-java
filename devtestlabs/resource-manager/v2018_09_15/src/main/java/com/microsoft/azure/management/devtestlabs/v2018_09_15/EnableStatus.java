/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EnableStatus.
 */
public final class EnableStatus extends ExpandableStringEnum<EnableStatus> {
    /** Static value Enabled for EnableStatus. */
    public static final EnableStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for EnableStatus. */
    public static final EnableStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a EnableStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding EnableStatus
     */
    @JsonCreator
    public static EnableStatus fromString(String name) {
        return fromString(name, EnableStatus.class);
    }

    /**
     * @return known EnableStatus values
     */
    public static Collection<EnableStatus> values() {
        return values(EnableStatus.class);
    }
}
