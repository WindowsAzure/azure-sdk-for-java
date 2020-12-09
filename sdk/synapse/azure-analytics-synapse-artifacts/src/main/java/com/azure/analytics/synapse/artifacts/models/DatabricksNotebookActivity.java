// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** DatabricksNotebook activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DatabricksNotebook")
@JsonFlatten
@Fluent
public class DatabricksNotebookActivity extends ExecutionActivity {
    /*
     * The absolute path of the notebook to be run in the Databricks Workspace.
     * This path must begin with a slash. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.notebookPath", required = true)
    private Object notebookPath;

    /*
     * Base parameters to be used for each run of this job.If the notebook
     * takes a parameter that is not specified, the default value from the
     * notebook will be used.
     */
    @JsonProperty(value = "typeProperties.baseParameters")
    private Map<String, Object> baseParameters;

    /*
     * A list of libraries to be installed on the cluster that will execute the
     * job.
     */
    @JsonProperty(value = "typeProperties.libraries")
    private List<Map<String, Object>> libraries;

    /**
     * Get the notebookPath property: The absolute path of the notebook to be run in the Databricks Workspace. This path
     * must begin with a slash. Type: string (or Expression with resultType string).
     *
     * @return the notebookPath value.
     */
    public Object getNotebookPath() {
        return this.notebookPath;
    }

    /**
     * Set the notebookPath property: The absolute path of the notebook to be run in the Databricks Workspace. This path
     * must begin with a slash. Type: string (or Expression with resultType string).
     *
     * @param notebookPath the notebookPath value to set.
     * @return the DatabricksNotebookActivity object itself.
     */
    public DatabricksNotebookActivity setNotebookPath(Object notebookPath) {
        this.notebookPath = notebookPath;
        return this;
    }

    /**
     * Get the baseParameters property: Base parameters to be used for each run of this job.If the notebook takes a
     * parameter that is not specified, the default value from the notebook will be used.
     *
     * @return the baseParameters value.
     */
    public Map<String, Object> getBaseParameters() {
        return this.baseParameters;
    }

    /**
     * Set the baseParameters property: Base parameters to be used for each run of this job.If the notebook takes a
     * parameter that is not specified, the default value from the notebook will be used.
     *
     * @param baseParameters the baseParameters value to set.
     * @return the DatabricksNotebookActivity object itself.
     */
    public DatabricksNotebookActivity setBaseParameters(Map<String, Object> baseParameters) {
        this.baseParameters = baseParameters;
        return this;
    }

    /**
     * Get the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @return the libraries value.
     */
    public List<Map<String, Object>> getLibraries() {
        return this.libraries;
    }

    /**
     * Set the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @param libraries the libraries value to set.
     * @return the DatabricksNotebookActivity object itself.
     */
    public DatabricksNotebookActivity setLibraries(List<Map<String, Object>> libraries) {
        this.libraries = libraries;
        return this;
    }
}
