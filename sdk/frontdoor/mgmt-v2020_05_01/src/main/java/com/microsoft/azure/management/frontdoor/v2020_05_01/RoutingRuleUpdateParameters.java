/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Routing rules to apply to an endpoint.
 */
public class RoutingRuleUpdateParameters {
    /**
     * Frontend endpoints associated with this rule.
     */
    @JsonProperty(value = "frontendEndpoints")
    private List<SubResource> frontendEndpoints;

    /**
     * Protocol schemes to match for this rule.
     */
    @JsonProperty(value = "acceptedProtocols")
    private List<FrontDoorProtocol> acceptedProtocols;

    /**
     * The route patterns of the rule.
     */
    @JsonProperty(value = "patternsToMatch")
    private List<String> patternsToMatch;

    /**
     * Whether to enable use of this rule. Permitted values are 'Enabled' or
     * 'Disabled'. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "enabledState")
    private RoutingRuleEnabledState enabledState;

    /**
     * A reference to the routing configuration.
     */
    @JsonProperty(value = "routeConfiguration")
    private RouteConfiguration routeConfiguration;

    /**
     * A reference to a specific Rules Engine Configuration to apply to this
     * route.
     */
    @JsonProperty(value = "rulesEngine")
    private SubResource rulesEngine;

    /**
     * Defines the Web Application Firewall policy for each routing rule (if
     * applicable).
     */
    @JsonProperty(value = "webApplicationFirewallPolicyLink")
    private RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink;

    /**
     * Get frontend endpoints associated with this rule.
     *
     * @return the frontendEndpoints value
     */
    public List<SubResource> frontendEndpoints() {
        return this.frontendEndpoints;
    }

    /**
     * Set frontend endpoints associated with this rule.
     *
     * @param frontendEndpoints the frontendEndpoints value to set
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withFrontendEndpoints(List<SubResource> frontendEndpoints) {
        this.frontendEndpoints = frontendEndpoints;
        return this;
    }

    /**
     * Get protocol schemes to match for this rule.
     *
     * @return the acceptedProtocols value
     */
    public List<FrontDoorProtocol> acceptedProtocols() {
        return this.acceptedProtocols;
    }

    /**
     * Set protocol schemes to match for this rule.
     *
     * @param acceptedProtocols the acceptedProtocols value to set
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withAcceptedProtocols(List<FrontDoorProtocol> acceptedProtocols) {
        this.acceptedProtocols = acceptedProtocols;
        return this;
    }

    /**
     * Get the route patterns of the rule.
     *
     * @return the patternsToMatch value
     */
    public List<String> patternsToMatch() {
        return this.patternsToMatch;
    }

    /**
     * Set the route patterns of the rule.
     *
     * @param patternsToMatch the patternsToMatch value to set
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withPatternsToMatch(List<String> patternsToMatch) {
        this.patternsToMatch = patternsToMatch;
        return this;
    }

    /**
     * Get whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the enabledState value
     */
    public RoutingRuleEnabledState enabledState() {
        return this.enabledState;
    }

    /**
     * Set whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param enabledState the enabledState value to set
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withEnabledState(RoutingRuleEnabledState enabledState) {
        this.enabledState = enabledState;
        return this;
    }

    /**
     * Get a reference to the routing configuration.
     *
     * @return the routeConfiguration value
     */
    public RouteConfiguration routeConfiguration() {
        return this.routeConfiguration;
    }

    /**
     * Set a reference to the routing configuration.
     *
     * @param routeConfiguration the routeConfiguration value to set
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withRouteConfiguration(RouteConfiguration routeConfiguration) {
        this.routeConfiguration = routeConfiguration;
        return this;
    }

    /**
     * Get a reference to a specific Rules Engine Configuration to apply to this route.
     *
     * @return the rulesEngine value
     */
    public SubResource rulesEngine() {
        return this.rulesEngine;
    }

    /**
     * Set a reference to a specific Rules Engine Configuration to apply to this route.
     *
     * @param rulesEngine the rulesEngine value to set
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withRulesEngine(SubResource rulesEngine) {
        this.rulesEngine = rulesEngine;
        return this;
    }

    /**
     * Get defines the Web Application Firewall policy for each routing rule (if applicable).
     *
     * @return the webApplicationFirewallPolicyLink value
     */
    public RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink() {
        return this.webApplicationFirewallPolicyLink;
    }

    /**
     * Set defines the Web Application Firewall policy for each routing rule (if applicable).
     *
     * @param webApplicationFirewallPolicyLink the webApplicationFirewallPolicyLink value to set
     * @return the RoutingRuleUpdateParameters object itself.
     */
    public RoutingRuleUpdateParameters withWebApplicationFirewallPolicyLink(RoutingRuleUpdateParametersWebApplicationFirewallPolicyLink webApplicationFirewallPolicyLink) {
        this.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
        return this;
    }

}
