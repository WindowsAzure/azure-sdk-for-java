// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PatchRouteFilterRule model. */
@JsonFlatten
@Fluent
public class PatchRouteFilterRule extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PatchRouteFilterRule.class);

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
     * The access type of the rule.
     */
    @JsonProperty(value = "properties.access")
    private Access access;

    /*
     * The rule type of the rule.
     */
    @JsonProperty(value = "properties.routeFilterRuleType")
    private RouteFilterRuleType routeFilterRuleType;

    /*
     * The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     */
    @JsonProperty(value = "properties.communities")
    private List<String> communities;

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
     * Get the access property: The access type of the rule.
     *
     * @return the access value.
     */
    public Access access() {
        return this.access;
    }

    /**
     * Set the access property: The access type of the rule.
     *
     * @param access the access value to set.
     * @return the PatchRouteFilterRule object itself.
     */
    public PatchRouteFilterRule withAccess(Access access) {
        this.access = access;
        return this;
    }

    /**
     * Get the routeFilterRuleType property: The rule type of the rule.
     *
     * @return the routeFilterRuleType value.
     */
    public RouteFilterRuleType routeFilterRuleType() {
        return this.routeFilterRuleType;
    }

    /**
     * Set the routeFilterRuleType property: The rule type of the rule.
     *
     * @param routeFilterRuleType the routeFilterRuleType value to set.
     * @return the PatchRouteFilterRule object itself.
     */
    public PatchRouteFilterRule withRouteFilterRuleType(RouteFilterRuleType routeFilterRuleType) {
        this.routeFilterRuleType = routeFilterRuleType;
        return this;
    }

    /**
     * Get the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     *
     * @return the communities value.
     */
    public List<String> communities() {
        return this.communities;
    }

    /**
     * Set the communities property: The collection for bgp community values to filter on. e.g.
     * ['12076:5010','12076:5020'].
     *
     * @param communities the communities value to set.
     * @return the PatchRouteFilterRule object itself.
     */
    public PatchRouteFilterRule withCommunities(List<String> communities) {
        this.communities = communities;
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
    }
}
