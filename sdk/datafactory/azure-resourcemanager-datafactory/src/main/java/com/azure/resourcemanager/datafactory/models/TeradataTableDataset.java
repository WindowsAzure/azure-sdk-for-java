// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Teradata database dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TeradataTable")
@JsonFlatten
@Fluent
public class TeradataTableDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TeradataTableDataset.class);

    /*
     * The database name of Teradata. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.database")
    private Object database;

    /*
     * The table name of Teradata. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /**
     * Get the database property: The database name of Teradata. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The database name of Teradata. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the TeradataTableDataset object itself.
     */
    public TeradataTableDataset withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the table property: The table name of Teradata. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The table name of Teradata. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the TeradataTableDataset object itself.
     */
    public TeradataTableDataset withTable(Object table) {
        this.table = table;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeradataTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeradataTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeradataTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeradataTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeradataTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeradataTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public TeradataTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
