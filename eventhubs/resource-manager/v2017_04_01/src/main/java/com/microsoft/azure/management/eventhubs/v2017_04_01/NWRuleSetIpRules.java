/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhubs.v2017_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of NetWorkRuleSet - IpRules resource.
 */
public class NWRuleSetIpRules {
    /**
     * IP Mask.
     */
    @JsonProperty(value = "ipMask")
    private String ipMask;

    /**
     * The IP Filter Action. Possible values include: 'Allow'.
     */
    @JsonProperty(value = "action")
    private NetworkRuleIPAction action;

    /**
     * Get iP Mask.
     *
     * @return the ipMask value
     */
    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Set iP Mask.
     *
     * @param ipMask the ipMask value to set
     * @return the NWRuleSetIpRules object itself.
     */
    public NWRuleSetIpRules withIpMask(String ipMask) {
        this.ipMask = ipMask;
        return this;
    }

    /**
     * Get the IP Filter Action. Possible values include: 'Allow'.
     *
     * @return the action value
     */
    public NetworkRuleIPAction action() {
        return this.action;
    }

    /**
     * Set the IP Filter Action. Possible values include: 'Allow'.
     *
     * @param action the action value to set
     * @return the NWRuleSetIpRules object itself.
     */
    public NWRuleSetIpRules withAction(NetworkRuleIPAction action) {
        this.action = action;
        return this;
    }

}
