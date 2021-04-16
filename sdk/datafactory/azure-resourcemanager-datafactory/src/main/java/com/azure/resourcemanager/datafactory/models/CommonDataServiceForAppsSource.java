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

/** A copy activity Common Data Service for Apps source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CommonDataServiceForAppsSource")
@Fluent
public final class CommonDataServiceForAppsSource extends CopySource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommonDataServiceForAppsSource.class);

    /*
     * FetchXML is a proprietary query language that is used in Microsoft
     * Common Data Service for Apps (online & on-premises). Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * Specifies the additional columns to be added to source data. Type: array
     * of objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private List<AdditionalColumns> additionalColumns;

    /**
     * Get the query property: FetchXML is a proprietary query language that is used in Microsoft Common Data Service
     * for Apps (online &amp; on-premises). Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set the query property: FetchXML is a proprietary query language that is used in Microsoft Common Data Service
     * for Apps (online &amp; on-premises). Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the CommonDataServiceForAppsSource object itself.
     */
    public CommonDataServiceForAppsSource withQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value.
     */
    public List<AdditionalColumns> additionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set.
     * @return the CommonDataServiceForAppsSource object itself.
     */
    public CommonDataServiceForAppsSource withAdditionalColumns(List<AdditionalColumns> additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CommonDataServiceForAppsSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
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
        if (additionalColumns() != null) {
            additionalColumns().forEach(e -> e.validate());
        }
    }
}
