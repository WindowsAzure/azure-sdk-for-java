// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The SparkRequest model. */
@Fluent
public final class SparkRequest {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The file property.
     */
    @JsonProperty(value = "file")
    private String file;

    /*
     * The className property.
     */
    @JsonProperty(value = "className")
    private String className;

    /*
     * The args property.
     */
    @JsonProperty(value = "args")
    private List<String> arguments;

    /*
     * The jars property.
     */
    @JsonProperty(value = "jars")
    private List<String> jars;

    /*
     * The pyFiles property.
     */
    @JsonProperty(value = "pyFiles")
    private List<String> pythonFiles;

    /*
     * The files property.
     */
    @JsonProperty(value = "files")
    private List<String> files;

    /*
     * The archives property.
     */
    @JsonProperty(value = "archives")
    private List<String> archives;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "conf")
    private Map<String, String> configuration;

    /*
     * The driverMemory property.
     */
    @JsonProperty(value = "driverMemory")
    private String driverMemory;

    /*
     * The driverCores property.
     */
    @JsonProperty(value = "driverCores")
    private Integer driverCores;

    /*
     * The executorMemory property.
     */
    @JsonProperty(value = "executorMemory")
    private String executorMemory;

    /*
     * The executorCores property.
     */
    @JsonProperty(value = "executorCores")
    private Integer executorCores;

    /*
     * The numExecutors property.
     */
    @JsonProperty(value = "numExecutors")
    private Integer executorCount;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the file property: The file property.
     *
     * @return the file value.
     */
    public String getFile() {
        return this.file;
    }

    /**
     * Set the file property: The file property.
     *
     * @param file the file value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * Get the className property: The className property.
     *
     * @return the className value.
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * Set the className property: The className property.
     *
     * @param className the className value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * Get the arguments property: The args property.
     *
     * @return the arguments value.
     */
    public List<String> getArguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: The args property.
     *
     * @param arguments the arguments value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setArguments(List<String> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the jars property: The jars property.
     *
     * @return the jars value.
     */
    public List<String> getJars() {
        return this.jars;
    }

    /**
     * Set the jars property: The jars property.
     *
     * @param jars the jars value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setJars(List<String> jars) {
        this.jars = jars;
        return this;
    }

    /**
     * Get the pythonFiles property: The pyFiles property.
     *
     * @return the pythonFiles value.
     */
    public List<String> getPythonFiles() {
        return this.pythonFiles;
    }

    /**
     * Set the pythonFiles property: The pyFiles property.
     *
     * @param pythonFiles the pythonFiles value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setPythonFiles(List<String> pythonFiles) {
        this.pythonFiles = pythonFiles;
        return this;
    }

    /**
     * Get the files property: The files property.
     *
     * @return the files value.
     */
    public List<String> getFiles() {
        return this.files;
    }

    /**
     * Set the files property: The files property.
     *
     * @param files the files value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setFiles(List<String> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the archives property: The archives property.
     *
     * @return the archives value.
     */
    public List<String> getArchives() {
        return this.archives;
    }

    /**
     * Set the archives property: The archives property.
     *
     * @param archives the archives value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setArchives(List<String> archives) {
        this.archives = archives;
        return this;
    }

    /**
     * Get the configuration property: Dictionary of &lt;string&gt;.
     *
     * @return the configuration value.
     */
    public Map<String, String> getConfiguration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: Dictionary of &lt;string&gt;.
     *
     * @param configuration the configuration value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setConfiguration(Map<String, String> configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Get the driverMemory property: The driverMemory property.
     *
     * @return the driverMemory value.
     */
    public String getDriverMemory() {
        return this.driverMemory;
    }

    /**
     * Set the driverMemory property: The driverMemory property.
     *
     * @param driverMemory the driverMemory value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setDriverMemory(String driverMemory) {
        this.driverMemory = driverMemory;
        return this;
    }

    /**
     * Get the driverCores property: The driverCores property.
     *
     * @return the driverCores value.
     */
    public Integer getDriverCores() {
        return this.driverCores;
    }

    /**
     * Set the driverCores property: The driverCores property.
     *
     * @param driverCores the driverCores value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setDriverCores(Integer driverCores) {
        this.driverCores = driverCores;
        return this;
    }

    /**
     * Get the executorMemory property: The executorMemory property.
     *
     * @return the executorMemory value.
     */
    public String getExecutorMemory() {
        return this.executorMemory;
    }

    /**
     * Set the executorMemory property: The executorMemory property.
     *
     * @param executorMemory the executorMemory value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setExecutorMemory(String executorMemory) {
        this.executorMemory = executorMemory;
        return this;
    }

    /**
     * Get the executorCores property: The executorCores property.
     *
     * @return the executorCores value.
     */
    public Integer getExecutorCores() {
        return this.executorCores;
    }

    /**
     * Set the executorCores property: The executorCores property.
     *
     * @param executorCores the executorCores value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setExecutorCores(Integer executorCores) {
        this.executorCores = executorCores;
        return this;
    }

    /**
     * Get the executorCount property: The numExecutors property.
     *
     * @return the executorCount value.
     */
    public Integer getExecutorCount() {
        return this.executorCount;
    }

    /**
     * Set the executorCount property: The numExecutors property.
     *
     * @param executorCount the executorCount value to set.
     * @return the SparkRequest object itself.
     */
    public SparkRequest setExecutorCount(Integer executorCount) {
        this.executorCount = executorCount;
        return this;
    }
}
