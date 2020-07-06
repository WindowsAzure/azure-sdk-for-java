// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayFirewallRuleSet;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApplicationGatewayAvailableWafRuleSetsResult model. */
@Fluent
public final class ApplicationGatewayAvailableWafRuleSetsResultInner {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ApplicationGatewayAvailableWafRuleSetsResultInner.class);

    /*
     * The list of application gateway rule sets.
     */
    @JsonProperty(value = "value")
    private List<ApplicationGatewayFirewallRuleSet> value;

    /**
     * Get the value property: The list of application gateway rule sets.
     *
     * @return the value value.
     */
    public List<ApplicationGatewayFirewallRuleSet> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of application gateway rule sets.
     *
     * @param value the value value to set.
     * @return the ApplicationGatewayAvailableWafRuleSetsResultInner object itself.
     */
    public ApplicationGatewayAvailableWafRuleSetsResultInner withValue(List<ApplicationGatewayFirewallRuleSet> value) {
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
