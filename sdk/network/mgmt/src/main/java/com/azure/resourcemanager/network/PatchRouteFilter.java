// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.inner.ExpressRouteCircuitPeeringInner;
import com.azure.resourcemanager.network.fluent.inner.RouteFilterRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The PatchRouteFilter model. */
@JsonFlatten
@Fluent
public class PatchRouteFilter extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PatchRouteFilter.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Collection of RouteFilterRules contained within a route filter.
     */
    @JsonProperty(value = "properties.rules")
    private List<RouteFilterRuleInner> rules;

    /*
     * A collection of references to express route circuit peerings.
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /*
     * A collection of references to express route circuit ipv6 peerings.
     */
    @JsonProperty(value = "properties.ipv6Peerings")
    private List<ExpressRouteCircuitPeeringInner> ipv6Peerings;

    /*
     * The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', 'Succeeded' and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
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
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withRules(List<RouteFilterRuleInner> rules) {
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
     * Set the peerings property: A collection of references to express route circuit peerings.
     *
     * @param peerings the peerings value to set.
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
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
     * Set the ipv6Peerings property: A collection of references to express route circuit ipv6 peerings.
     *
     * @param ipv6Peerings the ipv6Peerings value to set.
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withIpv6Peerings(List<ExpressRouteCircuitPeeringInner> ipv6Peerings) {
        this.ipv6Peerings = ipv6Peerings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', 'Succeeded' and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
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
