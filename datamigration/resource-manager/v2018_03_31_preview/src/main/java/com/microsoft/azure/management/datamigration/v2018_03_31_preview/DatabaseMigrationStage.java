/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DatabaseMigrationStage.
 */
public final class DatabaseMigrationStage extends ExpandableStringEnum<DatabaseMigrationStage> {
    /** Static value None for DatabaseMigrationStage. */
    public static final DatabaseMigrationStage NONE = fromString("None");

    /** Static value Initialize for DatabaseMigrationStage. */
    public static final DatabaseMigrationStage INITIALIZE = fromString("Initialize");

    /** Static value Backup for DatabaseMigrationStage. */
    public static final DatabaseMigrationStage BACKUP = fromString("Backup");

    /** Static value FileCopy for DatabaseMigrationStage. */
    public static final DatabaseMigrationStage FILE_COPY = fromString("FileCopy");

    /** Static value Restore for DatabaseMigrationStage. */
    public static final DatabaseMigrationStage RESTORE = fromString("Restore");

    /** Static value Completed for DatabaseMigrationStage. */
    public static final DatabaseMigrationStage COMPLETED = fromString("Completed");

    /**
     * Creates or finds a DatabaseMigrationStage from its string representation.
     * @param name a name to look for
     * @return the corresponding DatabaseMigrationStage
     */
    @JsonCreator
    public static DatabaseMigrationStage fromString(String name) {
        return fromString(name, DatabaseMigrationStage.class);
    }

    /**
     * @return known DatabaseMigrationStage values
     */
    public static Collection<DatabaseMigrationStage> values() {
        return values(DatabaseMigrationStage.class);
    }
}
