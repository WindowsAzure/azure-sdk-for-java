// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Azure Search Index. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureSearchIndex")
@JsonFlatten
@Fluent
public class AzureSearchIndexDataset extends Dataset {
    /*
     * The name of the Azure Search Index. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.indexName", required = true)
    private Object indexName;

    /**
     * Get the indexName property: The name of the Azure Search Index. Type: string (or Expression with resultType
     * string).
     *
     * @return the indexName value.
     */
    public Object getIndexName() {
        return this.indexName;
    }

    /**
     * Set the indexName property: The name of the Azure Search Index. Type: string (or Expression with resultType
     * string).
     *
     * @param indexName the indexName value to set.
     * @return the AzureSearchIndexDataset object itself.
     */
    public AzureSearchIndexDataset setIndexName(Object indexName) {
        this.indexName = indexName;
        return this;
    }
}
