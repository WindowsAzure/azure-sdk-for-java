/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ConflictResolutionMode.
 */
public final class ConflictResolutionMode extends ExpandableStringEnum<ConflictResolutionMode> {
    /** Static value LastWriterWins for ConflictResolutionMode. */
    public static final ConflictResolutionMode LAST_WRITER_WINS = fromString("LastWriterWins");

    /** Static value Custom for ConflictResolutionMode. */
    public static final ConflictResolutionMode CUSTOM = fromString("Custom");

    /**
     * Creates or finds a ConflictResolutionMode from its string representation.
     * @param name a name to look for
     * @return the corresponding ConflictResolutionMode
     */
    @JsonCreator
    public static ConflictResolutionMode fromString(String name) {
        return fromString(name, ConflictResolutionMode.class);
    }

    /**
     * @return known ConflictResolutionMode values
     */
    public static Collection<ConflictResolutionMode> values() {
        return values(ConflictResolutionMode.class);
    }
}
