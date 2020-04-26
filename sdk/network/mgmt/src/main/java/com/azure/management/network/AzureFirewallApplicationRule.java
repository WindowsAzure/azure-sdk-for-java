// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureFirewallApplicationRule model. */
@Fluent
public final class AzureFirewallApplicationRule {
    /*
     * Name of the application rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * List of source IP addresses for this rule.
     */
    @JsonProperty(value = "sourceAddresses")
    private List<String> sourceAddresses;

    /*
     * Array of ApplicationRuleProtocols.
     */
    @JsonProperty(value = "protocols")
    private List<AzureFirewallApplicationRuleProtocol> protocols;

    /*
     * List of FQDNs for this rule.
     */
    @JsonProperty(value = "targetFqdns")
    private List<String> targetFqdns;

    /*
     * List of FQDN Tags for this rule.
     */
    @JsonProperty(value = "fqdnTags")
    private List<String> fqdnTags;

    /**
     * Get the name property: Name of the application rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the application rule.
     *
     * @param name the name value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of the rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the rule.
     *
     * @param description the description value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withDescription(String description) {
        this.description = description;
        return this;
    }

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
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withSourceAddresses(List<String> sourceAddresses) {
        this.sourceAddresses = sourceAddresses;
        return this;
    }

    /**
     * Get the protocols property: Array of ApplicationRuleProtocols.
     *
     * @return the protocols value.
     */
    public List<AzureFirewallApplicationRuleProtocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Array of ApplicationRuleProtocols.
     *
     * @param protocols the protocols value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withProtocols(List<AzureFirewallApplicationRuleProtocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * Get the targetFqdns property: List of FQDNs for this rule.
     *
     * @return the targetFqdns value.
     */
    public List<String> targetFqdns() {
        return this.targetFqdns;
    }

    /**
     * Set the targetFqdns property: List of FQDNs for this rule.
     *
     * @param targetFqdns the targetFqdns value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withTargetFqdns(List<String> targetFqdns) {
        this.targetFqdns = targetFqdns;
        return this;
    }

    /**
     * Get the fqdnTags property: List of FQDN Tags for this rule.
     *
     * @return the fqdnTags value.
     */
    public List<String> fqdnTags() {
        return this.fqdnTags;
    }

    /**
     * Set the fqdnTags property: List of FQDN Tags for this rule.
     *
     * @param fqdnTags the fqdnTags value to set.
     * @return the AzureFirewallApplicationRule object itself.
     */
    public AzureFirewallApplicationRule withFqdnTags(List<String> fqdnTags) {
        this.fqdnTags = fqdnTags;
        return this;
    }
}
