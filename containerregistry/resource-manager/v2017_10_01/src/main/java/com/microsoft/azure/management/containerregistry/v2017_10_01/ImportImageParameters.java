/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImportImageParameters model.
 */
public class ImportImageParameters {
    /**
     * The source of the image.
     */
    @JsonProperty(value = "source", required = true)
    private ImportSource source;

    /**
     * List of strings of the form repo[:tag]. When tag is omitted the source
     * will be used (or 'latest' if source tag is also omitted).
     */
    @JsonProperty(value = "targetTags")
    private List<String> targetTags;

    /**
     * List of strings of repository names to do a manifest only copy. No tag
     * will be created.
     */
    @JsonProperty(value = "untaggedTargetRepositories")
    private List<String> untaggedTargetRepositories;

    /**
     * When Force, any existing target tags will be overwritten. When NoForce,
     * any existing target tags will fail the operation before any copying
     * begins. Possible values include: 'NoForce', 'Force'.
     */
    @JsonProperty(value = "mode")
    private ImportMode mode;

    /**
     * Get the source of the image.
     *
     * @return the source value
     */
    public ImportSource source() {
        return this.source;
    }

    /**
     * Set the source of the image.
     *
     * @param source the source value to set
     * @return the ImportImageParameters object itself.
     */
    public ImportImageParameters withSource(ImportSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get list of strings of the form repo[:tag]. When tag is omitted the source will be used (or 'latest' if source tag is also omitted).
     *
     * @return the targetTags value
     */
    public List<String> targetTags() {
        return this.targetTags;
    }

    /**
     * Set list of strings of the form repo[:tag]. When tag is omitted the source will be used (or 'latest' if source tag is also omitted).
     *
     * @param targetTags the targetTags value to set
     * @return the ImportImageParameters object itself.
     */
    public ImportImageParameters withTargetTags(List<String> targetTags) {
        this.targetTags = targetTags;
        return this;
    }

    /**
     * Get list of strings of repository names to do a manifest only copy. No tag will be created.
     *
     * @return the untaggedTargetRepositories value
     */
    public List<String> untaggedTargetRepositories() {
        return this.untaggedTargetRepositories;
    }

    /**
     * Set list of strings of repository names to do a manifest only copy. No tag will be created.
     *
     * @param untaggedTargetRepositories the untaggedTargetRepositories value to set
     * @return the ImportImageParameters object itself.
     */
    public ImportImageParameters withUntaggedTargetRepositories(List<String> untaggedTargetRepositories) {
        this.untaggedTargetRepositories = untaggedTargetRepositories;
        return this;
    }

    /**
     * Get when Force, any existing target tags will be overwritten. When NoForce, any existing target tags will fail the operation before any copying begins. Possible values include: 'NoForce', 'Force'.
     *
     * @return the mode value
     */
    public ImportMode mode() {
        return this.mode;
    }

    /**
     * Set when Force, any existing target tags will be overwritten. When NoForce, any existing target tags will fail the operation before any copying begins. Possible values include: 'NoForce', 'Force'.
     *
     * @param mode the mode value to set
     * @return the ImportImageParameters object itself.
     */
    public ImportImageParameters withMode(ImportMode mode) {
        this.mode = mode;
        return this;
    }

}
