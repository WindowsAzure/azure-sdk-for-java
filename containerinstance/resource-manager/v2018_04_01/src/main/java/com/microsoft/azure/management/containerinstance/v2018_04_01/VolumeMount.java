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
 * The properties of the volume mount.
 */
public class VolumeMount {
    /**
     * The name of the volume mount.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The path within the container where the volume should be mounted. Must
     * not contain colon (:).
     */
    @JsonProperty(value = "mountPath", required = true)
    private String mountPath;

    /**
     * The flag indicating whether the volume mount is read-only.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /**
     * Get the name of the volume mount.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the volume mount.
     *
     * @param name the name value to set
     * @return the VolumeMount object itself.
     */
    public VolumeMount withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the path within the container where the volume should be mounted. Must not contain colon (:).
     *
     * @return the mountPath value
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set the path within the container where the volume should be mounted. Must not contain colon (:).
     *
     * @param mountPath the mountPath value to set
     * @return the VolumeMount object itself.
     */
    public VolumeMount withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * Get the flag indicating whether the volume mount is read-only.
     *
     * @return the readOnly value
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * Set the flag indicating whether the volume mount is read-only.
     *
     * @param readOnly the readOnly value to set
     * @return the VolumeMount object itself.
     */
    public VolumeMount withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

}
