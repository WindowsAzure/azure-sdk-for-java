/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BackupStatus request.
 */
public class BackupStatusRequest {
    /**
     * Container Type - VM, SQLPaaS, DPM, AzureFileShare. Possible values
     * include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB',
     * 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client',
     * 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase'.
     */
    @JsonProperty(value = "resourceType")
    private DataSourceType resourceType;

    /**
     * Entire ARM resource id of the resource.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Protectable Item Logical Name.
     */
    @JsonProperty(value = "poLogicalName")
    private String poLogicalName;

    /**
     * Get container Type - VM, SQLPaaS, DPM, AzureFileShare. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase'.
     *
     * @return the resourceType value
     */
    public DataSourceType resourceType() {
        return this.resourceType;
    }

    /**
     * Set container Type - VM, SQLPaaS, DPM, AzureFileShare. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'VMwareVM', 'SystemState', 'Client', 'GenericDataSource', 'SQLDataBase', 'AzureFileShare', 'SAPHanaDatabase'.
     *
     * @param resourceType the resourceType value to set
     * @return the BackupStatusRequest object itself.
     */
    public BackupStatusRequest withResourceType(DataSourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get entire ARM resource id of the resource.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set entire ARM resource id of the resource.
     *
     * @param resourceId the resourceId value to set
     * @return the BackupStatusRequest object itself.
     */
    public BackupStatusRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get protectable Item Logical Name.
     *
     * @return the poLogicalName value
     */
    public String poLogicalName() {
        return this.poLogicalName;
    }

    /**
     * Set protectable Item Logical Name.
     *
     * @param poLogicalName the poLogicalName value to set
     * @return the BackupStatusRequest object itself.
     */
    public BackupStatusRequest withPoLogicalName(String poLogicalName) {
        this.poLogicalName = poLogicalName;
        return this;
    }

}
