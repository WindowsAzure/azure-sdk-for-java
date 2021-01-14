// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Table source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureTableSource")
@Fluent
public final class AzureTableSource extends TabularSource {
    /*
     * Azure Table source query. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "azureTableSourceQuery")
    private Object azureTableSourceQuery;

    /*
     * Azure Table source ignore table not found. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "azureTableSourceIgnoreTableNotFound")
    private Object azureTableSourceIgnoreTableNotFound;

    /**
     * Get the azureTableSourceQuery property: Azure Table source query. Type: string (or Expression with resultType
     * string).
     *
     * @return the azureTableSourceQuery value.
     */
    public Object getAzureTableSourceQuery() {
        return this.azureTableSourceQuery;
    }

    /**
     * Set the azureTableSourceQuery property: Azure Table source query. Type: string (or Expression with resultType
     * string).
     *
     * @param azureTableSourceQuery the azureTableSourceQuery value to set.
     * @return the AzureTableSource object itself.
     */
    public AzureTableSource setAzureTableSourceQuery(Object azureTableSourceQuery) {
        this.azureTableSourceQuery = azureTableSourceQuery;
        return this;
    }

    /**
     * Get the azureTableSourceIgnoreTableNotFound property: Azure Table source ignore table not found. Type: boolean
     * (or Expression with resultType boolean).
     *
     * @return the azureTableSourceIgnoreTableNotFound value.
     */
    public Object getAzureTableSourceIgnoreTableNotFound() {
        return this.azureTableSourceIgnoreTableNotFound;
    }

    /**
     * Set the azureTableSourceIgnoreTableNotFound property: Azure Table source ignore table not found. Type: boolean
     * (or Expression with resultType boolean).
     *
     * @param azureTableSourceIgnoreTableNotFound the azureTableSourceIgnoreTableNotFound value to set.
     * @return the AzureTableSource object itself.
     */
    public AzureTableSource setAzureTableSourceIgnoreTableNotFound(Object azureTableSourceIgnoreTableNotFound) {
        this.azureTableSourceIgnoreTableNotFound = azureTableSourceIgnoreTableNotFound;
        return this;
    }
}
