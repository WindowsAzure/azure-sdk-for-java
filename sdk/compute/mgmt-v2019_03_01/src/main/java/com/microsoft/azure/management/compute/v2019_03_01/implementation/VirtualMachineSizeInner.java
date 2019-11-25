/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the properties of a VM size.
 */
public class VirtualMachineSizeInner {
    /**
     * The name of the virtual machine size.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The number of cores supported by the virtual machine size.
     */
    @JsonProperty(value = "numberOfCores")
    private Integer numberOfCores;

    /**
     * The OS disk size, in MB, allowed by the virtual machine size.
     */
    @JsonProperty(value = "osDiskSizeInMB")
    private Integer osDiskSizeInMB;

    /**
     * The resource disk size, in MB, allowed by the virtual machine size.
     */
    @JsonProperty(value = "resourceDiskSizeInMB")
    private Integer resourceDiskSizeInMB;

    /**
     * The amount of memory, in MB, supported by the virtual machine size.
     */
    @JsonProperty(value = "memoryInMB")
    private Integer memoryInMB;

    /**
     * The maximum number of data disks that can be attached to the virtual
     * machine size.
     */
    @JsonProperty(value = "maxDataDiskCount")
    private Integer maxDataDiskCount;

    /**
     * Get the name of the virtual machine size.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the virtual machine size.
     *
     * @param name the name value to set
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the number of cores supported by the virtual machine size.
     *
     * @return the numberOfCores value
     */
    public Integer numberOfCores() {
        return this.numberOfCores;
    }

    /**
     * Set the number of cores supported by the virtual machine size.
     *
     * @param numberOfCores the numberOfCores value to set
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    /**
     * Get the OS disk size, in MB, allowed by the virtual machine size.
     *
     * @return the osDiskSizeInMB value
     */
    public Integer osDiskSizeInMB() {
        return this.osDiskSizeInMB;
    }

    /**
     * Set the OS disk size, in MB, allowed by the virtual machine size.
     *
     * @param osDiskSizeInMB the osDiskSizeInMB value to set
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withOsDiskSizeInMB(Integer osDiskSizeInMB) {
        this.osDiskSizeInMB = osDiskSizeInMB;
        return this;
    }

    /**
     * Get the resource disk size, in MB, allowed by the virtual machine size.
     *
     * @return the resourceDiskSizeInMB value
     */
    public Integer resourceDiskSizeInMB() {
        return this.resourceDiskSizeInMB;
    }

    /**
     * Set the resource disk size, in MB, allowed by the virtual machine size.
     *
     * @param resourceDiskSizeInMB the resourceDiskSizeInMB value to set
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withResourceDiskSizeInMB(Integer resourceDiskSizeInMB) {
        this.resourceDiskSizeInMB = resourceDiskSizeInMB;
        return this;
    }

    /**
     * Get the amount of memory, in MB, supported by the virtual machine size.
     *
     * @return the memoryInMB value
     */
    public Integer memoryInMB() {
        return this.memoryInMB;
    }

    /**
     * Set the amount of memory, in MB, supported by the virtual machine size.
     *
     * @param memoryInMB the memoryInMB value to set
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withMemoryInMB(Integer memoryInMB) {
        this.memoryInMB = memoryInMB;
        return this;
    }

    /**
     * Get the maximum number of data disks that can be attached to the virtual machine size.
     *
     * @return the maxDataDiskCount value
     */
    public Integer maxDataDiskCount() {
        return this.maxDataDiskCount;
    }

    /**
     * Set the maximum number of data disks that can be attached to the virtual machine size.
     *
     * @param maxDataDiskCount the maxDataDiskCount value to set
     * @return the VirtualMachineSizeInner object itself.
     */
    public VirtualMachineSizeInner withMaxDataDiskCount(Integer maxDataDiskCount) {
        this.maxDataDiskCount = maxDataDiskCount;
        return this;
    }

}
