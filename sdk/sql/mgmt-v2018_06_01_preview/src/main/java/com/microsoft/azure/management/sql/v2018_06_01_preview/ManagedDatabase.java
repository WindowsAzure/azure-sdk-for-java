/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2018_06_01_preview.implementation.ManagedDatabaseInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2018_06_01_preview.implementation.SqlManager;
import org.joda.time.DateTime;
import java.util.Map;

/**
 * Type representing ManagedDatabase.
 */
public interface ManagedDatabase extends HasInner<ManagedDatabaseInner>, Indexable, Refreshable<ManagedDatabase>, Updatable<ManagedDatabase.Update>, HasManager<SqlManager> {
    /**
     * @return the catalogCollation value.
     */
    CatalogCollationType catalogCollation();

    /**
     * @return the collation value.
     */
    String collation();

    /**
     * @return the createMode value.
     */
    ManagedDatabaseCreateMode createMode();

    /**
     * @return the creationDate value.
     */
    DateTime creationDate();

    /**
     * @return the defaultSecondaryLocation value.
     */
    String defaultSecondaryLocation();

    /**
     * @return the earliestRestorePoint value.
     */
    DateTime earliestRestorePoint();

    /**
     * @return the failoverGroupId value.
     */
    String failoverGroupId();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the longTermRetentionBackupResourceId value.
     */
    String longTermRetentionBackupResourceId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the recoverableDatabaseId value.
     */
    String recoverableDatabaseId();

    /**
     * @return the restorableDroppedDatabaseId value.
     */
    String restorableDroppedDatabaseId();

    /**
     * @return the restorePointInTime value.
     */
    DateTime restorePointInTime();

    /**
     * @return the sourceDatabaseId value.
     */
    String sourceDatabaseId();

    /**
     * @return the status value.
     */
    ManagedDatabaseStatus status();

    /**
     * @return the storageContainerSasToken value.
     */
    String storageContainerSasToken();

    /**
     * @return the storageContainerUri value.
     */
    String storageContainerUri();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ManagedDatabase definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithManagedInstance, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ManagedDatabase definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ManagedDatabase definition.
         */
        interface Blank extends WithManagedInstance {
        }

        /**
         * The stage of the manageddatabase definition allowing to specify ManagedInstance.
         */
        interface WithManagedInstance {
           /**
            * Specifies resourceGroupName, managedInstanceName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param managedInstanceName The name of the managed instance
            * @return the next definition stage
            */
            WithLocation withExistingManagedInstance(String resourceGroupName, String managedInstanceName);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify CatalogCollation.
         */
        interface WithCatalogCollation {
            /**
             * Specifies catalogCollation.
             * @param catalogCollation Collation of the metadata catalog. Possible values include: 'DATABASE_DEFAULT', 'SQL_Latin1_General_CP1_CI_AS'
             * @return the next definition stage
             */
            WithCreate withCatalogCollation(CatalogCollationType catalogCollation);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation Collation of the managed database
             * @return the next definition stage
             */
            WithCreate withCollation(String collation);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify CreateMode.
         */
        interface WithCreateMode {
            /**
             * Specifies createMode.
             * @param createMode Managed database create mode. PointInTimeRestore: Create a database by restoring a point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to restore. Possible values include: 'Default', 'RestoreExternalBackup', 'PointInTimeRestore', 'Recovery', 'RestoreLongTermRetentionBackup'
             * @return the next definition stage
             */
            WithCreate withCreateMode(ManagedDatabaseCreateMode createMode);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify LongTermRetentionBackupResourceId.
         */
        interface WithLongTermRetentionBackupResourceId {
            /**
             * Specifies longTermRetentionBackupResourceId.
             * @param longTermRetentionBackupResourceId The name of the Long Term Retention backup to be used for restore of this managed database
             * @return the next definition stage
             */
            WithCreate withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify RecoverableDatabaseId.
         */
        interface WithRecoverableDatabaseId {
            /**
             * Specifies recoverableDatabaseId.
             * @param recoverableDatabaseId The resource identifier of the recoverable database associated with create operation of this database
             * @return the next definition stage
             */
            WithCreate withRecoverableDatabaseId(String recoverableDatabaseId);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify RestorableDroppedDatabaseId.
         */
        interface WithRestorableDroppedDatabaseId {
            /**
             * Specifies restorableDroppedDatabaseId.
             * @param restorableDroppedDatabaseId The restorable dropped database resource id to restore when creating this database
             * @return the next definition stage
             */
            WithCreate withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             * @param restorePointInTime Conditional. If createMode is PointInTimeRestore, this value is required. Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database
             * @return the next definition stage
             */
            WithCreate withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify SourceDatabaseId.
         */
        interface WithSourceDatabaseId {
            /**
             * Specifies sourceDatabaseId.
             * @param sourceDatabaseId The resource identifier of the source database associated with create operation of this database
             * @return the next definition stage
             */
            WithCreate withSourceDatabaseId(String sourceDatabaseId);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify StorageContainerSasToken.
         */
        interface WithStorageContainerSasToken {
            /**
             * Specifies storageContainerSasToken.
             * @param storageContainerSasToken Conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the storage container sas token
             * @return the next definition stage
             */
            WithCreate withStorageContainerSasToken(String storageContainerSasToken);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify StorageContainerUri.
         */
        interface WithStorageContainerUri {
            /**
             * Specifies storageContainerUri.
             * @param storageContainerUri Conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the uri of the storage container where backups for this restore are stored
             * @return the next definition stage
             */
            WithCreate withStorageContainerUri(String storageContainerUri);
        }

