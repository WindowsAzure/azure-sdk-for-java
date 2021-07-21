// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.FirewallRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of firewall rules. */
@Fluent
public final class FirewallRuleListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallRuleListResult.class);

    /*
     * The list of firewall rules in a server.
     */
    @JsonProperty(value = "value")
    private List<FirewallRuleInner> value;

    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of firewall rules in a server.
     *
     * @return the value value.
     */
    public List<FirewallRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of firewall rules in a server.
     *
     * @param value the value value to set.
     * @return the FirewallRuleListResult object itself.
     */
    public FirewallRuleListResult withValue(List<FirewallRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the FirewallRuleListResult object itself.
     */
    public FirewallRuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
