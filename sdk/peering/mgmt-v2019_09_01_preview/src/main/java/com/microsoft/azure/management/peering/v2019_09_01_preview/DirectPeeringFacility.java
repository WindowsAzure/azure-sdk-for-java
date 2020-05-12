/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties that define a direct peering facility.
 */
public class DirectPeeringFacility {
    /**
     * The address of the direct peering facility.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * The type of the direct peering. Possible values include: 'Edge',
     * 'Transit', 'Cdn', 'Internal'.
     */
    @JsonProperty(value = "directPeeringType")
    private DirectPeeringType directPeeringType;

    /**
     * The PeeringDB.com ID of the facility.
     */
    @JsonProperty(value = "peeringDBFacilityId")
    private Integer peeringDBFacilityId;

    /**
     * The PeeringDB.com URL of the facility.
     */
    @JsonProperty(value = "peeringDBFacilityLink")
    private String peeringDBFacilityLink;

    /**
     * Get the address of the direct peering facility.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address of the direct peering facility.
     *
     * @param address the address value to set
     * @return the DirectPeeringFacility object itself.
     */
    public DirectPeeringFacility withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the type of the direct peering. Possible values include: 'Edge', 'Transit', 'Cdn', 'Internal'.
     *
     * @return the directPeeringType value
     */
    public DirectPeeringType directPeeringType() {
        return this.directPeeringType;
    }

    /**
     * Set the type of the direct peering. Possible values include: 'Edge', 'Transit', 'Cdn', 'Internal'.
     *
     * @param directPeeringType the directPeeringType value to set
     * @return the DirectPeeringFacility object itself.
     */
    public DirectPeeringFacility withDirectPeeringType(DirectPeeringType directPeeringType) {
        this.directPeeringType = directPeeringType;
        return this;
    }

    /**
     * Get the PeeringDB.com ID of the facility.
     *
     * @return the peeringDBFacilityId value
     */
    public Integer peeringDBFacilityId() {
        return this.peeringDBFacilityId;
    }

    /**
     * Set the PeeringDB.com ID of the facility.
     *
     * @param peeringDBFacilityId the peeringDBFacilityId value to set
     * @return the DirectPeeringFacility object itself.
     */
    public DirectPeeringFacility withPeeringDBFacilityId(Integer peeringDBFacilityId) {
        this.peeringDBFacilityId = peeringDBFacilityId;
        return this;
    }

    /**
     * Get the PeeringDB.com URL of the facility.
     *
     * @return the peeringDBFacilityLink value
     */
    public String peeringDBFacilityLink() {
        return this.peeringDBFacilityLink;
    }

    /**
     * Set the PeeringDB.com URL of the facility.
     *
     * @param peeringDBFacilityLink the peeringDBFacilityLink value to set
     * @return the DirectPeeringFacility object itself.
     */
    public DirectPeeringFacility withPeeringDBFacilityLink(String peeringDBFacilityLink) {
        this.peeringDBFacilityLink = peeringDBFacilityLink;
        return this;
    }

}
