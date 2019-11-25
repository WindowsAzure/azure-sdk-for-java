/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2019_02_28_preview.implementation;

import com.microsoft.azure.management.mixedreality.v2019_02_28_preview.Operation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mixedreality.v2019_02_28_preview.OperationDisplay;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {
    private final MixedRealityManager manager;
    OperationImpl(OperationInner inner, MixedRealityManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MixedRealityManager manager() {
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
