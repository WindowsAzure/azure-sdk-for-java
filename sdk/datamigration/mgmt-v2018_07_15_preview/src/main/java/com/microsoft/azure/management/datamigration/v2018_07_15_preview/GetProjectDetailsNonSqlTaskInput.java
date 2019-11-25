/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for the task that reads configuration from project artifacts.
 */
public class GetProjectDetailsNonSqlTaskInput {
    /**
     * Name of the migration project.
     */
    @JsonProperty(value = "projectName", required = true)
    private String projectName;

    /**
     * A URL that points to the location to access project artifacts.
     */
    @JsonProperty(value = "projectLocation", required = true)
    private String projectLocation;

    /**
     * Get name of the migration project.
     *
     * @return the projectName value
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Set name of the migration project.
     *
     * @param projectName the projectName value to set
     * @return the GetProjectDetailsNonSqlTaskInput object itself.
     */
    public GetProjectDetailsNonSqlTaskInput withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Get a URL that points to the location to access project artifacts.
     *
     * @return the projectLocation value
     */
    public String projectLocation() {
        return this.projectLocation;
    }

    /**
     * Set a URL that points to the location to access project artifacts.
     *
     * @param projectLocation the projectLocation value to set
     * @return the GetProjectDetailsNonSqlTaskInput object itself.
     */
    public GetProjectDetailsNonSqlTaskInput withProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
        return this;
    }

}
