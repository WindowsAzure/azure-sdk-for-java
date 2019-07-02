/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input for testing route.
 */
public class TestRouteInput {
    /**
     * Routing message.
     */
    @JsonProperty(value = "message")
    private RoutingMessage message;

    /**
     * Route properties.
     */
    @JsonProperty(value = "route", required = true)
    private RouteProperties route;

    /**
     * Routing Twin Reference.
     */
    @JsonProperty(value = "twin")
    private RoutingTwin twin;

    /**
     * Get routing message.
     *
     * @return the message value
     */
    public RoutingMessage message() {
        return this.message;
    }

    /**
     * Set routing message.
     *
     * @param message the message value to set
     * @return the TestRouteInput object itself.
     */
    public TestRouteInput withMessage(RoutingMessage message) {
        this.message = message;
        return this;
    }

    /**
     * Get route properties.
     *
     * @return the route value
     */
    public RouteProperties route() {
        return this.route;
    }

    /**
     * Set route properties.
     *
     * @param route the route value to set
     * @return the TestRouteInput object itself.
     */
    public TestRouteInput withRoute(RouteProperties route) {
        this.route = route;
        return this;
    }

    /**
     * Get routing Twin Reference.
     *
     * @return the twin value
     */
    public RoutingTwin twin() {
        return this.twin;
    }

    /**
     * Set routing Twin Reference.
     *
     * @param twin the twin value to set
     * @return the TestRouteInput object itself.
     */
    public TestRouteInput withTwin(RoutingTwin twin) {
        this.twin = twin;
        return this;
    }

}
