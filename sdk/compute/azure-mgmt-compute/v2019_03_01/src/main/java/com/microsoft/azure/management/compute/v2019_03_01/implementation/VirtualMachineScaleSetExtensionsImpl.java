/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineScaleSetExtensions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2019_03_01.VirtualMachineScaleSetExtension;

class VirtualMachineScaleSetExtensionsImpl extends WrapperImpl<VirtualMachineScaleSetExtensionsInner> implements VirtualMachineScaleSetExtensions {
    private final ComputeManager manager;

    VirtualMachineScaleSetExtensionsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSetExtensions());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl define(String name) {
        return wrapModel(name);
    }

    private VirtualMachineScaleSetExtensionImpl wrapModel(VirtualMachineScaleSetExtensionInner inner) {
        return  new VirtualMachineScaleSetExtensionImpl(inner, manager());
    }

    private VirtualMachineScaleSetExtensionImpl wrapModel(String name) {
        return new VirtualMachineScaleSetExtensionImpl(name, this.manager());
    }

    @Override
    public Observable<VirtualMachineScaleSetExtension> listAsync(final String resourceGroupName, final String vmScaleSetName) {
        VirtualMachineScaleSetExtensionsInner client = this.inner();
        return client.listAsync(resourceGroupName, vmScaleSetName)
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetExtensionInner>, Iterable<VirtualMachineScaleSetExtensionInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetExtensionInner> call(Page<VirtualMachineScaleSetExtensionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineScaleSetExtensionInner, VirtualMachineScaleSetExtension>() {
            @Override
            public VirtualMachineScaleSetExtension call(VirtualMachineScaleSetExtensionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualMachineScaleSetExtension> getAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        VirtualMachineScaleSetExtensionsInner client = this.inner();
        return client.getAsync(resourceGroupName, vmScaleSetName, vmssExtensionName)
        .flatMap(new Func1<VirtualMachineScaleSetExtensionInner, Observable<VirtualMachineScaleSetExtension>>() {
            @Override
            public Observable<VirtualMachineScaleSetExtension> call(VirtualMachineScaleSetExtensionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VirtualMachineScaleSetExtension)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        VirtualMachineScaleSetExtensionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmScaleSetName, vmssExtensionName).toCompletable();
    }

}
