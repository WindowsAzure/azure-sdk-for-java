/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.implementation.ManagedDiskParametersInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a data disk.
 */
public class DataDisk {
    /**
     * The logical unit number.
     */
    @JsonProperty(required = true)
    private int lun;

    /**
     * The disk name.
     */
    private String name;

    /**
     * The virtual hard disk.
     */
    private VirtualHardDisk vhd;

    /**
     * The source user image virtual hard disk. This virtual hard disk will be
     * copied before using it to attach to the virtual machine. If SourceImage
     * is provided, the destination virtual hard disk must not exist.
     */
    private VirtualHardDisk image;

    /**
     * The caching type. Possible values include: 'None', 'ReadOnly',
     * 'ReadWrite'.
     */
    private CachingTypes caching;

    /**
     * The create option. Possible values include: 'fromImage', 'empty',
     * 'attach'.
     */
    @JsonProperty(required = true)
    private DiskCreateOptionTypes createOption;

    /**
     * The initial disk size in GB for blank data disks, and the new desired
     * size for resizing existing OS and data disks.
     */
    private Integer diskSizeGB;

    /**
     * The managed disk parameters.
     */
    private ManagedDiskParametersInner managedDisk;

    /**
     * Get the lun value.
     *
     * @return the lun value
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun value.
     *
     * @param lun the lun value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the vhd value.
     *
     * @return the vhd value
     */
    public VirtualHardDisk vhd() {
        return this.vhd;
    }

    /**
     * Set the vhd value.
     *
     * @param vhd the vhd value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withVhd(VirtualHardDisk vhd) {
        this.vhd = vhd;
        return this;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param image the image value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withImage(VirtualHardDisk image) {
        this.image = image;
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
     * @return the DataDisk object itself.
     */
    public DataDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the createOption value.
     *
     * @return the createOption value
     */
    public DiskCreateOptionTypes createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption value.
     *
     * @param createOption the createOption value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withCreateOption(DiskCreateOptionTypes createOption) {
        this.createOption = createOption;
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
     * @return the DataDisk object itself.
     */
    public DataDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk value.
     *
     * @return the managedDisk value
     */
    public ManagedDiskParametersInner managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk value.
     *
     * @param managedDisk the managedDisk value to set
     * @return the DataDisk object itself.
     */
    public DataDisk withManagedDisk(ManagedDiskParametersInner managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

}
