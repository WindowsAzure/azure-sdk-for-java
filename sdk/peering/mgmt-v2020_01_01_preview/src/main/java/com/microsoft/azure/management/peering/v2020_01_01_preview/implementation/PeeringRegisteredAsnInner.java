/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_01_01_preview.implementation;

import com.microsoft.azure.management.peering.v2020_01_01_preview.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The customer's ASN that is registered by the peering service provider.
 */
@JsonFlatten
public class PeeringRegisteredAsnInner extends ProxyResource {
    /**
     * The customer's ASN from which traffic originates.
     */
    @JsonProperty(value = "properties.asn")
    private Integer asn;

    /**
     * The peering service prefix key that is to be shared with the customer.
     */
    @JsonProperty(value = "properties.peeringServicePrefixKey", access = JsonProperty.Access.WRITE_ONLY)
    private String peeringServicePrefixKey;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the customer's ASN from which traffic originates.
     *
     * @return the asn value
     */
    public Integer asn() {
        return this.asn;
    }

    /**
     * Set the customer's ASN from which traffic originates.
     *
     * @param asn the asn value to set
     * @return the PeeringRegisteredAsnInner object itself.
     */
    public PeeringRegisteredAsnInner withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }

    /**
     * Get the peering service prefix key that is to be shared with the customer.
     *
     * @return the peeringServicePrefixKey value
     */
    public String peeringServicePrefixKey() {
        return this.peeringServicePrefixKey;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
