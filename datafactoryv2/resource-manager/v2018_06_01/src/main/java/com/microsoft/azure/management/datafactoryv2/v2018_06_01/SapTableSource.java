/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for SAP Table source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapTableSource")
public class SapTableSource extends CopySource {
    /**
     * The number of rows to be retrieved. Type: integer(or Expression with
     * resultType integer).
     */
    @JsonProperty(value = "rowCount")
    private Object rowCount;

    /**
     * The number of rows that will be skipped. Type: integer (or Expression
     * with resultType integer).
     */
    @JsonProperty(value = "rowSkips")
    private Object rowSkips;

    /**
     * The fields of the SAP table that will be retrieved. For example,
     * column0, column1. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "rfcTableFields")
    private Object rfcTableFields;

    /**
     * The options for the filtering of the SAP Table. For example, COLUMN0 EQ
     * SOME VALUE. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "rfcTableOptions")
    private Object rfcTableOptions;

    /**
     * Specifies the maximum number of rows that will be retrieved at a time
     * when retrieving data from SAP Table. Type: integer (or Expression with
     * resultType integer).
     */
    @JsonProperty(value = "batchSize")
    private Object batchSize;

    /**
     * Specifies the custom RFC function module that will be used to read data
     * from SAP Table. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "customRfcReadTableFunctionModule")
    private Object customRfcReadTableFunctionModule;

    /**
     * Get the number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     *
     * @return the rowCount value
     */
    public Object rowCount() {
        return this.rowCount;
    }

    /**
     * Set the number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     *
     * @param rowCount the rowCount value to set
     * @return the SapTableSource object itself.
     */
    public SapTableSource withRowCount(Object rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /**
     * Get the number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     *
     * @return the rowSkips value
     */
    public Object rowSkips() {
        return this.rowSkips;
    }

    /**
     * Set the number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     *
     * @param rowSkips the rowSkips value to set
     * @return the SapTableSource object itself.
     */
    public SapTableSource withRowSkips(Object rowSkips) {
        this.rowSkips = rowSkips;
        return this;
    }

    /**
     * Get the fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     *
     * @return the rfcTableFields value
     */
    public Object rfcTableFields() {
        return this.rfcTableFields;
    }

    /**
     * Set the fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     *
     * @param rfcTableFields the rfcTableFields value to set
     * @return the SapTableSource object itself.
     */
    public SapTableSource withRfcTableFields(Object rfcTableFields) {
        this.rfcTableFields = rfcTableFields;
        return this;
    }

    /**
     * Get the options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     *
     * @return the rfcTableOptions value
     */
    public Object rfcTableOptions() {
        return this.rfcTableOptions;
    }

    /**
     * Set the options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     *
     * @param rfcTableOptions the rfcTableOptions value to set
     * @return the SapTableSource object itself.
     */
    public SapTableSource withRfcTableOptions(Object rfcTableOptions) {
        this.rfcTableOptions = rfcTableOptions;
        return this;
    }

    /**
     * Get specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     *
     * @return the batchSize value
     */
    public Object batchSize() {
        return this.batchSize;
    }

    /**
     * Set specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     *
     * @param batchSize the batchSize value to set
     * @return the SapTableSource object itself.
     */
    public SapTableSource withBatchSize(Object batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     *
     * @return the customRfcReadTableFunctionModule value
     */
    public Object customRfcReadTableFunctionModule() {
        return this.customRfcReadTableFunctionModule;
    }

    /**
     * Set specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     *
     * @param customRfcReadTableFunctionModule the customRfcReadTableFunctionModule value to set
     * @return the SapTableSource object itself.
     */
    public SapTableSource withCustomRfcReadTableFunctionModule(Object customRfcReadTableFunctionModule) {
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        return this;
    }

}
