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
 * Transformation for data flow source.
 */
public class DataFlowSource extends Transformation {
    /**
     * Dataset reference.
     */
    @JsonProperty(value = "dataset")
    private DatasetReference dataset;

    /**
     * Get dataset reference.
     *
     * @return the dataset value
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set dataset reference.
     *
     * @param dataset the dataset value to set
     * @return the DataFlowSource object itself.
     */
    public DataFlowSource withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

}
