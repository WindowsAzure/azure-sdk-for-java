// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeConnectionInfoInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeConnectionInfo;
import java.util.Collections;
import java.util.Map;

public final class IntegrationRuntimeConnectionInfoImpl implements IntegrationRuntimeConnectionInfo {
    private IntegrationRuntimeConnectionInfoInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    IntegrationRuntimeConnectionInfoImpl(
        IntegrationRuntimeConnectionInfoInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String serviceToken() {
        return this.innerModel().serviceToken();
    }

    public String identityCertThumbprint() {
        return this.innerModel().identityCertThumbprint();
    }

    public String hostServiceUri() {
        return this.innerModel().hostServiceUri();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String publicKey() {
        return this.innerModel().publicKey();
    }

    public Boolean isIdentityCertExprired() {
        return this.innerModel().isIdentityCertExprired();
    }

    public Map<String, Object> additionalProperties() {
        Map<String, Object> inner = this.innerModel().additionalProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public IntegrationRuntimeConnectionInfoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
