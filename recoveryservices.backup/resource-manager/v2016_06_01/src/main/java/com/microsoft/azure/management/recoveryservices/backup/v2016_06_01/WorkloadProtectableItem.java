/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base class for backup item. Workload-specific backup items are derived
 * from this class.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectableItemType")
@JsonTypeName("WorkloadProtectableItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "IaaSVMProtectableItem", value = IaaSVMProtectableItem.class)
})
public class WorkloadProtectableItem {
    /**
     * The backup management type.
     */
    @JsonProperty(value = "backupManagementType")
    private String backupManagementType;

    /**
     * The friendly name of the backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The state of the back up item. Possible values include: 'Invalid',
     * 'NotProtected', 'Protecting', 'Protected'.
     */
    @JsonProperty(value = "protectionState")
    private ProtectionStatus protectionState;

    /**
     * Get the backup management type.
     *
     * @return the backupManagementType value
     */
    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backup management type.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the WorkloadProtectableItem object itself.
     */
    public WorkloadProtectableItem withBackupManagementType(String backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the friendly name of the backup item.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendly name of the backup item.
     *
     * @param friendlyName the friendlyName value to set
     * @return the WorkloadProtectableItem object itself.
     */
    public WorkloadProtectableItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the state of the back up item. Possible values include: 'Invalid', 'NotProtected', 'Protecting', 'Protected'.
     *
     * @return the protectionState value
     */
    public ProtectionStatus protectionState() {
        return this.protectionState;
    }

    /**
     * Set the state of the back up item. Possible values include: 'Invalid', 'NotProtected', 'Protecting', 'Protected'.
     *
     * @param protectionState the protectionState value to set
     * @return the WorkloadProtectableItem object itself.
     */
    public WorkloadProtectableItem withProtectionState(ProtectionStatus protectionState) {
        this.protectionState = protectionState;
        return this;
    }

}
