// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.SubscriptionPolicies;
import com.azure.management.resources.SubscriptionState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Subscription model.
 */
@Fluent
public final class SubscriptionInner {
    /*
     * The fully qualified ID for the subscription. For example,
     * /subscriptions/00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The subscription ID.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /*
     * The subscription display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The subscription state. Possible values are Enabled, Warned, PastDue,
     * Disabled, and Deleted.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionState state;

    /*
     * Subscription policies.
     */
    @JsonProperty(value = "subscriptionPolicies")
    private SubscriptionPolicies subscriptionPolicies;

    /*
     * The authorization source of the request. Valid values are one or more
     * combinations of Legacy, RoleBased, Bypassed, Direct and Management. For
     * example, 'Legacy, RoleBased'.
     */
    @JsonProperty(value = "authorizationSource")
    private String authorizationSource;

    /**
     * Get the id property: The fully qualified ID for the subscription. For
     * example, /subscriptions/00000000-0000-0000-0000-000000000000.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the subscriptionId property: The subscription ID.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the displayName property: The subscription display name.
     * 
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Get the state property: The subscription state. Possible values are
     * Enabled, Warned, PastDue, Disabled, and Deleted.
     * 
     * @return the state value.
     */
    public SubscriptionState getState() {
        return this.state;
    }

    /**
     * Get the subscriptionPolicies property: Subscription policies.
     * 
     * @return the subscriptionPolicies value.
     */
    public SubscriptionPolicies getSubscriptionPolicies() {
        return this.subscriptionPolicies;
    }

    /**
     * Set the subscriptionPolicies property: Subscription policies.
     * 
     * @param subscriptionPolicies the subscriptionPolicies value to set.
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner setSubscriptionPolicies(SubscriptionPolicies subscriptionPolicies) {
        this.subscriptionPolicies = subscriptionPolicies;
        return this;
    }

    /**
     * Get the authorizationSource property: The authorization source of the
     * request. Valid values are one or more combinations of Legacy, RoleBased,
     * Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
     * 
     * @return the authorizationSource value.
     */
    public String getAuthorizationSource() {
        return this.authorizationSource;
    }

    /**
     * Set the authorizationSource property: The authorization source of the
     * request. Valid values are one or more combinations of Legacy, RoleBased,
     * Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
     * 
     * @param authorizationSource the authorizationSource value to set.
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner setAuthorizationSource(String authorizationSource) {
        this.authorizationSource = authorizationSource;
        return this;
    }
}
