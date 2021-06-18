// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.models.DnsSettings;
import com.azure.resourcemanager.network.models.FirewallPolicyInsights;
import com.azure.resourcemanager.network.models.FirewallPolicyIntrusionDetection;
import com.azure.resourcemanager.network.models.FirewallPolicySku;
import com.azure.resourcemanager.network.models.FirewallPolicySnat;
import com.azure.resourcemanager.network.models.FirewallPolicyThreatIntelWhitelist;
import com.azure.resourcemanager.network.models.FirewallPolicyTransportSecurity;
import com.azure.resourcemanager.network.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** FirewallPolicy Resource. */
@JsonFlatten
@Fluent
public class FirewallPolicyInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallPolicyInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The identity of the firewall policy.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /*
     * List of references to FirewallPolicyRuleCollectionGroups.
     */
    @JsonProperty(value = "properties.ruleCollectionGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> ruleCollectionGroups;

    /*
     * The provisioning state of the firewall policy resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The parent firewall policy from which rules are inherited.
     */
    @JsonProperty(value = "properties.basePolicy")
    private SubResource basePolicy;

    /*
     * List of references to Azure Firewalls that this Firewall Policy is
     * associated with.
     */
    @JsonProperty(value = "properties.firewalls", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> firewalls;

    /*
     * List of references to Child Firewall Policies.
     */
    @JsonProperty(value = "properties.childPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> childPolicies;

    /*
     * The operation mode for Threat Intelligence.
     */
    @JsonProperty(value = "properties.threatIntelMode")
    private AzureFirewallThreatIntelMode threatIntelMode;

    /*
     * ThreatIntel Whitelist for Firewall Policy.
     */
    @JsonProperty(value = "properties.threatIntelWhitelist")
    private FirewallPolicyThreatIntelWhitelist threatIntelWhitelist;

    /*
     * Insights on Firewall Policy.
     */
    @JsonProperty(value = "properties.insights")
    private FirewallPolicyInsights insights;

    /*
     * The private IP addresses/IP ranges to which traffic will not be SNAT.
     */
    @JsonProperty(value = "properties.snat")
    private FirewallPolicySnat snat;

    /*
     * DNS Proxy Settings definition.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private DnsSettings dnsSettings;

    /*
     * The configuration for Intrusion detection.
     */
    @JsonProperty(value = "properties.intrusionDetection")
    private FirewallPolicyIntrusionDetection intrusionDetection;

    /*
     * TLS Configuration definition.
     */
    @JsonProperty(value = "properties.transportSecurity")
    private FirewallPolicyTransportSecurity transportSecurity;

    /*
     * The Firewall Policy SKU.
     */
    @JsonProperty(value = "properties.sku")
    private FirewallPolicySku sku;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the identity property: The identity of the firewall policy.
     *
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the firewall policy.
     *
     * @param identity the identity value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the ruleCollectionGroups property: List of references to FirewallPolicyRuleCollectionGroups.
     *
     * @return the ruleCollectionGroups value.
     */
    public List<SubResource> ruleCollectionGroups() {
        return this.ruleCollectionGroups;
    }

    /**
     * Get the provisioningState property: The provisioning state of the firewall policy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @return the basePolicy value.
     */
    public SubResource basePolicy() {
        return this.basePolicy;
    }

    /**
     * Set the basePolicy property: The parent firewall policy from which rules are inherited.
     *
     * @param basePolicy the basePolicy value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withBasePolicy(SubResource basePolicy) {
        this.basePolicy = basePolicy;
        return this;
    }

    /**
     * Get the firewalls property: List of references to Azure Firewalls that this Firewall Policy is associated with.
     *
     * @return the firewalls value.
     */
    public List<SubResource> firewalls() {
        return this.firewalls;
    }

    /**
     * Get the childPolicies property: List of references to Child Firewall Policies.
     *
     * @return the childPolicies value.
     */
    public List<SubResource> childPolicies() {
        return this.childPolicies;
    }

    /**
     * Get the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @return the threatIntelMode value.
     */
    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.threatIntelMode;
    }

    /**
     * Set the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @param threatIntelMode the threatIntelMode value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.threatIntelMode = threatIntelMode;
        return this;
    }

    /**
     * Get the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @return the threatIntelWhitelist value.
     */
    public FirewallPolicyThreatIntelWhitelist threatIntelWhitelist() {
        return this.threatIntelWhitelist;
    }

    /**
     * Set the threatIntelWhitelist property: ThreatIntel Whitelist for Firewall Policy.
     *
     * @param threatIntelWhitelist the threatIntelWhitelist value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withThreatIntelWhitelist(FirewallPolicyThreatIntelWhitelist threatIntelWhitelist) {
        this.threatIntelWhitelist = threatIntelWhitelist;
        return this;
    }

    /**
     * Get the insights property: Insights on Firewall Policy.
     *
     * @return the insights value.
     */
    public FirewallPolicyInsights insights() {
        return this.insights;
    }

    /**
     * Set the insights property: Insights on Firewall Policy.
     *
     * @param insights the insights value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withInsights(FirewallPolicyInsights insights) {
        this.insights = insights;
        return this;
    }

    /**
     * Get the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     *
     * @return the snat value.
     */
    public FirewallPolicySnat snat() {
        return this.snat;
    }

    /**
     * Set the snat property: The private IP addresses/IP ranges to which traffic will not be SNAT.
     *
     * @param snat the snat value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withSnat(FirewallPolicySnat snat) {
        this.snat = snat;
        return this;
    }

    /**
     * Get the dnsSettings property: DNS Proxy Settings definition.
     *
     * @return the dnsSettings value.
     */
    public DnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: DNS Proxy Settings definition.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withDnsSettings(DnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the intrusionDetection property: The configuration for Intrusion detection.
     *
     * @return the intrusionDetection value.
     */
    public FirewallPolicyIntrusionDetection intrusionDetection() {
        return this.intrusionDetection;
    }

    /**
     * Set the intrusionDetection property: The configuration for Intrusion detection.
     *
     * @param intrusionDetection the intrusionDetection value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withIntrusionDetection(FirewallPolicyIntrusionDetection intrusionDetection) {
        this.intrusionDetection = intrusionDetection;
        return this;
    }

    /**
     * Get the transportSecurity property: TLS Configuration definition.
     *
     * @return the transportSecurity value.
     */
    public FirewallPolicyTransportSecurity transportSecurity() {
        return this.transportSecurity;
    }

    /**
     * Set the transportSecurity property: TLS Configuration definition.
     *
     * @param transportSecurity the transportSecurity value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withTransportSecurity(FirewallPolicyTransportSecurity transportSecurity) {
        this.transportSecurity = transportSecurity;
        return this;
    }

    /**
     * Get the sku property: The Firewall Policy SKU.
     *
     * @return the sku value.
     */
    public FirewallPolicySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Firewall Policy SKU.
     *
     * @param sku the sku value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withSku(FirewallPolicySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the FirewallPolicyInner object itself.
     */
    public FirewallPolicyInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FirewallPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (threatIntelWhitelist() != null) {
            threatIntelWhitelist().validate();
        }
        if (insights() != null) {
            insights().validate();
        }
        if (snat() != null) {
            snat().validate();
        }
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (intrusionDetection() != null) {
            intrusionDetection().validate();
        }
        if (transportSecurity() != null) {
            transportSecurity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
