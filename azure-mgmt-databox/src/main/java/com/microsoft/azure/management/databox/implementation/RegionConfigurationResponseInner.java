/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.implementation;

import com.microsoft.azure.management.databox.ScheduleAvailabilityResponse;
import com.microsoft.azure.management.databox.TransportAvailabilityResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration response specific to a region.
 */
public class RegionConfigurationResponseInner {
    /**
     * Schedule availability for given sku in a region.
     */
    @JsonProperty(value = "scheduleAvailabilityResponse", access = JsonProperty.Access.WRITE_ONLY)
    private ScheduleAvailabilityResponse scheduleAvailabilityResponse;

    /**
     * Transport options available for given sku in a region.
     */
    @JsonProperty(value = "transportAvailabilityResponse", access = JsonProperty.Access.WRITE_ONLY)
    private TransportAvailabilityResponse transportAvailabilityResponse;

    /**
     * Get schedule availability for given sku in a region.
     *
     * @return the scheduleAvailabilityResponse value
     */
    public ScheduleAvailabilityResponse scheduleAvailabilityResponse() {
        return this.scheduleAvailabilityResponse;
    }

    /**
     * Get transport options available for given sku in a region.
     *
     * @return the transportAvailabilityResponse value
     */
    public TransportAvailabilityResponse transportAvailabilityResponse() {
        return this.transportAvailabilityResponse;
    }

}
