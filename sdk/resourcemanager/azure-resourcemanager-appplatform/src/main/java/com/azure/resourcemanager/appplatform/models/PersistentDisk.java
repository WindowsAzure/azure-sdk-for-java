// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Persistent disk payload. */
@Fluent
public final class PersistentDisk {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PersistentDisk.class);

    /*
     * Size of the persistent disk in GB
     */
    @JsonProperty(value = "sizeInGB")
    private Integer sizeInGB;

    /*
     * Size of the used persistent disk in GB
     */
    @JsonProperty(value = "usedInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Integer usedInGB;

    /*
     * Mount path of the persistent disk
     */
    @JsonProperty(value = "mountPath")
    private String mountPath;

    /**
     * Get the sizeInGB property: Size of the persistent disk in GB.
     *
     * @return the sizeInGB value.
     */
    public Integer sizeInGB() {
        return this.sizeInGB;
    }

    /**
     * Set the sizeInGB property: Size of the persistent disk in GB.
     *
     * @param sizeInGB the sizeInGB value to set.
     * @return the PersistentDisk object itself.
     */
    public PersistentDisk withSizeInGB(Integer sizeInGB) {
        this.sizeInGB = sizeInGB;
        return this;
    }

    /**
     * Get the usedInGB property: Size of the used persistent disk in GB.
     *
     * @return the usedInGB value.
     */
    public Integer usedInGB() {
        return this.usedInGB;
    }

    /**
     * Get the mountPath property: Mount path of the persistent disk.
     *
     * @return the mountPath value.
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set the mountPath property: Mount path of the persistent disk.
     *
     * @param mountPath the mountPath value to set.
     * @return the PersistentDisk object itself.
     */
    public PersistentDisk withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
