/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.RestorePointTypes;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents an Azure SQL Database restore point.
 */
@JsonFlatten
public class RestorePointInner extends Resource {
    /**
     * Gets the restore point type of the Azure SQL Database restore point.
     * Possible values include: 'DISCRETE', 'CONTINUOUS'.
     */
    @JsonProperty(value = "properties.restorePointType", access = JsonProperty.Access.WRITE_ONLY)
    private RestorePointTypes restorePointType;

    /**
     * Restore point creation time. Populated when restorePointType =
     * CONTINUOUS. Null otherwise.
     */
    @JsonProperty(value = "properties.restorePointCreationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime restorePointCreationDate;

    /**
     * Earliest restore time. Populated when restorePointType = DISCRETE. Null
     * otherwise.
     */
    @JsonProperty(value = "properties.earliestRestoreDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime earliestRestoreDate;

    /**
     * Get the restorePointType value.
     *
     * @return the restorePointType value
     */
    public RestorePointTypes restorePointType() {
        return this.restorePointType;
    }

    /**
     * Get the restorePointCreationDate value.
     *
     * @return the restorePointCreationDate value
     */
    public DateTime restorePointCreationDate() {
        return this.restorePointCreationDate;
    }

    /**
     * Get the earliestRestoreDate value.
     *
     * @return the earliestRestoreDate value
     */
    public DateTime earliestRestoreDate() {
        return this.earliestRestoreDate;
    }

}
