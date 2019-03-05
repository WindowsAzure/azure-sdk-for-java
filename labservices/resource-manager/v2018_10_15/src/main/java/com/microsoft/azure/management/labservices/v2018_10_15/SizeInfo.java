/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains detailed information about a size.
 */
public class SizeInfo {
    /**
     * Represents the actual compute size, e.g. Standard_A2_v2.
     */
    @JsonProperty(value = "computeSize")
    private String computeSize;

    /**
     * The pay-as-you-go price per hour this size will cost. It does not
     * include discounts and may not reflect the actual price the size will
     * cost.
     */
    @JsonProperty(value = "price")
    private BigDecimal price;

    /**
     * The number of cores a VM of this size has.
     */
    @JsonProperty(value = "numberOfCores")
    private Integer numberOfCores;

    /**
     * The amount of memory available (in GB).
     */
    @JsonProperty(value = "memory")
    private Double memory;

    /**
     * Get represents the actual compute size, e.g. Standard_A2_v2.
     *
     * @return the computeSize value
     */
    public String computeSize() {
        return this.computeSize;
    }

    /**
     * Set represents the actual compute size, e.g. Standard_A2_v2.
     *
     * @param computeSize the computeSize value to set
     * @return the SizeInfo object itself.
     */
    public SizeInfo withComputeSize(String computeSize) {
        this.computeSize = computeSize;
        return this;
    }

    /**
     * Get the pay-as-you-go price per hour this size will cost. It does not include discounts and may not reflect the actual price the size will cost.
     *
     * @return the price value
     */
    public BigDecimal price() {
        return this.price;
    }

    /**
     * Set the pay-as-you-go price per hour this size will cost. It does not include discounts and may not reflect the actual price the size will cost.
     *
     * @param price the price value to set
     * @return the SizeInfo object itself.
     */
    public SizeInfo withPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Get the number of cores a VM of this size has.
     *
     * @return the numberOfCores value
     */
    public Integer numberOfCores() {
        return this.numberOfCores;
    }

    /**
     * Set the number of cores a VM of this size has.
     *
     * @param numberOfCores the numberOfCores value to set
     * @return the SizeInfo object itself.
     */
    public SizeInfo withNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    /**
     * Get the amount of memory available (in GB).
     *
     * @return the memory value
     */
    public Double memory() {
        return this.memory;
    }

    /**
     * Set the amount of memory available (in GB).
     *
     * @param memory the memory value to set
     * @return the SizeInfo object itself.
     */
    public SizeInfo withMemory(Double memory) {
        this.memory = memory;
        return this;
    }

}
