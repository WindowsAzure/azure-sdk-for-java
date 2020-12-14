// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.resourcemanager.keyvault.generated.KeyVaultManager;
import com.azure.resourcemanager.keyvault.generated.fluent.models.VaultAccessPolicyParametersInner;
import com.azure.resourcemanager.keyvault.generated.models.VaultAccessPolicyParameters;
import com.azure.resourcemanager.keyvault.generated.models.VaultAccessPolicyProperties;

public final class VaultAccessPolicyParametersImpl implements VaultAccessPolicyParameters {
    private VaultAccessPolicyParametersInner innerObject;

    private final KeyVaultManager serviceManager;

    public VaultAccessPolicyParametersImpl(
        VaultAccessPolicyParametersInner innerObject, KeyVaultManager serviceManager) {
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

    public VaultAccessPolicyProperties properties() {
        return this.innerModel().properties();
    }

    public VaultAccessPolicyParametersInner innerModel() {
        return this.innerObject;
    }

    private KeyVaultManager manager() {
        return this.serviceManager;
    }
}
