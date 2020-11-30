// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.FirewallPolicyRuleCollection;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Rule Collection Group resource. */
@JsonFlatten
@Fluent
public class FirewallPolicyRuleCollectionGroupInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyRuleCollectionGroupInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Rule Group type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Priority of the Firewall Policy Rule Collection Group resource.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /*
     * Group of Firewall Policy rule collections.
     */
    @JsonProperty(value = "properties.ruleCollections")
    private List<FirewallPolicyRuleCollection> ruleCollections;

    /*
     * The provisioning state of the firewall policy rule collection group
     * resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the FirewallPolicyRuleCollectionGroupInner object itself.
     */
    public FirewallPolicyRuleCollectionGroupInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Rule Group type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the Firewall Policy Rule Collection Group resource.
     *
     * @param priority the priority value to set.
     * @return the FirewallPolicyRuleCollectionGroupInner object itself.
     */
    public FirewallPolicyRuleCollectionGroupInner withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the ruleCollections property: Group of Firewall Policy rule collections.
     *
     * @return the ruleCollections value.
     */
    public List<FirewallPolicyRuleCollection> ruleCollections() {
        return this.ruleCollections;
    }

    /**
     * Set the ruleCollections property: Group of Firewall Policy rule collections.
     *
     * @param ruleCollections the ruleCollections value to set.
     * @return the FirewallPolicyRuleCollectionGroupInner object itself.
     */
    public FirewallPolicyRuleCollectionGroupInner withRuleCollections(
        List<FirewallPolicyRuleCollection> ruleCollections) {
        this.ruleCollections = ruleCollections;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the firewall policy rule collection group resource.
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
        if (ruleCollections() != null) {
            ruleCollections().forEach(e -> e.validate());
        }
    }
}
