/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of the disk.
 */
public class DiskInstanceView {
    /**
     * The disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specifies the encryption settings for the OS Disk. &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     */
    @JsonProperty(value = "encryptionSettings")
    private List<DiskEncryptionSettings> encryptionSettings;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

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
     * @return the DiskInstanceView object itself.
     */
    public DiskInstanceView withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the encryptionSettings value.
     *
     * @return the encryptionSettings value
     */
    public List<DiskEncryptionSettings> encryptionSettings() {
        return this.encryptionSettings;
    }

    /**
     * Set the encryptionSettings value.
     *
     * @param encryptionSettings the encryptionSettings value to set
     * @return the DiskInstanceView object itself.
     */
    public DiskInstanceView withEncryptionSettings(List<DiskEncryptionSettings> encryptionSettings) {
        this.encryptionSettings = encryptionSettings;
        return this;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set
     * @return the DiskInstanceView object itself.
     */
    public DiskInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

}
