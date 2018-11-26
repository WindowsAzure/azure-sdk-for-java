/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2018_08_01.EffectiveNetworkSecurityGroup;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for list effective network security groups API service call.
 */
public class EffectiveNetworkSecurityGroupListResultInner {
    /**
     * A list of effective network security groups.
     */
    @JsonProperty(value = "value")
    private List<EffectiveNetworkSecurityGroup> value;

    /**
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get a list of effective network security groups.
     *
     * @return the value value
     */
    public List<EffectiveNetworkSecurityGroup> value() {
        return this.value;
    }

    /**
     * Set a list of effective network security groups.
     *
     * @param value the value value to set
     * @return the EffectiveNetworkSecurityGroupListResultInner object itself.
     */
    public EffectiveNetworkSecurityGroupListResultInner withValue(List<EffectiveNetworkSecurityGroup> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the URL to get the next set of results.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

}
