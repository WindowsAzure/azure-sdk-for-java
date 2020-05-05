/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.implementation.RouteFilterRuleInner;
import com.microsoft.azure.management.network.v2020_03_01.implementation.ExpressRouteCircuitPeeringInner;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Route Filter Resource.
 */
@JsonFlatten
public class PatchRouteFilter extends SubResource {
    /**
     * Collection of RouteFilterRules contained within a route filter.
     */
    @JsonProperty(value = "properties.rules")
    private List<RouteFilterRuleInner> rules;

    /**
     * A collection of references to express route circuit peerings.
     */
    @JsonProperty(value = "properties.peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /**
     * A collection of references to express route circuit ipv6 peerings.
     */
    @JsonProperty(value = "properties.ipv6Peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteCircuitPeeringInner> ipv6Peerings;

    /**
     * The provisioning state of the route filter resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get collection of RouteFilterRules contained within a route filter.
     *
     * @return the rules value
     */
    public List<RouteFilterRuleInner> rules() {
        return this.rules;
    }

    /**
     * Set collection of RouteFilterRules contained within a route filter.
     *
     * @param rules the rules value to set
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withRules(List<RouteFilterRuleInner> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get a collection of references to express route circuit peerings.
     *
     * @return the peerings value
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Get a collection of references to express route circuit ipv6 peerings.
     *
     * @return the ipv6Peerings value
     */
    public List<ExpressRouteCircuitPeeringInner> ipv6Peerings() {
        return this.ipv6Peerings;
    }

    /**
     * Get the provisioning state of the route filter resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the PatchRouteFilter object itself.
     */
    public PatchRouteFilter withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
