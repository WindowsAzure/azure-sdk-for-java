/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Route table resource.
 */
@JsonFlatten
@SkipParentValidation
public class RouteTableInner extends Resource {
    /**
     * Collection of routes contained within a route table.
     */
    @JsonProperty(value = "properties.routes")
    private List<RouteInner> routes;

    /**
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /**
     * Gets or sets whether to disable the routes learned by BGP on that route
     * table. True means disable.
     */
    @JsonProperty(value = "properties.disableBgpRoutePropagation")
    private Boolean disableBgpRoutePropagation;

    /**
     * The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get collection of routes contained within a route table.
     *
     * @return the routes value
     */
    public List<RouteInner> routes() {
        return this.routes;
    }

    /**
     * Set collection of routes contained within a route table.
     *
     * @param routes the routes value to set
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withRoutes(List<RouteInner> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get a collection of references to subnets.
     *
     * @return the subnets value
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get gets or sets whether to disable the routes learned by BGP on that route table. True means disable.
     *
     * @return the disableBgpRoutePropagation value
     */
    public Boolean disableBgpRoutePropagation() {
        return this.disableBgpRoutePropagation;
    }

    /**
     * Set gets or sets whether to disable the routes learned by BGP on that route table. True means disable.
     *
     * @param disableBgpRoutePropagation the disableBgpRoutePropagation value to set
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
        this.disableBgpRoutePropagation = disableBgpRoutePropagation;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource. Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withEtag(String etag) {
        this.etag = etag;
        return this;
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
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withId(String id) {
        this.id = id;
        return this;
    }

}
