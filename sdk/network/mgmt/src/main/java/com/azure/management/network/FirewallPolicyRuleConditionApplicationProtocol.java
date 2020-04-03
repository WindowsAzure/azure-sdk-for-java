// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FirewallPolicyRuleConditionApplicationProtocol model.
 */
@Fluent
public final class FirewallPolicyRuleConditionApplicationProtocol {
    /*
     * The application protocol type of a Rule condition.
     */
    @JsonProperty(value = "protocolType")
    private FirewallPolicyRuleConditionApplicationProtocolType protocolType;

    /*
     * Port number for the protocol, cannot be greater than 64000.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the protocolType property: The application protocol type of a Rule
     * condition.
     * 
     * @return the protocolType value.
     */
    public FirewallPolicyRuleConditionApplicationProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set the protocolType property: The application protocol type of a Rule
     * condition.
     * 
     * @param protocolType the protocolType value to set.
     * @return the FirewallPolicyRuleConditionApplicationProtocol object
     * itself.
     */
    public FirewallPolicyRuleConditionApplicationProtocol withProtocolType(FirewallPolicyRuleConditionApplicationProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the port property: Port number for the protocol, cannot be greater
     * than 64000.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Port number for the protocol, cannot be greater
     * than 64000.
     * 
     * @param port the port value to set.
     * @return the FirewallPolicyRuleConditionApplicationProtocol object
     * itself.
     */
    public FirewallPolicyRuleConditionApplicationProtocol withPort(Integer port) {
        this.port = port;
        return this;
    }
}
