// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Shopify Service dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ShopifyObject")
@JsonFlatten
@Fluent
public class ShopifyObjectDataset extends Dataset {
    /*
     * The table name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableName")
    private Object tableName;

    /**
     * Get the tableName property: The table name. Type: string (or Expression with resultType string).
     *
     * @return the tableName value.
     */
    public Object getTableName() {
        return this.tableName;
    }

    /**
     * Set the tableName property: The table name. Type: string (or Expression with resultType string).
     *
     * @param tableName the tableName value to set.
     * @return the ShopifyObjectDataset object itself.
     */
    public ShopifyObjectDataset setTableName(Object tableName) {
        this.tableName = tableName;
        return this;
    }
}
