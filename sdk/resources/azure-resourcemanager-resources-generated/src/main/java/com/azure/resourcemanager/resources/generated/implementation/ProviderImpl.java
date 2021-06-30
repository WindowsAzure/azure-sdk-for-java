// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.resourcemanager.resources.generated.fluent.models.ProviderInner;
import com.azure.resourcemanager.resources.generated.models.Provider;
import com.azure.resourcemanager.resources.generated.models.ProviderAuthorizationConsentState;
import com.azure.resourcemanager.resources.generated.models.ProviderResourceType;
import java.util.Collections;
import java.util.List;

public final class ProviderImpl implements Provider {
    private ProviderInner innerObject;

    private final com.azure.resourcemanager.resources.generated.ResourceManager serviceManager;

    ProviderImpl(
        ProviderInner innerObject, com.azure.resourcemanager.resources.generated.ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String namespace() {
        return this.innerModel().namespace();
    }

    public String registrationState() {
        return this.innerModel().registrationState();
    }

    public String registrationPolicy() {
        return this.innerModel().registrationPolicy();
    }

    public List<ProviderResourceType> resourceTypes() {
        List<ProviderResourceType> inner = this.innerModel().resourceTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProviderAuthorizationConsentState providerAuthorizationConsentState() {
        return this.innerModel().providerAuthorizationConsentState();
    }

    public ProviderInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resources.generated.ResourceManager manager() {
        return this.serviceManager;
    }
}
