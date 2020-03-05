/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourceSkuLocationInfo model.
 */
public class ResourceSkuLocationInfo {
    /**
     * Location of the SKU.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * List of availability zones where the SKU is supported.
     */
    @JsonProperty(value = "zones", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> zones;

    /**
     * Details of capabilities available to a SKU in specific zones.
     */
    @JsonProperty(value = "zoneDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceSkuZoneDetails> zoneDetails;

    /**
     * Get location of the SKU.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get list of availability zones where the SKU is supported.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Get details of capabilities available to a SKU in specific zones.
     *
     * @return the zoneDetails value
     */
    public List<ResourceSkuZoneDetails> zoneDetails() {
        return this.zoneDetails;
    }

}
