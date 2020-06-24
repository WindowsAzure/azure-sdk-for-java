/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.management.compute.v2017_12_01.ComputeOperationValue;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ComputeOperationValueImpl extends WrapperImpl<ComputeOperationValueInner> implements ComputeOperationValue {
    private final ComputeManager manager;
    ComputeOperationValueImpl(ComputeOperationValueInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String operation() {
        return this.inner().operation();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public String provider() {
        return this.inner().provider();
    }

    @Override
    public String resource() {
        return this.inner().resource();
    }

}
