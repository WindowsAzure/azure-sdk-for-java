/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2018_08_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2018_08_01.ServiceEndpointPolicies;
import com.microsoft.azure.management.network.v2018_08_01.ServiceEndpointPolicy;
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

class ServiceEndpointPoliciesImpl extends GroupableResourcesCoreImpl<ServiceEndpointPolicy, ServiceEndpointPolicyImpl, ServiceEndpointPolicyInner, ServiceEndpointPoliciesInner, NetworkManager>  implements ServiceEndpointPolicies {
    protected ServiceEndpointPoliciesImpl(NetworkManager manager) {
        super(manager.inner().serviceEndpointPolicies(), manager);
    }

    @Override
    protected Observable<ServiceEndpointPolicyInner> getInnerAsync(String resourceGroupName, String name) {
        ServiceEndpointPoliciesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ServiceEndpointPoliciesInner client = this.inner();
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
    public PagedList<ServiceEndpointPolicy> listByResourceGroup(String resourceGroupName) {
        ServiceEndpointPoliciesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ServiceEndpointPolicy> listByResourceGroupAsync(String resourceGroupName) {
        ServiceEndpointPoliciesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ServiceEndpointPolicyInner>, Iterable<ServiceEndpointPolicyInner>>() {
            @Override
            public Iterable<ServiceEndpointPolicyInner> call(Page<ServiceEndpointPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServiceEndpointPolicyInner, ServiceEndpointPolicy>() {
            @Override
            public ServiceEndpointPolicy call(ServiceEndpointPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ServiceEndpointPolicy> list() {
        ServiceEndpointPoliciesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ServiceEndpointPolicy> listAsync() {
        ServiceEndpointPoliciesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ServiceEndpointPolicyInner>, Iterable<ServiceEndpointPolicyInner>>() {
            @Override
            public Iterable<ServiceEndpointPolicyInner> call(Page<ServiceEndpointPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServiceEndpointPolicyInner, ServiceEndpointPolicy>() {
            @Override
            public ServiceEndpointPolicy call(ServiceEndpointPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ServiceEndpointPolicyImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ServiceEndpointPolicyImpl wrapModel(ServiceEndpointPolicyInner inner) {
        return  new ServiceEndpointPolicyImpl(inner.name(), inner, manager());
    }

    @Override
    protected ServiceEndpointPolicyImpl wrapModel(String name) {
        return new ServiceEndpointPolicyImpl(name, new ServiceEndpointPolicyInner(), this.manager());
    }

}
