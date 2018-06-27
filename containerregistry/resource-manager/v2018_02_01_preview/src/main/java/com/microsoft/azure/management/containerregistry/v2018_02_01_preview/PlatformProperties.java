/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The platform properties against which the build has to happen.
 */
public class PlatformProperties {
    /**
     * The operating system type required for the build. Possible values
     * include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "osType", required = true)
    private OsType osType;

    /**
     * The CPU configuration in terms of number of cores required for the
     * build.
     */
    @JsonProperty(value = "cpu")
    private Integer cpu;

    /**
     * Get the operating system type required for the build. Possible values include: 'Windows', 'Linux'.
     *
     * @return the osType value
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Set the operating system type required for the build. Possible values include: 'Windows', 'Linux'.
     *
     * @param osType the osType value to set
     * @return the PlatformProperties object itself.
     */
    public PlatformProperties withOsType(OsType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the CPU configuration in terms of number of cores required for the build.
     *
     * @return the cpu value
     */
    public Integer cpu() {
        return this.cpu;
    }

    /**
     * Set the CPU configuration in terms of number of cores required for the build.
     *
     * @param cpu the cpu value to set
     * @return the PlatformProperties object itself.
     */
    public PlatformProperties withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

}
