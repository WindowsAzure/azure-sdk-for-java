/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for PurgeState.
 */
public final class PurgeState extends ExpandableStringEnum<PurgeState> {
    /** Static value pending for PurgeState. */
    public static final PurgeState PENDING = fromString("pending");

    /** Static value completed for PurgeState. */
    public static final PurgeState COMPLETED = fromString("completed");

    /**
     * Creates or finds a PurgeState from its string representation.
     * @param name a name to look for
     * @return the corresponding PurgeState
     */
    @JsonCreator
    public static PurgeState fromString(String name) {
        return fromString(name, PurgeState.class);
    }

    /**
     * @return known PurgeState values
     */
    public static Collection<PurgeState> values() {
        return values(PurgeState.class);
    }
}
