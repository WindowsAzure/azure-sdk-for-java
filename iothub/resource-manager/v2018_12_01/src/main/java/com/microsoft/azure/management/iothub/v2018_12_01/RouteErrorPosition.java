/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Position where the route error happened.
 */
public class RouteErrorPosition {
    /**
     * Line where the route error happened.
     */
    @JsonProperty(value = "line")
    private Integer line;

    /**
     * Column where the route error happened.
     */
    @JsonProperty(value = "column")
    private Integer column;

    /**
     * Get line where the route error happened.
     *
     * @return the line value
     */
    public Integer line() {
        return this.line;
    }

    /**
     * Set line where the route error happened.
     *
     * @param line the line value to set
     * @return the RouteErrorPosition object itself.
     */
    public RouteErrorPosition withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * Get column where the route error happened.
     *
     * @return the column value
     */
    public Integer column() {
        return this.column;
    }

    /**
     * Set column where the route error happened.
     *
     * @param column the column value to set
     * @return the RouteErrorPosition object itself.
     */
    public RouteErrorPosition withColumn(Integer column) {
        this.column = column;
        return this;
    }

}
