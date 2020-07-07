// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RouteFilter model. */
@JsonFlatten
@Fluent
public class RouteFilterInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RouteFilterInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Collection of RouteFilterRules contained within a route filter.
     */
    @JsonProperty(value = "properties.rules")
    private List<RouteFilterRuleInner> rules;

    /*
     * A collection of references to express route circuit peerings.
     */
    @JsonProperty(value = "properties.peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /*
     * A collection of references to express route circuit ipv6 peerings.
     */
    @JsonProperty(value = "properties.ipv6Peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteCircuitPeeringInner> ipv6Peerings;

    /*
     * The provisioning state of the route filter resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @return the rules value.
     */
    public List<RouteFilterRuleInner> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @param rules the rules value to set.
     * @return the RouteFilterInner object itself.
     */
    public RouteFilterInner withRules(List<RouteFilterRuleInner> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the peerings property: A collection of references to express route circuit peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Get the ipv6Peerings property: A collection of references to express route circuit ipv6 peerings.
     *
     * @return the ipv6Peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> ipv6Peerings() {
        return this.ipv6Peerings;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route filter resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
     * @return the RouteFilterInner object itself.
     */
    public RouteFilterInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
        if (peerings() != null) {
            peerings().forEach(e -> e.validate());
        }
        if (ipv6Peerings() != null) {
            ipv6Peerings().forEach(e -> e.validate());
        }
    }
}
