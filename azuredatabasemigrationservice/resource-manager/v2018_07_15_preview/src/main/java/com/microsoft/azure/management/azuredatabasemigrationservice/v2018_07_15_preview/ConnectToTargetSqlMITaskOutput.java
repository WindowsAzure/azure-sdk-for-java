/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Output for the task that validates connection to Azure SQL Database Managed
 * Instance.
 */
public class ConnectToTargetSqlMITaskOutput {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Target server version.
     */
    @JsonProperty(value = "targetServerVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerVersion;

    /**
     * Target server brand version.
     */
    @JsonProperty(value = "targetServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String targetServerBrandVersion;

    /**
     * List of logins on the target server.
     */
    @JsonProperty(value = "logins", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> logins;

    /**
     * List of agent jobs on the target server.
     */
    @JsonProperty(value = "agentJobs", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> agentJobs;

    /**
     * Validation errors.
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get target server version.
     *
     * @return the targetServerVersion value
     */
    public String targetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Get target server brand version.
     *
     * @return the targetServerBrandVersion value
     */
    public String targetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Get list of logins on the target server.
     *
     * @return the logins value
     */
    public List<String> logins() {
        return this.logins;
    }

    /**
     * Get list of agent jobs on the target server.
     *
     * @return the agentJobs value
     */
    public List<String> agentJobs() {
        return this.agentJobs;
    }

    /**
     * Get validation errors.
     *
     * @return the validationErrors value
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

}
