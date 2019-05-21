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
 * Defines values for CostThresholdStatus.
 */
public final class CostThresholdStatus extends ExpandableStringEnum<CostThresholdStatus> {
    /** Static value Enabled for CostThresholdStatus. */
    public static final CostThresholdStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for CostThresholdStatus. */
    public static final CostThresholdStatus DISABLED = fromString("Disabled");

    /**
     * Creates or finds a CostThresholdStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding CostThresholdStatus
     */
    @JsonCreator
    public static CostThresholdStatus fromString(String name) {
        return fromString(name, CostThresholdStatus.class);
    }

    /**
     * @return known CostThresholdStatus values
     */
    public static Collection<CostThresholdStatus> values() {
        return values(CostThresholdStatus.class);
    }
}
