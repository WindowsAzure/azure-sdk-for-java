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
 * The query filters that can be used with the list containers API.
 */
public class BMSContainerQueryObject {
    /**
     * The backup management type for this container. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * The status of the container's registration with the Recovery Services
     * vault.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The friendly name of the container.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Get the backup management type for this container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backup management type for this container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the status of the container's registration with the Recovery Services vault.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status of the container's registration with the Recovery Services vault.
     *
     * @param status the status value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the friendly name of the container.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendly name of the container.
     *
     * @param friendlyName the friendlyName value to set
     * @return the BMSContainerQueryObject object itself.
     */
    public BMSContainerQueryObject withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

}
