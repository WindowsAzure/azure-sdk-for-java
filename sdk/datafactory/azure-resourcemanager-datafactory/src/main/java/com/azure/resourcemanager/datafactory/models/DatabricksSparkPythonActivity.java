// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** DatabricksSparkPython activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DatabricksSparkPython")
@JsonFlatten
@Fluent
public class DatabricksSparkPythonActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabricksSparkPythonActivity.class);

    /*
     * The URI of the Python file to be executed. DBFS paths are supported.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.pythonFile", required = true)
    private Object pythonFile;

    /*
     * Command line parameters that will be passed to the Python file.
     */
    @JsonProperty(value = "typeProperties.parameters")
    private List<Object> parameters;

    /*
     * A list of libraries to be installed on the cluster that will execute the
     * job.
     */
    @JsonProperty(value = "typeProperties.libraries")
    private List<Map<String, Object>> libraries;

    /**
     * Get the pythonFile property: The URI of the Python file to be executed. DBFS paths are supported. Type: string
     * (or Expression with resultType string).
     *
     * @return the pythonFile value.
     */
    public Object pythonFile() {
        return this.pythonFile;
    }

    /**
     * Set the pythonFile property: The URI of the Python file to be executed. DBFS paths are supported. Type: string
     * (or Expression with resultType string).
     *
     * @param pythonFile the pythonFile value to set.
     * @return the DatabricksSparkPythonActivity object itself.
     */
    public DatabricksSparkPythonActivity withPythonFile(Object pythonFile) {
        this.pythonFile = pythonFile;
        return this;
    }

    /**
     * Get the parameters property: Command line parameters that will be passed to the Python file.
     *
     * @return the parameters value.
     */
    public List<Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Command line parameters that will be passed to the Python file.
     *
     * @param parameters the parameters value to set.
     * @return the DatabricksSparkPythonActivity object itself.
     */
    public DatabricksSparkPythonActivity withParameters(List<Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @return the libraries value.
     */
    public List<Map<String, Object>> libraries() {
        return this.libraries;
    }

    /**
     * Set the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @param libraries the libraries value to set.
     * @return the DatabricksSparkPythonActivity object itself.
     */
    public DatabricksSparkPythonActivity withLibraries(List<Map<String, Object>> libraries) {
        this.libraries = libraries;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
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
        if (pythonFile() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property pythonFile in model DatabricksSparkPythonActivity"));
        }
    }
}
