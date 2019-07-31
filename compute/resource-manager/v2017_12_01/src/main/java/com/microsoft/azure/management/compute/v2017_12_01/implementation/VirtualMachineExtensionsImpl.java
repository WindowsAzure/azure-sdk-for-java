/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineExtensions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineExtension;
import rx.Completable;

class VirtualMachineExtensionsImpl extends WrapperImpl<VirtualMachineExtensionsInner> implements VirtualMachineExtensions {
    private final ComputeManager manager;

    VirtualMachineExtensionsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineExtensions());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public VirtualMachineExtensionImpl defineExtension(String name) {
        return wrapExtensionModel(name);
    }

    private VirtualMachineExtensionImpl wrapExtensionModel(String name) {
        return new VirtualMachineExtensionImpl(name, this.manager());
    }

    private VirtualMachineExtensionImpl wrapVirtualMachineExtensionModel(VirtualMachineExtensionInner inner) {
        return  new VirtualMachineExtensionImpl(inner, manager());
    }

    private Observable<VirtualMachineExtensionInner> getVirtualMachineExtensionInnerUsingVirtualMachineExtensionsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String vmName = IdParsingUtils.getValueFromIdByName(id, "virtualMachines");
        String vmExtensionName = IdParsingUtils.getValueFromIdByName(id, "extensions");
        VirtualMachineExtensionsInner client = this.inner();
        return client.getAsync(resourceGroupName, vmName, vmExtensionName);
    }

    @Override
    public Observable<VirtualMachineExtension> getAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        VirtualMachineExtensionsInner client = this.inner();
        return client.getAsync(resourceGroupName, vmName, vmExtensionName)
        .map(new Func1<VirtualMachineExtensionInner, VirtualMachineExtension>() {
            @Override
            public VirtualMachineExtension call(VirtualMachineExtensionInner inner) {
                return wrapVirtualMachineExtensionModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vmName, String vmExtensionName) {
        VirtualMachineExtensionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmName, vmExtensionName).toCompletable();
    }

}
