/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SQL sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlSink")
public class SqlSink extends CopySink {
    /**
     * SQL writer stored procedure name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "sqlWriterStoredProcedureName")
    private Object sqlWriterStoredProcedureName;

    /**
     * SQL writer table type. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "sqlWriterTableType")
    private Object sqlWriterTableType;

    /**
     * SQL pre-copy script. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * SQL stored procedure parameters.
     */
    @JsonProperty(value = "storedProcedureParameters")
    private Map<String, StoredProcedureParameter> storedProcedureParameters;

    /**
     * Get sQL writer stored procedure name. Type: string (or Expression with resultType string).
     *
     * @return the sqlWriterStoredProcedureName value
     */
    public Object sqlWriterStoredProcedureName() {
        return this.sqlWriterStoredProcedureName;
    }

    /**
     * Set sQL writer stored procedure name. Type: string (or Expression with resultType string).
     *
     * @param sqlWriterStoredProcedureName the sqlWriterStoredProcedureName value to set
     * @return the SqlSink object itself.
     */
    public SqlSink withSqlWriterStoredProcedureName(Object sqlWriterStoredProcedureName) {
        this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
        return this;
    }

    /**
     * Get sQL writer table type. Type: string (or Expression with resultType string).
     *
     * @return the sqlWriterTableType value
     */
    public Object sqlWriterTableType() {
        return this.sqlWriterTableType;
    }

    /**
     * Set sQL writer table type. Type: string (or Expression with resultType string).
     *
     * @param sqlWriterTableType the sqlWriterTableType value to set
     * @return the SqlSink object itself.
     */
    public SqlSink withSqlWriterTableType(Object sqlWriterTableType) {
        this.sqlWriterTableType = sqlWriterTableType;
        return this;
    }

    /**
     * Get sQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @return the preCopyScript value
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set sQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @param preCopyScript the preCopyScript value to set
     * @return the SqlSink object itself.
     */
    public SqlSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get sQL stored procedure parameters.
     *
     * @return the storedProcedureParameters value
     */
    public Map<String, StoredProcedureParameter> storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set sQL stored procedure parameters.
     *
     * @param storedProcedureParameters the storedProcedureParameters value to set
     * @return the SqlSink object itself.
     */
    public SqlSink withStoredProcedureParameters(Map<String, StoredProcedureParameter> storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

}
