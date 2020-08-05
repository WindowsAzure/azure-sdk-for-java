/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DatabaseState.
 */
public final class DatabaseState extends ExpandableStringEnum<DatabaseState> {
    /** Static value All for DatabaseState. */
    public static final DatabaseState ALL = fromString("All");

    /** Static value Live for DatabaseState. */
    public static final DatabaseState LIVE = fromString("Live");

    /** Static value Deleted for DatabaseState. */
    public static final DatabaseState DELETED = fromString("Deleted");

    /**
     * Creates or finds a DatabaseState from its string representation.
     * @param name a name to look for
     * @return the corresponding DatabaseState
     */
    @JsonCreator
    public static DatabaseState fromString(String name) {
        return fromString(name, DatabaseState.class);
    }

    /**
     * @return known DatabaseState values
     */
    public static Collection<DatabaseState> values() {
        return values(DatabaseState.class);
    }
}
