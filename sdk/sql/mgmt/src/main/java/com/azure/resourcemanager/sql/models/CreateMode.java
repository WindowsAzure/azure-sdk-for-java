// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CreateMode. */
public final class CreateMode extends ExpandableStringEnum<CreateMode> {
    /** Static value Default for CreateMode. */
    public static final CreateMode DEFAULT = fromString("Default");

    /** Static value Copy for CreateMode. */
    public static final CreateMode COPY = fromString("Copy");

    /** Static value Secondary for CreateMode. */
    public static final CreateMode SECONDARY = fromString("Secondary");

    /** Static value PointInTimeRestore for CreateMode. */
    public static final CreateMode POINT_IN_TIME_RESTORE = fromString("PointInTimeRestore");

    /** Static value Restore for CreateMode. */
    public static final CreateMode RESTORE = fromString("Restore");

    /** Static value Recovery for CreateMode. */
    public static final CreateMode RECOVERY = fromString("Recovery");

    /** Static value RestoreExternalBackup for CreateMode. */
    public static final CreateMode RESTORE_EXTERNAL_BACKUP = fromString("RestoreExternalBackup");

    /** Static value RestoreExternalBackupSecondary for CreateMode. */
    public static final CreateMode RESTORE_EXTERNAL_BACKUP_SECONDARY = fromString("RestoreExternalBackupSecondary");

    /** Static value RestoreLongTermRetentionBackup for CreateMode. */
    public static final CreateMode RESTORE_LONG_TERM_RETENTION_BACKUP = fromString("RestoreLongTermRetentionBackup");

    /** Static value OnlineSecondary for CreateMode. */
    public static final CreateMode ONLINE_SECONDARY = fromString("OnlineSecondary");

    /**
     * Creates or finds a CreateMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CreateMode.
     */
    @JsonCreator
    public static CreateMode fromString(String name) {
        return fromString(name, CreateMode.class);
    }

    /** @return known CreateMode values. */
    public static Collection<CreateMode> values() {
        return values(CreateMode.class);
    }
}
