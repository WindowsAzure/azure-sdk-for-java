/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an Operating System disk.
 */
public class ImageOSDisk {
    /**
     * The Operating System type. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "osType", required = true)
    private OperatingSystemTypes osType;

    /**
     * The OS State. Possible values include: 'Generalized', 'Specialized'.
     */
    @JsonProperty(value = "osState", required = true)
    private OperatingSystemStateTypes osState;

    /**
     * The snapshot.
     */
    @JsonProperty(value = "snapshot")
    private SubResource snapshot;

    /**
     * The managedDisk.
     */
    @JsonProperty(value = "managedDisk")
    private SubResource managedDisk;

    /**
     * The Virtual Hard Disk.
     */
    @JsonProperty(value = "blobUri")
    private String blobUri;

    /**
     * The caching type. Possible values include: 'None', 'ReadOnly',
     * 'ReadWrite'.
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /**
     * The initial managed disk size in GB for blank data disks, and the new
     * desired size for existing OS and Data disks.
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osState value.
     *
     * @return the osState value
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the osState value.
     *
     * @param osState the osState value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
        return this;
    }

    /**
     * Get the snapshot value.
     *
     * @return the snapshot value
     */
    public SubResource snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot value.
     *
     * @param snapshot the snapshot value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withSnapshot(SubResource snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the managedDisk value.
     *
     * @return the managedDisk value
     */
    public SubResource managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk value.
     *
     * @param managedDisk the managedDisk value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withManagedDisk(SubResource managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the blobUri value.
     *
     * @return the blobUri value
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Set the blobUri value.
     *
     * @param blobUri the blobUri value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withBlobUri(String blobUri) {
        this.blobUri = blobUri;
        return this;
    }

    /**
     * Get the caching value.
     *
     * @return the caching value
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching value.
     *
     * @param caching the caching value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGB value.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB value.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

}
