/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.management.appservice.v2016_09_01.ComputeModeOptions;
import com.microsoft.azure.management.appservice.v2016_09_01.WorkerSizeOptions;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Stamp capacity information.
 */
public class StampCapacityInner {
    /**
     * Name of the stamp.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Available capacity (# of machines, bytes of storage etc...).
     */
    @JsonProperty(value = "availableCapacity")
    private Long availableCapacity;

    /**
     * Total capacity (# of machines, bytes of storage etc...).
     */
    @JsonProperty(value = "totalCapacity")
    private Long totalCapacity;

    /**
     * Name of the unit.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Shared/dedicated workers. Possible values include: 'Shared',
     * 'Dedicated', 'Dynamic'.
     */
    @JsonProperty(value = "computeMode")
    private ComputeModeOptions computeMode;

    /**
     * Size of the machines. Possible values include: 'Default', 'Small',
     * 'Medium', 'Large', 'D1', 'D2', 'D3'.
     */
    @JsonProperty(value = "workerSize")
    private WorkerSizeOptions workerSize;

    /**
     * Size ID of machines:
     * 0 - Small
     * 1 - Medium
     * 2 - Large.
     */
    @JsonProperty(value = "workerSizeId")
    private Integer workerSizeId;

    /**
     * If &lt;code&gt;true&lt;/code&gt;, it includes basic apps.
     * Basic apps are not used for capacity allocation.
     */
    @JsonProperty(value = "excludeFromCapacityAllocation")
    private Boolean excludeFromCapacityAllocation;

    /**
     * &lt;code&gt;true&lt;/code&gt; if capacity is applicable for all apps;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     */
    @JsonProperty(value = "isApplicableForAllComputeModes")
    private Boolean isApplicableForAllComputeModes;

    /**
     * Shared or Dedicated.
     */
    @JsonProperty(value = "siteMode")
    private String siteMode;

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
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the availableCapacity value.
     *
     * @return the availableCapacity value
     */
    public Long availableCapacity() {
        return this.availableCapacity;
    }

    /**
     * Set the availableCapacity value.
     *
     * @param availableCapacity the availableCapacity value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withAvailableCapacity(Long availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }

    /**
     * Get the totalCapacity value.
     *
     * @return the totalCapacity value
     */
    public Long totalCapacity() {
        return this.totalCapacity;
    }

    /**
     * Set the totalCapacity value.
     *
     * @param totalCapacity the totalCapacity value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withTotalCapacity(Long totalCapacity) {
        this.totalCapacity = totalCapacity;
        return this;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit value.
     *
     * @param unit the unit value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the computeMode value.
     *
     * @return the computeMode value
     */
    public ComputeModeOptions computeMode() {
        return this.computeMode;
    }

    /**
     * Set the computeMode value.
     *
     * @param computeMode the computeMode value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withComputeMode(ComputeModeOptions computeMode) {
        this.computeMode = computeMode;
        return this;
    }

    /**
     * Get the workerSize value.
     *
     * @return the workerSize value
     */
    public WorkerSizeOptions workerSize() {
        return this.workerSize;
    }

    /**
     * Set the workerSize value.
     *
     * @param workerSize the workerSize value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withWorkerSize(WorkerSizeOptions workerSize) {
        this.workerSize = workerSize;
        return this;
    }

    /**
     * Get the workerSizeId value.
     *
     * @return the workerSizeId value
     */
    public Integer workerSizeId() {
        return this.workerSizeId;
    }

    /**
     * Set the workerSizeId value.
     *
     * @param workerSizeId the workerSizeId value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withWorkerSizeId(Integer workerSizeId) {
        this.workerSizeId = workerSizeId;
        return this;
    }

    /**
     * Get the excludeFromCapacityAllocation value.
     *
     * @return the excludeFromCapacityAllocation value
     */
    public Boolean excludeFromCapacityAllocation() {
        return this.excludeFromCapacityAllocation;
    }

    /**
     * Set the excludeFromCapacityAllocation value.
     *
     * @param excludeFromCapacityAllocation the excludeFromCapacityAllocation value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withExcludeFromCapacityAllocation(Boolean excludeFromCapacityAllocation) {
        this.excludeFromCapacityAllocation = excludeFromCapacityAllocation;
        return this;
    }

    /**
     * Get the isApplicableForAllComputeModes value.
     *
     * @return the isApplicableForAllComputeModes value
     */
    public Boolean isApplicableForAllComputeModes() {
        return this.isApplicableForAllComputeModes;
    }

    /**
     * Set the isApplicableForAllComputeModes value.
     *
     * @param isApplicableForAllComputeModes the isApplicableForAllComputeModes value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withIsApplicableForAllComputeModes(Boolean isApplicableForAllComputeModes) {
        this.isApplicableForAllComputeModes = isApplicableForAllComputeModes;
        return this;
    }

    /**
     * Get the siteMode value.
     *
     * @return the siteMode value
     */
    public String siteMode() {
        return this.siteMode;
    }

    /**
     * Set the siteMode value.
     *
     * @param siteMode the siteMode value to set
     * @return the StampCapacityInner object itself.
     */
    public StampCapacityInner withSiteMode(String siteMode) {
        this.siteMode = siteMode;
        return this;
    }

}
