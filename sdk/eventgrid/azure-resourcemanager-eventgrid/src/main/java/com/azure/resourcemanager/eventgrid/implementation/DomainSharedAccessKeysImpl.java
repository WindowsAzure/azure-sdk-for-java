// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainSharedAccessKeysInner;
import com.azure.resourcemanager.eventgrid.models.DomainSharedAccessKeys;

public final class DomainSharedAccessKeysImpl implements DomainSharedAccessKeys {
    private DomainSharedAccessKeysInner innerObject;

    private final EventGridManager serviceManager;

    DomainSharedAccessKeysImpl(DomainSharedAccessKeysInner innerObject, EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String key1() {
        return this.innerModel().key1();
    }

    public String key2() {
        return this.innerModel().key2();
    }

    public DomainSharedAccessKeysInner innerModel() {
        return this.innerObject;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }
}
