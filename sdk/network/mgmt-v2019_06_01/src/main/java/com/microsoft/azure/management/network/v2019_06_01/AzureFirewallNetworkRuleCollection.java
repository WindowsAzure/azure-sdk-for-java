/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Network rule collection resource.
 */
@JsonFlatten
public class AzureFirewallNetworkRuleCollection extends SubResource {
    /**
     * Priority of the network rule collection resource.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * The action type of a rule collection.
     */
    @JsonProperty(value = "properties.action")
    private AzureFirewallRCAction action;

    /**
     * Collection of rules used by a network rule collection.
     */
    @JsonProperty(value = "properties.rules")
    private List<AzureFirewallNetworkRule> rules;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get priority of the network rule collection resource.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority of the network rule collection resource.
     *
     * @param priority the priority value to set
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action type of a rule collection.
     *
     * @return the action value
     */
    public AzureFirewallRCAction action() {
        return this.action;
    }

    /**
     * Set the action type of a rule collection.
     *
     * @param action the action value to set
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withAction(AzureFirewallRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get collection of rules used by a network rule collection.
     *
     * @return the rules value
     */
    public List<AzureFirewallNetworkRule> rules() {
        return this.rules;
    }

    /**
     * Set collection of rules used by a network rule collection.
     *
     * @param rules the rules value to set
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withRules(List<AzureFirewallNetworkRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set gets name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withName(String name) {
        this.name = name;
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

}
