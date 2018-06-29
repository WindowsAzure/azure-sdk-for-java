/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Base class for backup item. Workload-specific backup items are derived from
 * this class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "workloadItemType")
@JsonTypeName("WorkloadItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureVmWorkloadItem", value = AzureVmWorkloadItem.class)
})
public class WorkloadItem {
    /**
     * Type of backup managemenent to backup an item.
     */
    @JsonProperty(value = "backupManagementType")
    private String backupManagementType;

    /**
     * Type of workload for the backup management.
     */
    @JsonProperty(value = "workloadType")
    private String workloadType;

    /**
     * Friendly name of the backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * State of the back up item. Possible values include: 'Invalid',
     * 'NotProtected', 'Protecting', 'Protected', 'ProtectionFailed'.
     */
    @JsonProperty(value = "protectionState")
    private ProtectionStatus protectionState;

    /**
     * Get type of backup managemenent to backup an item.
     *
     * @return the backupManagementType value
     */
    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set type of backup managemenent to backup an item.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the WorkloadItem object itself.
     */
    public WorkloadItem withBackupManagementType(String backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get type of workload for the backup management.
     *
     * @return the workloadType value
     */
    public String workloadType() {
        return this.workloadType;
    }

    /**
     * Set type of workload for the backup management.
     *
     * @param workloadType the workloadType value to set
     * @return the WorkloadItem object itself.
     */
    public WorkloadItem withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get friendly name of the backup item.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the backup item.
     *
     * @param friendlyName the friendlyName value to set
     * @return the WorkloadItem object itself.
     */
    public WorkloadItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get state of the back up item. Possible values include: 'Invalid', 'NotProtected', 'Protecting', 'Protected', 'ProtectionFailed'.
     *
     * @return the protectionState value
     */
    public ProtectionStatus protectionState() {
        return this.protectionState;
    }

    /**
     * Set state of the back up item. Possible values include: 'Invalid', 'NotProtected', 'Protecting', 'Protected', 'ProtectionFailed'.
     *
     * @param protectionState the protectionState value to set
     * @return the WorkloadItem object itself.
     */
    public WorkloadItem withProtectionState(ProtectionStatus protectionState) {
        this.protectionState = protectionState;
        return this;
    }

}
