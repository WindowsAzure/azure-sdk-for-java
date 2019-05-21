/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters the list of backup items.
 */
public class BMSPOQueryObject {
    /**
     * The backup management type. Possible values include: 'Invalid',
     * 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * The backup status query parameter.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The friendly name for the item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Get the backup management type. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backup management type. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the BMSPOQueryObject object itself.
     */
    public BMSPOQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the backup status query parameter.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the backup status query parameter.
     *
     * @param status the status value to set
     * @return the BMSPOQueryObject object itself.
     */
    public BMSPOQueryObject withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the friendly name for the item.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendly name for the item.
     *
     * @param friendlyName the friendlyName value to set
     * @return the BMSPOQueryObject object itself.
     */
    public BMSPOQueryObject withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

}
