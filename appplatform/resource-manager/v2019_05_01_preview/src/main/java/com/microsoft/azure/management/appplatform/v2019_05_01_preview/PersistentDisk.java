/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Persistent disk payload.
 */
public class PersistentDisk {
    /**
     * Size of the persistent disk in GB.
     */
    @JsonProperty(value = "sizeInGB")
    private Integer sizeInGB;

    /**
     * Size of the used persistent disk in GB.
     */
    @JsonProperty(value = "usedInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer usedInGB;

    /**
     * Mount path of the persistent disk.
     */
    @JsonProperty(value = "mountPath")
    private String mountPath;

    /**
     * Get size of the persistent disk in GB.
     *
     * @return the sizeInGB value
     */
    public Integer sizeInGB() {
        return this.sizeInGB;
    }

    /**
     * Set size of the persistent disk in GB.
     *
     * @param sizeInGB the sizeInGB value to set
     * @return the PersistentDisk object itself.
     */
    public PersistentDisk withSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    /**
     * Get size of the used persistent disk in GB.
     *
     * @return the usedInGB value
     */
    public Integer usedInGB() {
        return this.usedInGB;
    }

    /**
     * Get mount path of the persistent disk.
     *
     * @return the mountPath value
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set mount path of the persistent disk.
     *
     * @param mountPath the mountPath value to set
     * @return the PersistentDisk object itself.
     */
    public PersistentDisk withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

}
