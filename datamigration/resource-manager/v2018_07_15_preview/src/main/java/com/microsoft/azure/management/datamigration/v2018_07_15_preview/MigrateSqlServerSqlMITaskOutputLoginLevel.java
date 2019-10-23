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
 * The MigrateSqlServerSqlMITaskOutputLoginLevel model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("LoginLevelOutput")
public class MigrateSqlServerSqlMITaskOutputLoginLevel extends MigrateSqlServerSqlMITaskOutput {
    /**
     * Login name.
     */
    @JsonProperty(value = "loginName", access = JsonProperty.Access.WRITE_ONLY)
    private String loginName;

    /**
     * Current state of login. Possible values include: 'None', 'InProgress',
     * 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState state;

    /**
     * Current stage of login. Possible values include: 'None', 'Initialize',
     * 'LoginMigration', 'EstablishUserMapping', 'AssignRoleMembership',
     * 'AssignRoleOwnership', 'EstablishServerPermissions',
     * 'EstablishObjectPermissions', 'Completed'.
     */
    @JsonProperty(value = "stage", access = JsonProperty.Access.WRITE_ONLY)
    private LoginMigrationStage stage;

    /**
     * Login migration start time.
     */
    @JsonProperty(value = "startedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startedOn;

    /**
     * Login migration end time.
     */
    @JsonProperty(value = "endedOn", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endedOn;

    /**
     * Login migration progress message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Login migration errors and warnings per login.
     */
    @JsonProperty(value = "exceptionsAndWarnings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> exceptionsAndWarnings;

    /**
     * Get login name.
     *
     * @return the loginName value
     */
    public String loginName() {
        return this.loginName;
    }

    /**
     * Get current state of login. Possible values include: 'None', 'InProgress', 'Failed', 'Warning', 'Completed', 'Skipped', 'Stopped'.
     *
     * @return the state value
     */
    public MigrationState state() {
        return this.state;
    }

    /**
     * Get current stage of login. Possible values include: 'None', 'Initialize', 'LoginMigration', 'EstablishUserMapping', 'AssignRoleMembership', 'AssignRoleOwnership', 'EstablishServerPermissions', 'EstablishObjectPermissions', 'Completed'.
     *
     * @return the stage value
     */
    public LoginMigrationStage stage() {
        return this.stage;
    }

    /**
     * Get login migration start time.
     *
     * @return the startedOn value
     */
    public DateTime startedOn() {
        return this.startedOn;
    }

    /**
     * Get login migration end time.
     *
     * @return the endedOn value
     */
    public DateTime endedOn() {
        return this.endedOn;
    }

    /**
     * Get login migration progress message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get login migration errors and warnings per login.
     *
     * @return the exceptionsAndWarnings value
     */
    public List<ReportableException> exceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

}
