/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL table index item.
 */
public class USqlIndex {
    /**
     * the name of the index in the table.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * the list of directed columns in the index.
     */
    @JsonProperty(value = "indexKeys")
    private List<USqlDirectedColumn> indexKeys;

    /**
     * the list of columns in the index.
     */
    @JsonProperty(value = "columns")
    private List<String> columns;

    /**
     * the distributions info of the index.
     */
    @JsonProperty(value = "distributionInfo")
    private USqlDistributionInfo distributionInfo;

    /**
     * partition function ID for the index.
     */
    @JsonProperty(value = "partitionFunction")
    private UUID partitionFunction;

    /**
     * the list of partition keys in the index.
     */
    @JsonProperty(value = "partitionKeyList")
    private List<String> partitionKeyList;

    /**
     * the list of full paths to the streams that contain this index in the
     * DataLake account.
     */
    @JsonProperty(value = "streamNames")
    private List<String> streamNames;

    /**
     * the switch indicating if this index is a columnstore index.
     */
    @JsonProperty(value = "isColumnstore")
    private Boolean isColumnstore;

    /**
     * the ID of this index within the table.
     */
    @JsonProperty(value = "indexId")
    private Integer indexId;

    /**
     * the switch indicating if this index is a unique index.
     */
    @JsonProperty(value = "isUnique")
    private Boolean isUnique;

    /**
     * Get the name of the index in the table.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the index in the table.
     *
     * @param name the name value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the list of directed columns in the index.
     *
     * @return the indexKeys value
     */
    public List<USqlDirectedColumn> indexKeys() {
        return this.indexKeys;
    }

    /**
     * Set the list of directed columns in the index.
     *
     * @param indexKeys the indexKeys value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withIndexKeys(List<USqlDirectedColumn> indexKeys) {
        this.indexKeys = indexKeys;
        return this;
    }

    /**
     * Get the list of columns in the index.
     *
     * @return the columns value
     */
    public List<String> columns() {
        return this.columns;
    }

    /**
     * Set the list of columns in the index.
     *
     * @param columns the columns value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withColumns(List<String> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the distributions info of the index.
     *
     * @return the distributionInfo value
     */
    public USqlDistributionInfo distributionInfo() {
        return this.distributionInfo;
    }

    /**
     * Set the distributions info of the index.
     *
     * @param distributionInfo the distributionInfo value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withDistributionInfo(USqlDistributionInfo distributionInfo) {
        this.distributionInfo = distributionInfo;
        return this;
    }

    /**
     * Get partition function ID for the index.
     *
     * @return the partitionFunction value
     */
    public UUID partitionFunction() {
        return this.partitionFunction;
    }

    /**
     * Set partition function ID for the index.
     *
     * @param partitionFunction the partitionFunction value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withPartitionFunction(UUID partitionFunction) {
        this.partitionFunction = partitionFunction;
        return this;
    }

    /**
     * Get the list of partition keys in the index.
     *
     * @return the partitionKeyList value
     */
    public List<String> partitionKeyList() {
        return this.partitionKeyList;
    }

    /**
     * Set the list of partition keys in the index.
     *
     * @param partitionKeyList the partitionKeyList value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withPartitionKeyList(List<String> partitionKeyList) {
        this.partitionKeyList = partitionKeyList;
        return this;
    }

    /**
     * Get the list of full paths to the streams that contain this index in the DataLake account.
     *
     * @return the streamNames value
     */
    public List<String> streamNames() {
        return this.streamNames;
    }

    /**
     * Set the list of full paths to the streams that contain this index in the DataLake account.
     *
     * @param streamNames the streamNames value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withStreamNames(List<String> streamNames) {
        this.streamNames = streamNames;
        return this;
    }

    /**
     * Get the switch indicating if this index is a columnstore index.
     *
     * @return the isColumnstore value
     */
    public Boolean isColumnstore() {
        return this.isColumnstore;
    }

    /**
     * Set the switch indicating if this index is a columnstore index.
     *
     * @param isColumnstore the isColumnstore value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withIsColumnstore(Boolean isColumnstore) {
        this.isColumnstore = isColumnstore;
        return this;
    }

    /**
     * Get the ID of this index within the table.
     *
     * @return the indexId value
     */
    public Integer indexId() {
        return this.indexId;
    }

    /**
     * Set the ID of this index within the table.
     *
     * @param indexId the indexId value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withIndexId(Integer indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * Get the switch indicating if this index is a unique index.
     *
     * @return the isUnique value
     */
    public Boolean isUnique() {
        return this.isUnique;
    }

    /**
     * Set the switch indicating if this index is a unique index.
     *
     * @param isUnique the isUnique value to set
     * @return the USqlIndex object itself.
     */
    public USqlIndex withIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
        return this;
    }

}
