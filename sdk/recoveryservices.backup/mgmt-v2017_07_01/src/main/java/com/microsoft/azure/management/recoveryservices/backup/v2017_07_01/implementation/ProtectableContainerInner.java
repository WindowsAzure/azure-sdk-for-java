/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.AzureStorageProtectableContainer;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.AzureVMAppContainerProtectableContainer;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupManagementType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Protectable Container Class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableContainerType")
@JsonTypeName("ProtectableContainer")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "StorageContainer", value = AzureStorageProtectableContainer.class),
    @JsonSubTypes.Type(name = "VMAppContainer", value = AzureVMAppContainerProtectableContainer.class)
})
public class ProtectableContainerInner {
    /**
     * Friendly name of the container.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Type of backup managemenent for the container. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql',
     * 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * Status of health of the container.
     */
    @JsonProperty(value = "healthStatus")
    private String healthStatus;

    /**
     * Fabric Id of the container such as ARM Id.
     */
    @JsonProperty(value = "containerId")
    private String containerId;

    /**
     * Get friendly name of the container.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the container.
     *
     * @param friendlyName the friendlyName value to set
     * @return the ProtectableContainerInner object itself.
     */
    public ProtectableContainerInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get type of backup managemenent for the container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set type of backup managemenent for the container. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the ProtectableContainerInner object itself.
     */
    public ProtectableContainerInner withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get status of health of the container.
     *
     * @return the healthStatus value
     */
    public String healthStatus() {
        return this.healthStatus;
    }

    /**
     * Set status of health of the container.
     *
     * @param healthStatus the healthStatus value to set
     * @return the ProtectableContainerInner object itself.
     */
    public ProtectableContainerInner withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get fabric Id of the container such as ARM Id.
     *
     * @return the containerId value
     */
    public String containerId() {
        return this.containerId;
    }

    /**
     * Set fabric Id of the container such as ARM Id.
     *
     * @param containerId the containerId value to set
     * @return the ProtectableContainerInner object itself.
     */
    public ProtectableContainerInner withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

}
