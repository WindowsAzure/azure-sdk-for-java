// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** Defines reference to load balancer NAT rules. */
@Immutable
public final class LoadBalancerNatRuleReference extends ProxyResourceReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerNatRuleReference.class);

    /** {@inheritDoc} */
    @Override
    public LoadBalancerNatRuleReference withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LoadBalancerNatRuleReference withSourceArmResourceId(String sourceArmResourceId) {
        super.withSourceArmResourceId(sourceArmResourceId);
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
    }
}
