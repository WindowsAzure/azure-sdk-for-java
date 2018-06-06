/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachines;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachine;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineCaptureResult;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineInstanceView;
import com.microsoft.azure.management.compute.v2017_03_30.OperationStatusResponse;
import com.microsoft.azure.management.compute.v2017_03_30.RunCommandResult;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineCaptureParameters;
import com.microsoft.azure.management.compute.v2017_03_30.RunCommandInput;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineExtensionsListResult;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineVirtualMachineSize;

class VirtualMachinesImpl extends GroupableResourcesCoreImpl<VirtualMachine, VirtualMachineImpl, VirtualMachineInner, VirtualMachinesInner, ComputeManager>  implements VirtualMachines {
    protected VirtualMachinesImpl(ComputeManager manager) {
        super(manager.inner().virtualMachines(), manager);
    }

    @Override
    protected Observable<VirtualMachineInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualMachinesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualMachinesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<VirtualMachine> listByResourceGroup(String resourceGroupName) {
        VirtualMachinesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<VirtualMachineInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VirtualMachinesInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<VirtualMachineInner>, Observable<Page<VirtualMachineInner>>>() {
            @Override
            public Observable<Page<VirtualMachineInner>> call(Page<VirtualMachineInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<VirtualMachine> listByResourceGroupAsync(String resourceGroupName) {
        VirtualMachinesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<VirtualMachineInner>, Observable<Page<VirtualMachineInner>>>() {
            @Override
            public Observable<Page<VirtualMachineInner>> call(Page<VirtualMachineInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<VirtualMachineInner>, Iterable<VirtualMachineInner>>() {
            @Override
            public Iterable<VirtualMachineInner> call(Page<VirtualMachineInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineInner, VirtualMachine>() {
            @Override
            public VirtualMachine call(VirtualMachineInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<VirtualMachine> list() {
        VirtualMachinesInner client = this.inner();
        return this.wrapList(client.list());
    }

    private Observable<Page<VirtualMachineInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VirtualMachinesInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<VirtualMachineInner>, Observable<Page<VirtualMachineInner>>>() {
            @Override
            public Observable<Page<VirtualMachineInner>> call(Page<VirtualMachineInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<VirtualMachine> listAsync() {
        VirtualMachinesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<VirtualMachineInner>, Iterable<VirtualMachineInner>>() {
            @Override
            public Iterable<VirtualMachineInner> call(Page<VirtualMachineInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualMachineInner, VirtualMachine>() {
            @Override
            public VirtualMachine call(VirtualMachineInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VirtualMachineImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<VirtualMachineCaptureResult> captureAsync(String resourceGroupName, String vmName, VirtualMachineCaptureParameters parameters) {
        VirtualMachinesInner client = this.inner();
        return client.captureAsync(resourceGroupName, vmName, parameters)
        .map(new Func1<VirtualMachineCaptureResultInner, VirtualMachineCaptureResult>() {
            @Override
            public VirtualMachineCaptureResult call(VirtualMachineCaptureResultInner inner) {
                return new VirtualMachineCaptureResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VirtualMachineInstanceView> instanceViewAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.instanceViewAsync(resourceGroupName, vmName)
        .map(new Func1<VirtualMachineInstanceViewInner, VirtualMachineInstanceView>() {
            @Override
            public VirtualMachineInstanceView call(VirtualMachineInstanceViewInner inner) {
                return new VirtualMachineInstanceViewImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> convertToManagedDisksAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.convertToManagedDisksAsync(resourceGroupName, vmName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> deallocateAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.deallocateAsync(resourceGroupName, vmName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> generalizeAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.generalizeAsync(resourceGroupName, vmName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> powerOffAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.powerOffAsync(resourceGroupName, vmName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> restartAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.restartAsync(resourceGroupName, vmName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> startAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.startAsync(resourceGroupName, vmName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> redeployAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.redeployAsync(resourceGroupName, vmName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<OperationStatusResponse> performMaintenanceAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.performMaintenanceAsync(resourceGroupName, vmName)
        .map(new Func1<OperationStatusResponseInner, OperationStatusResponse>() {
            @Override
            public OperationStatusResponse call(OperationStatusResponseInner inner) {
                return new OperationStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RunCommandResult> runCommandAsync(String resourceGroupName, String vmName, RunCommandInput parameters) {
        VirtualMachinesInner client = this.inner();
        return client.runCommandAsync(resourceGroupName, vmName, parameters)
        .map(new Func1<RunCommandResultInner, RunCommandResult>() {
            @Override
            public RunCommandResult call(RunCommandResultInner inner) {
                return new RunCommandResultImpl(inner, manager());
            }
        });
    }

    @Override
    protected VirtualMachineImpl wrapModel(VirtualMachineInner inner) {
        return  new VirtualMachineImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualMachineImpl wrapModel(String name) {
        return new VirtualMachineImpl(name, new VirtualMachineInner(), this.manager());
    }

    private VirtualMachineVirtualMachineSizeImpl wrapVirtualMachineVirtualMachineSizeModel(VirtualMachineSizeInner inner) {
        return  new VirtualMachineVirtualMachineSizeImpl(inner, manager());
    }

    @Override
    public Observable<VirtualMachineExtensionsListResult> getExtensionsAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.getExtensionsAsync(resourceGroupName, vmName)
        .map(new Func1<VirtualMachineExtensionsListResultInner, VirtualMachineExtensionsListResult>() {
            @Override
            public VirtualMachineExtensionsListResult call(VirtualMachineExtensionsListResultInner inner) {
                return new VirtualMachineExtensionsListResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<VirtualMachineVirtualMachineSize> listAvailableSizesAsync(String resourceGroupName, String vmName) {
        VirtualMachinesInner client = this.inner();
        return client.listAvailableSizesAsync(resourceGroupName, vmName)
        .flatMap(new Func1<List<VirtualMachineSizeInner>, Observable<VirtualMachineSizeInner>>() {
            @Override
            public Observable<VirtualMachineSizeInner> call(List<VirtualMachineSizeInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineSizeInner, VirtualMachineVirtualMachineSize>() {
            @Override
            public VirtualMachineVirtualMachineSize call(VirtualMachineSizeInner inner) {
                return wrapVirtualMachineVirtualMachineSizeModel(inner);
            }
        });
    }

}
