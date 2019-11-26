/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error response received from the Azure Maintenance service.
 */
public class MaintenanceError {
    /**
     * Details of the error.
     */
    @JsonProperty(value = "error")
    private ErrorDetails error;

    /**
     * Get details of the error.
     *
     * @return the error value
     */
    public ErrorDetails error() {
        return this.error;
    }

    /**
     * Set details of the error.
     *
     * @param error the error value to set
     * @return the MaintenanceError object itself.
     */
    public MaintenanceError withError(ErrorDetails error) {
        this.error = error;
        return this;
    }

}
