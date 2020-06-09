// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The ApplicationRuleCondition model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleConditionType")
@JsonTypeName("ApplicationRuleCondition")
@Fluent
public final class ApplicationRuleCondition extends FirewallPolicyRuleCondition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationRuleCondition.class);

    /*
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * List of destination IP addresses or Service Tags.
     */
    @JsonProperty(value = "destinationAddresses")
    private List<String> destinationAddresses;

    /*
     * Array of Application Protocols.
     */
    @JsonProperty(value = "protocols")
    private List<FirewallPolicyRuleConditionApplicationProtocol> protocols;

    /*
     * List of FQDNs for this rule condition.
     */
    @JsonProperty(value = "targetFqdns")
    private List<String> targetFqdns;

    /*
     * List of FQDN Tags for this rule condition.
     */
    @JsonProperty(value = "fqdnTags")
    private List<String> fqdnTags;

    /**
     * Get the sourceAddresses property: List of source IP addresses for this rule.
     *
     * @return the sourceAddresses value.
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses;
    }

    /**
     * Set the sourceAddresses property: List of source IP addresses for this rule.
     *
     * @param sourceAddresses the sourceAddresses value to set.
     * @return the ApplicationRuleCondition object itself.
     */
    public ApplicationRuleCondition withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the destinationAddresses property: List of destination IP addresses or Service Tags.
     *
     * @return the destinationAddresses value.
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses;
    }

    /**
     * Set the destinationAddresses property: List of destination IP addresses or Service Tags.
     *
     * @param destinationAddresses the destinationAddresses value to set.
     * @return the ApplicationRuleCondition object itself.
     */
    public ApplicationRuleCondition withDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
        return this;
    }

    /**
     * Get the protocols property: Array of Application Protocols.
     *
     * @return the protocols value.
     */
    public List<FirewallPolicyRuleConditionApplicationProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Array of Application Protocols.
     *
     * @param protocols the protocols value to set.
     * @return the ApplicationRuleCondition object itself.
     */
    public ApplicationRuleCondition withProtocols(List<FirewallPolicyRuleConditionApplicationProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the targetFqdns property: List of FQDNs for this rule condition.
     *
     * @return the targetFqdns value.
     */
    public List<String> targetFqdns() {
        return this.targetFqdns;
    }

    /**
     * Set the targetFqdns property: List of FQDNs for this rule condition.
     *
     * @param targetFqdns the targetFqdns value to set.
     * @return the ApplicationRuleCondition object itself.
     */
    public ApplicationRuleCondition withTargetFqdns(List<String> targetFqdns) {
        this.targetFqdns = targetFqdns;
        return this;
    }

    /**
     * Get the fqdnTags property: List of FQDN Tags for this rule condition.
     *
     * @return the fqdnTags value.
     */
    public List<String> fqdnTags() {
        return this.fqdnTags;
    }

    /**
     * Set the fqdnTags property: List of FQDN Tags for this rule condition.
     *
     * @param fqdnTags the fqdnTags value to set.
     * @return the ApplicationRuleCondition object itself.
     */
    public ApplicationRuleCondition withFqdnTags(List<String> fqdnTags) {
        this.fqdnTags = fqdnTags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (protocols() != null) {
            protocols().forEach(e -> e.validate());
        }
    }
}
