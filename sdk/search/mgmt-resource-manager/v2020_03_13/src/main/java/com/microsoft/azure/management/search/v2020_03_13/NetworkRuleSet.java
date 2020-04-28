/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_03_13;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network specific rules that determine how the Azure Cognitive Search service
 * may be reached.
 */
public class NetworkRuleSet {
    /**
     * A list of IP restriction rules that defines the inbound network access
     * to the search service endpoint. These restriction rules are applied only
     * when the EndpointAccess of the search service is Public.
     */
    @JsonProperty(value = "ipRules")
    private List<IpRule> ipRules;

    /**
     * Get a list of IP restriction rules that defines the inbound network access to the search service endpoint. These restriction rules are applied only when the EndpointAccess of the search service is Public.
     *
     * @return the ipRules value
     */
    public List<IpRule> ipRules() {
        return this.ipRules;
    }

    /**
     * Set a list of IP restriction rules that defines the inbound network access to the search service endpoint. These restriction rules are applied only when the EndpointAccess of the search service is Public.
     *
     * @param ipRules the ipRules value to set
     * @return the NetworkRuleSet object itself.
     */
    public NetworkRuleSet withIpRules(List<IpRule> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

}
