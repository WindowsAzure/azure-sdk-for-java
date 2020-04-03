// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ContainerMemoryStatistics model.
 */
@Fluent
public final class ContainerMemoryStatistics {
    /*
     * The usage property.
     */
    @JsonProperty(value = "usage")
    private Long usage;

    /*
     * The maxUsage property.
     */
    @JsonProperty(value = "maxUsage")
    private Long maxUsage;

    /*
     * The limit property.
     */
    @JsonProperty(value = "limit")
    private Long limit;

    /**
     * Get the usage property: The usage property.
     * 
     * @return the usage value.
     */
    public Long usage() {
        return this.usage;
    }

    /**
     * Set the usage property: The usage property.
     * 
     * @param usage the usage value to set.
     * @return the ContainerMemoryStatistics object itself.
     */
    public ContainerMemoryStatistics withUsage(Long usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get the maxUsage property: The maxUsage property.
     * 
     * @return the maxUsage value.
     */
    public Long maxUsage() {
        return this.maxUsage;
    }

    /**
     * Set the maxUsage property: The maxUsage property.
     * 
     * @param maxUsage the maxUsage value to set.
     * @return the ContainerMemoryStatistics object itself.
     */
    public ContainerMemoryStatistics withMaxUsage(Long maxUsage) {
        this.maxUsage = maxUsage;
        return this;
    }

    /**
     * Get the limit property: The limit property.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The limit property.
     * 
     * @param limit the limit value to set.
     * @return the ContainerMemoryStatistics object itself.
     */
    public ContainerMemoryStatistics withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
}
