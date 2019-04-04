/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that validates connection to SQL Server and also
 * validates source server requirements.
 */
public class ConnectToSourceSqlServerTaskInput {
    /**
     * Connection information for Source SQL Server.
     */
    @JsonProperty(value = "sourceConnectionInfo", required = true)
    private SqlConnectionInfo sourceConnectionInfo;

    /**
     * Permission group for validations. Possible values include: 'Default',
     * 'MigrationFromSqlServerToAzureDB', 'MigrationFromSqlServerToAzureMI',
     * 'MigrationFromMySQLToAzureDBForMySQL'.
     */
    @JsonProperty(value = "checkPermissionsGroup")
    private ServerLevelPermissionsGroup checkPermissionsGroup;

    /**
     * Flag for whether to collect logins from source server.
     */
    @JsonProperty(value = "collectLogins")
    private Boolean collectLogins;

    /**
     * Flag for whether to collect agent jobs from source server.
     */
    @JsonProperty(value = "collectAgentJobs")
    private Boolean collectAgentJobs;

    /**
     * Flag for whether to collect TDE Certificate names from source server.
     */
    @JsonProperty(value = "collectTdeCertificateInfo")
    private Boolean collectTdeCertificateInfo;

    /**
     * Get connection information for Source SQL Server.
     *
     * @return the sourceConnectionInfo value
     */
    public SqlConnectionInfo sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Set connection information for Source SQL Server.
     *
     * @param sourceConnectionInfo the sourceConnectionInfo value to set
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        this.sourceConnectionInfo = sourceConnectionInfo;
        return this;
    }

    /**
     * Get permission group for validations. Possible values include: 'Default', 'MigrationFromSqlServerToAzureDB', 'MigrationFromSqlServerToAzureMI', 'MigrationFromMySQLToAzureDBForMySQL'.
     *
     * @return the checkPermissionsGroup value
     */
    public ServerLevelPermissionsGroup checkPermissionsGroup() {
        return this.checkPermissionsGroup;
    }

    /**
     * Set permission group for validations. Possible values include: 'Default', 'MigrationFromSqlServerToAzureDB', 'MigrationFromSqlServerToAzureMI', 'MigrationFromMySQLToAzureDBForMySQL'.
     *
     * @param checkPermissionsGroup the checkPermissionsGroup value to set
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCheckPermissionsGroup(ServerLevelPermissionsGroup checkPermissionsGroup) {
        this.checkPermissionsGroup = checkPermissionsGroup;
        return this;
    }

    /**
     * Get flag for whether to collect logins from source server.
     *
     * @return the collectLogins value
     */
    public Boolean collectLogins() {
        return this.collectLogins;
    }

    /**
     * Set flag for whether to collect logins from source server.
     *
     * @param collectLogins the collectLogins value to set
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCollectLogins(Boolean collectLogins) {
        this.collectLogins = collectLogins;
        return this;
    }

    /**
     * Get flag for whether to collect agent jobs from source server.
     *
     * @return the collectAgentJobs value
     */
    public Boolean collectAgentJobs() {
        return this.collectAgentJobs;
    }

    /**
     * Set flag for whether to collect agent jobs from source server.
     *
     * @param collectAgentJobs the collectAgentJobs value to set
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCollectAgentJobs(Boolean collectAgentJobs) {
        this.collectAgentJobs = collectAgentJobs;
        return this;
    }

    /**
     * Get flag for whether to collect TDE Certificate names from source server.
     *
     * @return the collectTdeCertificateInfo value
     */
    public Boolean collectTdeCertificateInfo() {
        return this.collectTdeCertificateInfo;
    }

    /**
     * Set flag for whether to collect TDE Certificate names from source server.
     *
     * @param collectTdeCertificateInfo the collectTdeCertificateInfo value to set
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCollectTdeCertificateInfo(Boolean collectTdeCertificateInfo) {
        this.collectTdeCertificateInfo = collectTdeCertificateInfo;
        return this;
    }

}
