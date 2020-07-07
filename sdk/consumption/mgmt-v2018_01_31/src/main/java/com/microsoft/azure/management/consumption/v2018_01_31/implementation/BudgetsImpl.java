/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.consumption.v2018_01_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.consumption.v2018_01_31.Budgets;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.azure.management.consumption.v2018_01_31.Budget;
import com.microsoft.azure.arm.utils.PagedListConverter;

class BudgetsImpl extends WrapperImpl<BudgetsInner> implements Budgets {
    private PagedListConverter<BudgetInner, Budget> converter;
    private final ConsumptionManager manager;

    BudgetsImpl(ConsumptionManager manager) {
        super(manager.inner().budgets());
        this.manager = manager;
        this.converter = new PagedListConverter<BudgetInner, Budget>() {
            @Override
            public Observable<Budget> typeConvertAsync(BudgetInner inner) {
                return Observable.just((Budget) wrapModel(inner));
            }
        };
    }

    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public BudgetImpl define(String name) {
        return wrapModel(name);
    }

    private BudgetImpl wrapModel(BudgetInner inner) {
        return  new BudgetImpl(inner, manager());
    }

    private BudgetImpl wrapModel(String name) {
        return new BudgetImpl(name, this.manager());
    }

    @Override
    public Observable<Budget> getAsync(String budgetName) {
        BudgetsInner client = this.inner();
        return client.getAsync(budgetName)
        .map(new Func1<BudgetInner, Budget>() {
            @Override
            public Budget call(BudgetInner inner) {
                return new BudgetImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Budget> createOrUpdateAsync(String budgetName, BudgetInner parameters) {
        BudgetsInner client = this.inner();
        return client.createOrUpdateAsync(budgetName, parameters)
        .map(new Func1<BudgetInner, Budget>() {
            @Override
            public Budget call(BudgetInner inner) {
                return new BudgetImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String budgetName) {
        BudgetsInner client = this.inner();
        return client.deleteAsync(budgetName).toCompletable();
    }

    @Override
    public PagedList<Budget> list() {
        BudgetsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<Budget> listAsync() {
        BudgetsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<BudgetInner>, Iterable<BudgetInner>>() {
            @Override
            public Iterable<BudgetInner> call(Page<BudgetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BudgetInner, Budget>() {
            @Override
            public Budget call(BudgetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Budget> listByResourceGroup(String resourceGroupName) {
        BudgetsInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Budget> listByResourceGroupAsync(String resourceGroupName) {
        BudgetsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<BudgetInner>, Iterable<BudgetInner>>() {
            @Override
            public Iterable<BudgetInner> call(Page<BudgetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BudgetInner, Budget>() {
            @Override
            public Budget call(BudgetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    private Observable<BudgetInner> getInnerAsync(String resourceGroupName, String name) {
        BudgetsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    public Budget getByResourceGroup(String resourceGroupName, String name) {
        return getByResourceGroupAsync(resourceGroupName, name).toBlocking().last();
    }

    @Override
    public Observable<Budget> getByResourceGroupAsync(String resourceGroupName, String name) {
        return this.getInnerAsync(resourceGroupName, name).flatMap(new Func1<BudgetInner, Observable<Budget>> () {
            @Override
            public Observable<Budget> call(BudgetInner innerT) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Budget)wrapModel(innerT));
                }
            }
        });
    }

    @Override
    public ServiceFuture<Budget> getByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<Budget> callback) {
        return ServiceFuture.fromBody(getByResourceGroupAsync(resourceGroupName, name), callback);
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
            Observable<String> o = RXMapper.map(this.inner().deleteByResourceGroupNameAsync(resourceGroupName, name), id);
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
    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.deleteByResourceGroupAsync(resourceGroupName, name).await();
    }

    @Override
    public Completable deleteByResourceGroupAsync(String resourceGroupName, String name) {
        return this.inner().deleteByResourceGroupNameAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public ServiceFuture<Void> deleteByResourceGroupAsync(String resourceGroupName, String name, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteByResourceGroupAsync(resourceGroupName, name), serviceCallback);
    }

}
