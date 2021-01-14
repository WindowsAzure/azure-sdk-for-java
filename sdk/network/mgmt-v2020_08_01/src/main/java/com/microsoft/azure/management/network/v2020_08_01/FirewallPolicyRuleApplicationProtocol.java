/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the application rule protocol.
 */
public class FirewallPolicyRuleApplicationProtocol {
    /**
     * Protocol type. Possible values include: 'Http', 'Https'.
     */
    @JsonProperty(value = "protocolType")
    private FirewallPolicyRuleApplicationProtocolType protocolType;

    /**
     * Port number for the protocol, cannot be greater than 64000.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get protocol type. Possible values include: 'Http', 'Https'.
     *
     * @return the protocolType value
     */
    public FirewallPolicyRuleApplicationProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set protocol type. Possible values include: 'Http', 'Https'.
     *
     * @param protocolType the protocolType value to set
     * @return the FirewallPolicyRuleApplicationProtocol object itself.
     */
    public FirewallPolicyRuleApplicationProtocol withProtocolType(FirewallPolicyRuleApplicationProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get port number for the protocol, cannot be greater than 64000.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set port number for the protocol, cannot be greater than 64000.
     *
     * @param port the port value to set
     * @return the FirewallPolicyRuleApplicationProtocol object itself.
     */
    public FirewallPolicyRuleApplicationProtocol withPort(Integer port) {
        this.port = port;
        return this;
    }

}
