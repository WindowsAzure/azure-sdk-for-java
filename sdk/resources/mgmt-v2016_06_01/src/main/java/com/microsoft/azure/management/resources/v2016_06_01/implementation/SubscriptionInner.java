/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2016_06_01.implementation;

import com.microsoft.azure.management.resources.v2016_06_01.SubscriptionState;
import com.microsoft.azure.management.resources.v2016_06_01.SubscriptionPolicies;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscription information.
 */
public class SubscriptionInner {
    /**
     * The fully qualified ID for the subscription. For example,
     * /subscriptions/00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The subscription ID.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /**
     * The subscription display name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /**
     * The subscription state. Possible values are Enabled, Warned, PastDue,
     * Disabled, and Deleted. Possible values include: 'Enabled', 'Warned',
     * 'PastDue', 'Disabled', 'Deleted'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionState state;

    /**
     * The subscription policies.
     */
    @JsonProperty(value = "subscriptionPolicies")
    private SubscriptionPolicies subscriptionPolicies;

    /**
     * The authorization source of the request. Valid values are one or more
     * combinations of Legacy, RoleBased, Bypassed, Direct and Management. For
     * example, 'Legacy, RoleBased'.
     */
    @JsonProperty(value = "authorizationSource")
    private String authorizationSource;

    /**
     * Get the fully qualified ID for the subscription. For example, /subscriptions/00000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the subscription ID.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the subscription display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the subscription state. Possible values are Enabled, Warned, PastDue, Disabled, and Deleted. Possible values include: 'Enabled', 'Warned', 'PastDue', 'Disabled', 'Deleted'.
     *
     * @return the state value
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Get the subscription policies.
     *
     * @return the subscriptionPolicies value
     */
    public SubscriptionPolicies subscriptionPolicies() {
        return this.subscriptionPolicies;
    }

    /**
     * Set the subscription policies.
     *
     * @param subscriptionPolicies the subscriptionPolicies value to set
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner withSubscriptionPolicies(SubscriptionPolicies subscriptionPolicies) {
        this.subscriptionPolicies = subscriptionPolicies;
        return this;
    }

    /**
     * Get the authorization source of the request. Valid values are one or more combinations of Legacy, RoleBased, Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
     *
     * @return the authorizationSource value
     */
    public String authorizationSource() {
        return this.authorizationSource;
    }

    /**
     * Set the authorization source of the request. Valid values are one or more combinations of Legacy, RoleBased, Bypassed, Direct and Management. For example, 'Legacy, RoleBased'.
     *
     * @param authorizationSource the authorizationSource value to set
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner withAuthorizationSource(String authorizationSource) {
        this.authorizationSource = authorizationSource;
        return this;
    }

}
