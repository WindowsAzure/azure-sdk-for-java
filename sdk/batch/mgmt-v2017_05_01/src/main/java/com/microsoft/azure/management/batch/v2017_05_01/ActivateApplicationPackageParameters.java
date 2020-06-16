/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for an activating an application package.
 */
public class ActivateApplicationPackageParameters {
    /**
     * The format of the application package binary file.
     */
    @JsonProperty(value = "format", required = true)
    private String format;

    /**
     * Get the format of the application package binary file.
     *
     * @return the format value
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format of the application package binary file.
     *
     * @param format the format value to set
     * @return the ActivateApplicationPackageParameters object itself.
     */
    public ActivateApplicationPackageParameters withFormat(String format) {
        this.format = format;
        return this;
    }

}
