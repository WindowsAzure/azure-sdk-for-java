/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a virtual machine that determine how it is connected to a load
 * balancer.
 */
public class SharedPublicIpAddressConfigurationFragment {
    /**
     * The incoming NAT rules.
     */
    @JsonProperty(value = "inboundNatRules")
    private List<InboundNatRuleFragment> inboundNatRules;

    /**
     * Get the incoming NAT rules.
     *
     * @return the inboundNatRules value
     */
    public List<InboundNatRuleFragment> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the incoming NAT rules.
     *
     * @param inboundNatRules the inboundNatRules value to set
     * @return the SharedPublicIpAddressConfigurationFragment object itself.
     */
    public SharedPublicIpAddressConfigurationFragment withInboundNatRules(List<InboundNatRuleFragment> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
        return this;
    }

}
