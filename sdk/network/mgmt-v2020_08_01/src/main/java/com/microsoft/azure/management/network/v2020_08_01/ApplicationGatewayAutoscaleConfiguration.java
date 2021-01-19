/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application Gateway autoscale configuration.
 */
public class ApplicationGatewayAutoscaleConfiguration {
    /**
     * Lower bound on number of Application Gateway capacity.
     */
    @JsonProperty(value = "minCapacity", required = true)
    private int minCapacity;

    /**
     * Upper bound on number of Application Gateway capacity.
     */
    @JsonProperty(value = "maxCapacity")
    private Integer maxCapacity;

    /**
     * Get lower bound on number of Application Gateway capacity.
     *
     * @return the minCapacity value
     */
    public int minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set lower bound on number of Application Gateway capacity.
     *
     * @param minCapacity the minCapacity value to set
     * @return the ApplicationGatewayAutoscaleConfiguration object itself.
     */
    public ApplicationGatewayAutoscaleConfiguration withMinCapacity(int minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get upper bound on number of Application Gateway capacity.
     *
     * @return the maxCapacity value
     */
    public Integer maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * Set upper bound on number of Application Gateway capacity.
     *
     * @param maxCapacity the maxCapacity value to set
     * @return the ApplicationGatewayAutoscaleConfiguration object itself.
     */
    public ApplicationGatewayAutoscaleConfiguration withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

}
