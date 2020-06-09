/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_06_01.implementation;

import com.microsoft.azure.management.resources.v2018_06_01.Subscription;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2018_06_01.SubscriptionState;
import com.microsoft.azure.management.resources.v2018_06_01.SubscriptionPolicies;

class SubscriptionImpl extends WrapperImpl<SubscriptionInner> implements Subscription {
    private final ResourcesManager manager;
    SubscriptionImpl(SubscriptionInner inner, ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public String authorizationSource() {
        return this.inner().authorizationSource();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public SubscriptionState state() {
        return this.inner().state();
    }

    @Override
    public String subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public SubscriptionPolicies subscriptionPolicies() {
        return this.inner().subscriptionPolicies();
    }

    @Override
    public String tenantId() {
        return this.inner().tenantId();
    }

}
