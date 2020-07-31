/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for SAP Business Warehouse Open Hub Destination
 * source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SapOpenHubSource.class)
@JsonTypeName("SapOpenHubSource")
public class SapOpenHubSource extends TabularSource {
    /**
     * Whether to exclude the records of the last request. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "excludeLastRequest")
    private Object excludeLastRequest;

    /**
     * The ID of request for delta loading. Once it is set, only data with
     * requestId larger than the value of this property will be retrieved. The
     * default value is 0. Type: integer (or Expression with resultType integer
     * ).
     */
    @JsonProperty(value = "baseRequestId")
    private Object baseRequestId;

    /**
     * Specifies the custom RFC function module that will be used to read data
     * from SAP Table. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "customRfcReadTableFunctionModule")
    private Object customRfcReadTableFunctionModule;

    /**
     * The single character that will be used as delimiter passed to SAP RFC as
     * well as splitting the output data retrieved. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "sapDataColumnDelimiter")
    private Object sapDataColumnDelimiter;

    /**
     * Get whether to exclude the records of the last request. The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the excludeLastRequest value
     */
    public Object excludeLastRequest() {
        return this.excludeLastRequest;
    }

    /**
     * Set whether to exclude the records of the last request. The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param excludeLastRequest the excludeLastRequest value to set
     * @return the SapOpenHubSource object itself.
     */
    public SapOpenHubSource withExcludeLastRequest(Object excludeLastRequest) {
        this.excludeLastRequest = excludeLastRequest;
        return this;
    }

    /**
     * Get the ID of request for delta loading. Once it is set, only data with requestId larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression with resultType integer ).
     *
     * @return the baseRequestId value
     */
    public Object baseRequestId() {
        return this.baseRequestId;
    }

    /**
     * Set the ID of request for delta loading. Once it is set, only data with requestId larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression with resultType integer ).
     *
     * @param baseRequestId the baseRequestId value to set
     * @return the SapOpenHubSource object itself.
     */
    public SapOpenHubSource withBaseRequestId(Object baseRequestId) {
        this.baseRequestId = baseRequestId;
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
     * @return the SapOpenHubSource object itself.
     */
    public SapOpenHubSource withCustomRfcReadTableFunctionModule(Object customRfcReadTableFunctionModule) {
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        return this;
    }

    /**
     * Get the single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     *
     * @return the sapDataColumnDelimiter value
     */
    public Object sapDataColumnDelimiter() {
        return this.sapDataColumnDelimiter;
    }

    /**
     * Set the single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     *
     * @param sapDataColumnDelimiter the sapDataColumnDelimiter value to set
     * @return the SapOpenHubSource object itself.
     */
    public SapOpenHubSource withSapDataColumnDelimiter(Object sapDataColumnDelimiter) {
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        return this;
    }

}
