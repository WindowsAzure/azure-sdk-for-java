// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The WebApplicationFirewallPolicyListResult model.
 */
@Immutable
public final class WebApplicationFirewallPolicyListResultInner {
    /*
     * List of WebApplicationFirewallPolicies within a resource group.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<WebApplicationFirewallPolicyInner> value;

    /*
     * URL to get the next set of WebApplicationFirewallPolicy objects if there
     * are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of WebApplicationFirewallPolicies within a
     * resource group.
     * 
     * @return the value value.
     */
    public List<WebApplicationFirewallPolicyInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: URL to get the next set of
     * WebApplicationFirewallPolicy objects if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }
}
