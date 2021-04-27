// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A copy activity Greenplum Database source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GreenplumSource")
@Fluent
public final class GreenplumSource extends TabularSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GreenplumSource.class);

    /*
     * A query to retrieve data from source. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Get the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     *
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     *
     * @param query the query value to set.
     * @return the GreenplumSource object itself.
     */
    public GreenplumSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GreenplumSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GreenplumSource withAdditionalColumns(List<AdditionalColumns> additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GreenplumSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GreenplumSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GreenplumSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
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
