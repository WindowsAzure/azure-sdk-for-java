/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Request routing rule of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayRequestRoutingRule extends SubResource {
    /**
     * Rule type. Possible values include: 'Basic', 'PathBasedRouting'.
     */
    @JsonProperty(value = "properties.ruleType")
    private ApplicationGatewayRequestRoutingRuleType ruleType;

    /**
     * Priority of the request routing rule.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * Backend address pool resource of the application gateway.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * Backend http settings resource of the application gateway.
     */
    @JsonProperty(value = "properties.backendHttpSettings")
    private SubResource backendHttpSettings;

    /**
     * Http listener resource of the application gateway.
     */
    @JsonProperty(value = "properties.httpListener")
    private SubResource httpListener;

    /**
     * URL path map resource of the application gateway.
     */
    @JsonProperty(value = "properties.urlPathMap")
    private SubResource urlPathMap;

    /**
     * Rewrite Rule Set resource in Basic rule of the application gateway.
     */
    @JsonProperty(value = "properties.rewriteRuleSet")
    private SubResource rewriteRuleSet;

    /**
     * Redirect configuration resource of the application gateway.
     */
    @JsonProperty(value = "properties.redirectConfiguration")
    private SubResource redirectConfiguration;

    /**
     * The provisioning state of the request routing rule resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Name of the request routing rule that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get rule type. Possible values include: 'Basic', 'PathBasedRouting'.
     *
     * @return the ruleType value
     */
    public ApplicationGatewayRequestRoutingRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set rule type. Possible values include: 'Basic', 'PathBasedRouting'.
     *
     * @param ruleType the ruleType value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withRuleType(ApplicationGatewayRequestRoutingRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get priority of the request routing rule.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority of the request routing rule.
     *
     * @param priority the priority value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get backend address pool resource of the application gateway.
     *
     * @return the backendAddressPool value
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set backend address pool resource of the application gateway.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get backend http settings resource of the application gateway.
     *
     * @return the backendHttpSettings value
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set backend http settings resource of the application gateway.
     *
     * @param backendHttpSettings the backendHttpSettings value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get http listener resource of the application gateway.
     *
     * @return the httpListener value
     */
    public SubResource httpListener() {
        return this.httpListener;
    }

    /**
     * Set http listener resource of the application gateway.
     *
     * @param httpListener the httpListener value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withHttpListener(SubResource httpListener) {
        this.httpListener = httpListener;
        return this;
    }

    /**
     * Get uRL path map resource of the application gateway.
     *
     * @return the urlPathMap value
     */
    public SubResource urlPathMap() {
        return this.urlPathMap;
    }

    /**
     * Set uRL path map resource of the application gateway.
     *
     * @param urlPathMap the urlPathMap value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withUrlPathMap(SubResource urlPathMap) {
        this.urlPathMap = urlPathMap;
        return this;
    }

    /**
     * Get rewrite Rule Set resource in Basic rule of the application gateway.
     *
     * @return the rewriteRuleSet value
     */
    public SubResource rewriteRuleSet() {
        return this.rewriteRuleSet;
    }

    /**
     * Set rewrite Rule Set resource in Basic rule of the application gateway.
     *
     * @param rewriteRuleSet the rewriteRuleSet value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withRewriteRuleSet(SubResource rewriteRuleSet) {
        this.rewriteRuleSet = rewriteRuleSet;
        return this;
    }

    /**
     * Get redirect configuration resource of the application gateway.
     *
     * @return the redirectConfiguration value
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set redirect configuration resource of the application gateway.
     *
     * @param redirectConfiguration the redirectConfiguration value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withRedirectConfiguration(SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get the provisioning state of the request routing rule resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get name of the request routing rule that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the request routing rule that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withName(String name) {
        this.name = name;
        return this;
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
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
