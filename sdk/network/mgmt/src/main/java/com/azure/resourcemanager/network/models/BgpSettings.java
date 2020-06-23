// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The BgpSettings model. */
@Fluent
public final class BgpSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BgpSettings.class);

    /*
     * The BGP speaker's ASN.
     */
    @JsonProperty(value = "asn")
    private Long asn;

    /*
     * The BGP peering address and BGP identifier of this BGP speaker.
     */
    @JsonProperty(value = "bgpPeeringAddress")
    private String bgpPeeringAddress;

    /*
     * The weight added to routes learned from this BGP speaker.
     */
    @JsonProperty(value = "peerWeight")
    private Integer peerWeight;

    /**
     * Get the asn property: The BGP speaker's ASN.
     *
     * @return the asn value.
     */
    public Long asn() {
        return this.asn;
    }

    /**
     * Set the asn property: The BGP speaker's ASN.
     *
     * @param asn the asn value to set.
     * @return the BgpSettings object itself.
     */
    public BgpSettings withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Get the bgpPeeringAddress property: The BGP peering address and BGP identifier of this BGP speaker.
     *
     * @return the bgpPeeringAddress value.
     */
    public String bgpPeeringAddress() {
        return this.bgpPeeringAddress;
    }

    /**
     * Set the bgpPeeringAddress property: The BGP peering address and BGP identifier of this BGP speaker.
     *
     * @param bgpPeeringAddress the bgpPeeringAddress value to set.
     * @return the BgpSettings object itself.
     */
    public BgpSettings withBgpPeeringAddress(String bgpPeeringAddress) {
        this.bgpPeeringAddress = bgpPeeringAddress;
        return this;
    }

    /**
     * Get the peerWeight property: The weight added to routes learned from this BGP speaker.
     *
     * @return the peerWeight value.
     */
    public Integer peerWeight() {
        return this.peerWeight;
    }

    /**
     * Set the peerWeight property: The weight added to routes learned from this BGP speaker.
     *
     * @param peerWeight the peerWeight value to set.
     * @return the BgpSettings object itself.
     */
    public BgpSettings withPeerWeight(Integer peerWeight) {
        this.peerWeight = peerWeight;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
