/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_10_01.implementation;

import com.microsoft.azure.management.containerregistry.v2017_10_01.RegistryPolicies;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.containerregistry.v2017_10_01.QuarantinePolicy;
import com.microsoft.azure.management.containerregistry.v2017_10_01.TrustPolicy;

class RegistryPoliciesImpl extends WrapperImpl<RegistryPoliciesInner> implements RegistryPolicies {
    private final ContainerRegistryManager manager;
    RegistryPoliciesImpl(RegistryPoliciesInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public QuarantinePolicy quarantinePolicy() {
        return this.inner().quarantinePolicy();
    }

    @Override
    public TrustPolicy trustPolicy() {
        return this.inner().trustPolicy();
    }

}
