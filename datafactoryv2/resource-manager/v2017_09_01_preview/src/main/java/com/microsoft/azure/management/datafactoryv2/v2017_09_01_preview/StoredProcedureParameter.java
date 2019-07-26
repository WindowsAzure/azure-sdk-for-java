/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SQL stored procedure parameter.
 */
public class StoredProcedureParameter {
    /**
     * Stored procedure parameter value. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "value", required = true)
    private Object value;

    /**
     * Stored procedure parameter type.
     */
    @JsonProperty(value = "type")
    private Object type;

    /**
     * Get stored procedure parameter value. Type: string (or Expression with resultType string).
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set stored procedure parameter value. Type: string (or Expression with resultType string).
     *
     * @param value the value value to set
     * @return the StoredProcedureParameter object itself.
     */
    public StoredProcedureParameter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get stored procedure parameter type.
     *
     * @return the type value
     */
    public Object type() {
        return this.type;
    }

    /**
     * Set stored procedure parameter type.
     *
     * @param type the type value to set
     * @return the StoredProcedureParameter object itself.
     */
    public StoredProcedureParameter withType(Object type) {
        this.type = type;
        return this;
    }

}
