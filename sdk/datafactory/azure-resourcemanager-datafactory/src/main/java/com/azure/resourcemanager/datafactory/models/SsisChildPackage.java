// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSIS embedded child package. */
@Fluent
public final class SsisChildPackage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SsisChildPackage.class);

    /*
     * Path for embedded child package. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "packagePath", required = true)
    private Object packagePath;

    /*
     * Name for embedded child package.
     */
    @JsonProperty(value = "packageName")
    private String packageName;

    /*
     * Content for embedded child package. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "packageContent", required = true)
    private Object packageContent;

    /*
     * Last modified date for embedded child package.
     */
    @JsonProperty(value = "packageLastModifiedDate")
    private String packageLastModifiedDate;

    /**
     * Get the packagePath property: Path for embedded child package. Type: string (or Expression with resultType
     * string).
     *
     * @return the packagePath value.
     */
    public Object packagePath() {
        return this.packagePath;
    }

    /**
     * Set the packagePath property: Path for embedded child package. Type: string (or Expression with resultType
     * string).
     *
     * @param packagePath the packagePath value to set.
     * @return the SsisChildPackage object itself.
     */
    public SsisChildPackage withPackagePath(Object packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    /**
     * Get the packageName property: Name for embedded child package.
     *
     * @return the packageName value.
     */
    public String packageName() {
        return this.packageName;
    }

    /**
     * Set the packageName property: Name for embedded child package.
     *
     * @param packageName the packageName value to set.
     * @return the SsisChildPackage object itself.
     */
    public SsisChildPackage withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Get the packageContent property: Content for embedded child package. Type: string (or Expression with resultType
     * string).
     *
     * @return the packageContent value.
     */
    public Object packageContent() {
        return this.packageContent;
    }

    /**
     * Set the packageContent property: Content for embedded child package. Type: string (or Expression with resultType
     * string).
     *
     * @param packageContent the packageContent value to set.
     * @return the SsisChildPackage object itself.
     */
    public SsisChildPackage withPackageContent(Object packageContent) {
        this.packageContent = packageContent;
        return this;
    }

    /**
     * Get the packageLastModifiedDate property: Last modified date for embedded child package.
     *
     * @return the packageLastModifiedDate value.
     */
    public String packageLastModifiedDate() {
        return this.packageLastModifiedDate;
    }

    /**
     * Set the packageLastModifiedDate property: Last modified date for embedded child package.
     *
     * @param packageLastModifiedDate the packageLastModifiedDate value to set.
     * @return the SsisChildPackage object itself.
     */
    public SsisChildPackage withPackageLastModifiedDate(String packageLastModifiedDate) {
        this.packageLastModifiedDate = packageLastModifiedDate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (packagePath() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property packagePath in model SsisChildPackage"));
        }
        if (packageContent() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property packageContent in model SsisChildPackage"));
        }
    }
}
