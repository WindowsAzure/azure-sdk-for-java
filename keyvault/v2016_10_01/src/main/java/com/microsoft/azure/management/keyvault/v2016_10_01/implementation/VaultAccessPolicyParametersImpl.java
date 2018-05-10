/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01.implementation;

import com.microsoft.azure.management.keyvault.v2016_10_01.VaultAccessPolicyParameters;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.keyvault.v2016_10_01.VaultAccessPolicyProperties;

class VaultAccessPolicyParametersImpl extends WrapperImpl<VaultAccessPolicyParametersInner> implements VaultAccessPolicyParameters {
    private final KeyVaultManager manager;
    VaultAccessPolicyParametersImpl(VaultAccessPolicyParametersInner inner, KeyVaultManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KeyVaultManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public VaultAccessPolicyProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
