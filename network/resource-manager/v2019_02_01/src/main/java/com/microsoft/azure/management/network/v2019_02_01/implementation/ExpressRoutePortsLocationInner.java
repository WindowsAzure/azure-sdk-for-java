/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_02_01.ExpressRoutePortsLocationBandwidths;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * ExpressRoutePorts Peering Location.
 * Definition of the ExpressRoutePorts peering location resource.
 */
@JsonFlatten
@SkipParentValidation
public class ExpressRoutePortsLocationInner extends Resource {
    /**
     * Address of peering location.
     */
    @JsonProperty(value = "properties.address", access = JsonProperty.Access.WRITE_ONLY)
    private String address;

    /**
     * Contact details of peering locations.
     */
    @JsonProperty(value = "properties.contact", access = JsonProperty.Access.WRITE_ONLY)
    private String contact;

    /**
     * The inventory of available ExpressRoutePort bandwidths.
     */
    @JsonProperty(value = "properties.availableBandwidths")
    private List<ExpressRoutePortsLocationBandwidths> availableBandwidths;

    /**
     * The provisioning state of the ExpressRoutePortLocation resource.
     * Possible values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get address of peering location.
     *
     * @return the address value
     */
    public String address() {
        return this.address;
    }

    /**
     * Get contact details of peering locations.
     *
     * @return the contact value
     */
    public String contact() {
        return this.contact;
    }

    /**
     * Get the inventory of available ExpressRoutePort bandwidths.
     *
     * @return the availableBandwidths value
     */
    public List<ExpressRoutePortsLocationBandwidths> availableBandwidths() {
        return this.availableBandwidths;
    }

    /**
     * Set the inventory of available ExpressRoutePort bandwidths.
     *
     * @param availableBandwidths the availableBandwidths value to set
     * @return the ExpressRoutePortsLocationInner object itself.
     */
    public ExpressRoutePortsLocationInner withAvailableBandwidths(List<ExpressRoutePortsLocationBandwidths> availableBandwidths) {
        this.availableBandwidths = availableBandwidths;
        return this;
    }

    /**
     * Get the provisioning state of the ExpressRoutePortLocation resource. Possible values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the ExpressRoutePortsLocationInner object itself.
     */
    public ExpressRoutePortsLocationInner withId(String id) {
        this.id = id;
        return this;
    }

}
