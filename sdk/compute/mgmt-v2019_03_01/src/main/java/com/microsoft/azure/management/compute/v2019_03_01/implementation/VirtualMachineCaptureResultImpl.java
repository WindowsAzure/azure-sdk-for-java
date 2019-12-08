/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineCaptureResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class VirtualMachineCaptureResultImpl extends WrapperImpl<VirtualMachineCaptureResultInner> implements VirtualMachineCaptureResult {
    private final ComputeManager manager;
    VirtualMachineCaptureResultImpl(VirtualMachineCaptureResultInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public String contentVersion() {
        return this.inner().contentVersion();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Object parameters() {
        return this.inner().parameters();
    }

    @Override
    public List<Object> resources() {
        return this.inner().resources();
    }

    @Override
    public String schema() {
        return this.inner().schema();
    }

}
