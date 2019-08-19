/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Agent Job level output for the task that validates connection to SQL Server
 * and also validates source server requirements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType", defaultImpl = ConnectToSourceSqlServerTaskOutputAgentJobLevel.class)
@JsonTypeName("AgentJobLevelOutput")
public class ConnectToSourceSqlServerTaskOutputAgentJobLevel extends ConnectToSourceSqlServerTaskOutput {
    /**
     * Agent Job name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The type of Agent Job.
     */
    @JsonProperty(value = "jobCategory", access = JsonProperty.Access.WRITE_ONLY)
    private String jobCategory;

    /**
     * The state of the original Agent Job.
     */
    @JsonProperty(value = "isEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEnabled;

    /**
     * The owner of the Agent Job.
     */
    @JsonProperty(value = "jobOwner", access = JsonProperty.Access.WRITE_ONLY)
    private String jobOwner;

    /**
     * UTC Date and time when the Agent Job was last executed.
     */
    @JsonProperty(value = "lastExecutedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastExecutedOn;

    /**
     * Validation errors.
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Information about eligibility of agent job for migration.
     */
    @JsonProperty(value = "migrationEligibility", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationEligibilityInfo migrationEligibility;

    /**
     * Get agent Job name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type of Agent Job.
     *
     * @return the jobCategory value
     */
    public String jobCategory() {
        return this.jobCategory;
    }

    /**
     * Get the state of the original Agent Job.
     *
     * @return the isEnabled value
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Get the owner of the Agent Job.
     *
     * @return the jobOwner value
     */
    public String jobOwner() {
        return this.jobOwner;
    }

    /**
     * Get uTC Date and time when the Agent Job was last executed.
     *
     * @return the lastExecutedOn value
     */
    public DateTime lastExecutedOn() {
        return this.lastExecutedOn;
    }

    /**
     * Get validation errors.
     *
     * @return the validationErrors value
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
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
