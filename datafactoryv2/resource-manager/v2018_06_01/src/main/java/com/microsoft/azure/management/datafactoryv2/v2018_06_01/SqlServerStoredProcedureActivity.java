/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * SQL stored procedure activity type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlServerStoredProcedure")
@JsonFlatten
public class SqlServerStoredProcedureActivity extends ExecutionActivity {
    /**
     * Stored procedure name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.storedProcedureName", required = true)
    private Object storedProcedureName;

    /**
     * Value and type setting for stored procedure parameters. Example:
     * "{Parameter1: {value: "1", type: "int"}}".
     */
    @JsonProperty(value = "typeProperties.storedProcedureParameters")
    private Map<String, StoredProcedureParameter> storedProcedureParameters;

    /**
     * Get stored procedure name. Type: string (or Expression with resultType string).
     *
     * @return the storedProcedureName value
     */
    public Object storedProcedureName() {
        return this.storedProcedureName;
    }

    /**
     * Set stored procedure name. Type: string (or Expression with resultType string).
     *
     * @param storedProcedureName the storedProcedureName value to set
     * @return the SqlServerStoredProcedureActivity object itself.
     */
    public SqlServerStoredProcedureActivity withStoredProcedureName(Object storedProcedureName) {
        this.storedProcedureName = storedProcedureName;
        return this;
    }

    /**
     * Get value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     *
     * @return the storedProcedureParameters value
     */
    public Map<String, StoredProcedureParameter> storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}".
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set
     * @return the SqlServerStoredProcedureActivity object itself.
     */
    public SqlServerStoredProcedureActivity withStoredProcedureParameters(Map<String, StoredProcedureParameter> storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

}
