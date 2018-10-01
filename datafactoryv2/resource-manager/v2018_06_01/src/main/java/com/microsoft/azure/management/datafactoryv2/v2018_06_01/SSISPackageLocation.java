/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSIS package location.
 */
public class SSISPackageLocation {
    /**
     * The SSIS package path.
     */
    @JsonProperty(value = "packagePath", required = true)
    private String packagePath;

    /**
     * Get the SSIS package path.
     *
     * @return the packagePath value
     */
    public String packagePath() {
        return this.packagePath;
    }

    /**
     * Set the SSIS package path.
     *
     * @param packagePath the packagePath value to set
     * @return the SSISPackageLocation object itself.
     */
    public SSISPackageLocation withPackagePath(String packagePath) {
        this.packagePath = packagePath;
        return this;
    }

}
