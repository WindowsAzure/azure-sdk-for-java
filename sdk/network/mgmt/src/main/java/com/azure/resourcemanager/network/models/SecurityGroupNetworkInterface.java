// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SecurityGroupNetworkInterface model. */
@Fluent
public final class SecurityGroupNetworkInterface {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityGroupNetworkInterface.class);

    /*
     * ID of the network interface.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * All security rules associated with the network interface.
     */
    @JsonProperty(value = "securityRuleAssociations")
    private SecurityRuleAssociations securityRuleAssociations;

    /**
     * Get the id property: ID of the network interface.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ID of the network interface.
     *
     * @param id the id value to set.
     * @return the SecurityGroupNetworkInterface object itself.
     */
    public SecurityGroupNetworkInterface withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the securityRuleAssociations property: All security rules associated with the network interface.
     *
     * @return the securityRuleAssociations value.
     */
    public SecurityRuleAssociations securityRuleAssociations() {
        return this.securityRuleAssociations;
    }

    /**
     * Set the securityRuleAssociations property: All security rules associated with the network interface.
     *
     * @param securityRuleAssociations the securityRuleAssociations value to set.
     * @return the SecurityGroupNetworkInterface object itself.
     */
    public SecurityGroupNetworkInterface withSecurityRuleAssociations(
        SecurityRuleAssociations securityRuleAssociations) {
        this.securityRuleAssociations = securityRuleAssociations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityRuleAssociations() != null) {
            securityRuleAssociations().validate();
        }
    }
}
