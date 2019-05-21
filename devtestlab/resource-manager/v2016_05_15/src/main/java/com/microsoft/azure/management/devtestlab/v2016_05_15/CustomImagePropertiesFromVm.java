/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for creating a custom image from a virtual machine.
 */
public class CustomImagePropertiesFromVm {
    /**
     * The source vm identifier.
     */
    @JsonProperty(value = "sourceVmId")
    private String sourceVmId;

    /**
     * The Windows OS information of the VM.
     */
    @JsonProperty(value = "windowsOsInfo")
    private WindowsOsInfo windowsOsInfo;

    /**
     * The Linux OS information of the VM.
     */
    @JsonProperty(value = "linuxOsInfo")
    private LinuxOsInfo linuxOsInfo;

    /**
     * Get the source vm identifier.
     *
     * @return the sourceVmId value
     */
    public String sourceVmId() {
        return this.sourceVmId;
    }

    /**
     * Set the source vm identifier.
     *
     * @param sourceVmId the sourceVmId value to set
     * @return the CustomImagePropertiesFromVm object itself.
     */
    public CustomImagePropertiesFromVm withSourceVmId(String sourceVmId) {
        this.sourceVmId = sourceVmId;
        return this;
    }

    /**
     * Get the Windows OS information of the VM.
     *
     * @return the windowsOsInfo value
     */
    public WindowsOsInfo windowsOsInfo() {
        return this.windowsOsInfo;
    }

    /**
     * Set the Windows OS information of the VM.
     *
     * @param windowsOsInfo the windowsOsInfo value to set
     * @return the CustomImagePropertiesFromVm object itself.
     */
    public CustomImagePropertiesFromVm withWindowsOsInfo(WindowsOsInfo windowsOsInfo) {
        this.windowsOsInfo = windowsOsInfo;
        return this;
    }

    /**
     * Get the Linux OS information of the VM.
     *
     * @return the linuxOsInfo value
     */
    public LinuxOsInfo linuxOsInfo() {
        return this.linuxOsInfo;
    }

    /**
     * Set the Linux OS information of the VM.
     *
     * @param linuxOsInfo the linuxOsInfo value to set
     * @return the CustomImagePropertiesFromVm object itself.
     */
    public CustomImagePropertiesFromVm withLinuxOsInfo(LinuxOsInfo linuxOsInfo) {
        this.linuxOsInfo = linuxOsInfo;
        return this;
    }

}
