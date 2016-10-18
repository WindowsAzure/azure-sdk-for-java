/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.sql.SqlSubResource;

/**
 * Represents an Azure SQL Database auditing policy.
 */
@JsonFlatten
public class DatabaseAuditingPolicyInner extends SqlSubResource {
    /**
     * Indicates whether the default server auditing policy is used for that
     * Azure SQL Database.
     */
    @JsonProperty(value = "properties.useServerDefault")
    private String useServerDefault;

    /**
     * The auditing state of the Azure SQL Server auditing policy.
     */
    @JsonProperty(value = "properties.auditingState")
    private String auditingState;

    /**
     * The events types of the Azure SQL Server auditing policy.
     */
    @JsonProperty(value = "properties.eventTypesToAudit")
    private String eventTypesToAudit;

    /**
     * The storage account name of the Azure SQL Server auditing policy.
     */
    @JsonProperty(value = "properties.storageAccountName")
    private String storageAccountName;

    /**
     * The primary storage account key of the Azure SQL Server auditing policy.
     */
    @JsonProperty(value = "properties.storageAccountKey")
    private String storageAccountKey;

    /**
     * The secondary key of the storage account of the Azure SQL Server
     * auditing policy.
     */
    @JsonProperty(value = "properties.storageAccountSecondaryKey")
    private String storageAccountSecondaryKey;

    /**
     * The storage table endpoint of the Azure SQL Server auditing policy.
     */
    @JsonProperty(value = "properties.storageTableEndpoint")
    private String storageTableEndpoint;

    /**
     * The resource group of the storage account of the Azure SQL Server
     * auditing policy.
     */
    @JsonProperty(value = "properties.storageAccountResourceGroupName")
    private String storageAccountResourceGroupName;

    /**
     * The subscription Id of the storage account of the Azure SQL Server
     * auditing policy.
     */
    @JsonProperty(value = "properties.storageAccountSubscriptionId")
    private String storageAccountSubscriptionId;

    /**
     * The retention in days of the Azure SQL Database auditing policy.
     */
    @JsonProperty(value = "properties.retentionDays")
    private String retentionDays;

    /**
     * The name of the table audit logs are written to in the Azure SQL
     * Database auditing policy.
     */
    @JsonProperty(value = "properties.auditLogsTableName")
    private String auditLogsTableName;

    /**
     * The full name of the table audit logs are written to in the Azure SQL
     * Database auditing policy.
     */
    @JsonProperty(value = "properties.fullAuditLogsTableName")
    private String fullAuditLogsTableName;

    /**
     * Get the useServerDefault value.
     *
     * @return the useServerDefault value
     */
    public String useServerDefault() {
        return this.useServerDefault;
    }

    /**
     * Set the useServerDefault value.
     *
     * @param useServerDefault the useServerDefault value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withUseServerDefault(String useServerDefault) {
        this.useServerDefault = useServerDefault;
        return this;
    }

    /**
     * Get the auditingState value.
     *
     * @return the auditingState value
     */
    public String auditingState() {
        return this.auditingState;
    }

    /**
     * Set the auditingState value.
     *
     * @param auditingState the auditingState value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withAuditingState(String auditingState) {
        this.auditingState = auditingState;
        return this;
    }

    /**
     * Get the eventTypesToAudit value.
     *
     * @return the eventTypesToAudit value
     */
    public String eventTypesToAudit() {
        return this.eventTypesToAudit;
    }

    /**
     * Set the eventTypesToAudit value.
     *
     * @param eventTypesToAudit the eventTypesToAudit value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withEventTypesToAudit(String eventTypesToAudit) {
        this.eventTypesToAudit = eventTypesToAudit;
        return this;
    }

    /**
     * Get the storageAccountName value.
     *
     * @return the storageAccountName value
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the storageAccountName value.
     *
     * @param storageAccountName the storageAccountName value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the storageAccountKey value.
     *
     * @return the storageAccountKey value
     */
    public String storageAccountKey() {
        return this.storageAccountKey;
    }

    /**
     * Set the storageAccountKey value.
     *
     * @param storageAccountKey the storageAccountKey value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withStorageAccountKey(String storageAccountKey) {
        this.storageAccountKey = storageAccountKey;
        return this;
    }

    /**
     * Get the storageAccountSecondaryKey value.
     *
     * @return the storageAccountSecondaryKey value
     */
    public String storageAccountSecondaryKey() {
        return this.storageAccountSecondaryKey;
    }

    /**
     * Set the storageAccountSecondaryKey value.
     *
     * @param storageAccountSecondaryKey the storageAccountSecondaryKey value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withStorageAccountSecondaryKey(String storageAccountSecondaryKey) {
        this.storageAccountSecondaryKey = storageAccountSecondaryKey;
        return this;
    }

    /**
     * Get the storageTableEndpoint value.
     *
     * @return the storageTableEndpoint value
     */
    public String storageTableEndpoint() {
        return this.storageTableEndpoint;
    }

    /**
     * Set the storageTableEndpoint value.
     *
     * @param storageTableEndpoint the storageTableEndpoint value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withStorageTableEndpoint(String storageTableEndpoint) {
        this.storageTableEndpoint = storageTableEndpoint;
        return this;
    }

    /**
     * Get the storageAccountResourceGroupName value.
     *
     * @return the storageAccountResourceGroupName value
     */
    public String storageAccountResourceGroupName() {
        return this.storageAccountResourceGroupName;
    }

    /**
     * Set the storageAccountResourceGroupName value.
     *
     * @param storageAccountResourceGroupName the storageAccountResourceGroupName value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withStorageAccountResourceGroupName(String storageAccountResourceGroupName) {
        this.storageAccountResourceGroupName = storageAccountResourceGroupName;
        return this;
    }

    /**
     * Get the storageAccountSubscriptionId value.
     *
     * @return the storageAccountSubscriptionId value
     */
    public String storageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId;
    }

    /**
     * Set the storageAccountSubscriptionId value.
     *
     * @param storageAccountSubscriptionId the storageAccountSubscriptionId value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withStorageAccountSubscriptionId(String storageAccountSubscriptionId) {
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        return this;
    }

    /**
     * Get the retentionDays value.
     *
     * @return the retentionDays value
     */
    public String retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the retentionDays value.
     *
     * @param retentionDays the retentionDays value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withRetentionDays(String retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get the auditLogsTableName value.
     *
     * @return the auditLogsTableName value
     */
    public String auditLogsTableName() {
        return this.auditLogsTableName;
    }

    /**
     * Set the auditLogsTableName value.
     *
     * @param auditLogsTableName the auditLogsTableName value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withAuditLogsTableName(String auditLogsTableName) {
        this.auditLogsTableName = auditLogsTableName;
        return this;
    }

    /**
     * Get the fullAuditLogsTableName value.
     *
     * @return the fullAuditLogsTableName value
     */
    public String fullAuditLogsTableName() {
        return this.fullAuditLogsTableName;
    }

    /**
     * Set the fullAuditLogsTableName value.
     *
     * @param fullAuditLogsTableName the fullAuditLogsTableName value to set
     * @return the DatabaseAuditingPolicyInner object itself.
     */
    public DatabaseAuditingPolicyInner withFullAuditLogsTableName(String fullAuditLogsTableName) {
        this.fullAuditLogsTableName = fullAuditLogsTableName;
        return this;
    }

}
