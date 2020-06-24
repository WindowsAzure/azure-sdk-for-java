// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ImageOSDisk model. */
@Fluent
public final class ImageOSDisk {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImageOSDisk.class);

    /*
     * This property allows you to specify the type of the OS that is included
     * in the disk if creating a VM from a custom image. <br><br> Possible
     * values are: <br><br> **Windows** <br><br> **Linux**
     */
    @JsonProperty(value = "osType", required = true)
    private OperatingSystemTypes osType;

    /*
     * The OS State.
     */
    @JsonProperty(value = "osState", required = true)
    private OperatingSystemStateTypes osState;

    /*
     * The snapshot.
     */
    @JsonProperty(value = "snapshot")
    private SubResource snapshot;

    /*
     * The managedDisk.
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
     * Specifies the storage account type for the managed disk. UltraSSD_LRS
     * cannot be used with OS Disk.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountTypes storageAccountType;

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk if
     * creating a VM from a custom image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @param osType the osType value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osState property: The OS State.
     *
     * @return the osState value.
     */
    public OperatingSystemStateTypes osState() {
        return this.osState;
    }

    /**
     * Set the osState property: The OS State.
     *
     * @param osState the osState value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withOsState(OperatingSystemStateTypes osState) {
        this.osState = osState;
        return this;
    }

    /**
     * Get the snapshot property: The snapshot.
     *
     * @return the snapshot value.
     */
    public SubResource snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The snapshot.
     *
     * @param snapshot the snapshot value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withSnapshot(SubResource snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the managedDisk property: The managedDisk.
     *
     * @return the managedDisk value.
     */
    public SubResource managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managedDisk.
     *
     * @param managedDisk the managedDisk value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withManagedDisk(SubResource managedDisk) {
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
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withBlobUri(String blobUri) {
        this.blobUri = blobUri;
        return this;
    }

    /**
     * Get the caching property: Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**.
     *
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**.
     *
     * @param caching the caching value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of empty data disks in gigabytes. This element can be used to
     * overwrite the name of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than
     * 1023 GB.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of empty data disks in gigabytes. This element can be used to
     * overwrite the name of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than
     * 1023 GB.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the storageAccountType property: Specifies the storage account type for the managed disk. UltraSSD_LRS cannot
     * be used with OS Disk.
     *
     * @return the storageAccountType value.
     */
    public StorageAccountTypes storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type for the managed disk. UltraSSD_LRS cannot
     * be used with OS Disk.
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the ImageOSDisk object itself.
     */
    public ImageOSDisk withStorageAccountType(StorageAccountTypes storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property osType in model ImageOSDisk"));
        }
        if (osState() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property osState in model ImageOSDisk"));
        }
    }
}
