/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Analytics Job Parameters base class for build and submit.
 */
public class BaseJobParameters {
    /**
     * The job type of the current job (Hive, USql, or Scope (for internal use
     * only)). Possible values include: 'USql', 'Hive', 'Scope'.
     */
    @JsonProperty(value = "type", required = true)
    private JobType type;

    /**
     * The job specific properties.
     */
    @JsonProperty(value = "properties", required = true)
    private CreateJobProperties properties;

    /**
     * Get the job type of the current job (Hive, USql, or Scope (for internal use only)). Possible values include: 'USql', 'Hive', 'Scope'.
     *
     * @return the type value
     */
    public JobType type() {
        return this.type;
    }

    /**
     * Set the job type of the current job (Hive, USql, or Scope (for internal use only)). Possible values include: 'USql', 'Hive', 'Scope'.
     *
     * @param type the type value to set
     * @return the BaseJobParameters object itself.
     */
    public BaseJobParameters withType(JobType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the job specific properties.
     *
     * @return the properties value
     */
    public CreateJobProperties properties() {
        return this.properties;
    }

    /**
     * Set the job specific properties.
     *
     * @param properties the properties value to set
     * @return the BaseJobParameters object itself.
     */
    public BaseJobParameters withProperties(CreateJobProperties properties) {
        this.properties = properties;
        return this;
    }

}
