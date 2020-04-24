// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RouteTable model. */
@JsonFlatten
@Fluent
public class RouteTableInner extends Resource {
    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Collection of routes contained within a route table.
     */
    @JsonProperty(value = "properties.routes")
    private List<RouteInner> routes;

    /*
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /*
     * Gets or sets whether to disable the routes learned by BGP on that route
     * table. True means disable.
     */
    @JsonProperty(value = "properties.disableBgpRoutePropagation")
    private Boolean disableBgpRoutePropagation;

    /*
     * The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the routes property: Collection of routes contained within a route table.
     *
     * @return the routes value.
     */
    public List<RouteInner> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: Collection of routes contained within a route table.
     *
     * @param routes the routes value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withRoutes(List<RouteInner> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     *
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get the disableBgpRoutePropagation property: Gets or sets whether to disable the routes learned by BGP on that
     * route table. True means disable.
     *
     * @return the disableBgpRoutePropagation value.
     */
    public Boolean disableBgpRoutePropagation() {
        return this.disableBgpRoutePropagation;
    }

    /**
     * Set the disableBgpRoutePropagation property: Gets or sets whether to disable the routes learned by BGP on that
     * route table. True means disable.
     *
     * @param disableBgpRoutePropagation the disableBgpRoutePropagation value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
        this.disableBgpRoutePropagation = disableBgpRoutePropagation;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withId(String id) {
        this.id = id;
        return this;
    }
}
