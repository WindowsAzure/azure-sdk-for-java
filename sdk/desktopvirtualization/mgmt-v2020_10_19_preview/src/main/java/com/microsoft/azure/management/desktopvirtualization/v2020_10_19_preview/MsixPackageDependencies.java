/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema for MSIX Package Dependencies properties.
 */
public class MsixPackageDependencies {
    /**
     * Name of package dependency.
     */
    @JsonProperty(value = "dependencyName")
    private String dependencyName;

    /**
     * Name of dependency publisher.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * Dependency version required.
     */
    @JsonProperty(value = "minVersion")
    private String minVersion;

    /**
     * Get name of package dependency.
     *
     * @return the dependencyName value
     */
    public String dependencyName() {
        return this.dependencyName;
    }

    /**
     * Set name of package dependency.
     *
     * @param dependencyName the dependencyName value to set
     * @return the MsixPackageDependencies object itself.
     */
    public MsixPackageDependencies withDependencyName(String dependencyName) {
        this.dependencyName = dependencyName;
        return this;
    }

    /**
     * Get name of dependency publisher.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set name of dependency publisher.
     *
     * @param publisher the publisher value to set
     * @return the MsixPackageDependencies object itself.
     */
    public MsixPackageDependencies withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get dependency version required.
     *
     * @return the minVersion value
     */
    public String minVersion() {
        return this.minVersion;
    }

    /**
     * Set dependency version required.
     *
     * @param minVersion the minVersion value to set
     * @return the MsixPackageDependencies object itself.
     */
    public MsixPackageDependencies withMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }

}
