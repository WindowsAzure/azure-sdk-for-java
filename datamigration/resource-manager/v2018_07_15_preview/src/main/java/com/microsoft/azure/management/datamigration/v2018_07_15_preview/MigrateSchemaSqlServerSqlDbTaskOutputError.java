/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The MigrateSchemaSqlServerSqlDbTaskOutputError model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType", defaultImpl = MigrateSchemaSqlServerSqlDbTaskOutputError.class)
@JsonTypeName("SchemaErrorOutput")
public class MigrateSchemaSqlServerSqlDbTaskOutputError extends MigrateSchemaSqlServerSqlDbTaskOutput {
    /**
     * Schema command which failed.
     */
    @JsonProperty(value = "commandText", access = JsonProperty.Access.WRITE_ONLY)
    private String commandText;

    /**
     * Reason of failure.
     */
    @JsonProperty(value = "errorText", access = JsonProperty.Access.WRITE_ONLY)
    private String errorText;

    /**
     * Get schema command which failed.
     *
     * @return the commandText value
     */
    public String commandText() {
        return this.commandText;
    }

    /**
     * Get reason of failure.
     *
     * @return the errorText value
     */
    public String errorText() {
        return this.errorText;
    }

}
