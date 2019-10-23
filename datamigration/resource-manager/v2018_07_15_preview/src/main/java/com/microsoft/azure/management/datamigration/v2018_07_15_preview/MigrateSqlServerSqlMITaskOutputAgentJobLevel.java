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
 * The MigrateSqlServerSqlMITaskOutputAgentJobLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("AgentJobLevelOutput")
public class MigrateSqlServerSqlMITaskOutputAgentJobLevel extends MigrateSqlServerSqlMITaskOutput {
    /**
     * Agent Job name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The state of the original Agent Job.
     */
    @JsonProperty(value = "isEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEnabled;

    /**
     * Current state of migration. Possible values include: 'None',
     * 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

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
     * Migration progress message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Migration errors and warnings per job.
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Get agent Job name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
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
     * Get current state of migration. Possible values include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     *
     * @return the state value
     */
    public MigrationState state() {
        return this.state;
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
     * Get migration progress message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get migration errors and warnings per job.
     *
     * @return the exceptionsAndWarnings value
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

}
