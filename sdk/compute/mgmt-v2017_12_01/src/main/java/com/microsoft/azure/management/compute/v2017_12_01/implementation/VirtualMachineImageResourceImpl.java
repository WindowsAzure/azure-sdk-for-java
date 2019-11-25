/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineImageResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.Map;

class VirtualMachineImageResourceImpl extends WrapperImpl<VirtualMachineImageResourceInner> implements VirtualMachineImageResource {
    private final ComputeManager manager;

    VirtualMachineImageResourceImpl(VirtualMachineImageResourceInner inner,  ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

}
