// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.implementation;

import com.azure.resourcemanager.dataprotection.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryDisplay;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryForProperties;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryValueForSingleApi;

public final class ClientDiscoveryValueForSingleApiImpl implements ClientDiscoveryValueForSingleApi {
    private ClientDiscoveryValueForSingleApiInner innerObject;

    private final com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager;

    ClientDiscoveryValueForSingleApiImpl(
        ClientDiscoveryValueForSingleApiInner innerObject,
        com.azure.resourcemanager.dataprotection.DataProtectionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ClientDiscoveryDisplay display() {
        return this.innerModel().display();
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public ClientDiscoveryForProperties properties() {
        return this.innerModel().properties();
    }

    public ClientDiscoveryValueForSingleApiInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dataprotection.DataProtectionManager manager() {
        return this.serviceManager;
    }
}
