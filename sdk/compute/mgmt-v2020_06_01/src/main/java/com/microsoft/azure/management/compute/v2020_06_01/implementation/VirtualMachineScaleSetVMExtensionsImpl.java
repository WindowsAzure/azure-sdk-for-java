/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetVMExtensions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetVMExtensionsListResult;
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetVMExtension;

class VirtualMachineScaleSetVMExtensionsImpl extends WrapperImpl<VirtualMachineScaleSetVMExtensionsInner> implements VirtualMachineScaleSetVMExtensions {
    private final ComputeManager manager;

    VirtualMachineScaleSetVMExtensionsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSetVMExtensions());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public VirtualMachineScaleSetVMExtensionImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualMachineScaleSetVMExtensionImpl wrapModel(VirtualMachineScaleSetVMExtensionInner inner) {
        return  new VirtualMachineScaleSetVMExtensionImpl(inner, manager());
    }

    private VirtualMachineScaleSetVMExtensionImpl wrapModel(String name) {
        return new VirtualMachineScaleSetVMExtensionImpl(name, this.manager());
    }

    @Override
    public Observable<VirtualMachineScaleSetVMExtensionsListResult> listAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMExtensionsInner client = this.inner();
        return client.listAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<VirtualMachineScaleSetVMExtensionsListResultInner, VirtualMachineScaleSetVMExtensionsListResult>() {
            @Override
            public VirtualMachineScaleSetVMExtensionsListResult call(VirtualMachineScaleSetVMExtensionsListResultInner inner) {
                return new VirtualMachineScaleSetVMExtensionsListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VirtualMachineScaleSetVMExtension> getAsync(String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName) {
        VirtualMachineScaleSetVMExtensionsInner client = this.inner();
        return client.getAsync(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName)
        .flatMap(new Func1<VirtualMachineScaleSetVMExtensionInner, Observable<VirtualMachineScaleSetVMExtension>>() {
            @Override
            public Observable<VirtualMachineScaleSetVMExtension> call(VirtualMachineScaleSetVMExtensionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VirtualMachineScaleSetVMExtension)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vmScaleSetName, String instanceId, String vmExtensionName) {
        VirtualMachineScaleSetVMExtensionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmScaleSetName, instanceId, vmExtensionName).toCompletable();
    }

}
