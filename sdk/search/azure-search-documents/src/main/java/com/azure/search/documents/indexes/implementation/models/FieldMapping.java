// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FieldMapping model. */
@Fluent
public final class FieldMapping {
    /*
     * The name of the field in the data source.
     */
    @JsonProperty(value = "sourceFieldName", required = true)
    private String sourceFieldName;

    /*
     * The name of the target field in the index. Same as the source field name
     * by default.
     */
    @JsonProperty(value = "targetFieldName")
    private String targetFieldName;

    /*
     * A function to apply to each source field value before indexing.
     */
    @JsonProperty(value = "mappingFunction")
    private FieldMappingFunction mappingFunction;

    /** Creates an instance of FieldMapping class. */
    @JsonCreator
    public FieldMapping(@JsonProperty(value = "sourceFieldName", required = true) String sourceFieldName) {
        this.sourceFieldName = sourceFieldName;
    }

    /**
     * Get the sourceFieldName property: The name of the field in the data source.
     *
     * @return the sourceFieldName value.
     */
    public String getSourceFieldName() {
        return this.sourceFieldName;
    }

    /**
     * Set the sourceFieldName property: The name of the field in the data source.
     *
     * @param sourceFieldName the sourceFieldName value to set.
     * @return the FieldMapping object itself.
     */
    /**
     * Get the targetFieldName property: The name of the target field in the index. Same as the source field name by
     * default.
     *
     * @return the targetFieldName value.
     */
    public String getTargetFieldName() {
        return this.targetFieldName;
    }

    /**
     * Set the targetFieldName property: The name of the target field in the index. Same as the source field name by
     * default.
     *
     * @param targetFieldName the targetFieldName value to set.
     * @return the FieldMapping object itself.
     */
    public FieldMapping setTargetFieldName(String targetFieldName) {
        this.targetFieldName = targetFieldName;
        return this;
    }

    /**
     * Get the mappingFunction property: A function to apply to each source field value before indexing.
     *
     * @return the mappingFunction value.
     */
    public FieldMappingFunction getMappingFunction() {
        return this.mappingFunction;
    }

    /**
     * Set the mappingFunction property: A function to apply to each source field value before indexing.
     *
     * @param mappingFunction the mappingFunction value to set.
     * @return the FieldMapping object itself.
     */
    public FieldMapping setMappingFunction(FieldMappingFunction mappingFunction) {
        this.mappingFunction = mappingFunction;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getSourceFieldName() == null) {
            throw new IllegalArgumentException("Missing required property sourceFieldName in model FieldMapping");
        }
        if (getMappingFunction() != null) {
            getMappingFunction().validate();
        }
    }
}
