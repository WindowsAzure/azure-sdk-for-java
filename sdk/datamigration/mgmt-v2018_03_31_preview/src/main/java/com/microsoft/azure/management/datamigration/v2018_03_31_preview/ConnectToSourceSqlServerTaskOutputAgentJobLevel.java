/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AgentJob level output for the task that validates connection to SQL Server
 * and also validates source server requirements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType", defaultImpl = ConnectToSourceSqlServerTaskOutputAgentJobLevel.class)
@JsonTypeName("AgentJobLevelOutput")
public class ConnectToSourceSqlServerTaskOutputAgentJobLevel extends ConnectToSourceSqlServerTaskOutput {
    /**
     * AgentJob name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The type of AgentJob.
     */
    @JsonProperty(value = "jobCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String jobCategory;

    /**
     * The state of the original AgentJob.
     */
    @JsonProperty(value = "isEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEnabled;

    /**
     * The owner of the AgentJob.
     */
    @JsonProperty(value = "jobOwner", access = JsonProperty.Access.WRITE_ONLY)
    private String jobOwner;

    /**
     * UTC Date and time when the AgentJob was last executed.
     */
    @JsonProperty(value = "lastExecutedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastExecutedOn;

    /**
     * Information about eligibility of agent job for migration.
     */
    @JsonProperty(value = "migrationEligibility", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationEligibilityInfo migrationEligibility;

    /**
     * Get agentJob name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type of AgentJob.
     *
     * @return the jobCategory value
     */
    public String jobCategory() {
        return this.jobCategory;
    }

    /**
     * Get the state of the original AgentJob.
     *
     * @return the isEnabled value
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Get the owner of the AgentJob.
     *
     * @return the jobOwner value
     */
    public String jobOwner() {
        return this.jobOwner;
    }

    /**
     * Get uTC Date and time when the AgentJob was last executed.
     *
     * @return the lastExecutedOn value
     */
    public DateTime lastExecutedOn() {
        return this.lastExecutedOn;
    }

    /**
     * Get information about eligibility of agent job for migration.
     *
     * @return the migrationEligibility value
     */
    public MigrationEligibilityInfo migrationEligibility() {
        return this.migrationEligibility;
    }

}
