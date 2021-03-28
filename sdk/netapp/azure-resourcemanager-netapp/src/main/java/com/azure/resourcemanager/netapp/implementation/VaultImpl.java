// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.VaultInner;
import com.azure.resourcemanager.netapp.models.Vault;

public final class VaultImpl implements Vault {
    private VaultInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    VaultImpl(VaultInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
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

    public String location() {
        return this.innerModel().location();
    }

    public String vaultName() {
        return this.innerModel().vaultName();
    }

    public VaultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
