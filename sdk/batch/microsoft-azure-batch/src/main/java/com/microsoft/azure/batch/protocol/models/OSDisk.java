/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for the operating system disk of the compute node (VM).
 */
public class OSDisk {
    /**
     * Specifies the ephemeral Disk Settings for the operating system disk used
     * by the compute node (VM).
     */
    @JsonProperty(value = "ephemeralOSDiskSettings")
    private DiffDiskSettings ephemeralOSDiskSettings;

    /**
     * Get specifies the ephemeral Disk Settings for the operating system disk used by the compute node (VM).
     *
     * @return the ephemeralOSDiskSettings value
     */
    public DiffDiskSettings ephemeralOSDiskSettings() {
        return this.ephemeralOSDiskSettings;
    }

    /**
     * Set specifies the ephemeral Disk Settings for the operating system disk used by the compute node (VM).
     *
     * @param ephemeralOSDiskSettings the ephemeralOSDiskSettings value to set
     * @return the OSDisk object itself.
     */
    public OSDisk withEphemeralOSDiskSettings(DiffDiskSettings ephemeralOSDiskSettings) {
        this.ephemeralOSDiskSettings = ephemeralOSDiskSettings;
        return this;
    }

}
