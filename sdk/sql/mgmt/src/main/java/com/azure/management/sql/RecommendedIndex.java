// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The RecommendedIndex model. */
@JsonFlatten
@Immutable
public class RecommendedIndex extends ProxyResource {
    /*
     * The proposed index action. You can create a missing index, drop an
     * unused index, or rebuild an existing index to improve its performance.
     */
    @JsonProperty(value = "properties.action", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendedIndexAction action;

    /*
     * The current recommendation state.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendedIndexState state;

    /*
     * The UTC datetime showing when this resource was created (ISO8601
     * format).
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The UTC datetime of when was this resource last changed (ISO8601
     * format).
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * The type of index (CLUSTERED, NONCLUSTERED, COLUMNSTORE, CLUSTERED
     * COLUMNSTORE)
     */
    @JsonProperty(value = "properties.indexType", access = JsonProperty.Access.WRITE_ONLY)
    private RecommendedIndexType indexType;

    /*
     * The schema where table to build index over resides
     */
    @JsonProperty(value = "properties.schema", access = JsonProperty.Access.WRITE_ONLY)
    private String schema;

    /*
     * The table on which to build index.
     */
    @JsonProperty(value = "properties.table", access = JsonProperty.Access.WRITE_ONLY)
    private String table;

    /*
     * Columns over which to build index
     */
    @JsonProperty(value = "properties.columns", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> columns;

    /*
     * The list of column names to be included in the index
     */
    @JsonProperty(value = "properties.includedColumns", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> includedColumns;

    /*
     * The full build index script
     */
    @JsonProperty(value = "properties.indexScript", access = JsonProperty.Access.WRITE_ONLY)
    private String indexScript;

    /*
     * The estimated impact of doing recommended index action.
     */
    @JsonProperty(value = "properties.estimatedImpact", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationImpact> estimatedImpact;

    /*
     * The values reported after index action is complete.
     */
    @JsonProperty(value = "properties.reportedImpact", access = JsonProperty.Access.WRITE_ONLY)
    private List<OperationImpact> reportedImpact;

    /**
     * Get the action property: The proposed index action. You can create a missing index, drop an unused index, or
     * rebuild an existing index to improve its performance.
     *
     * @return the action value.
     */
    public RecommendedIndexAction action() {
        return this.action;
    }

    /**
     * Get the state property: The current recommendation state.
     *
     * @return the state value.
     */
    public RecommendedIndexState state() {
        return this.state;
    }

    /**
     * Get the created property: The UTC datetime showing when this resource was created (ISO8601 format).
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified property: The UTC datetime of when was this resource last changed (ISO8601 format).
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the indexType property: The type of index (CLUSTERED, NONCLUSTERED, COLUMNSTORE, CLUSTERED COLUMNSTORE).
     *
     * @return the indexType value.
     */
    public RecommendedIndexType indexType() {
        return this.indexType;
    }

    /**
     * Get the schema property: The schema where table to build index over resides.
     *
     * @return the schema value.
     */
    public String schema() {
        return this.schema;
    }

    /**
     * Get the table property: The table on which to build index.
     *
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Get the columns property: Columns over which to build index.
     *
     * @return the columns value.
     */
    public List<String> columns() {
        return this.columns;
    }

    /**
     * Get the includedColumns property: The list of column names to be included in the index.
     *
     * @return the includedColumns value.
     */
    public List<String> includedColumns() {
        return this.includedColumns;
    }

    /**
     * Get the indexScript property: The full build index script.
     *
     * @return the indexScript value.
     */
    public String indexScript() {
        return this.indexScript;
    }

    /**
     * Get the estimatedImpact property: The estimated impact of doing recommended index action.
     *
     * @return the estimatedImpact value.
     */
    public List<OperationImpact> estimatedImpact() {
        return this.estimatedImpact;
    }

    /**
     * Get the reportedImpact property: The values reported after index action is complete.
     *
     * @return the reportedImpact value.
     */
    public List<OperationImpact> reportedImpact() {
        return this.reportedImpact;
    }
}
