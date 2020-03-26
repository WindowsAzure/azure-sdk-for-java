// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for JobAgentState.
 */
public final class JobAgentState extends ExpandableStringEnum<JobAgentState> {
    /**
     * Static value Creating for JobAgentState.
     */
    public static final JobAgentState CREATING = fromString("Creating");

    /**
     * Static value Ready for JobAgentState.
     */
    public static final JobAgentState READY = fromString("Ready");

    /**
     * Static value Updating for JobAgentState.
     */
    public static final JobAgentState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for JobAgentState.
     */
    public static final JobAgentState DELETING = fromString("Deleting");

    /**
     * Static value Disabled for JobAgentState.
     */
    public static final JobAgentState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a JobAgentState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding JobAgentState.
     */
    @JsonCreator
    public static JobAgentState fromString(String name) {
        return fromString(name, JobAgentState.class);
    }

    /**
     * @return known JobAgentState values.
     */
    public static Collection<JobAgentState> values() {
        return values(JobAgentState.class);
    }
}
