/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * One or more actions that will execute, modifying the request and/or
 * response.
 */
public class RulesEngineAction {
    /**
     * A list of header actions to apply from the request from AFD to the
     * origin.
     */
    @JsonProperty(value = "requestHeaderActions")
    private List<HeaderAction> requestHeaderActions;

    /**
     * A list of header actions to apply from the response from AFD to the
     * client.
     */
    @JsonProperty(value = "responseHeaderActions")
    private List<HeaderAction> responseHeaderActions;

    /**
     * Override the route configuration.
     */
    @JsonProperty(value = "routeConfigurationOverride")
    private RouteConfiguration routeConfigurationOverride;

    /**
     * Get a list of header actions to apply from the request from AFD to the origin.
     *
     * @return the requestHeaderActions value
     */
    public List<HeaderAction> requestHeaderActions() {
        return this.requestHeaderActions;
    }

    /**
     * Set a list of header actions to apply from the request from AFD to the origin.
     *
     * @param requestHeaderActions the requestHeaderActions value to set
     * @return the RulesEngineAction object itself.
     */
    public RulesEngineAction withRequestHeaderActions(List<HeaderAction> requestHeaderActions) {
        this.requestHeaderActions = requestHeaderActions;
        return this;
    }

    /**
     * Get a list of header actions to apply from the response from AFD to the client.
     *
     * @return the responseHeaderActions value
     */
    public List<HeaderAction> responseHeaderActions() {
        return this.responseHeaderActions;
    }

    /**
     * Set a list of header actions to apply from the response from AFD to the client.
     *
     * @param responseHeaderActions the responseHeaderActions value to set
     * @return the RulesEngineAction object itself.
     */
    public RulesEngineAction withResponseHeaderActions(List<HeaderAction> responseHeaderActions) {
        this.responseHeaderActions = responseHeaderActions;
        return this;
    }

    /**
     * Get override the route configuration.
     *
     * @return the routeConfigurationOverride value
     */
    public RouteConfiguration routeConfigurationOverride() {
        return this.routeConfigurationOverride;
    }

    /**
     * Set override the route configuration.
     *
     * @param routeConfigurationOverride the routeConfigurationOverride value to set
     * @return the RulesEngineAction object itself.
     */
    public RulesEngineAction withRouteConfigurationOverride(RouteConfiguration routeConfigurationOverride) {
        this.routeConfigurationOverride = routeConfigurationOverride;
        return this;
    }

}
