/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2018_02_14.implementation;

import com.microsoft.azure.management.keyvault.v2018_02_14.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.keyvault.v2018_02_14.OperationDisplay;
import com.microsoft.azure.management.keyvault.v2018_02_14.ServiceSpecification;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final KeyVaultManager manager;
    OperationImpl(OperationInner inner, KeyVaultManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KeyVaultManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public ServiceSpecification serviceSpecification() {
        return this.inner().serviceSpecification();
    }

}
