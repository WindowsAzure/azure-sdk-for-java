/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Progress details during installation of updates.
 */
public class UpdateInstallProgress {
    /**
     * Percentage completed.
     */
    @JsonProperty(value = "percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /**
     * Number of updates to install.
     */
    @JsonProperty(value = "numberOfUpdatesToInstall", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfUpdatesToInstall;

    /**
     * Number of updates installed.
     */
    @JsonProperty(value = "numberOfUpdatesInstalled", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numberOfUpdatesInstalled;

    /**
     * Get percentage completed.
     *
     * @return the percentComplete value
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get number of updates to install.
     *
     * @return the numberOfUpdatesToInstall value
     */
    public Integer numberOfUpdatesToInstall() {
        return this.numberOfUpdatesToInstall;
    }

    /**
     * Get number of updates installed.
     *
     * @return the numberOfUpdatesInstalled value
     */
    public Integer numberOfUpdatesInstalled() {
        return this.numberOfUpdatesInstalled;
    }

}
