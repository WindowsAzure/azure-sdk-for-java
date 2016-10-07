/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the maximum size limits for an Azure SQL Database.
 */
public class MaxSizeCapability {
    /**
     * Gets the maximum size of the database (see 'unit' for the units).
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer limit;

    /**
     * Gets the units that the limit is expressed in. Possible values include:
     * 'Megabytes', 'Gigabytes', 'Terabytes', 'Petabytes'.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private MaxSizeUnits unit;

    /**
     * Gets the status of the maximum size capability. Possible values
     * include: 'Visible', 'Available', 'Default'.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /**
     * Get the limit value.
     *
     * @return the limit value
     */
    public Integer limit() {
        return this.limit;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public MaxSizeUnits unit() {
        return this.unit;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public CapabilityStatus status() {
        return this.status;
    }

}
