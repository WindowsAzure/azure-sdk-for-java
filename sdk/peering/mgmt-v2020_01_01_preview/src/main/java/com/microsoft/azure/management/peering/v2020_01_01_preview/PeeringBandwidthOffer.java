/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that define a peering bandwidth offer.
 */
public class PeeringBandwidthOffer {
    /**
     * The name of the bandwidth offer.
     */
    @JsonProperty(value = "offerName")
    private String offerName;

    /**
     * The value of the bandwidth offer in Mbps.
     */
    @JsonProperty(value = "valueInMbps")
    private Integer valueInMbps;

    /**
     * Get the name of the bandwidth offer.
     *
     * @return the offerName value
     */
    public String offerName() {
        return this.offerName;
    }

    /**
     * Set the name of the bandwidth offer.
     *
     * @param offerName the offerName value to set
     * @return the PeeringBandwidthOffer object itself.
     */
    public PeeringBandwidthOffer withOfferName(String offerName) {
        this.offerName = offerName;
        return this;
    }

    /**
     * Get the value of the bandwidth offer in Mbps.
     *
     * @return the valueInMbps value
     */
    public Integer valueInMbps() {
        return this.valueInMbps;
    }

    /**
     * Set the value of the bandwidth offer in Mbps.
     *
     * @param valueInMbps the valueInMbps value to set
     * @return the PeeringBandwidthOffer object itself.
     */
    public PeeringBandwidthOffer withValueInMbps(Integer valueInMbps) {
        this.valueInMbps = valueInMbps;
        return this;
    }

}
