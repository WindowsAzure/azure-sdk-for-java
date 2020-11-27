/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final ADHybridHealthServiceManager manager;
    OperationImpl(OperationInner inner, ADHybridHealthServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }

    @Override
    public Object display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
