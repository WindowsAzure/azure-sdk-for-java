/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.LoadBalancer;
import com.microsoft.azure.management.network.LoadBalancers;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.ListableGroupableResourcesPageImpl;
import rx.Completable;
import rx.Observable;

/**
 *  Implementation for {@link LoadBalancers}.
 */
@LangDefinition
class LoadBalancersImpl
        extends ListableGroupableResourcesPageImpl<
            LoadBalancer,
            LoadBalancerImpl,
            LoadBalancerInner,
            LoadBalancersInner,
            NetworkManager>
        implements LoadBalancers {

    LoadBalancersImpl(final NetworkManager networkManager) {
        super(networkManager.inner().loadBalancers(), networkManager);
    }

    @Override
    public PagedList<LoadBalancer> list() {
        return wrapList(this.inner().listAll());
    }

    @Override
    public PagedList<LoadBalancer> listByGroup(String groupName) {
        return wrapList(this.inner().list(groupName));
    }

    @Override
    public LoadBalancerImpl getByGroup(String groupName, String name) {
        return wrapModel(this.inner().get(groupName, name));
    }

    @Override
    public Completable deleteByGroupAsync(String groupName, String name) {
        return this.inner().deleteAsync(groupName, name).toCompletable();
    }

    @Override
    public LoadBalancerImpl define(String name) {
        return wrapModel(name);
    }

    // Fluent model create helpers

    @Override
    protected LoadBalancerImpl wrapModel(String name) {
        LoadBalancerInner inner = new LoadBalancerInner();
        return new LoadBalancerImpl(
                name,
                inner,
                this.manager());
    }

    @Override
    protected LoadBalancerImpl wrapModel(LoadBalancerInner inner) {
        if (inner == null) {
            return null;
        }
        return new LoadBalancerImpl(
                inner.name(),
                inner,
                this.manager());
    }

    @Override
    protected Observable<Page<LoadBalancerInner>> listAsyncPage() {
        return inner().listAllAsync();
    }

    @Override
    protected Observable<Page<LoadBalancerInner>> listByGroupAsyncPage(String resourceGroupName) {
        return inner().listAsync(resourceGroupName);
    }
}
