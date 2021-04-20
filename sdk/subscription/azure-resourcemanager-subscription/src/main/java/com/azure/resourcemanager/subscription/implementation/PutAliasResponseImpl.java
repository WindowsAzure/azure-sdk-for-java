// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.implementation;

import com.azure.resourcemanager.subscription.fluent.models.PutAliasResponseInner;
import com.azure.resourcemanager.subscription.models.PutAliasResponse;
import com.azure.resourcemanager.subscription.models.PutAliasResponseProperties;

public final class PutAliasResponseImpl implements PutAliasResponse {
    private PutAliasResponseInner innerObject;

    private final com.azure.resourcemanager.subscription.SubscriptionManager serviceManager;

    PutAliasResponseImpl(
        PutAliasResponseInner innerObject, com.azure.resourcemanager.subscription.SubscriptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PutAliasResponseProperties properties() {
        return this.innerModel().properties();
    }

    public PutAliasResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.subscription.SubscriptionManager manager() {
        return this.serviceManager;
    }
}
