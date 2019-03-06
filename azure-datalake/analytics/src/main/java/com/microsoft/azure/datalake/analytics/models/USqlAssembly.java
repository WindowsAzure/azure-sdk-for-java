/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL Assembly.
 */
public class USqlAssembly extends CatalogItem {
    /**
     * the name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * the name of the assembly.
     */
    @JsonProperty(value = "assemblyName")
    private String name;

    /**
     * the name of the CLR.
     */
    @JsonProperty(value = "clrName")
    private String clrName;

    /**
     * the switch indicating if this assembly is visible or not.
     */
    @JsonProperty(value = "isVisible")
    private Boolean isVisible;

    /**
     * the switch indicating if this assembly is user defined or not.
     */
    @JsonProperty(value = "isUserDefined")
    private Boolean isUserDefined;

    /**
     * the list of files associated with the assembly.
     */
    @JsonProperty(value = "files")
    private List<USqlAssemblyFileInfo> files;

    /**
     * the list of dependencies associated with the assembly.
     */
    @JsonProperty(value = "dependencies")
    private List<USqlAssemblyDependencyInfo> dependencies;

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the USqlAssembly object itself.
     */
    public USqlAssembly withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the name of the assembly.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the assembly.
     *
     * @param name the name value to set
     * @return the USqlAssembly object itself.
     */
    public USqlAssembly withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the name of the CLR.
     *
     * @return the clrName value
     */
    public String clrName() {
        return this.clrName;
    }

    /**
     * Set the name of the CLR.
     *
     * @param clrName the clrName value to set
     * @return the USqlAssembly object itself.
     */
    public USqlAssembly withClrName(String clrName) {
        this.clrName = clrName;
        return this;
    }

    /**
     * Get the switch indicating if this assembly is visible or not.
     *
     * @return the isVisible value
     */
    public Boolean isVisible() {
        return this.isVisible;
    }

    /**
     * Set the switch indicating if this assembly is visible or not.
     *
     * @param isVisible the isVisible value to set
     * @return the USqlAssembly object itself.
     */
    public USqlAssembly withIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    /**
     * Get the switch indicating if this assembly is user defined or not.
     *
     * @return the isUserDefined value
     */
    public Boolean isUserDefined() {
        return this.isUserDefined;
    }

    /**
     * Set the switch indicating if this assembly is user defined or not.
     *
     * @param isUserDefined the isUserDefined value to set
     * @return the USqlAssembly object itself.
     */
    public USqlAssembly withIsUserDefined(Boolean isUserDefined) {
        this.isUserDefined = isUserDefined;
        return this;
    }

    /**
     * Get the list of files associated with the assembly.
     *
     * @return the files value
     */
    public List<USqlAssemblyFileInfo> files() {
        return this.files;
    }

    /**
     * Set the list of files associated with the assembly.
     *
     * @param files the files value to set
     * @return the USqlAssembly object itself.
     */
    public USqlAssembly withFiles(List<USqlAssemblyFileInfo> files) {
        this.files = files;
        return this;
    }

    /**
     * Get the list of dependencies associated with the assembly.
     *
     * @return the dependencies value
     */
    public List<USqlAssemblyDependencyInfo> dependencies() {
        return this.dependencies;
    }

    /**
     * Set the list of dependencies associated with the assembly.
     *
     * @param dependencies the dependencies value to set
     * @return the USqlAssembly object itself.
     */
    public USqlAssembly withDependencies(List<USqlAssemblyDependencyInfo> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

}
