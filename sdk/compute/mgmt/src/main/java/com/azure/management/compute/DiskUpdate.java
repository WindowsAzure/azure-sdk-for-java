// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The DiskUpdate model.
 */
@JsonFlatten
@Fluent
public class DiskUpdate {
    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS,
     * or UltraSSD_LRS.
     */
    @JsonProperty(value = "sku")
    private DiskSku sku;

    /*
     * The operating system of the osDiskImage.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /*
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the disk to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /*
     * Encryption settings for disk or snapshot
     */
    @JsonProperty(value = "properties.encryptionSettingsCollection")
    private EncryptionSettingsCollection encryptionSettingsCollection;

    /*
     * The number of IOPS allowed for this disk; only settable for UltraSSD
     * disks. One operation can transfer between 4k and 256k bytes.
     */
    @JsonProperty(value = "properties.diskIOPSReadWrite")
    private Long diskIOPSReadWrite;

    /*
     * The bandwidth allowed for this disk; only settable for UltraSSD disks.
     * MBps means millions of bytes per second - MB here uses the ISO notation,
     * of powers of 10.
     */
    @JsonProperty(value = "properties.diskMBpsReadWrite")
    private Integer diskMBpsReadWrite;

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The disks sku name. Can be Standard_LRS,
     * Premium_LRS, StandardSSD_LRS, or UltraSSD_LRS.
     * 
     * @return the sku value.
     */
    public DiskSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The disks sku name. Can be Standard_LRS,
     * Premium_LRS, StandardSSD_LRS, or UltraSSD_LRS.
     * 
     * @param sku the sku value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withSku(DiskSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the osType property: The operating system of the osDiskImage.
     * 
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The operating system of the osDiskImage.
     * 
     * @param osType the osType value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the diskSizeGB property: If creationData.createOption is Empty, this
     * field is mandatory and it indicates the size of the disk to create. If
     * this field is present for updates or creation with other options, it
     * indicates a resize. Resizes are only allowed if the disk is not attached
     * to a running VM, and can only increase the disk's size.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: If creationData.createOption is Empty, this
     * field is mandatory and it indicates the size of the disk to create. If
     * this field is present for updates or creation with other options, it
     * indicates a resize. Resizes are only allowed if the disk is not attached
     * to a running VM, and can only increase the disk's size.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the encryptionSettingsCollection property: Encryption settings for
     * disk or snapshot.
     * 
     * @return the encryptionSettingsCollection value.
     */
    public EncryptionSettingsCollection encryptionSettingsCollection() {
        return this.encryptionSettingsCollection;
    }

    /**
     * Set the encryptionSettingsCollection property: Encryption settings for
     * disk or snapshot.
     * 
     * @param encryptionSettingsCollection the encryptionSettingsCollection
     * value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withEncryptionSettingsCollection(EncryptionSettingsCollection encryptionSettingsCollection) {
        this.encryptionSettingsCollection = encryptionSettingsCollection;
        return this;
    }

    /**
     * Get the diskIOPSReadWrite property: The number of IOPS allowed for this
     * disk; only settable for UltraSSD disks. One operation can transfer
     * between 4k and 256k bytes.
     * 
     * @return the diskIOPSReadWrite value.
     */
    public Long diskIOPSReadWrite() {
        return this.diskIOPSReadWrite;
    }

    /**
     * Set the diskIOPSReadWrite property: The number of IOPS allowed for this
     * disk; only settable for UltraSSD disks. One operation can transfer
     * between 4k and 256k bytes.
     * 
     * @param diskIOPSReadWrite the diskIOPSReadWrite value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskIOPSReadWrite(Long diskIOPSReadWrite) {
        this.diskIOPSReadWrite = diskIOPSReadWrite;
        return this;
    }

    /**
     * Get the diskMBpsReadWrite property: The bandwidth allowed for this disk;
     * only settable for UltraSSD disks. MBps means millions of bytes per
     * second - MB here uses the ISO notation, of powers of 10.
     * 
     * @return the diskMBpsReadWrite value.
     */
    public Integer diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Set the diskMBpsReadWrite property: The bandwidth allowed for this disk;
     * only settable for UltraSSD disks. MBps means millions of bytes per
     * second - MB here uses the ISO notation, of powers of 10.
     * 
     * @param diskMBpsReadWrite the diskMBpsReadWrite value to set.
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskMBpsReadWrite(Integer diskMBpsReadWrite) {
        this.diskMBpsReadWrite = diskMBpsReadWrite;
        return this;
    }
}
