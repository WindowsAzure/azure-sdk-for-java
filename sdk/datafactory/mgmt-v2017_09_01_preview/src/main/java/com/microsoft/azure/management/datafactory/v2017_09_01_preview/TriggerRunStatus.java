/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for TriggerRunStatus.
 */
public final class TriggerRunStatus extends ExpandableStringEnum<TriggerRunStatus> {
    /** Static value Succeeded for TriggerRunStatus. */
    public static final TriggerRunStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for TriggerRunStatus. */
    public static final TriggerRunStatus FAILED = fromString("Failed");

    /** Static value Inprogress for TriggerRunStatus. */
    public static final TriggerRunStatus INPROGRESS = fromString("Inprogress");

    /**
     * Creates or finds a TriggerRunStatus from its string representation.
     * @param name a name to look for
     * @return the corresponding TriggerRunStatus
     */
    @JsonCreator
    public static TriggerRunStatus fromString(String name) {
        return fromString(name, TriggerRunStatus.class);
    }

    /**
     * @return known TriggerRunStatus values
     */
    public static Collection<TriggerRunStatus> values() {
        return values(TriggerRunStatus.class);
    }
}
