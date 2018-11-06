/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Migration Task errors.
 */
public class DataMigrationError {
    /**
     * Error description.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Type of error. Possible values include: 'Default', 'Warning', 'Error'.
     */
    @JsonProperty(value = "type")
    private ErrorType type;

    /**
     * Get error description.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get type of error. Possible values include: 'Default', 'Warning', 'Error'.
     *
     * @return the type value
     */
    public ErrorType type() {
        return this.type;
    }

    /**
     * Set type of error. Possible values include: 'Default', 'Warning', 'Error'.
     *
     * @param type the type value to set
     * @return the DataMigrationError object itself.
     */
    public DataMigrationError withType(ErrorType type) {
        this.type = type;
        return this;
    }

}
