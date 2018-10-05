/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Analytics account name availability check parameters.
 */
public class CheckNameAvailabilityParameters {
    /**
     * The Data Lake Analytics name to check availability for.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The resource type. Note: This should not be set by the user, as the
     * constant value is Microsoft.DataLakeAnalytics/accounts.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of CheckNameAvailabilityParameters class.
     * @param name the Data Lake Analytics name to check availability for.
     */
    public CheckNameAvailabilityParameters() {
        type = "Microsoft.DataLakeAnalytics/accounts";
    }

    /**
     * Get the Data Lake Analytics name to check availability for.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the Data Lake Analytics name to check availability for.
     *
     * @param name the name value to set
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resource type. Note: This should not be set by the user, as the constant value is Microsoft.DataLakeAnalytics/accounts.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the resource type. Note: This should not be set by the user, as the constant value is Microsoft.DataLakeAnalytics/accounts.
     *
     * @param type the type value to set
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

}
