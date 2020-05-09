/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2019-09-16;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings for the Cosmos DB database backing the service.
 */
public class ServiceCosmosDbConfigurationInfo {
    /**
     * The provisioned throughput for the backing database.
     */
    @JsonProperty(value = "offerThroughput")
    private Integer offerThroughput;

    /**
     * Get the provisioned throughput for the backing database.
     *
     * @return the offerThroughput value
     */
    public Integer offerThroughput() {
        return this.offerThroughput;
    }

    /**
     * Set the provisioned throughput for the backing database.
     *
     * @param offerThroughput the offerThroughput value to set
     * @return the ServiceCosmosDbConfigurationInfo object itself.
     */
    public ServiceCosmosDbConfigurationInfo withOfferThroughput(Integer offerThroughput) {
        this.offerThroughput = offerThroughput;
        return this;
    }

}
