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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * The Azure Table storage dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureTableDataset.class)
@JsonTypeName("AzureTable")
@JsonFlatten
public class AzureTableDataset extends DatasetInner {
    /**
     * The table name of the Azure Table storage. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName", required = true)
    private Object tableName;

    /**
     * Get the table name of the Azure Table storage. Type: string (or Expression with resultType string).
     *
     * @return the tableName value
     */
    public Object tableName() {
        return this.tableName;
    }

    /**
     * Set the table name of the Azure Table storage. Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set
     * @return the AzureTableDataset object itself.
     */
    public AzureTableDataset withTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }

}
