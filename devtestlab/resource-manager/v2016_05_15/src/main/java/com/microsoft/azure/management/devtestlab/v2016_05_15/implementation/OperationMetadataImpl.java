/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlab.v2016_05_15.OperationMetadata;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devtestlab.v2016_05_15.OperationMetadataDisplay;

class OperationMetadataImpl extends WrapperImpl<OperationMetadataInner> implements OperationMetadata {
    private final DevTestLabManager manager;
    OperationMetadataImpl(OperationMetadataInner inner, DevTestLabManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevTestLabManager manager() {
        return this.manager;
    }

    @Override
    public OperationMetadataDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
