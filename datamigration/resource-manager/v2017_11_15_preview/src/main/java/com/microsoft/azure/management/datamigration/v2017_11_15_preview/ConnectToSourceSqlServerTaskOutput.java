/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Output for the task that validates connection to SQL Server and also
 * validates source server requirements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("ConnectToSourceSqlServerTaskOutput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DatabaseLevelOutput", value = ConnectToSourceSqlServerTaskOutputDatabaseLevel.class),
    @JsonSubTypes.Type(name = "TaskLevelOutput", value = ConnectToSourceSqlServerTaskOutputTaskLevel.class)
})
public class ConnectToSourceSqlServerTaskOutput {
    /**
     * Result identifier.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get result identifier.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

}
