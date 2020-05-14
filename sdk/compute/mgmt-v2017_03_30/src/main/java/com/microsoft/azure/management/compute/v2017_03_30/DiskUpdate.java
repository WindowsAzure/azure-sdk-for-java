/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Disk update resource.
 */
@JsonFlatten
public class DiskUpdate extends ResourceUpdate {
    /**
     * the Operating System type. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /**
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the VHD to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /**
     * Encryption settings for disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettings")
    private EncryptionSettings encryptionSettings;

    /**
     * Get the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the Operating System type. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get if creationData.createOption is Empty, this field is mandatory and it indicates the size of the VHD to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set if creationData.createOption is Empty, this field is mandatory and it indicates the size of the VHD to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk's size.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get encryption settings for disk or snapshot.
     *
     * @return the encryptionSettings value
     */
    public EncryptionSettings encryptionSettings() {
        return this.encryptionSettings;
    }

    /**
     * Set encryption settings for disk or snapshot.
     *
     * @param encryptionSettings the encryptionSettings value to set
     * @return the DiskUpdate object itself.
     */
    public DiskUpdate withEncryptionSettings(EncryptionSettings encryptionSettings) {
        this.encryptionSettings = encryptionSettings;
        return this;
    }

}
