/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a volume that is populated with the contents of a git repository.
 */
public class GitRepoVolume {
    /**
     * Target directory name. Must not contain or start with '..'.  If '.' is
     * supplied, the volume directory will be the git repository.  Otherwise,
     * if specified, the volume will contain the git repository in the
     * subdirectory with the given name.
     */
    @JsonProperty(value = "directory")
    private String directory;

    /**
     * Repository URL.
     */
    @JsonProperty(value = "repository", required = true)
    private String repository;

    /**
     * Commit hash for the specified revision.
     */
    @JsonProperty(value = "revision")
    private String revision;

    /**
     * Get target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     *
     * @return the directory value
     */
    public String directory() {
        return this.directory;
    }

    /**
     * Set target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
     *
     * @param directory the directory value to set
     * @return the GitRepoVolume object itself.
     */
    public GitRepoVolume withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * Get repository URL.
     *
     * @return the repository value
     */
    public String repository() {
        return this.repository;
    }

    /**
     * Set repository URL.
     *
     * @param repository the repository value to set
     * @return the GitRepoVolume object itself.
     */
    public GitRepoVolume withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get commit hash for the specified revision.
     *
     * @return the revision value
     */
    public String revision() {
        return this.revision;
    }

    /**
     * Set commit hash for the specified revision.
     *
     * @param revision the revision value to set
     * @return the GitRepoVolume object itself.
     */
    public GitRepoVolume withRevision(String revision) {
        this.revision = revision;
        return this;
    }

}
