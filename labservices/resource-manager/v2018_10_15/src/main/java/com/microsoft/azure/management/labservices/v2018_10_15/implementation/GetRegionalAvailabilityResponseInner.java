/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15.implementation;

import java.util.List;
import com.microsoft.azure.management.labservices.v2018_10_15.RegionalAvailability;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response model from the GetRegionalAvailability action.
 */
public class GetRegionalAvailabilityResponseInner {
    /**
     * Availability information for different size categories per region.
     */
    @JsonProperty(value = "regionalAvailability")
    private List<RegionalAvailability> regionalAvailability;

    /**
     * Get availability information for different size categories per region.
     *
     * @return the regionalAvailability value
     */
    public List<RegionalAvailability> regionalAvailability() {
        return this.regionalAvailability;
    }

    /**
     * Set availability information for different size categories per region.
     *
     * @param regionalAvailability the regionalAvailability value to set
     * @return the GetRegionalAvailabilityResponseInner object itself.
     */
    public GetRegionalAvailabilityResponseInner withRegionalAvailability(List<RegionalAvailability> regionalAvailability) {
        this.regionalAvailability = regionalAvailability;
        return this;
    }

}
