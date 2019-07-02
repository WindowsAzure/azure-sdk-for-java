/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the application rule protocol.
 */
public class AzureFirewallApplicationRuleProtocol {
    /**
     * Protocol type. Possible values include: 'Http', 'Https'.
     */
    @JsonProperty(value = "protocolType")
    private AzureFirewallApplicationRuleProtocolType protocolType;

    /**
     * Port number for the protocol, cannot be greater than 64000. This field
     * is optional.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get protocol type. Possible values include: 'Http', 'Https'.
     *
     * @return the protocolType value
     */
    public AzureFirewallApplicationRuleProtocolType protocolType() {
        return this.protocolType;
    }

    /**
     * Set protocol type. Possible values include: 'Http', 'Https'.
     *
     * @param protocolType the protocolType value to set
     * @return the AzureFirewallApplicationRuleProtocol object itself.
     */
    public AzureFirewallApplicationRuleProtocol withProtocolType(AzureFirewallApplicationRuleProtocolType protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get port number for the protocol, cannot be greater than 64000. This field is optional.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set port number for the protocol, cannot be greater than 64000. This field is optional.
     *
     * @param port the port value to set
     * @return the AzureFirewallApplicationRuleProtocol object itself.
     */
    public AzureFirewallApplicationRuleProtocol withPort(Integer port) {
        this.port = port;
        return this;
    }

}
