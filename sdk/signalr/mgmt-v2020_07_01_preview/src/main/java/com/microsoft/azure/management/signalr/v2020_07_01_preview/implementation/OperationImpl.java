/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_07_01_preview.implementation;

import com.microsoft.azure.management.signalr.v2020_07_01_preview.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.signalr.v2020_07_01_preview.OperationDisplay;
import com.microsoft.azure.management.signalr.v2020_07_01_preview.OperationProperties;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final SignalRServiceManager manager;
    OperationImpl(OperationInner inner, SignalRServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SignalRServiceManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public Boolean isDataAction() {
        return this.inner().isDataAction();
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
    public OperationProperties properties() {
        return this.inner().properties();
    }

}
