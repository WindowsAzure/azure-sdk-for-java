/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CommandState.
 */
public final class CommandState extends ExpandableStringEnum<CommandState> {
    /** Static value Unknown for CommandState. */
    public static final CommandState UNKNOWN = fromString("Unknown");

    /** Static value Accepted for CommandState. */
    public static final CommandState ACCEPTED = fromString("Accepted");

    /** Static value Running for CommandState. */
    public static final CommandState RUNNING = fromString("Running");

    /** Static value Succeeded for CommandState. */
    public static final CommandState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for CommandState. */
    public static final CommandState FAILED = fromString("Failed");

    /**
     * Creates or finds a CommandState from its string representation.
     * @param name a name to look for
     * @return the corresponding CommandState
     */
    @JsonCreator
    public static CommandState fromString(String name) {
        return fromString(name, CommandState.class);
    }

    /**
     * @return known CommandState values
     */
    public static Collection<CommandState> values() {
        return values(CommandState.class);
    }
}
