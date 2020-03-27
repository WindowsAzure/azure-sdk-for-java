// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.sql.CatalogCollationType;
import com.azure.management.sql.ManagedDatabaseCreateMode;
import com.azure.management.sql.ManagedDatabaseStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The ManagedDatabase model.
 */
@JsonFlatten
@Fluent
public class ManagedDatabaseInner extends Resource {
    /*
     * Collation of the managed database.
     */
    @JsonProperty(value = "properties.collation")
    private String collation;

    /*
     * Status of the database.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private ManagedDatabaseStatus status;

    /*
     * Creation date of the database.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * Earliest restore point in time for point in time restore.
     */
    @JsonProperty(value = "properties.earliestRestorePoint", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime earliestRestorePoint;

    /*
     * Conditional. If createMode is PointInTimeRestore, this value is
     * required. Specifies the point in time (ISO8601 format) of the source
     * database that will be restored to create the new database.
     */
    @JsonProperty(value = "properties.restorePointInTime")
    private OffsetDateTime restorePointInTime;

    /*
     * Geo paired region.
     */
    @JsonProperty(value = "properties.defaultSecondaryLocation", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultSecondaryLocation;

    /*
     * Collation of the metadata catalog.
     */
    @JsonProperty(value = "properties.catalogCollation")
    private CatalogCollationType catalogCollation;

    /*
     * Managed database create mode. PointInTimeRestore: Create a database by
     * restoring a point in time backup of an existing database.
     * SourceDatabaseName, SourceManagedInstanceName and PointInTime must be
     * specified. RestoreExternalBackup: Create a database by restoring from
     * external backup files. Collation, StorageContainerUri and
     * StorageContainerSasToken must be specified. Recovery: Creates a database
     * by restoring a geo-replicated backup. RecoverableDatabaseId must be
     * specified as the recoverable database resource ID to restore.
     */
    @JsonProperty(value = "properties.createMode")
    private ManagedDatabaseCreateMode createMode;

    /*
     * Conditional. If createMode is RestoreExternalBackup, this value is
     * required. Specifies the uri of the storage container where backups for
     * this restore are stored.
     */
    @JsonProperty(value = "properties.storageContainerUri")
    private String storageContainerUri;

    /*
     * The resource identifier of the source database associated with create
     * operation of this database.
     */
    @JsonProperty(value = "properties.sourceDatabaseId")
    private String sourceDatabaseId;

    /*
     * The restorable dropped database resource id to restore when creating
     * this database.
     */
    @JsonProperty(value = "properties.restorableDroppedDatabaseId")
    private String restorableDroppedDatabaseId;

    /*
     * Conditional. If createMode is RestoreExternalBackup, this value is
     * required. Specifies the storage container sas token.
     */
    @JsonProperty(value = "properties.storageContainerSasToken")
    private String storageContainerSasToken;

    /*
     * Instance Failover Group resource identifier that this managed database
     * belongs to.
     */
    @JsonProperty(value = "properties.failoverGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String failoverGroupId;

    /*
     * The resource identifier of the recoverable database associated with
     * create operation of this database.
     */
    @JsonProperty(value = "properties.recoverableDatabaseId")
    private String recoverableDatabaseId;

    /*
     * The name of the Long Term Retention backup to be used for restore of
     * this managed database.
     */
    @JsonProperty(value = "properties.longTermRetentionBackupResourceId")
    private String longTermRetentionBackupResourceId;

    /**
     * Get the collation property: Collation of the managed database.
     * 
     * @return the collation value.
     */
    public String collation() {
        return this.collation;
    }

    /**
     * Set the collation property: Collation of the managed database.
     * 
     * @param collation the collation value to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withCollation(String collation) {
        this.collation = collation;
        return this;
    }

    /**
     * Get the status property: Status of the database.
     * 
     * @return the status value.
     */
    public ManagedDatabaseStatus status() {
        return this.status;
    }

    /**
     * Get the creationDate property: Creation date of the database.
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the earliestRestorePoint property: Earliest restore point in time
     * for point in time restore.
     * 
     * @return the earliestRestorePoint value.
     */
    public OffsetDateTime earliestRestorePoint() {
        return this.earliestRestorePoint;
    }

    /**
     * Get the restorePointInTime property: Conditional. If createMode is
     * PointInTimeRestore, this value is required. Specifies the point in time
     * (ISO8601 format) of the source database that will be restored to create
     * the new database.
     * 
     * @return the restorePointInTime value.
     */
    public OffsetDateTime restorePointInTime() {
        return this.restorePointInTime;
    }

    /**
     * Set the restorePointInTime property: Conditional. If createMode is
     * PointInTimeRestore, this value is required. Specifies the point in time
     * (ISO8601 format) of the source database that will be restored to create
     * the new database.
     * 
     * @param restorePointInTime the restorePointInTime value to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withRestorePointInTime(OffsetDateTime restorePointInTime) {
        this.restorePointInTime = restorePointInTime;
        return this;
    }

    /**
     * Get the defaultSecondaryLocation property: Geo paired region.
     * 
     * @return the defaultSecondaryLocation value.
     */
    public String defaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }

    /**
     * Get the catalogCollation property: Collation of the metadata catalog.
     * 
     * @return the catalogCollation value.
     */
    public CatalogCollationType catalogCollation() {
        return this.catalogCollation;
    }

    /**
     * Set the catalogCollation property: Collation of the metadata catalog.
     * 
     * @param catalogCollation the catalogCollation value to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withCatalogCollation(CatalogCollationType catalogCollation) {
        this.catalogCollation = catalogCollation;
        return this;
    }

    /**
     * Get the createMode property: Managed database create mode.
     * PointInTimeRestore: Create a database by restoring a point in time
     * backup of an existing database. SourceDatabaseName,
     * SourceManagedInstanceName and PointInTime must be specified.
     * RestoreExternalBackup: Create a database by restoring from external
     * backup files. Collation, StorageContainerUri and
     * StorageContainerSasToken must be specified. Recovery: Creates a database
     * by restoring a geo-replicated backup. RecoverableDatabaseId must be
     * specified as the recoverable database resource ID to restore.
     * 
     * @return the createMode value.
     */
    public ManagedDatabaseCreateMode createMode() {
        return this.createMode;
    }

    /**
     * Set the createMode property: Managed database create mode.
     * PointInTimeRestore: Create a database by restoring a point in time
     * backup of an existing database. SourceDatabaseName,
     * SourceManagedInstanceName and PointInTime must be specified.
     * RestoreExternalBackup: Create a database by restoring from external
     * backup files. Collation, StorageContainerUri and
     * StorageContainerSasToken must be specified. Recovery: Creates a database
     * by restoring a geo-replicated backup. RecoverableDatabaseId must be
     * specified as the recoverable database resource ID to restore.
     * 
     * @param createMode the createMode value to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withCreateMode(ManagedDatabaseCreateMode createMode) {
        this.createMode = createMode;
        return this;
    }

    /**
     * Get the storageContainerUri property: Conditional. If createMode is
     * RestoreExternalBackup, this value is required. Specifies the uri of the
     * storage container where backups for this restore are stored.
     * 
     * @return the storageContainerUri value.
     */
    public String storageContainerUri() {
        return this.storageContainerUri;
    }

    /**
     * Set the storageContainerUri property: Conditional. If createMode is
     * RestoreExternalBackup, this value is required. Specifies the uri of the
     * storage container where backups for this restore are stored.
     * 
     * @param storageContainerUri the storageContainerUri value to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withStorageContainerUri(String storageContainerUri) {
        this.storageContainerUri = storageContainerUri;
        return this;
    }

    /**
     * Get the sourceDatabaseId property: The resource identifier of the source
     * database associated with create operation of this database.
     * 
     * @return the sourceDatabaseId value.
     */
    public String sourceDatabaseId() {
        return this.sourceDatabaseId;
    }

    /**
     * Set the sourceDatabaseId property: The resource identifier of the source
     * database associated with create operation of this database.
     * 
     * @param sourceDatabaseId the sourceDatabaseId value to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * Get the restorableDroppedDatabaseId property: The restorable dropped
     * database resource id to restore when creating this database.
     * 
     * @return the restorableDroppedDatabaseId value.
     */
    public String restorableDroppedDatabaseId() {
        return this.restorableDroppedDatabaseId;
    }

    /**
     * Set the restorableDroppedDatabaseId property: The restorable dropped
     * database resource id to restore when creating this database.
     * 
     * @param restorableDroppedDatabaseId the restorableDroppedDatabaseId value
     * to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId) {
        this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
        return this;
    }

    /**
     * Get the storageContainerSasToken property: Conditional. If createMode is
     * RestoreExternalBackup, this value is required. Specifies the storage
     * container sas token.
     * 
     * @return the storageContainerSasToken value.
     */
    public String storageContainerSasToken() {
        return this.storageContainerSasToken;
    }

    /**
     * Set the storageContainerSasToken property: Conditional. If createMode is
     * RestoreExternalBackup, this value is required. Specifies the storage
     * container sas token.
     * 
     * @param storageContainerSasToken the storageContainerSasToken value to
     * set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withStorageContainerSasToken(String storageContainerSasToken) {
        this.storageContainerSasToken = storageContainerSasToken;
        return this;
    }

    /**
     * Get the failoverGroupId property: Instance Failover Group resource
     * identifier that this managed database belongs to.
     * 
     * @return the failoverGroupId value.
     */
    public String failoverGroupId() {
        return this.failoverGroupId;
    }

    /**
     * Get the recoverableDatabaseId property: The resource identifier of the
     * recoverable database associated with create operation of this database.
     * 
     * @return the recoverableDatabaseId value.
     */
    public String recoverableDatabaseId() {
        return this.recoverableDatabaseId;
    }

    /**
     * Set the recoverableDatabaseId property: The resource identifier of the
     * recoverable database associated with create operation of this database.
     * 
     * @param recoverableDatabaseId the recoverableDatabaseId value to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withRecoverableDatabaseId(String recoverableDatabaseId) {
        this.recoverableDatabaseId = recoverableDatabaseId;
        return this;
    }

    /**
     * Get the longTermRetentionBackupResourceId property: The name of the Long
     * Term Retention backup to be used for restore of this managed database.
     * 
     * @return the longTermRetentionBackupResourceId value.
     */
    public String longTermRetentionBackupResourceId() {
        return this.longTermRetentionBackupResourceId;
    }

    /**
     * Set the longTermRetentionBackupResourceId property: The name of the Long
     * Term Retention backup to be used for restore of this managed database.
     * 
     * @param longTermRetentionBackupResourceId the
     * longTermRetentionBackupResourceId value to set.
     * @return the ManagedDatabaseInner object itself.
     */
    public ManagedDatabaseInner withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId) {
        this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
        return this;
    }
}
