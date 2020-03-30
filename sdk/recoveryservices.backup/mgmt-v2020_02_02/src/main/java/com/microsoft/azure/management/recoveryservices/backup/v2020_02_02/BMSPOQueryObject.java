/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters to list items that can be backed up.
 */
public class BMSPOQueryObject {
    /**
     * Backup management type. Possible values include: 'Invalid',
     * 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql',
     * 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * Workload type. Possible values include: 'Invalid', 'VM', 'FileFolder',
     * 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM',
     * 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase',
     * 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     */
    @JsonProperty(value = "workloadType")
    private WorkloadType workloadType;

    /**
     * Full name of the container whose Protectable Objects should be returned.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /**
     * Backup status query parameter.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * Friendly name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Get backup management type. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set backup management type. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the BMSPOQueryObject object itself.
     */
    public BMSPOQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get workload type. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     *
     * @return the workloadType value
     */
    public WorkloadType workloadType() {
        return this.workloadType;
    }

    /**
     * Set workload type. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase', 'SAPAseDatabase'.
     *
     * @param workloadType the workloadType value to set
     * @return the BMSPOQueryObject object itself.
     */
    public BMSPOQueryObject withWorkloadType(WorkloadType workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get full name of the container whose Protectable Objects should be returned.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set full name of the container whose Protectable Objects should be returned.
     *
     * @param containerName the containerName value to set
     * @return the BMSPOQueryObject object itself.
     */
    public BMSPOQueryObject withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get backup status query parameter.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set backup status query parameter.
     *
     * @param status the status value to set
     * @return the BMSPOQueryObject object itself.
     */
    public BMSPOQueryObject withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get friendly name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the BMSPOQueryObject object itself.
     */
    public BMSPOQueryObject withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

}
