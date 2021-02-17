// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.models.ProviderRegistrationInner;
import com.azure.resourcemanager.providerhub.models.ProviderRegistration;
import com.azure.resourcemanager.providerhub.models.ProviderRegistrationProperties;

public final class ProviderRegistrationImpl implements ProviderRegistration {
    private ProviderRegistrationInner innerObject;

    private final ProviderhubManager serviceManager;

    ProviderRegistrationImpl(ProviderRegistrationInner innerObject, ProviderhubManager serviceManager) {
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

    public ProviderRegistrationProperties properties() {
        return this.innerModel().properties();
    }

    public ProviderRegistrationInner innerModel() {
        return this.innerObject;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }
}
