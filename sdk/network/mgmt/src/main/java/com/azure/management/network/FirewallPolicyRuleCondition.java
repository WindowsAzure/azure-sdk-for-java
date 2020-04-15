// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The FirewallPolicyRuleCondition model. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "ruleConditionType",
    defaultImpl = FirewallPolicyRuleCondition.class)
@JsonTypeName("FirewallPolicyRuleCondition")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ApplicationRuleCondition", value = ApplicationRuleCondition.class),
    @JsonSubTypes.Type(name = "NetworkRuleCondition", value = NetworkRuleCondition.class)
})
@Fluent
public class FirewallPolicyRuleCondition {
    /*
     * Name of the rule condition.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Description of the rule condition.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the name property: Name of the rule condition.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the rule condition.
     *
     * @param name the name value to set.
     * @return the FirewallPolicyRuleCondition object itself.
     */
    public FirewallPolicyRuleCondition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of the rule condition.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the rule condition.
     *
     * @param description the description value to set.
     * @return the FirewallPolicyRuleCondition object itself.
     */
    public FirewallPolicyRuleCondition withDescription(String description) {
        this.description = description;
        return this;
    }
}
