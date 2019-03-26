/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway.v2019_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tracking courier information.
 */
public class TrackingInfo {
    /**
     * Serial number of the device being tracked.
     */
    @JsonProperty(value = "serialNumber")
    private String serialNumber;

    /**
     * Name of the carrier used in the delivery.
     */
    @JsonProperty(value = "carrierName")
    private String carrierName;

    /**
     * Tracking ID of the shipment.
     */
    @JsonProperty(value = "trackingId")
    private String trackingId;

    /**
     * Tracking URL of the shipment.
     */
    @JsonProperty(value = "trackingUrl")
    private String trackingUrl;

    /**
     * Get serial number of the device being tracked.
     *
     * @return the serialNumber value
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Set serial number of the device being tracked.
     *
     * @param serialNumber the serialNumber value to set
     * @return the TrackingInfo object itself.
     */
    public TrackingInfo withSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Get name of the carrier used in the delivery.
     *
     * @return the carrierName value
     */
    public String carrierName() {
        return this.carrierName;
    }

    /**
     * Set name of the carrier used in the delivery.
     *
     * @param carrierName the carrierName value to set
     * @return the TrackingInfo object itself.
     */
    public TrackingInfo withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    /**
     * Get tracking ID of the shipment.
     *
     * @return the trackingId value
     */
    public String trackingId() {
        return this.trackingId;
    }

    /**
     * Set tracking ID of the shipment.
     *
     * @param trackingId the trackingId value to set
     * @return the TrackingInfo object itself.
     */
    public TrackingInfo withTrackingId(String trackingId) {
        this.trackingId = trackingId;
        return this;
    }

    /**
     * Get tracking URL of the shipment.
     *
     * @return the trackingUrl value
     */
    public String trackingUrl() {
        return this.trackingUrl;
    }

    /**
     * Set tracking URL of the shipment.
     *
     * @param trackingUrl the trackingUrl value to set
     * @return the TrackingInfo object itself.
     */
    public TrackingInfo withTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

}
