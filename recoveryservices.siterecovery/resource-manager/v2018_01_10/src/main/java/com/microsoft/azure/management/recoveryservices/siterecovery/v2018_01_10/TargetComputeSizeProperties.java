/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents applicable recovery vm sizes properties.
 */
public class TargetComputeSizeProperties {
    /**
     * Target compute size name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Target compute size display name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The maximum cpu cores count supported by target compute size.
     */
    @JsonProperty(value = "cpuCoresCount")
    private Integer cpuCoresCount;

    /**
     * The maximum memory in GB supported by target compute size.
     */
    @JsonProperty(value = "memoryInGB")
    private Double memoryInGB;

    /**
     * The maximum data disks count supported by target compute size.
     */
    @JsonProperty(value = "maxDataDiskCount")
    private Integer maxDataDiskCount;

    /**
     * The maximum Nics count supported by target compute size.
     */
    @JsonProperty(value = "maxNicsCount")
    private Integer maxNicsCount;

    /**
     * The reasons why the target compute size is not applicable for the
     * protected item.
     */
    @JsonProperty(value = "errors")
    private List<ComputeSizeErrorDetails> errors;

    /**
     * The value indicating whether the target compute size supports high Iops.
     */
    @JsonProperty(value = "highIopsSupported")
    private String highIopsSupported;

    /**
     * Get target compute size name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set target compute size name.
     *
     * @param name the name value to set
     * @return the TargetComputeSizeProperties object itself.
     */
    public TargetComputeSizeProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get target compute size display name.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set target compute size display name.
     *
     * @param friendlyName the friendlyName value to set
     * @return the TargetComputeSizeProperties object itself.
     */
    public TargetComputeSizeProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the maximum cpu cores count supported by target compute size.
     *
     * @return the cpuCoresCount value
     */
    public Integer cpuCoresCount() {
        return this.cpuCoresCount;
    }

    /**
     * Set the maximum cpu cores count supported by target compute size.
     *
     * @param cpuCoresCount the cpuCoresCount value to set
     * @return the TargetComputeSizeProperties object itself.
     */
    public TargetComputeSizeProperties withCpuCoresCount(Integer cpuCoresCount) {
        this.cpuCoresCount = cpuCoresCount;
        return this;
    }

    /**
     * Get the maximum memory in GB supported by target compute size.
     *
     * @return the memoryInGB value
     */
    public Double memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the maximum memory in GB supported by target compute size.
     *
     * @param memoryInGB the memoryInGB value to set
     * @return the TargetComputeSizeProperties object itself.
     */
    public TargetComputeSizeProperties withMemoryInGB(Double memoryInGB) {
        this.memoryInGB = memoryInGB;
        return this;
    }

    /**
     * Get the maximum data disks count supported by target compute size.
     *
     * @return the maxDataDiskCount value
     */
    public Integer maxDataDiskCount() {
        return this.maxDataDiskCount;
    }

    /**
     * Set the maximum data disks count supported by target compute size.
     *
     * @param maxDataDiskCount the maxDataDiskCount value to set
     * @return the TargetComputeSizeProperties object itself.
     */
    public TargetComputeSizeProperties withMaxDataDiskCount(Integer maxDataDiskCount) {
        this.maxDataDiskCount = maxDataDiskCount;
        return this;
    }

    /**
     * Get the maximum Nics count supported by target compute size.
     *
     * @return the maxNicsCount value
     */
    public Integer maxNicsCount() {
        return this.maxNicsCount;
    }

    /**
     * Set the maximum Nics count supported by target compute size.
     *
     * @param maxNicsCount the maxNicsCount value to set
     * @return the TargetComputeSizeProperties object itself.
     */
    public TargetComputeSizeProperties withMaxNicsCount(Integer maxNicsCount) {
        this.maxNicsCount = maxNicsCount;
        return this;
    }

    /**
     * Get the reasons why the target compute size is not applicable for the protected item.
     *
     * @return the errors value
     */
    public List<ComputeSizeErrorDetails> errors() {
        return this.errors;
    }

    /**
     * Set the reasons why the target compute size is not applicable for the protected item.
     *
     * @param errors the errors value to set
     * @return the TargetComputeSizeProperties object itself.
     */
    public TargetComputeSizeProperties withErrors(List<ComputeSizeErrorDetails> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the value indicating whether the target compute size supports high Iops.
     *
     * @return the highIopsSupported value
     */
    public String highIopsSupported() {
        return this.highIopsSupported;
    }

    /**
     * Set the value indicating whether the target compute size supports high Iops.
     *
     * @param highIopsSupported the highIopsSupported value to set
     * @return the TargetComputeSizeProperties object itself.
     */
    public TargetComputeSizeProperties withHighIopsSupported(String highIopsSupported) {
        this.highIopsSupported = highIopsSupported;
        return this;
    }

}
