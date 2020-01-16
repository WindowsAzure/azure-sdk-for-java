/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSIS embedded child package.
 */
public class SSISChildPackage {
    /**
     * Path for embedded child package. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "packagePath", required = true)
    private Object packagePath;

    /**
     * Name for embedded child package.
     */
    @JsonProperty(value = "packageName")
    private String packageName;

    /**
     * Content for embedded child package. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "packageContent", required = true)
    private Object packageContent;

    /**
     * Last modified date for embedded child package.
     */
    @JsonProperty(value = "packageLastModifiedDate")
    private String packageLastModifiedDate;

    /**
     * Get path for embedded child package. Type: string (or Expression with resultType string).
     *
     * @return the packagePath value
     */
    public Object packagePath() {
        return this.packagePath;
    }

    /**
     * Set path for embedded child package. Type: string (or Expression with resultType string).
     *
     * @param packagePath the packagePath value to set
     * @return the SSISChildPackage object itself.
     */
    public SSISChildPackage withPackagePath(Object packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    /**
     * Get name for embedded child package.
     *
     * @return the packageName value
     */
    public String packageName() {
        return this.packageName;
    }

    /**
     * Set name for embedded child package.
     *
     * @param packageName the packageName value to set
     * @return the SSISChildPackage object itself.
     */
    public SSISChildPackage withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Get content for embedded child package. Type: string (or Expression with resultType string).
     *
     * @return the packageContent value
     */
    public Object packageContent() {
        return this.packageContent;
    }

    /**
     * Set content for embedded child package. Type: string (or Expression with resultType string).
     *
     * @param packageContent the packageContent value to set
     * @return the SSISChildPackage object itself.
     */
    public SSISChildPackage withPackageContent(Object packageContent) {
        this.packageContent = packageContent;
        return this;
    }

    /**
     * Get last modified date for embedded child package.
     *
     * @return the packageLastModifiedDate value
     */
    public String packageLastModifiedDate() {
        return this.packageLastModifiedDate;
    }

    /**
     * Set last modified date for embedded child package.
     *
     * @param packageLastModifiedDate the packageLastModifiedDate value to set
     * @return the SSISChildPackage object itself.
     */
    public SSISChildPackage withPackageLastModifiedDate(String packageLastModifiedDate) {
        this.packageLastModifiedDate = packageLastModifiedDate;
        return this;
    }

}
