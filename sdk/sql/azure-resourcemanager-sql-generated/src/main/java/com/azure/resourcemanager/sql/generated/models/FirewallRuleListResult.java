// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.models.FirewallRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the response to a List Firewall Rules request. */
@Fluent
public final class FirewallRuleListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FirewallRuleListResult.class);

    /*
     * The list of server firewall rules.
     */
    @JsonProperty(value = "value")
    private List<FirewallRuleInner> value;

    /**
     * Get the value property: The list of server firewall rules.
     *
     * @return the value value.
     */
    public List<FirewallRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of server firewall rules.
     *
     * @param value the value value to set.
     * @return the FirewallRuleListResult object itself.
     */
    public FirewallRuleListResult withValue(List<FirewallRuleInner> value) {
        this.value = value;
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
