/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Import database parameters.
 */
public class ImportRequest extends ExportRequest {
    /**
     * The name of the database to import.
     */
    @JsonProperty(value = "databaseName", required = true)
    private String databaseName;

    /**
     * The edition for the database being created.
     *
     * The list of SKUs may vary by region and support offer. To determine the
     * SKUs (including the SKU name, tier/edition, family, and capacity) that
     * are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or one of the following commands:
     *
     * ```azurecli
     * az sql db list-editions -l &lt;location&gt; -o table
     * ````
     *
     * ```powershell
     * Get-AzSqlServerServiceObjective -Location &lt;location&gt;
     * ````
     * . Possible values include: 'Web', 'Business', 'Basic', 'Standard',
     * 'Premium', 'PremiumRS', 'Free', 'Stretch', 'DataWarehouse', 'System',
     * 'System2', 'GeneralPurpose', 'BusinessCritical', 'Hyperscale'.
     */
    @JsonProperty(value = "edition", required = true)
    private DatabaseEdition edition;

    /**
     * The name of the service objective to assign to the database. Possible
     * values include: 'System', 'System0', 'System1', 'System2', 'System3',
     * 'System4', 'System2L', 'System3L', 'System4L', 'Free', 'Basic', 'S0',
     * 'S1', 'S2', 'S3', 'S4', 'S6', 'S7', 'S9', 'S12', 'P1', 'P2', 'P3', 'P4',
     * 'P6', 'P11', 'P15', 'PRS1', 'PRS2', 'PRS4', 'PRS6', 'DW100', 'DW200',
     * 'DW300', 'DW400', 'DW500', 'DW600', 'DW1000', 'DW1200', 'DW1000c',
     * 'DW1500', 'DW1500c', 'DW2000', 'DW2000c', 'DW3000', 'DW2500c',
     * 'DW3000c', 'DW6000', 'DW5000c', 'DW6000c', 'DW7500c', 'DW10000c',
     * 'DW15000c', 'DW30000c', 'DS100', 'DS200', 'DS300', 'DS400', 'DS500',
     * 'DS600', 'DS1000', 'DS1200', 'DS1500', 'DS2000', 'ElasticPool'.
     */
    @JsonProperty(value = "serviceObjectiveName", required = true)
    private ServiceObjectiveName serviceObjectiveName;

    /**
     * The maximum size for the newly imported database.
     */
    @JsonProperty(value = "maxSizeBytes", required = true)
    private String maxSizeBytes;

    /**
     * Get the name of the database to import.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database to import.
     *
     * @param databaseName the databaseName value to set
     * @return the ImportRequest object itself.
     */
    public ImportRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the edition for the database being created.
     The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or one of the following commands:
     ```azurecli
     az sql db list-editions -l &lt;location&gt; -o table
     ````
     ```powershell
     Get-AzSqlServerServiceObjective -Location &lt;location&gt;
     ````
     . Possible values include: 'Web', 'Business', 'Basic', 'Standard', 'Premium', 'PremiumRS', 'Free', 'Stretch', 'DataWarehouse', 'System', 'System2', 'GeneralPurpose', 'BusinessCritical', 'Hyperscale'.
     *
     * @return the edition value
     */
    public DatabaseEdition edition() {
        return this.edition;
    }

    /**
     * Set the edition for the database being created.
     The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or one of the following commands:
     ```azurecli
     az sql db list-editions -l &lt;location&gt; -o table
     ````
     ```powershell
     Get-AzSqlServerServiceObjective -Location &lt;location&gt;
     ````
     . Possible values include: 'Web', 'Business', 'Basic', 'Standard', 'Premium', 'PremiumRS', 'Free', 'Stretch', 'DataWarehouse', 'System', 'System2', 'GeneralPurpose', 'BusinessCritical', 'Hyperscale'.
     *
     * @param edition the edition value to set
     * @return the ImportRequest object itself.
     */
    public ImportRequest withEdition(DatabaseEdition edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get the name of the service objective to assign to the database. Possible values include: 'System', 'System0', 'System1', 'System2', 'System3', 'System4', 'System2L', 'System3L', 'System4L', 'Free', 'Basic', 'S0', 'S1', 'S2', 'S3', 'S4', 'S6', 'S7', 'S9', 'S12', 'P1', 'P2', 'P3', 'P4', 'P6', 'P11', 'P15', 'PRS1', 'PRS2', 'PRS4', 'PRS6', 'DW100', 'DW200', 'DW300', 'DW400', 'DW500', 'DW600', 'DW1000', 'DW1200', 'DW1000c', 'DW1500', 'DW1500c', 'DW2000', 'DW2000c', 'DW3000', 'DW2500c', 'DW3000c', 'DW6000', 'DW5000c', 'DW6000c', 'DW7500c', 'DW10000c', 'DW15000c', 'DW30000c', 'DS100', 'DS200', 'DS300', 'DS400', 'DS500', 'DS600', 'DS1000', 'DS1200', 'DS1500', 'DS2000', 'ElasticPool'.
     *
     * @return the serviceObjectiveName value
     */
    public ServiceObjectiveName serviceObjectiveName() {
        return this.serviceObjectiveName;
    }

    /**
     * Set the name of the service objective to assign to the database. Possible values include: 'System', 'System0', 'System1', 'System2', 'System3', 'System4', 'System2L', 'System3L', 'System4L', 'Free', 'Basic', 'S0', 'S1', 'S2', 'S3', 'S4', 'S6', 'S7', 'S9', 'S12', 'P1', 'P2', 'P3', 'P4', 'P6', 'P11', 'P15', 'PRS1', 'PRS2', 'PRS4', 'PRS6', 'DW100', 'DW200', 'DW300', 'DW400', 'DW500', 'DW600', 'DW1000', 'DW1200', 'DW1000c', 'DW1500', 'DW1500c', 'DW2000', 'DW2000c', 'DW3000', 'DW2500c', 'DW3000c', 'DW6000', 'DW5000c', 'DW6000c', 'DW7500c', 'DW10000c', 'DW15000c', 'DW30000c', 'DS100', 'DS200', 'DS300', 'DS400', 'DS500', 'DS600', 'DS1000', 'DS1200', 'DS1500', 'DS2000', 'ElasticPool'.
     *
     * @param serviceObjectiveName the serviceObjectiveName value to set
     * @return the ImportRequest object itself.
     */
    public ImportRequest withServiceObjectiveName(ServiceObjectiveName serviceObjectiveName) {
        this.serviceObjectiveName = serviceObjectiveName;
        return this;
    }

    /**
     * Get the maximum size for the newly imported database.
     *
     * @return the maxSizeBytes value
     */
    public String maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maximum size for the newly imported database.
     *
     * @param maxSizeBytes the maxSizeBytes value to set
     * @return the ImportRequest object itself.
     */
    public ImportRequest withMaxSizeBytes(String maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

}
