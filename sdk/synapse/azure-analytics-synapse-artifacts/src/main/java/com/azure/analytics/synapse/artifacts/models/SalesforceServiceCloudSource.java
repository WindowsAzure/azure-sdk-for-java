// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A copy activity Salesforce Service Cloud source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SalesforceServiceCloudSource")
@Fluent
public final class SalesforceServiceCloudSource extends CopySource {
    /*
     * Database query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The read behavior for the operation. Default is Query.
     */
    @JsonProperty(value = "readBehavior")
    private SalesforceSourceReadBehavior readBehavior;

    /*
     * Specifies the additional columns to be added to source data. Type: array
     * of objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private List<AdditionalColumns> additionalColumns;

    /**
     * Get the query property: Database query. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the SalesforceServiceCloudSource object itself.
     */
    public SalesforceServiceCloudSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the readBehavior property: The read behavior for the operation. Default is Query.
     *
     * @return the readBehavior value.
     */
    public SalesforceSourceReadBehavior getReadBehavior() {
        return this.readBehavior;
    }

    /**
     * Set the readBehavior property: The read behavior for the operation. Default is Query.
     *
     * @param readBehavior the readBehavior value to set.
     * @return the SalesforceServiceCloudSource object itself.
     */
    public SalesforceServiceCloudSource setReadBehavior(SalesforceSourceReadBehavior readBehavior) {
        this.readBehavior = readBehavior;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value.
     */
    public List<AdditionalColumns> getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set.
     * @return the SalesforceServiceCloudSource object itself.
     */
    public SalesforceServiceCloudSource setAdditionalColumns(List<AdditionalColumns> additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }
}
