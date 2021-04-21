// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databox.models.ScheduleAvailabilityResponse;
import com.azure.resourcemanager.databox.models.TransportAvailabilityResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration response specific to a region. */
@Immutable
public final class RegionConfigurationResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegionConfigurationResponseInner.class);

    /*
     * Schedule availability for given sku in a region.
     */
    @JsonProperty(value = "scheduleAvailabilityResponse", access = JsonProperty.Access.WRITE_ONLY)
    private ScheduleAvailabilityResponse scheduleAvailabilityResponse;

    /*
     * Transport options available for given sku in a region.
     */
    @JsonProperty(value = "transportAvailabilityResponse", access = JsonProperty.Access.WRITE_ONLY)
    private TransportAvailabilityResponse transportAvailabilityResponse;

    /**
     * Get the scheduleAvailabilityResponse property: Schedule availability for given sku in a region.
     *
     * @return the scheduleAvailabilityResponse value.
     */
    public ScheduleAvailabilityResponse scheduleAvailabilityResponse() {
        return this.scheduleAvailabilityResponse;
    }

    /**
     * Get the transportAvailabilityResponse property: Transport options available for given sku in a region.
     *
     * @return the transportAvailabilityResponse value.
     */
    public TransportAvailabilityResponse transportAvailabilityResponse() {
        return this.transportAvailabilityResponse;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scheduleAvailabilityResponse() != null) {
            scheduleAvailabilityResponse().validate();
        }
        if (transportAvailabilityResponse() != null) {
            transportAvailabilityResponse().validate();
        }
    }
}
