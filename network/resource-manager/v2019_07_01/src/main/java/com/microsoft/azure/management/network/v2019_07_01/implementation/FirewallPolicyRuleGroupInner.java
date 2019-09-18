/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.FirewallPolicyRule;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Rule Group resource.
 */
@JsonFlatten
public class FirewallPolicyRuleGroupInner extends SubResource {
    /**
     * Priority of the Firewall Policy Rule Group resource.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /**
     * Group of Firewall Policy rules.
     */
    @JsonProperty(value = "properties.rules")
    private List<FirewallPolicyRule> rules;

    /**
     * The provisioning state of the firewall policy rule group resource.
     * Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Rule Group type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get priority of the Firewall Policy Rule Group resource.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set priority of the Firewall Policy Rule Group resource.
     *
     * @param priority the priority value to set
     * @return the FirewallPolicyRuleGroupInner object itself.
     */
    public FirewallPolicyRuleGroupInner withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get group of Firewall Policy rules.
     *
     * @return the rules value
     */
    public List<FirewallPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set group of Firewall Policy rules.
     *
     * @param rules the rules value to set
     * @return the FirewallPolicyRuleGroupInner object itself.
     */
    public FirewallPolicyRuleGroupInner withRules(List<FirewallPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioning state of the firewall policy rule group resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the firewall policy rule group resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the FirewallPolicyRuleGroupInner object itself.
     */
    public FirewallPolicyRuleGroupInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the resource that is unique within a resource group. This name can be used to access the resource.
     *
     * @param name the name value to set
     * @return the FirewallPolicyRuleGroupInner object itself.
     */
    public FirewallPolicyRuleGroupInner withName(String name) {
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
     * Get rule Group type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
