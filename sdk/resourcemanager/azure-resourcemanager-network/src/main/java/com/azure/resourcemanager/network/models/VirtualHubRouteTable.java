// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VirtualHub route table. */
@Fluent
public final class VirtualHubRouteTable {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualHubRouteTable.class);

    /*
     * List of all routes.
     */
    @JsonProperty(value = "routes")
    private List<VirtualHubRoute> routes;

    /**
     * Get the routes property: List of all routes.
     *
     * @return the routes value.
     */
    public List<VirtualHubRoute> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: List of all routes.
     *
     * @param routes the routes value to set.
     * @return the VirtualHubRouteTable object itself.
     */
    public VirtualHubRouteTable withRoutes(List<VirtualHubRoute> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }
}
