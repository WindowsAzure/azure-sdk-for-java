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

/**
 * Information for connecting to Oracle server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OracleConnectionInfo")
public class OracleConnectionInfo extends ConnectionInfo {
    /**
     * EZConnect or TNSName connection string.
     */
    @JsonProperty(value = "dataSource", required = true)
    private String dataSource;

    /**
     * Get eZConnect or TNSName connection string.
     *
     * @return the dataSource value
     */
    public String dataSource() {
        return this.dataSource;
    }

    /**
     * Set eZConnect or TNSName connection string.
     *
     * @param dataSource the dataSource value to set
     * @return the OracleConnectionInfo object itself.
     */
    public OracleConnectionInfo withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

}
