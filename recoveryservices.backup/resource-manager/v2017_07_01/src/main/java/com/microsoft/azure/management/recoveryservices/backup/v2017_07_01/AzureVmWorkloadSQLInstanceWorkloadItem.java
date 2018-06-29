/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure VM workload-specific workload item representing SQL Instance.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "workloadItemType")
@JsonTypeName("SQLInstance")
public class AzureVmWorkloadSQLInstanceWorkloadItem extends AzureVmWorkloadItem {
    /**
     * Data Directory Paths for default directories.
     */
    @JsonProperty(value = "dataDirectoryPaths")
    private List<SQLDataDirectory> dataDirectoryPaths;

    /**
     * Get data Directory Paths for default directories.
     *
     * @return the dataDirectoryPaths value
     */
    public List<SQLDataDirectory> dataDirectoryPaths() {
        return this.dataDirectoryPaths;
    }

    /**
     * Set data Directory Paths for default directories.
     *
     * @param dataDirectoryPaths the dataDirectoryPaths value to set
     * @return the AzureVmWorkloadSQLInstanceWorkloadItem object itself.
     */
    public AzureVmWorkloadSQLInstanceWorkloadItem withDataDirectoryPaths(List<SQLDataDirectory> dataDirectoryPaths) {
        this.dataDirectoryPaths = dataDirectoryPaths;
        return this;
    }

}
