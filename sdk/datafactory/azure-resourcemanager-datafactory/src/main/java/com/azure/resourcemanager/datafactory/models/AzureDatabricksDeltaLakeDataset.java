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

/** Azure Databricks Delta Lake dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricksDeltaLakeDataset")
@JsonFlatten
@Fluent
public class AzureDatabricksDeltaLakeDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureDatabricksDeltaLakeDataset.class);

    /*
     * The name of delta table. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.table")
    private Object table;

    /*
     * The database name of delta table. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.database")
    private Object database;

    /**
     * Get the table property: The name of delta table. Type: string (or Expression with resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.table;
    }

    /**
     * Set the table property: The name of delta table. Type: string (or Expression with resultType string).
     *
     * @param table the table value to set.
     * @return the AzureDatabricksDeltaLakeDataset object itself.
     */
    public AzureDatabricksDeltaLakeDataset withTable(Object table) {
        this.table = table;
        return this;
    }

    /**
     * Get the database property: The database name of delta table. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: The database name of delta table. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the AzureDatabricksDeltaLakeDataset object itself.
     */
    public AzureDatabricksDeltaLakeDataset withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeDataset withFolder(DatasetFolder folder) {
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
