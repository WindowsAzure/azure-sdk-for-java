/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network interface and all its associated security rules.
 */
public class SecurityGroupNetworkInterface {
    /**
     * ID of the network interface.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The securityRuleAssociations property.
     */
    @JsonProperty(value = "securityRuleAssociations")
    private SecurityRuleAssociations securityRuleAssociations;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the SecurityGroupNetworkInterface object itself.
     */
    public SecurityGroupNetworkInterface withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the securityRuleAssociations value.
     *
     * @return the securityRuleAssociations value
     */
    public SecurityRuleAssociations securityRuleAssociations() {
        return this.securityRuleAssociations;
    }

    /**
     * Set the securityRuleAssociations value.
     *
     * @param securityRuleAssociations the securityRuleAssociations value to set
     * @return the SecurityGroupNetworkInterface object itself.
     */
    public SecurityGroupNetworkInterface withSecurityRuleAssociations(SecurityRuleAssociations securityRuleAssociations) {
        this.securityRuleAssociations = securityRuleAssociations;
        return this;
    }

}
