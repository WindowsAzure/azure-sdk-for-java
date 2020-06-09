// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureFirewallApplicationRuleCollection model. */
@JsonFlatten
@Fluent
public class AzureFirewallApplicationRuleCollection extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureFirewallApplicationRuleCollection.class);

    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Priority of the application rule collection resource.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /*
     * The action type of a rule collection.
     */
    @JsonProperty(value = "properties.action")
    private AzureFirewallRCAction action;

    /*
     * Collection of rules used by a application rule collection.
     */
    @JsonProperty(value = "properties.rules")
    private List<AzureFirewallApplicationRule> rules;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the priority property: Priority of the application rule collection resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the application rule collection resource.
     *
     * @param priority the priority value to set.
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action property: The action type of a rule collection.
     *
     * @return the action value.
     */
    public AzureFirewallRCAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a rule collection.
     *
     * @param action the action value to set.
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withAction(AzureFirewallRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a application rule collection.
     *
     * @return the rules value.
     */
    public List<AzureFirewallApplicationRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of rules used by a application rule collection.
     *
     * @param rules the rules value to set.
     * @return the AzureFirewallApplicationRuleCollection object itself.
     */
    public AzureFirewallApplicationRuleCollection withRules(List<AzureFirewallApplicationRule> rules) {
        this.rules = rules;
        return this;
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
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (action() != null) {
            action().validate();
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
