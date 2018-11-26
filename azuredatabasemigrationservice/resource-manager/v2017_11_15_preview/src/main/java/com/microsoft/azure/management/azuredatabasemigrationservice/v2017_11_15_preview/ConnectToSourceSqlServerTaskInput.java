/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2017_11_15_preview;

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
     * 'MigrationFromSqlServerToAzureDB'.
     */
    @JsonProperty(value = "checkPermissionsGroup")
    private ServerLevelPermissionsGroup checkPermissionsGroup;

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
     * Get permission group for validations. Possible values include: 'Default', 'MigrationFromSqlServerToAzureDB'.
     *
     * @return the checkPermissionsGroup value
     */
    public ServerLevelPermissionsGroup checkPermissionsGroup() {
        return this.checkPermissionsGroup;
    }

    /**
     * Set permission group for validations. Possible values include: 'Default', 'MigrationFromSqlServerToAzureDB'.
     *
     * @param checkPermissionsGroup the checkPermissionsGroup value to set
     * @return the ConnectToSourceSqlServerTaskInput object itself.
     */
    public ConnectToSourceSqlServerTaskInput withCheckPermissionsGroup(ServerLevelPermissionsGroup checkPermissionsGroup) {
        this.checkPermissionsGroup = checkPermissionsGroup;
        return this;
    }

}
