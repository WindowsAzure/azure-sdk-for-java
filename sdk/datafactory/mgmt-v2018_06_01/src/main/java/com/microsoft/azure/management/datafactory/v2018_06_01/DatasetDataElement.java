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
 * Columns that define the structure of the dataset.
 */
public class DatasetDataElement {
    /**
     * Name of the column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "name")
    private Object name;

    /**
     * Type of the column. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "type")
    private Object type;

    /**
     * Get name of the column. Type: string (or Expression with resultType string).
     *
     * @return the name value
     */
    public Object name() {
        return this.name;
    }

    /**
     * Set name of the column. Type: string (or Expression with resultType string).
     *
     * @param name the name value to set
     * @return the DatasetDataElement object itself.
     */
    public DatasetDataElement withName(Object name) {
        this.name = name;
        return this;
    }

    /**
     * Get type of the column. Type: string (or Expression with resultType string).
     *
     * @return the type value
     */
    public Object type() {
        return this.type;
    }

    /**
     * Set type of the column. Type: string (or Expression with resultType string).
     *
     * @param type the type value to set
     * @return the DatasetDataElement object itself.
     */
    public DatasetDataElement withType(Object type) {
        this.type = type;
        return this;
    }

}
