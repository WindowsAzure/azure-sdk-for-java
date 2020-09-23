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
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetVMs;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetVMInstanceView;
import com.microsoft.azure.management.compute.v2020_06_01.RetrieveBootDiagnosticsDataResult;
import com.microsoft.azure.management.compute.v2020_06_01.RunCommandResult;
import com.microsoft.azure.management.compute.v2020_06_01.RunCommandInput;
import com.microsoft.azure.management.compute.v2020_06_01.VirtualMachineScaleSetVM;

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
    public Completable reimageAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.reimageAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

    @Override
    public Completable reimageAllAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.reimageAllAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

    @Override
    public Completable deallocateAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.deallocateAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
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
    public Completable powerOffAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.powerOffAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

    @Override
    public Completable restartAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.restartAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

    @Override
    public Completable startAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.startAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

    @Override
    public Completable redeployAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.redeployAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

    @Override
    public Observable<RetrieveBootDiagnosticsDataResult> retrieveBootDiagnosticsDataAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.retrieveBootDiagnosticsDataAsync(resourceGroupName, vmScaleSetName, instanceId)
        .map(new Func1<RetrieveBootDiagnosticsDataResultInner, RetrieveBootDiagnosticsDataResult>() {
            @Override
            public RetrieveBootDiagnosticsDataResult call(RetrieveBootDiagnosticsDataResultInner inner) {
                return new RetrieveBootDiagnosticsDataResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable performMaintenanceAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.performMaintenanceAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

    @Override
    public Completable simulateEvictionAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.simulateEvictionAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

    @Override
    public Observable<RunCommandResult> runCommandAsync(String resourceGroupName, String vmScaleSetName, String instanceId, RunCommandInput parameters) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.runCommandAsync(resourceGroupName, vmScaleSetName, instanceId, parameters)
        .map(new Func1<RunCommandResultInner, RunCommandResult>() {
            @Override
            public RunCommandResult call(RunCommandResultInner inner) {
                return new RunCommandResultImpl(inner, manager());
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
        .flatMap(new Func1<VirtualMachineScaleSetVMInner, Observable<VirtualMachineScaleSetVM>>() {
            @Override
            public Observable<VirtualMachineScaleSetVM> call(VirtualMachineScaleSetVMInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((VirtualMachineScaleSetVM)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String vmScaleSetName, String instanceId) {
        VirtualMachineScaleSetVMsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmScaleSetName, instanceId).toCompletable();
    }

}
