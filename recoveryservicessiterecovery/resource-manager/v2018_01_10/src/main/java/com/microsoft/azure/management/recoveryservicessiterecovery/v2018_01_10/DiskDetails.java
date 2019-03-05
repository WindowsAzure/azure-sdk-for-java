/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * On-prem disk details data.
 */
public class DiskDetails {
    /**
     * The hard disk max size in MB.
     */
    @JsonProperty(value = "maxSizeMB")
    private Long maxSizeMB;

    /**
     * The type of the volume.
     */
    @JsonProperty(value = "vhdType")
    private String vhdType;

    /**
     * The VHD Id.
     */
    @JsonProperty(value = "vhdId")
    private String vhdId;

    /**
     * The VHD name.
     */
    @JsonProperty(value = "vhdName")
    private String vhdName;

    /**
     * Get the hard disk max size in MB.
     *
     * @return the maxSizeMB value
     */
    public Long maxSizeMB() {
        return this.maxSizeMB;
    }

    /**
     * Set the hard disk max size in MB.
     *
     * @param maxSizeMB the maxSizeMB value to set
     * @return the DiskDetails object itself.
     */
    public DiskDetails withMaxSizeMB(Long maxSizeMB) {
        this.maxSizeMB = maxSizeMB;
        return this;
    }

    /**
     * Get the type of the volume.
     *
     * @return the vhdType value
     */
    public String vhdType() {
        return this.vhdType;
    }

    /**
     * Set the type of the volume.
     *
     * @param vhdType the vhdType value to set
     * @return the DiskDetails object itself.
     */
    public DiskDetails withVhdType(String vhdType) {
        this.vhdType = vhdType;
        return this;
    }

    /**
     * Get the VHD Id.
     *
     * @return the vhdId value
     */
    public String vhdId() {
        return this.vhdId;
    }

    /**
     * Set the VHD Id.
     *
     * @param vhdId the vhdId value to set
     * @return the DiskDetails object itself.
     */
    public DiskDetails withVhdId(String vhdId) {
        this.vhdId = vhdId;
        return this;
    }

    /**
     * Get the VHD name.
     *
     * @return the vhdName value
     */
    public String vhdName() {
        return this.vhdName;
    }

    /**
     * Set the VHD name.
     *
     * @param vhdName the vhdName value to set
     * @return the DiskDetails object itself.
     */
    public DiskDetails withVhdName(String vhdName) {
        this.vhdName = vhdName;
        return this;
    }

}
