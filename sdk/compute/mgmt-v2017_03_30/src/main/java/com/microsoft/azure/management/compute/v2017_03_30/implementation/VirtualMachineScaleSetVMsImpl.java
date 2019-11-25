/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineScaleSetVMs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2017_03_30.OperationStatusResponse;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineScaleSetVMInstanceView;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineScaleSetVM;

class VirtualMachineScaleSetVMsImpl extends WrapperImpl<VirtualMachineScaleSetVMsInner> implements VirtualMachineScaleSetVMs {
    private final ComputeManager manager;

    VirtualMachineScaleSetVMsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSetVMs());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private VirtualMachineScaleSetVMImpl wrapModel(VirtualMachineScaleSetVMInner inner) {
        return  new VirtualMachineScaleSetVMImpl(inner, manager());
    }

    @Override
    public Observable<OperationStatusResponse> reimageAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.reimageAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> reimageAllAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.reimageAllAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> deallocateAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.deallocateAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VirtualMachineScaleSetVMInstanceView> getInstanceViewAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.getInstanceViewAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<VirtualMachineScaleSetVMInstanceViewInner, VirtualMachineScaleSetVMInstanceView>() {
            @Override
            public VirtualMachineScaleSetVMInstanceView call(VirtualMachineScaleSetVMInstanceViewInner inner) {
                return new VirtualMachineScaleSetVMInstanceViewImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> powerOffAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.powerOffAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> restartAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.restartAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> startAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.startAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VirtualMachineScaleSetVM> listAsync(final String resourceGroupName, final String virtualMachineScaleSetName) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.listAsync(resourceGroupName, virtualMachineScaleSetName)
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetVMInner>, Iterable<VirtualMachineScaleSetVMInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetVMInner> call(Page<VirtualMachineScaleSetVMInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineScaleSetVMInner, VirtualMachineScaleSetVM>() {
            @Override
            public VirtualMachineScaleSetVM call(VirtualMachineScaleSetVMInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<VirtualMachineScaleSetVM> getAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.getAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<VirtualMachineScaleSetVMInner, VirtualMachineScaleSetVM>() {
            @Override
            public VirtualMachineScaleSetVM call(VirtualMachineScaleSetVMInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

}
