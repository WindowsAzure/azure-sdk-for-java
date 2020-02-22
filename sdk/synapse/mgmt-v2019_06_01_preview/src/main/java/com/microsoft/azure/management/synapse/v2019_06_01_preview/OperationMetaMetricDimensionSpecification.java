/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * What is this?.
 */
public class OperationMetaMetricDimensionSpecification {
    /**
     * Dimension display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Dimension unique name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Whether this metric should be exported for Shoebox.
     */
    @JsonProperty(value = "toBeExportedForShoebox")
    private Boolean toBeExportedForShoebox;

    /**
     * Get dimension display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set dimension display name.
     *
     * @param displayName the displayName value to set
     * @return the OperationMetaMetricDimensionSpecification object itself.
     */
    public OperationMetaMetricDimensionSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get dimension unique name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set dimension unique name.
     *
     * @param name the name value to set
     * @return the OperationMetaMetricDimensionSpecification object itself.
     */
    public OperationMetaMetricDimensionSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get whether this metric should be exported for Shoebox.
     *
     * @return the toBeExportedForShoebox value
     */
    public Boolean toBeExportedForShoebox() {
        return this.toBeExportedForShoebox;
    }

    /**
     * Set whether this metric should be exported for Shoebox.
     *
     * @param toBeExportedForShoebox the toBeExportedForShoebox value to set
     * @return the OperationMetaMetricDimensionSpecification object itself.
     */
    public OperationMetaMetricDimensionSpecification withToBeExportedForShoebox(Boolean toBeExportedForShoebox) {
        this.toBeExportedForShoebox = toBeExportedForShoebox;
        return this;
    }

}
