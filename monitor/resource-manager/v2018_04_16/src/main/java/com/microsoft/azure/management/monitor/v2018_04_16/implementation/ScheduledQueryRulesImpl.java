/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.monitor.v2018_04_16.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.monitor.v2018_04_16.ScheduledQueryRules;
import com.microsoft.azure.management.monitor.v2018_04_16.LogSearchRuleResource;
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

class ScheduledQueryRulesImpl extends GroupableResourcesCoreImpl<LogSearchRuleResource, LogSearchRuleResourceImpl, LogSearchRuleResourceInner, ScheduledQueryRulesInner, MonitorManager>  implements ScheduledQueryRules {
    protected ScheduledQueryRulesImpl(MonitorManager manager) {
        super(manager.inner().scheduledQueryRules(), manager);
    }

    @Override
    protected Observable<LogSearchRuleResourceInner> getInnerAsync(String resourceGroupName, String name) {
        ScheduledQueryRulesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ScheduledQueryRulesInner client = this.inner();
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
    public PagedList<LogSearchRuleResource> listByResourceGroup(String resourceGroupName) {
        ScheduledQueryRulesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<LogSearchRuleResource> listByResourceGroupAsync(String resourceGroupName) {
        ScheduledQueryRulesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<LogSearchRuleResourceInner>, Observable<LogSearchRuleResourceInner>>() {
            @Override
            public Observable<LogSearchRuleResourceInner> call(Page<LogSearchRuleResourceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<LogSearchRuleResourceInner, LogSearchRuleResource>() {
            @Override
            public LogSearchRuleResource call(LogSearchRuleResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<LogSearchRuleResource> list() {
        ScheduledQueryRulesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<LogSearchRuleResource> listAsync() {
        ScheduledQueryRulesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<LogSearchRuleResourceInner>, Observable<LogSearchRuleResourceInner>>() {
            @Override
            public Observable<LogSearchRuleResourceInner> call(Page<LogSearchRuleResourceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<LogSearchRuleResourceInner, LogSearchRuleResource>() {
            @Override
            public LogSearchRuleResource call(LogSearchRuleResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public LogSearchRuleResourceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected LogSearchRuleResourceImpl wrapModel(LogSearchRuleResourceInner inner) {
        return  new LogSearchRuleResourceImpl(inner.name(), inner, manager());
    }

    @Override
    protected LogSearchRuleResourceImpl wrapModel(String name) {
        return new LogSearchRuleResourceImpl(name, new LogSearchRuleResourceInner(), this.manager());
    }

}
