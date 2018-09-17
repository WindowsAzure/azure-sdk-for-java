/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The HiveJobProperties model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Hive")
public class HiveJobProperties extends JobProperties {
    /**
     * Gets or sets the statement information for each statement in the script.
     */
    @JsonProperty(value = "statementInfo")
    private List<HiveJobStatementInfo> statementInfo;

    /**
     * Gets or sets the Hive logs location.
     */
    @JsonProperty(value = "logsLocation")
    private String logsLocation;

    /**
     * Gets or sets the runtime version of the U-SQL engine to use.
     */
    @JsonProperty(value = "warehouseLocation")
    private String warehouseLocation;

    /**
     * Gets or sets the number of statements that will be run based on the
     * script.
     */
    @JsonProperty(value = "statementCount")
    private Integer statementCount;

    /**
     * Gets or sets the number of statements that have been run based on the
     * script.
     */
    @JsonProperty(value = "executedStatementCount")
    private Integer executedStatementCount;

    /**
     * Get gets or sets the statement information for each statement in the script.
     *
     * @return the statementInfo value
     */
    public List<HiveJobStatementInfo> statementInfo() {
        return this.statementInfo;
    }

    /**
     * Set gets or sets the statement information for each statement in the script.
     *
     * @param statementInfo the statementInfo value to set
     * @return the HiveJobProperties object itself.
     */
    public HiveJobProperties withStatementInfo(List<HiveJobStatementInfo> statementInfo) {
        this.statementInfo = statementInfo;
        return this;
    }

    /**
     * Get gets or sets the Hive logs location.
     *
     * @return the logsLocation value
     */
    public String logsLocation() {
        return this.logsLocation;
    }

    /**
     * Set gets or sets the Hive logs location.
     *
     * @param logsLocation the logsLocation value to set
     * @return the HiveJobProperties object itself.
     */
    public HiveJobProperties withLogsLocation(String logsLocation) {
        this.logsLocation = logsLocation;
        return this;
    }

    /**
     * Get gets or sets the runtime version of the U-SQL engine to use.
     *
     * @return the warehouseLocation value
     */
    public String warehouseLocation() {
        return this.warehouseLocation;
    }

    /**
     * Set gets or sets the runtime version of the U-SQL engine to use.
     *
     * @param warehouseLocation the warehouseLocation value to set
     * @return the HiveJobProperties object itself.
     */
    public HiveJobProperties withWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
        return this;
    }

    /**
     * Get gets or sets the number of statements that will be run based on the script.
     *
     * @return the statementCount value
     */
    public Integer statementCount() {
        return this.statementCount;
    }

    /**
     * Set gets or sets the number of statements that will be run based on the script.
     *
     * @param statementCount the statementCount value to set
     * @return the HiveJobProperties object itself.
     */
    public HiveJobProperties withStatementCount(Integer statementCount) {
        this.statementCount = statementCount;
        return this;
    }

    /**
     * Get gets or sets the number of statements that have been run based on the script.
     *
     * @return the executedStatementCount value
     */
    public Integer executedStatementCount() {
        return this.executedStatementCount;
    }

    /**
     * Set gets or sets the number of statements that have been run based on the script.
     *
     * @param executedStatementCount the executedStatementCount value to set
     * @return the HiveJobProperties object itself.
     */
    public HiveJobProperties withExecutedStatementCount(Integer executedStatementCount) {
        this.executedStatementCount = executedStatementCount;
        return this;
    }

}
