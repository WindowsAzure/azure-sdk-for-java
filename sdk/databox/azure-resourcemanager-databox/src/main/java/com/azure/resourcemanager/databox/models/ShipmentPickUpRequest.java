// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Shipment pick up request details. */
@Fluent
public final class ShipmentPickUpRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ShipmentPickUpRequest.class);

    /*
     * Minimum date after which the pick up should commence, this must be in
     * local time of pick up area.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * Maximum date before which the pick up should commence, this must be in
     * local time of pick up area.
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /*
     * Shipment Location in the pickup place. Eg.front desk
     */
    @JsonProperty(value = "shipmentLocation", required = true)
    private String shipmentLocation;

    /**
     * Get the startTime property: Minimum date after which the pick up should commence, this must be in local time of
     * pick up area.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Minimum date after which the pick up should commence, this must be in local time of
     * pick up area.
     *
     * @param startTime the startTime value to set.
     * @return the ShipmentPickUpRequest object itself.
     */
    public ShipmentPickUpRequest withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: Maximum date before which the pick up should commence, this must be in local time of
     * pick up area.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: Maximum date before which the pick up should commence, this must be in local time of
     * pick up area.
     *
     * @param endTime the endTime value to set.
     * @return the ShipmentPickUpRequest object itself.
     */
    public ShipmentPickUpRequest withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the shipmentLocation property: Shipment Location in the pickup place. Eg.front desk.
     *
     * @return the shipmentLocation value.
     */
    public String shipmentLocation() {
        return this.shipmentLocation;
    }

    /**
     * Set the shipmentLocation property: Shipment Location in the pickup place. Eg.front desk.
     *
     * @param shipmentLocation the shipmentLocation value to set.
     * @return the ShipmentPickUpRequest object itself.
     */
    public ShipmentPickUpRequest withShipmentLocation(String shipmentLocation) {
        this.shipmentLocation = shipmentLocation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startTime() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property startTime in model ShipmentPickUpRequest"));
        }
        if (endTime() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property endTime in model ShipmentPickUpRequest"));
        }
        if (shipmentLocation() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property shipmentLocation in model ShipmentPickUpRequest"));
        }
    }
}
