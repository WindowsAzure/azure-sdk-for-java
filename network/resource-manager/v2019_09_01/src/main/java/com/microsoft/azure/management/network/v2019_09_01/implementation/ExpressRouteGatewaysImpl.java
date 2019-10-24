/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_09_01.ExpressRouteGateways;
import com.microsoft.azure.management.network.v2019_09_01.ExpressRouteGateway;
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

class ExpressRouteGatewaysImpl extends GroupableResourcesCoreImpl<ExpressRouteGateway, ExpressRouteGatewayImpl, ExpressRouteGatewayInner, ExpressRouteGatewaysInner, NetworkManager>  implements ExpressRouteGateways {
    protected ExpressRouteGatewaysImpl(NetworkManager manager) {
        super(manager.inner().expressRouteGateways(), manager);
    }

    @Override
    protected Observable<ExpressRouteGatewayInner> getInnerAsync(String resourceGroupName, String name) {
        ExpressRouteGatewaysInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ExpressRouteGatewaysInner client = this.inner();
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
    public PagedList<ExpressRouteGateway> listByResourceGroup(String resourceGroupName) {
        ExpressRouteGatewaysInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ExpressRouteGateway> listByResourceGroupAsync(String resourceGroupName) {
        ExpressRouteGatewaysInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<ExpressRouteGatewayInner>, Observable<ExpressRouteGatewayInner>>() {
            @Override
            public Observable<ExpressRouteGatewayInner> call(Page<ExpressRouteGatewayInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<ExpressRouteGatewayInner, ExpressRouteGateway>() {
            @Override
            public ExpressRouteGateway call(ExpressRouteGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ExpressRouteGateway> list() {
        ExpressRouteGatewaysInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ExpressRouteGateway> listAsync() {
        ExpressRouteGatewaysInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<ExpressRouteGatewayInner>, Observable<ExpressRouteGatewayInner>>() {
            @Override
            public Observable<ExpressRouteGatewayInner> call(Page<ExpressRouteGatewayInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<ExpressRouteGatewayInner, ExpressRouteGateway>() {
            @Override
            public ExpressRouteGateway call(ExpressRouteGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ExpressRouteGatewayImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ExpressRouteGatewayImpl wrapModel(ExpressRouteGatewayInner inner) {
        return  new ExpressRouteGatewayImpl(inner.name(), inner, manager());
    }

    @Override
    protected ExpressRouteGatewayImpl wrapModel(String name) {
        return new ExpressRouteGatewayImpl(name, new ExpressRouteGatewayInner(), this.manager());
    }

}
