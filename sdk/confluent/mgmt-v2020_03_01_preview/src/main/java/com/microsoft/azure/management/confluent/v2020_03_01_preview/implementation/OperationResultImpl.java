/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.confluent.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.confluent.v2020_03_01_preview.OperationResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.confluent.v2020_03_01_preview.OperationDisplay;

class OperationResultImpl extends WrapperImpl<OperationResultInner> implements OperationResult {
    private final ConfluentManager manager;
    OperationResultImpl(OperationResultInner inner, ConfluentManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ConfluentManager manager() {
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
