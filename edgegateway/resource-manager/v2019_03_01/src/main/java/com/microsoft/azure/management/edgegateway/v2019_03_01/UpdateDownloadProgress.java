/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details about the download progress of update.
 */
public class UpdateDownloadProgress {
    /**
     * The download phase. Possible values include: 'Unknown', 'Initializing',
     * 'Downloading', 'Verifying'.
     */
    @JsonProperty(value = "downloadPhase", access = JsonProperty.Access.WRITE_ONLY)
    private DownloadPhase downloadPhase;

    /**
     * Percentage of completion.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /**
     * Total bytes to download.
     */
    @JsonProperty(value = "totalBytesToDownload", access = JsonProperty.Access.WRITE_ONLY)
    private Double totalBytesToDownload;

    /**
     * Total bytes downloaded.
     */
    @JsonProperty(value = "totalBytesDownloaded", access = JsonProperty.Access.WRITE_ONLY)
    private Double totalBytesDownloaded;

    /**
     * Number of updates to download.
     */
    @JsonProperty(value = "numberOfUpdatesToDownload", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfUpdatesToDownload;

    /**
     * Number of updates downloaded.
     */
    @JsonProperty(value = "numberOfUpdatesDownloaded", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfUpdatesDownloaded;

    /**
     * Get the download phase. Possible values include: 'Unknown', 'Initializing', 'Downloading', 'Verifying'.
     *
     * @return the downloadPhase value
     */
    public DownloadPhase downloadPhase() {
        return this.downloadPhase;
    }

    /**
     * Get percentage of completion.
     *
     * @return the percentComplete value
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get total bytes to download.
     *
     * @return the totalBytesToDownload value
     */
    public Double totalBytesToDownload() {
        return this.totalBytesToDownload;
    }

    /**
     * Get total bytes downloaded.
     *
     * @return the totalBytesDownloaded value
     */
    public Double totalBytesDownloaded() {
        return this.totalBytesDownloaded;
    }

    /**
     * Get number of updates to download.
     *
     * @return the numberOfUpdatesToDownload value
     */
    public Integer numberOfUpdatesToDownload() {
        return this.numberOfUpdatesToDownload;
    }

    /**
     * Get number of updates downloaded.
     *
     * @return the numberOfUpdatesDownloaded value
     */
    public Integer numberOfUpdatesDownloaded() {
        return this.numberOfUpdatesDownloaded;
    }

}
