/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Table level result for Sql Server to Azure Sql DB migration.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType", defaultImpl = MigrateSqlServerSqlDbTaskOutputTableLevel.class)
@JsonTypeName("TableLevelOutput")
public class MigrateSqlServerSqlDbTaskOutputTableLevel extends MigrateSqlServerSqlDbTaskOutput {
    /**
     * Name of the item.
     */
    @JsonProperty(value = "objectName", access = JsonProperty.Access.WRITE_ONLY)
    private String objectName;

    /**
     * Migration start time.
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startedOn;

    /**
     * Migration end time.
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endedOn;

    /**
     * Current state of migration. Possible values include: 'None',
     * 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /**
     * Status message.
     */
    @JsonProperty(value = "statusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String statusMessage;

    /**
     * Number of items.
     */
    @JsonProperty(value = "itemsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long itemsCount;

    /**
     * Number of successfully completed items.
     */
    @JsonProperty(value = "itemsCompletedCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long itemsCompletedCount;

    /**
     * Wildcard string prefix to use for querying all errors of the item.
     */
    @JsonProperty(value = "errorPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String errorPrefix;

    /**
     * Wildcard string prefix to use for querying all sub-tem results of the
     * item.
     */
    @JsonProperty(value = "resultPrefix", access = JsonProperty.Access.WRITE_ONLY)
    private String resultPrefix;

    /**
     * Get name of the item.
     *
     * @return the objectName value
     */
    public String objectName() {
        return this.objectName;
    }

    /**
     * Get migration start time.
     *
     * @return the startedOn value
     */
    public DateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get migration end time.
     *
     * @return the endedOn value
     */
    public DateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get current state of migration. Possible values include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     *
     * @return the state value
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get status message.
     *
     * @return the statusMessage value
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Get number of items.
     *
     * @return the itemsCount value
     */
    public Long itemsCount() {
        return this.itemsCount;
    }

    /**
     * Get number of successfully completed items.
     *
     * @return the itemsCompletedCount value
     */
    public Long itemsCompletedCount() {
        return this.itemsCompletedCount;
    }

    /**
     * Get wildcard string prefix to use for querying all errors of the item.
     *
     * @return the errorPrefix value
     */
    public String errorPrefix() {
        return this.errorPrefix;
    }

    /**
     * Get wildcard string prefix to use for querying all sub-tem results of the item.
     *
     * @return the resultPrefix value
     */
    public String resultPrefix() {
        return this.resultPrefix;
    }

}
