/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ExecutionState.
 */
public final class ExecutionState extends ExpandableStringEnum<ExecutionState> {
    /** Static value Unknown for ExecutionState. */
    public static final ExecutionState UNKNOWN = fromString("Unknown");

    /** Static value Pending for ExecutionState. */
    public static final ExecutionState PENDING = fromString("Pending");

    /** Static value Running for ExecutionState. */
    public static final ExecutionState RUNNING = fromString("Running");

    /** Static value Failed for ExecutionState. */
    public static final ExecutionState FAILED = fromString("Failed");

    /** Static value Succeeded for ExecutionState. */
    public static final ExecutionState SUCCEEDED = fromString("Succeeded");

    /** Static value TimedOut for ExecutionState. */
    public static final ExecutionState TIMED_OUT = fromString("TimedOut");

    /** Static value Canceled for ExecutionState. */
    public static final ExecutionState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a ExecutionState from its string representation.
     * @param name a name to look for
     * @return the corresponding ExecutionState
     */
    @JsonCreator
    public static ExecutionState fromString(String name) {
        return fromString(name, ExecutionState.class);
    }

    /**
     * @return known ExecutionState values
     */
    public static Collection<ExecutionState> values() {
        return values(ExecutionState.class);
    }
}
