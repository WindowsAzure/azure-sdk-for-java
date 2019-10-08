/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BGP settings details for a link.
 */
public class VpnLinkBgpSettings {
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
     * @return the VpnLinkBgpSettings object itself.
     */
    public VpnLinkBgpSettings withAsn(Long asn) {
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
     * @return the VpnLinkBgpSettings object itself.
     */
    public VpnLinkBgpSettings withBgpPeeringAddress(String bgpPeeringAddress) {
        this.bgpPeeringAddress = bgpPeeringAddress;
        return this;
    }

}
