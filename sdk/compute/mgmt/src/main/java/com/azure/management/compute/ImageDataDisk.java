// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageDataDisk model.
 */
@Fluent
public final class ImageDataDisk {
    /*
     * Specifies the logical unit number of the data disk. This value is used
     * to identify data disks within the VM and therefore must be unique for
     * each data disk attached to a VM.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /*
     * The snapshot property.
     */
    @JsonProperty(value = "snapshot")
    private SubResource snapshot;

    /*
     * The managedDisk property.
     */
    @JsonProperty(value = "managedDisk")
    private SubResource managedDisk;

    /*
     * The Virtual Hard Disk.
     */
    @JsonProperty(value = "blobUri")
    private String blobUri;

    /*
     * Specifies the caching requirements. <br><br> Possible values are:
     * <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br>
     * Default: **None for Standard storage. ReadOnly for Premium storage**
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Specifies the size of empty data disks in gigabytes. This element can be
     * used to overwrite the name of the disk in a virtual machine image.
     * <br><br> This value cannot be larger than 1023 GB
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * Specifies the storage account type for the managed disk. NOTE:
     * UltraSSD_LRS can only be used with data disks. It cannot be used with OS
     * Disk. Standard_LRS uses Standard HDD. StandardSSD_LRS uses Standard SSD.
     * Premium_LRS uses Premium SSD. UltraSSD_LRS uses Ultra disk. For more
     * information regarding disks supported for Windows Virtual Machines,
     * refer to
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/disks-types and, for Linux Virtual Machines, refer to https://docs.microsoft.com/en-us/azure/virtual-machines/linux/disks-types
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountTypes storageAccountType;

    /**
     * Get the lun property: Specifies the logical unit number of the data
     * disk. This value is used to identify data disks within the VM and
     * therefore must be unique for each data disk attached to a VM.
     * 
     * @return the lun value.
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Specifies the logical unit number of the data
     * disk. This value is used to identify data disks within the VM and
     * therefore must be unique for each data disk attached to a VM.
     * 
     * @param lun the lun value to set.
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the snapshot property: The snapshot property.
     * 
     * @return the snapshot value.
     */
    public SubResource snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The snapshot property.
     * 
     * @param snapshot the snapshot value to set.
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withSnapshot(SubResource snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the managedDisk property: The managedDisk property.
     * 
     * @return the managedDisk value.
     */
    public SubResource managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managedDisk property.
     * 
     * @param managedDisk the managedDisk value to set.
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withManagedDisk(SubResource managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the blobUri property: The Virtual Hard Disk.
     * 
     * @return the blobUri value.
     */
    public String blobUri() {
        return this.blobUri;
    }

    /**
     * Set the blobUri property: The Virtual Hard Disk.
     * 
     * @param blobUri the blobUri value to set.
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withBlobUri(String blobUri) {
        this.blobUri = blobUri;
        return this;
    }

    /**
     * Get the caching property: Specifies the caching requirements.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None**
     * &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for
     * Premium storage**.
     * 
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None**
     * &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for
     * Premium storage**.
     * 
     * @param caching the caching value to set.
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of empty data disks in
     * gigabytes. This element can be used to overwrite the name of the disk in
     * a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be
     * larger than 1023 GB.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of empty data disks in
     * gigabytes. This element can be used to overwrite the name of the disk in
     * a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be
     * larger than 1023 GB.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the storageAccountType property: Specifies the storage account type
     * for the managed disk. NOTE: UltraSSD_LRS can only be used with data
     * disks. It cannot be used with OS Disk. Standard_LRS uses Standard HDD.
     * StandardSSD_LRS uses Standard SSD. Premium_LRS uses Premium SSD.
     * UltraSSD_LRS uses Ultra disk. For more information regarding disks
     * supported for Windows Virtual Machines, refer to
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/disks-types and, for Linux Virtual Machines, refer to https://docs.microsoft.com/en-us/azure/virtual-machines/linux/disks-types.
     * 
     * @return the storageAccountType value.
     */
    public StorageAccountTypes storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type
     * for the managed disk. NOTE: UltraSSD_LRS can only be used with data
     * disks. It cannot be used with OS Disk. Standard_LRS uses Standard HDD.
     * StandardSSD_LRS uses Standard SSD. Premium_LRS uses Premium SSD.
     * UltraSSD_LRS uses Ultra disk. For more information regarding disks
     * supported for Windows Virtual Machines, refer to
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/disks-types and, for Linux Virtual Machines, refer to https://docs.microsoft.com/en-us/azure/virtual-machines/linux/disks-types.
     * 
     * @param storageAccountType the storageAccountType value to set.
     * @return the ImageDataDisk object itself.
     */
    public ImageDataDisk withStorageAccountType(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }
}
