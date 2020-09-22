/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the data disk image.
 */
public class GalleryDataDiskImage extends GalleryDiskImage {
    /**
     * This property specifies the logical unit number of the data disk. This
     * value is used to identify data disks within the Virtual Machine and
     * therefore must be unique for each data disk attached to the Virtual
     * Machine.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /**
     * Get this property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     *
     * @return the lun value
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set this property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     *
     * @param lun the lun value to set
     * @return the GalleryDataDiskImage object itself.
     */
    public GalleryDataDiskImage withLun(int lun) {
        this.lun = lun;
        return this;
    }

}
