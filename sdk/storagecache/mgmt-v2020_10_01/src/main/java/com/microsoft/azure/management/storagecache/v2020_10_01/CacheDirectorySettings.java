/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cache Directory Services settings.
 */
public class CacheDirectorySettings {
    /**
     * Specifies settings for joining the HPC Cache to an Active Directory
     * domain.
     */
    @JsonProperty(value = "activeDirectory")
    private CacheActiveDirectorySettings activeDirectory;

    /**
     * Specifies settings for Extended Groups. Extended Groups allows users to
     * be members of more than 16 groups.
     */
    @JsonProperty(value = "usernameDownload")
    private CacheUsernameDownloadSettings usernameDownload;

    /**
     * Get specifies settings for joining the HPC Cache to an Active Directory domain.
     *
     * @return the activeDirectory value
     */
    public CacheActiveDirectorySettings activeDirectory() {
        return this.activeDirectory;
    }

    /**
     * Set specifies settings for joining the HPC Cache to an Active Directory domain.
     *
     * @param activeDirectory the activeDirectory value to set
     * @return the CacheDirectorySettings object itself.
     */
    public CacheDirectorySettings withActiveDirectory(CacheActiveDirectorySettings activeDirectory) {
        this.activeDirectory = activeDirectory;
        return this;
    }

    /**
     * Get specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
     *
     * @return the usernameDownload value
     */
    public CacheUsernameDownloadSettings usernameDownload() {
        return this.usernameDownload;
    }

    /**
     * Set specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
     *
     * @param usernameDownload the usernameDownload value to set
     * @return the CacheDirectorySettings object itself.
     */
    public CacheDirectorySettings withUsernameDownload(CacheUsernameDownloadSettings usernameDownload) {
        this.usernameDownload = usernameDownload;
        return this;
    }

}
