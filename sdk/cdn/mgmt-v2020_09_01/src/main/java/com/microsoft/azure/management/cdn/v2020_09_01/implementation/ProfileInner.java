/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.Sku;
import com.microsoft.azure.management.cdn.v2020_09_01.ProfileResourceState;
import com.microsoft.azure.management.cdn.v2020_09_01.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * CDN profile is a logical grouping of endpoints that share the same settings,
 * such as CDN provider and pricing tier.
 */
@JsonFlatten
public class ProfileInner extends Resource {
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the
     * CDN profile.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /**
     * Resource status of the profile. Possible values include: 'Creating',
     * 'Active', 'Deleting', 'Disabled'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private ProfileResourceState resourceState;

    /**
     * Provisioning status of the profile.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The Id of the frontdoor.
     */
    @JsonProperty(value = "properties.frontdoorId", access = JsonProperty.Access.WRITE_ONLY)
    private String frontdoorId;

    /**
     * The systemData property.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     *
     * @param sku the sku value to set
     * @return the ProfileInner object itself.
     */
    public ProfileInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get resource status of the profile. Possible values include: 'Creating', 'Active', 'Deleting', 'Disabled'.
     *
     * @return the resourceState value
     */
    public ProfileResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get provisioning status of the profile.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the Id of the frontdoor.
     *
     * @return the frontdoorId value
     */
    public String frontdoorId() {
        return this.frontdoorId;
    }

    /**
     * Get the systemData value.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

}
