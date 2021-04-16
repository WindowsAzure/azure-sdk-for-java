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

/** The MongoDB database dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDbCollection")
@JsonFlatten
@Fluent
public class MongoDbCollectionDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MongoDbCollectionDataset.class);

    /*
     * The table name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.collectionName", required = true)
    private Object collectionName;

    /**
     * Get the collectionName property: The table name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     *
     * @return the collectionName value.
     */
    public Object collectionName() {
        return this.collectionName;
    }

    /**
     * Set the collectionName property: The table name of the MongoDB database. Type: string (or Expression with
     * resultType string).
     *
     * @param collectionName the collectionName value to set.
     * @return the MongoDbCollectionDataset object itself.
     */
    public MongoDbCollectionDataset withCollectionName(Object collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbCollectionDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbCollectionDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbCollectionDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbCollectionDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbCollectionDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbCollectionDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbCollectionDataset withFolder(DatasetFolder folder) {
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
        if (collectionName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property collectionName in model MongoDbCollectionDataset"));
        }
    }
}
