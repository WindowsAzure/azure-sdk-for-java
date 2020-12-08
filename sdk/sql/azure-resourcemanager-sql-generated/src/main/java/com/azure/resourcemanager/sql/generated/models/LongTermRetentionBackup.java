// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.LongTermRetentionBackupInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of LongTermRetentionBackup. */
public interface LongTermRetentionBackup {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the serverName property: The server name that the backup database belong to.
     *
     * @return the serverName value.
     */
    String serverName();

    /**
     * Gets the serverCreateTime property: The create time of the server.
     *
     * @return the serverCreateTime value.
     */
    OffsetDateTime serverCreateTime();

    /**
     * Gets the databaseName property: The name of the database the backup belong to.
     *
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * Gets the databaseDeletionTime property: The delete time of the database.
     *
     * @return the databaseDeletionTime value.
     */
    OffsetDateTime databaseDeletionTime();

    /**
     * Gets the backupTime property: The time the backup was taken.
     *
     * @return the backupTime value.
     */
    OffsetDateTime backupTime();

    /**
     * Gets the backupExpirationTime property: The time the long term retention backup will expire.
     *
     * @return the backupExpirationTime value.
     */
    OffsetDateTime backupExpirationTime();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.LongTermRetentionBackupInner object.
     *
     * @return the inner object.
     */
    LongTermRetentionBackupInner innerModel();
}
