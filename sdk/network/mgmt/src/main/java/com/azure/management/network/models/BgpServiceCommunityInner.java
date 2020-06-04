// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.network.BgpCommunity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The BgpServiceCommunity model. */
@JsonFlatten
@Fluent
public class BgpServiceCommunityInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BgpServiceCommunityInner.class);

    /*
     * The name of the bgp community. e.g. Skype.
     */
    @JsonProperty(value = "properties.serviceName")
    private String serviceName;

    /*
     * Get a list of bgp communities.
     */
    @JsonProperty(value = "properties.bgpCommunities")
    private List<BgpCommunity> bgpCommunities;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the serviceName property: The name of the bgp community. e.g. Skype.
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the bgp community. e.g. Skype.
     *
     * @param serviceName the serviceName value to set.
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the bgpCommunities property: Get a list of bgp communities.
     *
     * @return the bgpCommunities value.
     */
    public List<BgpCommunity> bgpCommunities() {
        return this.bgpCommunities;
    }

    /**
     * Set the bgpCommunities property: Get a list of bgp communities.
     *
     * @param bgpCommunities the bgpCommunities value to set.
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withBgpCommunities(List<BgpCommunity> bgpCommunities) {
        this.bgpCommunities = bgpCommunities;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the BgpServiceCommunityInner object itself.
     */
    public BgpServiceCommunityInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bgpCommunities() != null) {
            bgpCommunities().forEach(e -> e.validate());
        }
    }
}
