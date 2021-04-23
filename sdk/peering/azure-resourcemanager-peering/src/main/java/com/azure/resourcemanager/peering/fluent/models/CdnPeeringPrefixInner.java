// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CDN peering prefix. */
@JsonFlatten
@Immutable
public class CdnPeeringPrefixInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CdnPeeringPrefixInner.class);

    /*
     * The prefix.
     */
    @JsonProperty(value = "properties.prefix", access = JsonProperty.Access.WRITE_ONLY)
    private String prefix;

    /*
     * The Azure region.
     */
    @JsonProperty(value = "properties.azureRegion", access = JsonProperty.Access.WRITE_ONLY)
    private String azureRegion;

    /*
     * The Azure service.
     */
    @JsonProperty(value = "properties.azureService", access = JsonProperty.Access.WRITE_ONLY)
    private String azureService;

    /*
     * The flag that indicates whether or not this is the primary region.
     */
    @JsonProperty(value = "properties.isPrimaryRegion", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPrimaryRegion;

    /*
     * The BGP Community
     */
    @JsonProperty(value = "properties.bgpCommunity", access = JsonProperty.Access.WRITE_ONLY)
    private String bgpCommunity;

    /**
     * Get the prefix property: The prefix.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Get the azureRegion property: The Azure region.
     *
     * @return the azureRegion value.
     */
    public String azureRegion() {
        return this.azureRegion;
    }

    /**
     * Get the azureService property: The Azure service.
     *
     * @return the azureService value.
     */
    public String azureService() {
        return this.azureService;
    }

    /**
     * Get the isPrimaryRegion property: The flag that indicates whether or not this is the primary region.
     *
     * @return the isPrimaryRegion value.
     */
    public Boolean isPrimaryRegion() {
        return this.isPrimaryRegion;
    }

    /**
     * Get the bgpCommunity property: The BGP Community.
     *
     * @return the bgpCommunity value.
     */
    public String bgpCommunity() {
        return this.bgpCommunity;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
