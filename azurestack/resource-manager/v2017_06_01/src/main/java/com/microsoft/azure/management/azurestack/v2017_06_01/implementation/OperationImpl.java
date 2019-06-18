/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01.implementation;

import com.microsoft.azure.management.azurestack.v2017_06_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.azurestack.v2017_06_01.Display;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final AzureStackManager manager;
    OperationImpl(OperationInner inner, AzureStackManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AzureStackManager manager() {
        return this.manager;
    }

    @Override
    public Display display() {
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

}
