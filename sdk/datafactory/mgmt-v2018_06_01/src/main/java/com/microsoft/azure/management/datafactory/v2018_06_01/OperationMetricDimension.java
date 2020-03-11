/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the metric dimension.
 */
public class OperationMetricDimension {
    /**
     * The name of the dimension for the metric.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display name of the metric dimension.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Whether the dimension should be exported to Azure Monitor.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Get the name of the dimension for the metric.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the dimension for the metric.
     *
     * @param name the name value to set
     * @return the OperationMetricDimension object itself.
     */
    public OperationMetricDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display name of the metric dimension.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the metric dimension.
     *
     * @param displayName the displayName value to set
     * @return the OperationMetricDimension object itself.
     */
    public OperationMetricDimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get whether the dimension should be exported to Azure Monitor.
     *
     * @return the toBeExportedForShoebox value
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set whether the dimension should be exported to Azure Monitor.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set
     * @return the OperationMetricDimension object itself.
     */
    public OperationMetricDimension withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
        return this;
    }

}
