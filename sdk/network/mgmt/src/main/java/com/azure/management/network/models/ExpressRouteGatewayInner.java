// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.network.ExpressRouteGatewayPropertiesAutoScaleConfiguration;
import com.azure.management.network.ProvisioningState;
import com.azure.management.network.VirtualHubId;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteGateway model. */
@JsonFlatten
@Fluent
public class ExpressRouteGatewayInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Configuration for auto scaling.
     */
    @JsonProperty(value = "properties.autoScaleConfiguration")
    private ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration;

    /*
     * List of ExpressRoute connections to the ExpressRoute gateway.
     */
    @JsonProperty(value = "properties.expressRouteConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteConnectionInner> expressRouteConnections;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     */
    @JsonProperty(value = "properties.virtualHub")
    private VirtualHubId virtualHub;

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
     * Get the autoScaleConfiguration property: Configuration for auto scaling.
     *
     * @return the autoScaleConfiguration value.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration() {
        return this.autoScaleConfiguration;
    }

    /**
     * Set the autoScaleConfiguration property: Configuration for auto scaling.
     *
     * @param autoScaleConfiguration the autoScaleConfiguration value to set.
     * @return the ExpressRouteGatewayInner object itself.
     */
    public ExpressRouteGatewayInner withAutoScaleConfiguration(
        ExpressRouteGatewayPropertiesAutoScaleConfiguration autoScaleConfiguration) {
        this.autoScaleConfiguration = autoScaleConfiguration;
        return this;
    }

    /**
     * Get the expressRouteConnections property: List of ExpressRoute connections to the ExpressRoute gateway.
     *
     * @return the expressRouteConnections value.
     */
    public List<ExpressRouteConnectionInner> expressRouteConnections() {
        return this.expressRouteConnections;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the virtualHub property: The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     *
     * @return the virtualHub value.
     */
    public VirtualHubId virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The Virtual Hub where the ExpressRoute gateway is or will be deployed.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the ExpressRouteGatewayInner object itself.
     */
    public ExpressRouteGatewayInner withVirtualHub(VirtualHubId virtualHub) {
        this.virtualHub = virtualHub;
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
     * @return the ExpressRouteGatewayInner object itself.
     */
    public ExpressRouteGatewayInner withId(String id) {
        this.id = id;
        return this;
    }
}
