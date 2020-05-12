/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_04_01.implementation;

import com.microsoft.azure.management.peering.v2020_04_01.PeeringServiceSku;
import com.microsoft.azure.management.peering.v2020_04_01.ProvisioningState;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Peering Service.
 */
@JsonFlatten
public class PeeringServiceInner extends ProxyResource {
    /**
     * The SKU that defines the type of the peering service.
     */
    @JsonProperty(value = "sku")
    private PeeringServiceSku sku;

    /**
     * The PeeringServiceLocation of the Customer.
     */
    @JsonProperty(value = "properties.peeringServiceLocation")
    private String peeringServiceLocation;

    /**
     * The MAPS Provider Name.
     */
    @JsonProperty(value = "properties.peeringServiceProvider")
    private String peeringServiceProvider;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the SKU that defines the type of the peering service.
     *
     * @return the sku value
     */
    public PeeringServiceSku sku() {
        return this.sku;
    }

    /**
     * Set the SKU that defines the type of the peering service.
     *
     * @param sku the sku value to set
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withSku(PeeringServiceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the PeeringServiceLocation of the Customer.
     *
     * @return the peeringServiceLocation value
     */
    public String peeringServiceLocation() {
        return this.peeringServiceLocation;
    }

    /**
     * Set the PeeringServiceLocation of the Customer.
     *
     * @param peeringServiceLocation the peeringServiceLocation value to set
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withPeeringServiceLocation(String peeringServiceLocation) {
        this.peeringServiceLocation = peeringServiceLocation;
        return this;
    }

    /**
     * Get the MAPS Provider Name.
     *
     * @return the peeringServiceProvider value
     */
    public String peeringServiceProvider() {
        return this.peeringServiceProvider;
    }

    /**
     * Set the MAPS Provider Name.
     *
     * @param peeringServiceProvider the peeringServiceProvider value to set
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withPeeringServiceProvider(String peeringServiceProvider) {
        this.peeringServiceProvider = peeringServiceProvider;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the resource.
     *
     * @param location the location value to set
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the resource tags.
     *
     * @param tags the tags value to set
     * @return the PeeringServiceInner object itself.
     */
    public PeeringServiceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
