/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServices;
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudService;
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
import com.microsoft.azure.management.compute.v2020_10_01_preview.CloudServiceInstanceView;
import java.util.List;

class CloudServicesImpl extends GroupableResourcesCoreImpl<CloudService, CloudServiceImpl, CloudServiceInner, CloudServicesInner, ComputeManager>  implements CloudServices {
    protected CloudServicesImpl(ComputeManager manager) {
        super(manager.inner().cloudServices(), manager);
    }

    @Override
    protected Observable<CloudServiceInner> getInnerAsync(String resourceGroupName, String name) {
        CloudServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        CloudServicesInner client = this.inner();
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
    public PagedList<CloudService> listByResourceGroup(String resourceGroupName) {
        CloudServicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<CloudService> listByResourceGroupAsync(String resourceGroupName) {
        CloudServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<CloudServiceInner>, Iterable<CloudServiceInner>>() {
            @Override
            public Iterable<CloudServiceInner> call(Page<CloudServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CloudServiceInner, CloudService>() {
            @Override
            public CloudService call(CloudServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<CloudService> list() {
        CloudServicesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<CloudService> listAsync() {
        CloudServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<CloudServiceInner>, Iterable<CloudServiceInner>>() {
            @Override
            public Iterable<CloudServiceInner> call(Page<CloudServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CloudServiceInner, CloudService>() {
            @Override
            public CloudService call(CloudServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public CloudServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<CloudServiceInstanceView> getInstanceViewAsync(String resourceGroupName, String cloudServiceName) {
        CloudServicesInner client = this.inner();
        return client.getInstanceViewAsync(resourceGroupName, cloudServiceName)
        .map(new Func1<CloudServiceInstanceViewInner, CloudServiceInstanceView>() {
            @Override
            public CloudServiceInstanceView call(CloudServiceInstanceViewInner inner) {
                return new CloudServiceInstanceViewImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable startAsync(String resourceGroupName, String cloudServiceName) {
        CloudServicesInner client = this.inner();
        return client.startAsync(resourceGroupName, cloudServiceName).toCompletable();
    }

    @Override
    public Completable powerOffAsync(String resourceGroupName, String cloudServiceName) {
        CloudServicesInner client = this.inner();
        return client.powerOffAsync(resourceGroupName, cloudServiceName).toCompletable();
    }

    @Override
    public Completable restartAsync(String resourceGroupName, String cloudServiceName, List<String> roleInstances) {
        CloudServicesInner client = this.inner();
        return client.restartAsync(resourceGroupName, cloudServiceName, roleInstances).toCompletable();
    }

    @Override
    public Completable reimageAsync(String resourceGroupName, String cloudServiceName, List<String> roleInstances) {
        CloudServicesInner client = this.inner();
        return client.reimageAsync(resourceGroupName, cloudServiceName, roleInstances).toCompletable();
    }

    @Override
    public Completable rebuildAsync(String resourceGroupName, String cloudServiceName, List<String> roleInstances) {
        CloudServicesInner client = this.inner();
        return client.rebuildAsync(resourceGroupName, cloudServiceName, roleInstances).toCompletable();
    }

    @Override
    public Completable deleteInstancesAsync(String resourceGroupName, String cloudServiceName, List<String> roleInstances) {
        CloudServicesInner client = this.inner();
        return client.deleteInstancesAsync(resourceGroupName, cloudServiceName, roleInstances).toCompletable();
    }

    @Override
    protected CloudServiceImpl wrapModel(CloudServiceInner inner) {
        return  new CloudServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected CloudServiceImpl wrapModel(String name) {
        return new CloudServiceImpl(name, new CloudServiceInner(), this.manager());
    }

}
