/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.implementation;

import com.microsoft.azure.management.batch.PackageState;
import org.joda.time.DateTime;

/**
 * An application package which represents a particular version of an
 * application.
 */
public class ApplicationPackageInner {
    /**
     * The id of the application.
     */
    private String id;

    /**
     * The version of the application package.
     */
    private String version;

    /**
     * The current state of the application package. Possible values include:
     * 'pending', 'active', 'unmapped'.
     */
    private PackageState state;

    /**
     * The format of the application package, if the package is active.
     */
    private String format;

    /**
     * The storage URL at which the application package is stored.
     */
    private String storageUrl;

    /**
     * The UTC time at which the storage URL will expire.
     */
    private DateTime storageUrlExpiry;

    /**
     * The time at which the package was last activated, if the package is
     * active.
     */
    private DateTime lastActivationTime;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ApplicationPackageInner object itself.
     */
    public ApplicationPackageInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the ApplicationPackageInner object itself.
     */
    public ApplicationPackageInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public PackageState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the ApplicationPackageInner object itself.
     */
    public ApplicationPackageInner withState(PackageState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the format value.
     *
     * @return the format value
     */
    public String format() {
        return this.format;
    }

    /**
     * Set the format value.
     *
     * @param format the format value to set
     * @return the ApplicationPackageInner object itself.
     */
    public ApplicationPackageInner withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Get the storageUrl value.
     *
     * @return the storageUrl value
     */
    public String storageUrl() {
        return this.storageUrl;
    }

    /**
     * Set the storageUrl value.
     *
     * @param storageUrl the storageUrl value to set
     * @return the ApplicationPackageInner object itself.
     */
    public ApplicationPackageInner withStorageUrl(String storageUrl) {
        this.storageUrl = storageUrl;
        return this;
    }

    /**
     * Get the storageUrlExpiry value.
     *
     * @return the storageUrlExpiry value
     */
    public DateTime storageUrlExpiry() {
        return this.storageUrlExpiry;
    }

    /**
     * Set the storageUrlExpiry value.
     *
     * @param storageUrlExpiry the storageUrlExpiry value to set
     * @return the ApplicationPackageInner object itself.
     */
    public ApplicationPackageInner withStorageUrlExpiry(DateTime storageUrlExpiry) {
        this.storageUrlExpiry = storageUrlExpiry;
        return this;
    }

    /**
     * Get the lastActivationTime value.
     *
     * @return the lastActivationTime value
     */
    public DateTime lastActivationTime() {
        return this.lastActivationTime;
    }

    /**
     * Set the lastActivationTime value.
     *
     * @param lastActivationTime the lastActivationTime value to set
     * @return the ApplicationPackageInner object itself.
     */
    public ApplicationPackageInner withLastActivationTime(DateTime lastActivationTime) {
        this.lastActivationTime = lastActivationTime;
        return this;
    }

}
