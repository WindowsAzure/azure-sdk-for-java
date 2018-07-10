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
 * A Data Lake Analytics catalog U-SQL table column item.
 */
public class USqlTableColumn {
    /**
     * the name of the column in the table.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * the object type of the specified column (such as System.String).
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * the name of the column in the table.
     * This property is only used for compability. It will be removed in the future. Use name instead
     */
    @JsonProperty(value = "columnName")
    private void setColumnName(String columnName) {
        this.name = columnName;
    }

    /**
     * the object type of the specified column (such as System.String).
     * This property is only used for compability. It will be removed in the future. Use type instead
     */
    @JsonProperty(value = "dataType")
    private void setDataType(String dataType) {
        this.type = dataType;
    }

    /**
     * Get the name of the column in the table.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the column in the table.
     *
     * @param name the name value to set
     * @return the USqlTableColumn object itself.
     */
    public USqlTableColumn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the object type of the specified column (such as System.String).
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the object type of the specified column (such as System.String).
     *
     * @param type the type value to set
     * @return the USqlTableColumn object itself.
     */
    public USqlTableColumn withType(String type) {
        this.type = type;
        return this;
    }

}
