/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents mapping of host directories to directories in the container.
 */
public class LocalDataVolume {
    /**
     * The path on the host that is to be mounted as a directory in the
     * container.
     */
    @JsonProperty(value = "hostPath", required = true)
    private String hostPath;

    /**
     * The container local path where the host directory is mounted.
     */
    @JsonProperty(value = "localPath", required = true)
    private String localPath;

    /**
     * Get the hostPath value.
     *
     * @return the hostPath value
     */
    public String hostPath() {
        return this.hostPath;
    }

    /**
     * Set the hostPath value.
     *
     * @param hostPath the hostPath value to set
     * @return the LocalDataVolume object itself.
     */
    public LocalDataVolume withHostPath(String hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * Get the localPath value.
     *
     * @return the localPath value
     */
    public String localPath() {
        return this.localPath;
    }

    /**
     * Set the localPath value.
     *
     * @param localPath the localPath value to set
     * @return the LocalDataVolume object itself.
     */
    public LocalDataVolume withLocalPath(String localPath) {
        this.localPath = localPath;
        return this;
    }

}
