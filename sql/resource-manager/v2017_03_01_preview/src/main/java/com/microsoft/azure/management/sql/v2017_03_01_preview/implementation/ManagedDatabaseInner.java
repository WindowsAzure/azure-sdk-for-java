/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseStatus;
import org.joda.time.DateTime;
import com.microsoft.azure.management.sql.v2017_03_01_preview.CatalogCollationType;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseCreateMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A managed database resource.
 */
@JsonFlatten
public class ManagedDatabaseInner extends Resource {
    /**
     * Collation of the managed database.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /**
     * Status of the database. Possible values include: 'Online', 'Offline',
     * 'Shutdown', 'Creating', 'Inaccessible', 'Updating'.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedDatabaseStatus status;

    /**
     * Creation date of the database.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * Earliest restore point in time for point in time restore.
     */
    @JsonProperty(value = "properties.earliestRestorePoint", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime earliestRestorePoint;

    /**
     * Conditional. If createMode is PointInTimeRestore, this value is
     * required. Specifies the point in time (ISO8601 format) of the source
     * database that will be restored to create the new database.
     */
    @JsonProperty(value = "properties.restorePointInTime")
    private DateTime restorePointInTime;

    /**
     * Geo paired region.
     */
    @JsonProperty(value = "properties.defaultSecondaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultSecondaryLocation;

    /**
     * Collation of the metadata catalog. Possible values include:
     * 'DATABASE_DEFAULT', 'SQL_Latin1_General_CP1_CI_AS'.
     */
    @JsonProperty(value = "properties.catalogCollation")
    private CatalogCollationType catalogCollation;

    /**
     * Managed database create mode. PointInTimeRestore: Create a database by
     * restoring a point in time backup of an existing database.
     * SourceDatabaseName, SourceManagedInstanceName and PointInTime must be
     * specified. RestoreExternalBackup: Create a database by restoring from
     * external backup files. Collation, StorageContainerUri and
     * StorageContainerSasToken must be specified. Recovery: Creates a database
     * by restoring a geo-replicated backup. RecoverableDatabaseId must be
     * specified as the recoverable database resource ID to restore. Possible
     * values include: 'Default', 'RestoreExternalBackup',
     * 'PointInTimeRestore', 'Recovery'.
     */
    @JsonProperty(value = "properties.createMode")
    private ManagedDatabaseCreateMode createMode;

    /**
     * Conditional. If createMode is RestoreExternalBackup, this value is
     * required. Specifies the uri of the storage container where backups for
     * this restore are stored.
     */
    @JsonProperty(value = "properties.storageContainerUri")
    private String storageContainerUri;

    /**
     * The resource identifier of the source database associated with create
     * operation of this database.
     */
    @JsonProperty(value = "properties.sourceDatabaseId")
    private String sourceDatabaseId;

    /**
     * The restorable dropped database resource id to restore when creating
     * this database.
     */
    @JsonProperty(value = "properties.restorableDroppedDatabaseId")
    private String restorableDroppedDatabaseId;

    /**
     * Conditional. If createMode is RestoreExternalBackup, this value is
     * required. Specifies the storage container sas token.
     */
    @JsonProperty(value = "properties.storageContainerSasToken")
    private String storageContainerSasToken;

    /**
     * Instance Failover Group resource identifier that this managed database
     * belongs to.
     */
    @JsonProperty(value = "properties.failoverGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String failoverGroupId;

    /**
     * The resource identifier of the recoverable database associated with
     * create operation of this database.
     */
    @JsonProperty(value = "properties.recoverableDatabaseId")
    private String recoverableDatabaseId;

    /**
     * Get collation of the managed database.
     *
     * @return the collation value
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set collation of the managed database.
     *
     * @param collation the collation value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get status of the database. Possible values include: 'Online', 'Offline', 'Shutdown', 'Creating', 'Inaccessible', 'Updating'.
     *
     * @return the status value
     */
    public ManagedDatabaseStatus status() {
        return this.status;
    }

    /**
     * Get creation date of the database.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get earliest restore point in time for point in time restore.
     *
     * @return the earliestRestorePoint value
     */
    public DateTime earliestRestorePoint() {
        return this.earliestRestorePoint;
    }

    /**
     * Get conditional. If createMode is PointInTimeRestore, this value is required. Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database.
     *
     * @return the restorePointInTime value
     */
    public DateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set conditional. If createMode is PointInTimeRestore, this value is required. Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database.
     *
     * @param restorePointInTime the restorePointInTime value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withRestorePointInTime(DateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get geo paired region.
     *
     * @return the defaultSecondaryLocation value
     */
    public String defaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }

    /**
     * Get collation of the metadata catalog. Possible values include: 'DATABASE_DEFAULT', 'SQL_Latin1_General_CP1_CI_AS'.
     *
     * @return the catalogCollation value
     */
    public CatalogCollationType catalogCollation() {
        return this.catalogCollation;
    }

    /**
     * Set collation of the metadata catalog. Possible values include: 'DATABASE_DEFAULT', 'SQL_Latin1_General_CP1_CI_AS'.
     *
     * @param catalogCollation the catalogCollation value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withCatalogCollation(CatalogCollationType catalogCollation) {
        this.catalogCollation = catalogCollation;
        return this;
    }

    /**
     * Get managed database create mode. PointInTimeRestore: Create a database by restoring a point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to restore. Possible values include: 'Default', 'RestoreExternalBackup', 'PointInTimeRestore', 'Recovery'.
     *
     * @return the createMode value
     */
    public ManagedDatabaseCreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set managed database create mode. PointInTimeRestore: Create a database by restoring a point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to restore. Possible values include: 'Default', 'RestoreExternalBackup', 'PointInTimeRestore', 'Recovery'.
     *
     * @param createMode the createMode value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withCreateMode(ManagedDatabaseCreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the uri of the storage container where backups for this restore are stored.
     *
     * @return the storageContainerUri value
     */
    public String storageContainerUri() {
        return this.storageContainerUri;
    }

    /**
     * Set conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the uri of the storage container where backups for this restore are stored.
     *
     * @param storageContainerUri the storageContainerUri value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withStorageContainerUri(String storageContainerUri) {
        this.storageContainerUri = storageContainerUri;
        return this;
    }

    /**
     * Get the resource identifier of the source database associated with create operation of this database.
     *
     * @return the sourceDatabaseId value
     */
    public String sourceDatabaseId() {
        return this.sourceDatabaseId;
    }

    /**
     * Set the resource identifier of the source database associated with create operation of this database.
     *
     * @param sourceDatabaseId the sourceDatabaseId value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * Get the restorable dropped database resource id to restore when creating this database.
     *
     * @return the restorableDroppedDatabaseId value
     */
    public String restorableDroppedDatabaseId() {
        return this.restorableDroppedDatabaseId;
    }

    /**
     * Set the restorable dropped database resource id to restore when creating this database.
     *
     * @param restorableDroppedDatabaseId the restorableDroppedDatabaseId value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
        this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
        return this;
    }

    /**
     * Get conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the storage container sas token.
     *
     * @return the storageContainerSasToken value
     */
    public String storageContainerSasToken() {
        return this.storageContainerSasToken;
    }

    /**
     * Set conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the storage container sas token.
     *
     * @param storageContainerSasToken the storageContainerSasToken value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withStorageContainerSasToken(String storageContainerSasToken) {
        this.storageContainerSasToken = storageContainerSasToken;
        return this;
    }

    /**
     * Get instance Failover Group resource identifier that this managed database belongs to.
     *
     * @return the failoverGroupId value
     */
    public String failoverGroupId() {
        return this.failoverGroupId;
    }

    /**
     * Get the resource identifier of the recoverable database associated with create operation of this database.
     *
     * @return the recoverableDatabaseId value
     */
    public String recoverableDatabaseId() {
        return this.recoverableDatabaseId;
    }

    /**
     * Set the resource identifier of the recoverable database associated with create operation of this database.
     *
     * @param recoverableDatabaseId the recoverableDatabaseId value to set
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withRecoverableDatabaseId(String recoverableDatabaseId) {
        this.recoverableDatabaseId = recoverableDatabaseId;
        return this;
    }

}
