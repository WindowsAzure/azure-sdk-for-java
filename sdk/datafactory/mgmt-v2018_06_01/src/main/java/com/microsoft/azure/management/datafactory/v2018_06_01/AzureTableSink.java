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
 * A copy activity Azure Table sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureTableSink.class)
@JsonTypeName("AzureTableSink")
public class AzureTableSink extends CopySink {
    /**
     * Azure Table default partition key value. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "azureTableDefaultPartitionKeyValue")
    private Object azureTableDefaultPartitionKeyValue;

    /**
     * Azure Table partition key name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "azureTablePartitionKeyName")
    private Object azureTablePartitionKeyName;

    /**
     * Azure Table row key name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "azureTableRowKeyName")
    private Object azureTableRowKeyName;

    /**
     * Azure Table insert type. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "azureTableInsertType")
    private Object azureTableInsertType;

    /**
     * Get azure Table default partition key value. Type: string (or Expression with resultType string).
     *
     * @return the azureTableDefaultPartitionKeyValue value
     */
    public Object azureTableDefaultPartitionKeyValue() {
        return this.azureTableDefaultPartitionKeyValue;
    }

    /**
     * Set azure Table default partition key value. Type: string (or Expression with resultType string).
     *
     * @param azureTableDefaultPartitionKeyValue the azureTableDefaultPartitionKeyValue value to set
     * @return the AzureTableSink object itself.
     */
    public AzureTableSink withAzureTableDefaultPartitionKeyValue(Object azureTableDefaultPartitionKeyValue) {
        this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
        return this;
    }

    /**
     * Get azure Table partition key name. Type: string (or Expression with resultType string).
     *
     * @return the azureTablePartitionKeyName value
     */
    public Object azureTablePartitionKeyName() {
        return this.azureTablePartitionKeyName;
    }

    /**
     * Set azure Table partition key name. Type: string (or Expression with resultType string).
     *
     * @param azureTablePartitionKeyName the azureTablePartitionKeyName value to set
     * @return the AzureTableSink object itself.
     */
    public AzureTableSink withAzureTablePartitionKeyName(Object azureTablePartitionKeyName) {
        this.azureTablePartitionKeyName = azureTablePartitionKeyName;
        return this;
    }

    /**
     * Get azure Table row key name. Type: string (or Expression with resultType string).
     *
     * @return the azureTableRowKeyName value
     */
    public Object azureTableRowKeyName() {
        return this.azureTableRowKeyName;
    }

    /**
     * Set azure Table row key name. Type: string (or Expression with resultType string).
     *
     * @param azureTableRowKeyName the azureTableRowKeyName value to set
     * @return the AzureTableSink object itself.
     */
    public AzureTableSink withAzureTableRowKeyName(Object azureTableRowKeyName) {
        this.azureTableRowKeyName = azureTableRowKeyName;
        return this;
    }

    /**
     * Get azure Table insert type. Type: string (or Expression with resultType string).
     *
     * @return the azureTableInsertType value
     */
    public Object azureTableInsertType() {
        return this.azureTableInsertType;
    }

    /**
     * Set azure Table insert type. Type: string (or Expression with resultType string).
     *
     * @param azureTableInsertType the azureTableInsertType value to set
     * @return the AzureTableSink object itself.
     */
    public AzureTableSink withAzureTableInsertType(Object azureTableInsertType) {
        this.azureTableInsertType = azureTableInsertType;
        return this;
    }

}
