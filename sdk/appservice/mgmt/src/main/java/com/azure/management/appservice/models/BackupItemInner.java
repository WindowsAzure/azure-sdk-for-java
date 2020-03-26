// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.management.appservice.BackupItemStatus;
import com.azure.management.appservice.DatabaseBackupSetting;
import com.azure.management.appservice.ProxyOnlyResource;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The BackupItem model.
 */
@JsonFlatten
@Immutable
public class BackupItemInner extends ProxyOnlyResource {
    /*
     * Id of the backup.
     */
    @JsonProperty(value = "properties.id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer backupId;

    /*
     * SAS URL for the storage account container which contains this backup.
     */
    @JsonProperty(value = "properties.storageAccountUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String storageAccountUrl;

    /*
     * Name of the blob which contains data for this backup.
     */
    @JsonProperty(value = "properties.blobName", access = JsonProperty.Access.WRITE_ONLY)
    private String blobName;

    /*
     * Name of this backup.
     */
    @JsonProperty(value = "properties.name", access = JsonProperty.Access.WRITE_ONLY)
    private String namePropertiesName;

    /*
     * Backup status.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private BackupItemStatus status;

    /*
     * Size of the backup in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /*
     * Timestamp of the backup creation.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * Details regarding this backup. Might contain an error message.
     */
    @JsonProperty(value = "properties.log", access = JsonProperty.Access.WRITE_ONLY)
    private String log;

    /*
     * List of databases included in the backup.
     */
    @JsonProperty(value = "properties.databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseBackupSetting> databases;

    /*
     * True if this backup has been created due to a schedule being triggered.
     */
    @JsonProperty(value = "properties.scheduled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean scheduled;

    /*
     * Timestamp of a last restore operation which used this backup.
     */
    @JsonProperty(value = "properties.lastRestoreTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastRestoreTimeStamp;

    /*
     * Timestamp when this backup finished.
     */
    @JsonProperty(value = "properties.finishedTimeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime finishedTimeStamp;

    /*
     * Unique correlation identifier. Please use this along with the timestamp
     * while communicating with Azure support.
     */
    @JsonProperty(value = "properties.correlationId", access = JsonProperty.Access.WRITE_ONLY)
    private String correlationId;

    /*
     * Size of the original web app which has been backed up.
     */
    @JsonProperty(value = "properties.websiteSizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long websiteSizeInBytes;

    /**
     * Get the backupId property: Id of the backup.
     * 
     * @return the backupId value.
     */
    public Integer backupId() {
        return this.backupId;
    }

    /**
     * Get the storageAccountUrl property: SAS URL for the storage account
     * container which contains this backup.
     * 
     * @return the storageAccountUrl value.
     */
    public String storageAccountUrl() {
        return this.storageAccountUrl;
    }

    /**
     * Get the blobName property: Name of the blob which contains data for this
     * backup.
     * 
     * @return the blobName value.
     */
    public String blobName() {
        return this.blobName;
    }

    /**
     * Get the namePropertiesName property: Name of this backup.
     * 
     * @return the namePropertiesName value.
     */
    public String namePropertiesName() {
        return this.namePropertiesName;
    }

    /**
     * Get the status property: Backup status.
     * 
     * @return the status value.
     */
    public BackupItemStatus status() {
        return this.status;
    }

    /**
     * Get the sizeInBytes property: Size of the backup in bytes.
     * 
     * @return the sizeInBytes value.
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the created property: Timestamp of the backup creation.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the log property: Details regarding this backup. Might contain an
     * error message.
     * 
     * @return the log value.
     */
    public String log() {
        return this.log;
    }

    /**
     * Get the databases property: List of databases included in the backup.
     * 
     * @return the databases value.
     */
    public List<DatabaseBackupSetting> databases() {
        return this.databases;
    }

    /**
     * Get the scheduled property: True if this backup has been created due to
     * a schedule being triggered.
     * 
     * @return the scheduled value.
     */
    public Boolean scheduled() {
        return this.scheduled;
    }

    /**
     * Get the lastRestoreTimeStamp property: Timestamp of a last restore
     * operation which used this backup.
     * 
     * @return the lastRestoreTimeStamp value.
     */
    public OffsetDateTime lastRestoreTimeStamp() {
        return this.lastRestoreTimeStamp;
    }

    /**
     * Get the finishedTimeStamp property: Timestamp when this backup finished.
     * 
     * @return the finishedTimeStamp value.
     */
    public OffsetDateTime finishedTimeStamp() {
        return this.finishedTimeStamp;
    }

    /**
     * Get the correlationId property: Unique correlation identifier. Please
     * use this along with the timestamp while communicating with Azure
     * support.
     * 
     * @return the correlationId value.
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Get the websiteSizeInBytes property: Size of the original web app which
     * has been backed up.
     * 
     * @return the websiteSizeInBytes value.
     */
    public Long websiteSizeInBytes() {
        return this.websiteSizeInBytes;
    }
}
