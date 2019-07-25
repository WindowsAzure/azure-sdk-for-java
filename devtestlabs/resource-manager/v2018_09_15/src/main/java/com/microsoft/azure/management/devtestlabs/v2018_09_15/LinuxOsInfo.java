/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a Linux OS.
 */
public class LinuxOsInfo {
    /**
     * The state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested,
     * DeprovisionApplied). Possible values include: 'NonDeprovisioned',
     * 'DeprovisionRequested', 'DeprovisionApplied'.
     */
    @JsonProperty(value = "linuxOsState")
    private LinuxOsState linuxOsState;

    /**
     * Get the state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied). Possible values include: 'NonDeprovisioned', 'DeprovisionRequested', 'DeprovisionApplied'.
     *
     * @return the linuxOsState value
     */
    public LinuxOsState linuxOsState() {
        return this.linuxOsState;
    }

    /**
     * Set the state of the Linux OS (i.e. NonDeprovisioned, DeprovisionRequested, DeprovisionApplied). Possible values include: 'NonDeprovisioned', 'DeprovisionRequested', 'DeprovisionApplied'.
     *
     * @param linuxOsState the linuxOsState value to set
     * @return the LinuxOsInfo object itself.
     */
    public LinuxOsInfo withLinuxOsState(LinuxOsState linuxOsState) {
        this.linuxOsState = linuxOsState;
        return this;
    }

}
