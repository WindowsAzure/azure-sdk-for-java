/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation;

import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.Display;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final HanaOnAzureManager manager;
    OperationImpl(OperationInner inner, HanaOnAzureManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public HanaOnAzureManager manager() {
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

}
