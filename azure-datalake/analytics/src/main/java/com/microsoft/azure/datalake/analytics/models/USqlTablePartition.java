/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL table partition item.
 */
public class USqlTablePartition extends CatalogItem {
    /**
     * the name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * the name of the schema associated with this table partition and
     * database.
     */
    @JsonProperty(value = "schemaName")
    private String schemaName;

    /**
     * the name of the table partition.
     */
    @JsonProperty(value = "partitionName")
    private String name;

    /**
     * the Ddl object of the partition's parent.
     */
    @JsonProperty(value = "parentName")
    private DdlName parentName;

    /**
     * the index ID for this partition.
     */
    @JsonProperty(value = "indexId")
    private Integer indexId;

    /**
     * the list of labels associated with this partition.
     */
    @JsonProperty(value = "label")
    private List<String> label;

    /**
     * the creation time of the partition.
     */
    @JsonProperty(value = "createDate")
    private DateTime createDate;

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the name of the schema associated with this table partition and database.
     *
     * @return the schemaName value
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the name of the schema associated with this table partition and database.
     *
     * @param schemaName the schemaName value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the name of the table partition.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the table partition.
     *
     * @param name the name value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the Ddl object of the partition's parent.
     *
     * @return the parentName value
     */
    public DdlName parentName() {
        return this.parentName;
    }

    /**
     * Set the Ddl object of the partition's parent.
     *
     * @param parentName the parentName value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withParentName(DdlName parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * Get the index ID for this partition.
     *
     * @return the indexId value
     */
    public Integer indexId() {
        return this.indexId;
    }

    /**
     * Set the index ID for this partition.
     *
     * @param indexId the indexId value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withIndexId(Integer indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * Get the list of labels associated with this partition.
     *
     * @return the label value
     */
    public List<String> label() {
        return this.label;
    }

    /**
     * Set the list of labels associated with this partition.
     *
     * @param label the label value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withLabel(List<String> label) {
        this.label = label;
        return this;
    }

    /**
     * Get the creation time of the partition.
     *
     * @return the createDate value
     */
    public DateTime createDate() {
        return this.createDate;
    }

    /**
     * Set the creation time of the partition.
     *
     * @param createDate the createDate value to set
     * @return the USqlTablePartition object itself.
     */
    public USqlTablePartition withCreateDate(DateTime createDate) {
        this.createDate = createDate;
        return this;
    }

}
