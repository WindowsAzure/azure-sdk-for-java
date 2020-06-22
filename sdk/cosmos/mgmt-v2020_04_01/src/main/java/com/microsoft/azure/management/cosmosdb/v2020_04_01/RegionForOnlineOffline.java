/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB region to online or offline.
 */
public class RegionForOnlineOffline {
    /**
     * Cosmos DB region, with spaces between words and each word capitalized.
     */
    @JsonProperty(value = "region", required = true)
    private String region;

    /**
     * Get cosmos DB region, with spaces between words and each word capitalized.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Set cosmos DB region, with spaces between words and each word capitalized.
     *
     * @param region the region value to set
     * @return the RegionForOnlineOffline object itself.
     */
    public RegionForOnlineOffline withRegion(String region) {
        this.region = region;
        return this;
    }

}
