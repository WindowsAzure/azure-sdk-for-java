/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a table auditing policy.
 */
public class TableAuditingPolicyProperties {
    /**
     * The state of the policy.
     */
    @JsonProperty(value = "auditingState")
    private String auditingState;

    /**
     * The audit logs table name.
     */
    @JsonProperty(value = "auditLogsTableName")
    private String auditLogsTableName;

    /**
     * Comma-separated list of event types to audit.
     */
    @JsonProperty(value = "eventTypesToAudit")
    private String eventTypesToAudit;

    /**
     * The full audit logs table name.
     */
    @JsonProperty(value = "fullAuditLogsTableName")
    private String fullAuditLogsTableName;

    /**
     * The number of days to keep in the audit logs.
     */
    @JsonProperty(value = "retentionDays")
    private String retentionDays;

    /**
     * The key of the auditing storage account.
     */
    @JsonProperty(value = "storageAccountKey")
    private String storageAccountKey;

    /**
     * The table storage account name.
     */
    @JsonProperty(value = "storageAccountName")
    private String storageAccountName;

    /**
     * The table storage account resource group name.
     */
    @JsonProperty(value = "storageAccountResourceGroupName")
    private String storageAccountResourceGroupName;

    /**
     * The secondary key of the auditing storage account.
     */
    @JsonProperty(value = "storageAccountSecondaryKey")
    private String storageAccountSecondaryKey;

    /**
     * The table storage subscription Id.
     */
    @JsonProperty(value = "storageAccountSubscriptionId")
    private UUID storageAccountSubscriptionId;

    /**
     * The storage table endpoint.
     */
    @JsonProperty(value = "storageTableEndpoint")
    private String storageTableEndpoint;

    /**
     * Get the state of the policy.
     *
     * @return the auditingState value
     */
    public String auditingState() {
        return this.auditingState;
    }

    /**
     * Set the state of the policy.
     *
     * @param auditingState the auditingState value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withAuditingState(String auditingState) {
        this.auditingState = auditingState;
        return this;
    }

    /**
     * Get the audit logs table name.
     *
     * @return the auditLogsTableName value
     */
    public String auditLogsTableName() {
        return this.auditLogsTableName;
    }

    /**
     * Set the audit logs table name.
     *
     * @param auditLogsTableName the auditLogsTableName value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withAuditLogsTableName(String auditLogsTableName) {
        this.auditLogsTableName = auditLogsTableName;
        return this;
    }

    /**
     * Get comma-separated list of event types to audit.
     *
     * @return the eventTypesToAudit value
     */
    public String eventTypesToAudit() {
        return this.eventTypesToAudit;
    }

    /**
     * Set comma-separated list of event types to audit.
     *
     * @param eventTypesToAudit the eventTypesToAudit value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withEventTypesToAudit(String eventTypesToAudit) {
        this.eventTypesToAudit = eventTypesToAudit;
        return this;
    }

    /**
     * Get the full audit logs table name.
     *
     * @return the fullAuditLogsTableName value
     */
    public String fullAuditLogsTableName() {
        return this.fullAuditLogsTableName;
    }

    /**
     * Set the full audit logs table name.
     *
     * @param fullAuditLogsTableName the fullAuditLogsTableName value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withFullAuditLogsTableName(String fullAuditLogsTableName) {
        this.fullAuditLogsTableName = fullAuditLogsTableName;
        return this;
    }

    /**
     * Get the number of days to keep in the audit logs.
     *
     * @return the retentionDays value
     */
    public String retentionDays() {
        return this.retentionDays;
    }

    /**
     * Set the number of days to keep in the audit logs.
     *
     * @param retentionDays the retentionDays value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withRetentionDays(String retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * Get the key of the auditing storage account.
     *
     * @return the storageAccountKey value
     */
    public String storageAccountKey() {
        return this.storageAccountKey;
    }

    /**
     * Set the key of the auditing storage account.
     *
     * @param storageAccountKey the storageAccountKey value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withStorageAccountKey(String storageAccountKey) {
        this.storageAccountKey = storageAccountKey;
        return this;
    }

    /**
     * Get the table storage account name.
     *
     * @return the storageAccountName value
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the table storage account name.
     *
     * @param storageAccountName the storageAccountName value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
        return this;
    }

    /**
     * Get the table storage account resource group name.
     *
     * @return the storageAccountResourceGroupName value
     */
    public String storageAccountResourceGroupName() {
        return this.storageAccountResourceGroupName;
    }

    /**
     * Set the table storage account resource group name.
     *
     * @param storageAccountResourceGroupName the storageAccountResourceGroupName value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withStorageAccountResourceGroupName(String storageAccountResourceGroupName) {
        this.storageAccountResourceGroupName = storageAccountResourceGroupName;
        return this;
    }

    /**
     * Get the secondary key of the auditing storage account.
     *
     * @return the storageAccountSecondaryKey value
     */
    public String storageAccountSecondaryKey() {
        return this.storageAccountSecondaryKey;
    }

    /**
     * Set the secondary key of the auditing storage account.
     *
     * @param storageAccountSecondaryKey the storageAccountSecondaryKey value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withStorageAccountSecondaryKey(String storageAccountSecondaryKey) {
        this.storageAccountSecondaryKey = storageAccountSecondaryKey;
        return this;
    }

    /**
     * Get the table storage subscription Id.
     *
     * @return the storageAccountSubscriptionId value
     */
    public UUID storageAccountSubscriptionId() {
        return this.storageAccountSubscriptionId;
    }

    /**
     * Set the table storage subscription Id.
     *
     * @param storageAccountSubscriptionId the storageAccountSubscriptionId value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withStorageAccountSubscriptionId(UUID storageAccountSubscriptionId) {
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        return this;
    }

    /**
     * Get the storage table endpoint.
     *
     * @return the storageTableEndpoint value
     */
    public String storageTableEndpoint() {
        return this.storageTableEndpoint;
    }

    /**
     * Set the storage table endpoint.
     *
     * @param storageTableEndpoint the storageTableEndpoint value to set
     * @return the TableAuditingPolicyProperties object itself.
     */
    public TableAuditingPolicyProperties withStorageTableEndpoint(String storageTableEndpoint) {
        this.storageTableEndpoint = storageTableEndpoint;
        return this;
    }

}
