/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Defines the connection properties of a server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Unknown")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Migrate.SqlServer.AzureDbSqlMi.Complete", value = MigrateMISyncCompleteCommandProperties.class),
    @JsonSubTypes.Type(name = "Migrate.Sync.Complete.Database", value = MigrateSyncCompleteCommandProperties.class),
    @JsonSubTypes.Type(name = "MiSqlConnectionInfo", value = MiSqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "PostgreSqlConnectionInfo", value = PostgreSqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "OracleConnectionInfo", value = OracleConnectionInfo.class),
    @JsonSubTypes.Type(name = "MySqlConnectionInfo", value = MySqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "MongoDbConnectionInfo", value = MongoDbConnectionInfo.class),
    @JsonSubTypes.Type(name = "SqlConnectionInfo", value = SqlConnectionInfo.class),
    @JsonSubTypes.Type(name = "GetTDECertificates.Sql", value = GetTdeCertificatesSqlTaskProperties.class),
    @JsonSubTypes.Type(name = "Validate.Oracle.AzureDbPostgreSql.Sync", value = ValidateOracleAzureDbForPostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Validate.MongoDb", value = ValidateMongoDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ValidateMigrationInput.SqlServer.AzureSqlDbMI.Sync.LRS", value = ValidateMigrationInputSqlServerSqlMISyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ValidateMigrationInput.SqlServer.AzureSqlDbMI", value = ValidateMigrationInputSqlServerSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "ValidateMigrationInput.SqlServer.SqlDb.Sync", value = ValidateMigrationInputSqlServerSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.Oracle.Sql.Sync", value = MigrateOracleAzureDbForPostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.PostgreSql.AzureDbForPostgreSql.Sync", value = MigratePostgreSqlAzureDbForPostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.MySql.AzureDbForMySql.Sync", value = MigrateMySqlAzureDbForMySqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.AzureSqlDb.Sync", value = MigrateSqlServerSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.SqlDb", value = MigrateSqlServerSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.AzureSqlDbMI.Sync.LRS", value = MigrateSqlServerSqlMISyncTaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.SqlServer.AzureSqlDbMI", value = MigrateSqlServerSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "Migrate.MongoDb", value = MigrateMongoDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.AzureDbForMySql", value = ConnectToTargetAzureDbForMySqlTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.AzureSqlDbMI.Sync.LRS", value = ConnectToTargetSqlMISyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.AzureSqlDbMI", value = ConnectToTargetSqlMITaskProperties.class),
    @JsonSubTypes.Type(name = "GetUserTables.AzureSqlDb.Sync", value = GetUserTablesSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "GetUserTables.Sql", value = GetUserTablesSqlTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.Oracle.AzureDbForPostgreSql.Sync", value = ConnectToTargetOracleAzureDbForPostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.AzureDbForPostgreSql.Sync", value = ConnectToTargetAzureDbForPostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.SqlDb.Sync", value = ConnectToTargetSqlSqlDbSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToTarget.SqlDb", value = ConnectToTargetSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.Oracle.Sync", value = ConnectToSourceOracleSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.PostgreSql.Sync", value = ConnectToSourcePostgreSqlSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.SqlServer.Sync", value = ConnectToSourceSqlServerSyncTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.SqlServer", value = ConnectToSourceSqlServerTaskProperties.class),
    @JsonSubTypes.Type(name = "Connect.MongoDb", value = ConnectToMongoDbTaskProperties.class),
    @JsonSubTypes.Type(name = "ConnectToSource.MySql", value = ConnectToSourceMySqlTaskProperties.class),
    @JsonSubTypes.Type(name = "MigrateSchemaSqlServerSqlDb", value = MigrateSchemaSqlServerSqlDbTaskProperties.class),
    @JsonSubTypes.Type(name = "cancel", value = MongoDbCancelCommand.class),
    @JsonSubTypes.Type(name = "finish", value = MongoDbFinishCommand.class),
    @JsonSubTypes.Type(name = "restart", value = MongoDbRestartCommand.class),
    @JsonSubTypes.Type(name = "Service.Check.OCI", value = CheckOCIDriverTaskProperties.class),
    @JsonSubTypes.Type(name = "Service.Upload.OCI", value = UploadOCIDriverTaskProperties.class),
    @JsonSubTypes.Type(name = "Service.Install.OCI", value = InstallOCIDriverTaskProperties.class)
})
public class ConnectionInfo {
    /**
     * User name.
     */
    @JsonProperty(value = "userName")
    private String userName;

    /**
     * Password credential.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get user name.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set user name.
     *
     * @param userName the userName value to set
     * @return the ConnectionInfo object itself.
     */
    public ConnectionInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password credential.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set password credential.
     *
     * @param password the password value to set
     * @return the ConnectionInfo object itself.
     */
    public ConnectionInfo withPassword(String password) {
        this.password = password;
        return this;
    }

}
