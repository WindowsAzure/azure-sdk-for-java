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

/** The Dynamics entity dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsEntity")
@JsonFlatten
@Fluent
public class DynamicsEntityDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DynamicsEntityDataset.class);

    /*
     * The logical name of the entity. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.entityName")
    private Object entityName;

    /**
     * Get the entityName property: The logical name of the entity. Type: string (or Expression with resultType string).
     *
     * @return the entityName value.
     */
    public Object entityName() {
        return this.entityName;
    }

    /**
     * Set the entityName property: The logical name of the entity. Type: string (or Expression with resultType string).
     *
     * @param entityName the entityName value to set.
     * @return the DynamicsEntityDataset object itself.
     */
    public DynamicsEntityDataset withEntityName(Object entityName) {
        this.entityName = entityName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsEntityDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsEntityDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsEntityDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsEntityDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsEntityDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsEntityDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicsEntityDataset withFolder(DatasetFolder folder) {
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
