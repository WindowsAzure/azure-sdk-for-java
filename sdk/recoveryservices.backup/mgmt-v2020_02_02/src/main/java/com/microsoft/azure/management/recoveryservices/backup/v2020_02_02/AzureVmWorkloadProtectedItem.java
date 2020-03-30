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

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.ProtectedItemInner;

/**
 * Azure VM workload-specific protected item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType", defaultImpl = AzureVmWorkloadProtectedItem.class)
@JsonTypeName("AzureVmWorkloadProtectedItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureVmWorkloadSAPAseDatabase", value = AzureVmWorkloadSAPAseDatabaseProtectedItem.class),
    @JsonSubTypes.Type(name = "AzureVmWorkloadSAPHanaDatabase", value = AzureVmWorkloadSAPHanaDatabaseProtectedItem.class),
    @JsonSubTypes.Type(name = "AzureVmWorkloadSQLDatabase", value = AzureVmWorkloadSQLDatabaseProtectedItem.class)
})
public class AzureVmWorkloadProtectedItem extends ProtectedItemInner {
    /**
     * Friendly name of the DB represented by this backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Host/Cluster Name for instance or AG.
     */
    @JsonProperty(value = "serverName")
    private String serverName;

    /**
     * Parent name of the DB such as Instance or Availability Group.
     */
    @JsonProperty(value = "parentName")
    private String parentName;

    /**
     * Parent type of protected item, example: for a DB, standalone server or
     * distributed.
     */
    @JsonProperty(value = "parentType")
    private String parentType;

    /**
     * Backup status of this backup item.
     */
    @JsonProperty(value = "protectionStatus")
    private String protectionStatus;

    /**
     * Backup state of this backup item. Possible values include: 'Invalid',
     * 'IRPending', 'Protected', 'ProtectionError', 'ProtectionStopped',
     * 'ProtectionPaused'.
     */
    @JsonProperty(value = "protectionState")
    private ProtectionState protectionState;

    /**
     * Last backup operation status. Possible values: Healthy, Unhealthy.
     * Possible values include: 'Invalid', 'Healthy', 'Unhealthy', 'IRPending'.
     */
    @JsonProperty(value = "lastBackupStatus")
    private LastBackupStatus lastBackupStatus;

    /**
     * Timestamp of the last backup operation on this backup item.
     */
    @JsonProperty(value = "lastBackupTime")
    private DateTime lastBackupTime;

    /**
     * Error details in last backup.
     */
    @JsonProperty(value = "lastBackupErrorDetail")
    private ErrorDetail lastBackupErrorDetail;

    /**
     * Data ID of the protected item.
     */
    @JsonProperty(value = "protectedItemDataSourceId")
    private String protectedItemDataSourceId;

    /**
     * Health status of the backup item, evaluated based on last heartbeat
     * received. Possible values include: 'Invalid', 'Healthy', 'Unhealthy',
     * 'NotReachable', 'IRPending'.
     */
    @JsonProperty(value = "protectedItemHealthStatus")
    private ProtectedItemHealthStatus protectedItemHealthStatus;

    /**
     * Additional information for this backup item.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureVmWorkloadProtectedItemExtendedInfo extendedInfo;

    /**
     * Get friendly name of the DB represented by this backup item.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the DB represented by this backup item.
     *
     * @param friendlyName the friendlyName value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get host/Cluster Name for instance or AG.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Set host/Cluster Name for instance or AG.
     *
     * @param serverName the serverName value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Get parent name of the DB such as Instance or Availability Group.
     *
     * @return the parentName value
     */
    public String parentName() {
        return this.parentName;
    }

    /**
     * Set parent name of the DB such as Instance or Availability Group.
     *
     * @param parentName the parentName value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * Get parent type of protected item, example: for a DB, standalone server or distributed.
     *
     * @return the parentType value
     */
    public String parentType() {
        return this.parentType;
    }

    /**
     * Set parent type of protected item, example: for a DB, standalone server or distributed.
     *
     * @param parentType the parentType value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withParentType(String parentType) {
        this.parentType = parentType;
        return this;
    }

    /**
     * Get backup status of this backup item.
     *
     * @return the protectionStatus value
     */
    public String protectionStatus() {
        return this.protectionStatus;
    }

    /**
     * Set backup status of this backup item.
     *
     * @param protectionStatus the protectionStatus value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withProtectionStatus(String protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * Get backup state of this backup item. Possible values include: 'Invalid', 'IRPending', 'Protected', 'ProtectionError', 'ProtectionStopped', 'ProtectionPaused'.
     *
     * @return the protectionState value
     */
    public ProtectionState protectionState() {
        return this.protectionState;
    }

    /**
     * Set backup state of this backup item. Possible values include: 'Invalid', 'IRPending', 'Protected', 'ProtectionError', 'ProtectionStopped', 'ProtectionPaused'.
     *
     * @param protectionState the protectionState value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withProtectionState(ProtectionState protectionState) {
        this.protectionState = protectionState;
        return this;
    }

    /**
     * Get last backup operation status. Possible values: Healthy, Unhealthy. Possible values include: 'Invalid', 'Healthy', 'Unhealthy', 'IRPending'.
     *
     * @return the lastBackupStatus value
     */
    public LastBackupStatus lastBackupStatus() {
        return this.lastBackupStatus;
    }

    /**
     * Set last backup operation status. Possible values: Healthy, Unhealthy. Possible values include: 'Invalid', 'Healthy', 'Unhealthy', 'IRPending'.
     *
     * @param lastBackupStatus the lastBackupStatus value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withLastBackupStatus(LastBackupStatus lastBackupStatus) {
        this.lastBackupStatus = lastBackupStatus;
        return this;
    }

    /**
     * Get timestamp of the last backup operation on this backup item.
     *
     * @return the lastBackupTime value
     */
    public DateTime lastBackupTime() {
        return this.lastBackupTime;
    }

    /**
     * Set timestamp of the last backup operation on this backup item.
     *
     * @param lastBackupTime the lastBackupTime value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withLastBackupTime(DateTime lastBackupTime) {
        this.lastBackupTime = lastBackupTime;
        return this;
    }

    /**
     * Get error details in last backup.
     *
     * @return the lastBackupErrorDetail value
     */
    public ErrorDetail lastBackupErrorDetail() {
        return this.lastBackupErrorDetail;
    }

    /**
     * Set error details in last backup.
     *
     * @param lastBackupErrorDetail the lastBackupErrorDetail value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withLastBackupErrorDetail(ErrorDetail lastBackupErrorDetail) {
        this.lastBackupErrorDetail = lastBackupErrorDetail;
        return this;
    }

    /**
     * Get data ID of the protected item.
     *
     * @return the protectedItemDataSourceId value
     */
    public String protectedItemDataSourceId() {
        return this.protectedItemDataSourceId;
    }

    /**
     * Set data ID of the protected item.
     *
     * @param protectedItemDataSourceId the protectedItemDataSourceId value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withProtectedItemDataSourceId(String protectedItemDataSourceId) {
        this.protectedItemDataSourceId = protectedItemDataSourceId;
        return this;
    }

    /**
     * Get health status of the backup item, evaluated based on last heartbeat received. Possible values include: 'Invalid', 'Healthy', 'Unhealthy', 'NotReachable', 'IRPending'.
     *
     * @return the protectedItemHealthStatus value
     */
    public ProtectedItemHealthStatus protectedItemHealthStatus() {
        return this.protectedItemHealthStatus;
    }

    /**
     * Set health status of the backup item, evaluated based on last heartbeat received. Possible values include: 'Invalid', 'Healthy', 'Unhealthy', 'NotReachable', 'IRPending'.
     *
     * @param protectedItemHealthStatus the protectedItemHealthStatus value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withProtectedItemHealthStatus(ProtectedItemHealthStatus protectedItemHealthStatus) {
        this.protectedItemHealthStatus = protectedItemHealthStatus;
        return this;
    }

    /**
     * Get additional information for this backup item.
     *
     * @return the extendedInfo value
     */
    public AzureVmWorkloadProtectedItemExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set additional information for this backup item.
     *
     * @param extendedInfo the extendedInfo value to set
     * @return the AzureVmWorkloadProtectedItem object itself.
     */
    public AzureVmWorkloadProtectedItem withExtendedInfo(AzureVmWorkloadProtectedItemExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

}
