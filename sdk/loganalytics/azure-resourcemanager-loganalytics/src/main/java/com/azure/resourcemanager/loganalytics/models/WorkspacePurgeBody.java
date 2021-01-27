// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the body of a purge request for an App Insights Workspace. */
@Fluent
public final class WorkspacePurgeBody {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkspacePurgeBody.class);

    /*
     * Table from which to purge data.
     */
    @JsonProperty(value = "table", required = true)
    private String table;

    /*
     * The set of columns and filters (queries) to run over them to purge the
     * resulting data.
     */
    @JsonProperty(value = "filters", required = true)
    private List<WorkspacePurgeBodyFilters> filters;

    /**
     * Get the table property: Table from which to purge data.
     *
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the table property: Table from which to purge data.
     *
     * @param table the table value to set.
     * @return the WorkspacePurgeBody object itself.
     */
    public WorkspacePurgeBody withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the filters property: The set of columns and filters (queries) to run over them to purge the resulting data.
     *
     * @return the filters value.
     */
    public List<WorkspacePurgeBodyFilters> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: The set of columns and filters (queries) to run over them to purge the resulting data.
     *
     * @param filters the filters value to set.
     * @return the WorkspacePurgeBody object itself.
     */
    public WorkspacePurgeBody withFilters(List<WorkspacePurgeBodyFilters> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (table() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property table in model WorkspacePurgeBody"));
        }
        if (filters() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property filters in model WorkspacePurgeBody"));
        } else {
            filters().forEach(e -> e.validate());
        }
    }
}
