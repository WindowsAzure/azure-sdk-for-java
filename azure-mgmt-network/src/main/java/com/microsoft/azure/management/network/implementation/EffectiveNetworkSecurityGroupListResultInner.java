/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import java.util.List;
import com.microsoft.azure.management.network.EffectiveNetworkSecurityGroup;

/**
 * Response for list effective network security groups api service call.
 */
public class EffectiveNetworkSecurityGroupListResultInner {
    /**
     * Gets list of effective network security groups.
     */
    private List<EffectiveNetworkSecurityGroup> value;

    /**
     * Gets the URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<EffectiveNetworkSecurityGroup> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the EffectiveNetworkSecurityGroupListResultInner object itself.
     */
    public EffectiveNetworkSecurityGroupListResultInner withValue(List<EffectiveNetworkSecurityGroup> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the EffectiveNetworkSecurityGroupListResultInner object itself.
     */
    public EffectiveNetworkSecurityGroupListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
