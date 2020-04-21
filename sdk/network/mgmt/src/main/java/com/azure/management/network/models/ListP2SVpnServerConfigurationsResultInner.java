// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ListP2SVpnServerConfigurationsResult model.
 */
@Fluent
public final class ListP2SVpnServerConfigurationsResultInner {
    /*
     * List of P2SVpnServerConfigurations.
     */
    @JsonProperty(value = "value")
    private List<P2SVpnServerConfigurationInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of P2SVpnServerConfigurations.
     * 
     * @return the value value.
     */
    public List<P2SVpnServerConfigurationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of P2SVpnServerConfigurations.
     * 
     * @param value the value value to set.
     * @return the ListP2SVpnServerConfigurationsResultInner object itself.
     */
    public ListP2SVpnServerConfigurationsResultInner withValue(List<P2SVpnServerConfigurationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list
     * results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list
     * results if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ListP2SVpnServerConfigurationsResultInner object itself.
     */
    public ListP2SVpnServerConfigurationsResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
