/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabricmesh;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the hostname properties for http routing.
 */
public class HttpHostConfig {
    /**
     * http hostname config name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Route information to use for routing. Routes are processed in the order
     * they are specified. Specify routes that are more specific before routes
     * that can handle general cases.
     */
    @JsonProperty(value = "routes", required = true)
    private List<HttpRouteConfig> routes;

    /**
     * Get http hostname config name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set http hostname config name.
     *
     * @param name the name value to set
     * @return the HttpHostConfig object itself.
     */
    public HttpHostConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
     *
     * @return the routes value
     */
    public List<HttpRouteConfig> routes() {
        return this.routes;
    }

    /**
     * Set route information to use for routing. Routes are processed in the order they are specified. Specify routes that are more specific before routes that can handle general cases.
     *
     * @param routes the routes value to set
     * @return the HttpHostConfig object itself.
     */
    public HttpHostConfig withRoutes(List<HttpRouteConfig> routes) {
        this.routes = routes;
        return this;
    }

}