        /**
         * The stage of the manageddatabase definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ManagedDatabase>, DefinitionStages.WithCatalogCollation, DefinitionStages.WithCollation, DefinitionStages.WithCreateMode, DefinitionStages.WithLongTermRetentionBackupResourceId, DefinitionStages.WithRecoverableDatabaseId, DefinitionStages.WithRestorableDroppedDatabaseId, DefinitionStages.WithRestorePointInTime, DefinitionStages.WithSourceDatabaseId, DefinitionStages.WithStorageContainerSasToken, DefinitionStages.WithStorageContainerUri, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a ManagedDatabase update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ManagedDatabase>, UpdateStages.WithCatalogCollation, UpdateStages.WithCollation, UpdateStages.WithCreateMode, UpdateStages.WithLongTermRetentionBackupResourceId, UpdateStages.WithRecoverableDatabaseId, UpdateStages.WithRestorableDroppedDatabaseId, UpdateStages.WithRestorePointInTime, UpdateStages.WithSourceDatabaseId, UpdateStages.WithStorageContainerSasToken, UpdateStages.WithStorageContainerUri, UpdateStages.WithTags {
    }

    /**
     * Grouping of ManagedDatabase update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the manageddatabase update allowing to specify CatalogCollation.
         */
        interface WithCatalogCollation {
            /**
             * Specifies catalogCollation.
             * @param catalogCollation Collation of the metadata catalog. Possible values include: 'DATABASE_DEFAULT', 'SQL_Latin1_General_CP1_CI_AS'
             * @return the next update stage
             */
            Update withCatalogCollation(CatalogCollationType catalogCollation);
        }

        /**
         * The stage of the manageddatabase update allowing to specify Collation.
         */
        interface WithCollation {
            /**
             * Specifies collation.
             * @param collation Collation of the managed database
             * @return the next update stage
             */
            Update withCollation(String collation);
        }

        /**
         * The stage of the manageddatabase update allowing to specify CreateMode.
         */
        interface WithCreateMode {
            /**
             * Specifies createMode.
             * @param createMode Managed database create mode. PointInTimeRestore: Create a database by restoring a point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to restore. Possible values include: 'Default', 'RestoreExternalBackup', 'PointInTimeRestore', 'Recovery', 'RestoreLongTermRetentionBackup'
             * @return the next update stage
             */
            Update withCreateMode(ManagedDatabaseCreateMode createMode);
        }

        /**
         * The stage of the manageddatabase update allowing to specify LongTermRetentionBackupResourceId.
         */
        interface WithLongTermRetentionBackupResourceId {
            /**
             * Specifies longTermRetentionBackupResourceId.
             * @param longTermRetentionBackupResourceId The name of the Long Term Retention backup to be used for restore of this managed database
             * @return the next update stage
             */
            Update withLongTermRetentionBackupResourceId(String longTermRetentionBackupResourceId);
        }

        /**
         * The stage of the manageddatabase update allowing to specify RecoverableDatabaseId.
         */
        interface WithRecoverableDatabaseId {
            /**
             * Specifies recoverableDatabaseId.
             * @param recoverableDatabaseId The resource identifier of the recoverable database associated with create operation of this database
             * @return the next update stage
             */
            Update withRecoverableDatabaseId(String recoverableDatabaseId);
        }

        /**
         * The stage of the manageddatabase update allowing to specify RestorableDroppedDatabaseId.
         */
        interface WithRestorableDroppedDatabaseId {
            /**
             * Specifies restorableDroppedDatabaseId.
             * @param restorableDroppedDatabaseId The restorable dropped database resource id to restore when creating this database
             * @return the next update stage
             */
            Update withRestorableDroppedDatabaseId(String restorableDroppedDatabaseId);
        }

        /**
         * The stage of the manageddatabase update allowing to specify RestorePointInTime.
         */
        interface WithRestorePointInTime {
            /**
             * Specifies restorePointInTime.
             * @param restorePointInTime Conditional. If createMode is PointInTimeRestore, this value is required. Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database
             * @return the next update stage
             */
            Update withRestorePointInTime(DateTime restorePointInTime);
        }

        /**
         * The stage of the manageddatabase update allowing to specify SourceDatabaseId.
         */
        interface WithSourceDatabaseId {
            /**
             * Specifies sourceDatabaseId.
             * @param sourceDatabaseId The resource identifier of the source database associated with create operation of this database
             * @return the next update stage
             */
            Update withSourceDatabaseId(String sourceDatabaseId);
        }

        /**
         * The stage of the manageddatabase update allowing to specify StorageContainerSasToken.
         */
        interface WithStorageContainerSasToken {
            /**
             * Specifies storageContainerSasToken.
             * @param storageContainerSasToken Conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the storage container sas token
             * @return the next update stage
             */
            Update withStorageContainerSasToken(String storageContainerSasToken);
        }

        /**
         * The stage of the manageddatabase update allowing to specify StorageContainerUri.
         */
        interface WithStorageContainerUri {
            /**
             * Specifies storageContainerUri.
             * @param storageContainerUri Conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the uri of the storage container where backups for this restore are stored
             * @return the next update stage
             */
            Update withStorageContainerUri(String storageContainerUri);
        }

        /**
         * The stage of the manageddatabase update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
