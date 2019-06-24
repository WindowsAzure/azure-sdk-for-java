/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The group by expression to be used in the report.
 */
public class ReportConfigGrouping {
    /**
     * Has type of the column to group. Possible values include: 'Tag',
     * 'Dimension'.
     */
    @JsonProperty(value = "columnType", required = true)
    private ReportConfigColumnType columnType;

    /**
     * The name of the column to group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get has type of the column to group. Possible values include: 'Tag', 'Dimension'.
     *
     * @return the columnType value
     */
    public ReportConfigColumnType columnType() {
        return this.columnType;
    }

    /**
     * Set has type of the column to group. Possible values include: 'Tag', 'Dimension'.
     *
     * @param columnType the columnType value to set
     * @return the ReportConfigGrouping object itself.
     */
    public ReportConfigGrouping withColumnType(ReportConfigColumnType columnType) {
        this.columnType = columnType;
        return this;
    }

    /**
     * Get the name of the column to group.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the column to group.
     *
     * @param name the name value to set
     * @return the ReportConfigGrouping object itself.
     */
    public ReportConfigGrouping withName(String name) {
        this.name = name;
        return this;
    }

}
