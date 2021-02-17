// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.implementation;

import com.azure.resourcemanager.providerhub.ProviderhubManager;
import com.azure.resourcemanager.providerhub.fluent.models.ResourceProviderManifestInner;
import com.azure.resourcemanager.providerhub.models.FeaturesRule;
import com.azure.resourcemanager.providerhub.models.ReRegisterSubscriptionMetadata;
import com.azure.resourcemanager.providerhub.models.RequestHeaderOptions;
import com.azure.resourcemanager.providerhub.models.ResourceProviderAuthentication;
import com.azure.resourcemanager.providerhub.models.ResourceProviderAuthorization;
import com.azure.resourcemanager.providerhub.models.ResourceProviderCapabilities;
import com.azure.resourcemanager.providerhub.models.ResourceProviderEndpoint;
import com.azure.resourcemanager.providerhub.models.ResourceProviderManagement;
import com.azure.resourcemanager.providerhub.models.ResourceProviderManifest;
import com.azure.resourcemanager.providerhub.models.ResourceProviderType;
import com.azure.resourcemanager.providerhub.models.ResourceType;
import java.util.Collections;
import java.util.List;

public final class ResourceProviderManifestImpl implements ResourceProviderManifest {
    private ResourceProviderManifestInner innerObject;

    private final ProviderhubManager serviceManager;

    ResourceProviderManifestImpl(ResourceProviderManifestInner innerObject, ProviderhubManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ResourceProviderAuthentication providerAuthentication() {
        return this.innerModel().providerAuthentication();
    }

    public List<ResourceProviderAuthorization> providerAuthorizations() {
        List<ResourceProviderAuthorization> inner = this.innerModel().providerAuthorizations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String namespace() {
        return this.innerModel().namespace();
    }

    public String providerVersion() {
        return this.innerModel().providerVersion();
    }

    public ResourceProviderType providerType() {
        return this.innerModel().providerType();
    }

    public List<String> requiredFeatures() {
        List<String> inner = this.innerModel().requiredFeatures();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public FeaturesRule featuresRule() {
        return this.innerModel().featuresRule();
    }

    public RequestHeaderOptions requestHeaderOptions() {
        return this.innerModel().requestHeaderOptions();
    }

    public List<ResourceType> resourceTypes() {
        List<ResourceType> inner = this.innerModel().resourceTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceProviderManagement management() {
        return this.innerModel().management();
    }

    public List<ResourceProviderCapabilities> capabilities() {
        List<ResourceProviderCapabilities> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Object metadata() {
        return this.innerModel().metadata();
    }

    public List<ResourceProviderEndpoint> globalNotificationEndpoints() {
        List<ResourceProviderEndpoint> inner = this.innerModel().globalNotificationEndpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ReRegisterSubscriptionMetadata reRegisterSubscriptionMetadata() {
        return this.innerModel().reRegisterSubscriptionMetadata();
    }

    public ResourceProviderManifestInner innerModel() {
        return this.innerObject;
    }

    private ProviderhubManager manager() {
        return this.serviceManager;
    }
}
