/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BGP settings details.
 */
public class BgpSettings {
    /**
     * The BGP speaker's ASN.
     */
    @JsonProperty(value = "asn")
    private Long asn;

    /**
     * The BGP peering address and BGP identifier of this BGP speaker.
     */
    @JsonProperty(value = "bgpPeeringAddress")
    private String bgpPeeringAddress;

    /**
     * The weight added to routes learned from this BGP speaker.
     */
    @JsonProperty(value = "peerWeight")
    private Integer peerWeight;

    /**
     * BGP peering address with IP configuration ID for virtual network
     * gateway.
     */
    @JsonProperty(value = "bgpPeeringAddresses")
    private List<IPConfigurationBgpPeeringAddress> bgpPeeringAddresses;

    /**
     * Get the BGP speaker's ASN.
     *
     * @return the asn value
     */
    public Long asn() {
        return this.asn;
    }

    /**
     * Set the BGP speaker's ASN.
     *
     * @param asn the asn value to set
     * @return the BgpSettings object itself.
     */
    public BgpSettings withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Get the BGP peering address and BGP identifier of this BGP speaker.
     *
     * @return the bgpPeeringAddress value
     */
    public String bgpPeeringAddress() {
        return this.bgpPeeringAddress;
    }

    /**
     * Set the BGP peering address and BGP identifier of this BGP speaker.
     *
     * @param bgpPeeringAddress the bgpPeeringAddress value to set
     * @return the BgpSettings object itself.
     */
    public BgpSettings withBgpPeeringAddress(String bgpPeeringAddress) {
        this.bgpPeeringAddress = bgpPeeringAddress;
        return this;
    }

    /**
     * Get the weight added to routes learned from this BGP speaker.
     *
     * @return the peerWeight value
     */
    public Integer peerWeight() {
        return this.peerWeight;
    }

    /**
     * Set the weight added to routes learned from this BGP speaker.
     *
     * @param peerWeight the peerWeight value to set
     * @return the BgpSettings object itself.
     */
    public BgpSettings withPeerWeight(Integer peerWeight) {
        this.peerWeight = peerWeight;
        return this;
    }

    /**
     * Get bGP peering address with IP configuration ID for virtual network gateway.
     *
     * @return the bgpPeeringAddresses value
     */
    public List<IPConfigurationBgpPeeringAddress> bgpPeeringAddresses() {
        return this.bgpPeeringAddresses;
    }

    /**
     * Set bGP peering address with IP configuration ID for virtual network gateway.
     *
     * @param bgpPeeringAddresses the bgpPeeringAddresses value to set
     * @return the BgpSettings object itself.
     */
    public BgpSettings withBgpPeeringAddresses(List<IPConfigurationBgpPeeringAddress> bgpPeeringAddresses) {
        this.bgpPeeringAddresses = bgpPeeringAddresses;
        return this;
    }

}
