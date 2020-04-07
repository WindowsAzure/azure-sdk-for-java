// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for LongTermRetentionDatabaseState.
 */
public final class LongTermRetentionDatabaseState extends ExpandableStringEnum<LongTermRetentionDatabaseState> {
    /**
     * Static value All for LongTermRetentionDatabaseState.
     */
    public static final LongTermRetentionDatabaseState ALL = fromString("All");

    /**
     * Static value Live for LongTermRetentionDatabaseState.
     */
    public static final LongTermRetentionDatabaseState LIVE = fromString("Live");

    /**
     * Static value Deleted for LongTermRetentionDatabaseState.
     */
    public static final LongTermRetentionDatabaseState DELETED = fromString("Deleted");

    /**
     * Creates or finds a LongTermRetentionDatabaseState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LongTermRetentionDatabaseState.
     */
    @JsonCreator
    public static LongTermRetentionDatabaseState fromString(String name) {
        return fromString(name, LongTermRetentionDatabaseState.class);
    }

    /**
     * @return known LongTermRetentionDatabaseState values.
     */
    public static Collection<LongTermRetentionDatabaseState> values() {
        return values(LongTermRetentionDatabaseState.class);
    }
}
