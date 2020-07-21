/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_11_01.implementation;

import com.microsoft.azure.management.resources.v2019_11_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_11_01.OperationDisplay;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final ResourcesManager manager;
    OperationImpl(OperationInner inner, ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
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

}
