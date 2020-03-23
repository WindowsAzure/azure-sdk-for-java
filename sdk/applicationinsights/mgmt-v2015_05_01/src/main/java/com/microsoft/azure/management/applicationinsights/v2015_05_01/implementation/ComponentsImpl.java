/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.Components;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponent;
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
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentPurgeResponse;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentPurgeBody;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentPurgeStatusResponse;

class ComponentsImpl extends GroupableResourcesCoreImpl<ApplicationInsightsComponent, ApplicationInsightsComponentImpl, ApplicationInsightsComponentInner, ComponentsInner, InsightsManager>  implements Components {
    protected ComponentsImpl(InsightsManager manager) {
        super(manager.inner().components(), manager);
    }

    @Override
    protected Observable<ApplicationInsightsComponentInner> getInnerAsync(String resourceGroupName, String name) {
        ComponentsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ComponentsInner client = this.inner();
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
    public PagedList<ApplicationInsightsComponent> listByResourceGroup(String resourceGroupName) {
        ComponentsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ApplicationInsightsComponent> listByResourceGroupAsync(String resourceGroupName) {
        ComponentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ApplicationInsightsComponentInner>, Iterable<ApplicationInsightsComponentInner>>() {
            @Override
            public Iterable<ApplicationInsightsComponentInner> call(Page<ApplicationInsightsComponentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationInsightsComponentInner, ApplicationInsightsComponent>() {
            @Override
            public ApplicationInsightsComponent call(ApplicationInsightsComponentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ApplicationInsightsComponent> list() {
        ComponentsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ApplicationInsightsComponent> listAsync() {
        ComponentsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ApplicationInsightsComponentInner>, Iterable<ApplicationInsightsComponentInner>>() {
            @Override
            public Iterable<ApplicationInsightsComponentInner> call(Page<ApplicationInsightsComponentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ApplicationInsightsComponentInner, ApplicationInsightsComponent>() {
            @Override
            public ApplicationInsightsComponent call(ApplicationInsightsComponentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ApplicationInsightsComponentImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<ComponentPurgeResponse> purgeAsync(String resourceGroupName, String resourceName, ComponentPurgeBody body) {
        ComponentsInner client = this.inner();
        return client.purgeAsync(resourceGroupName, resourceName, body)
        .map(new Func1<ComponentPurgeResponseInner, ComponentPurgeResponse>() {
            @Override
            public ComponentPurgeResponse call(ComponentPurgeResponseInner inner) {
                return new ComponentPurgeResponseImpl(inner, manager());
            }
        });
    }

    @Override
    protected ApplicationInsightsComponentImpl wrapModel(ApplicationInsightsComponentInner inner) {
        return  new ApplicationInsightsComponentImpl(inner.name(), inner, manager());
    }

    @Override
    protected ApplicationInsightsComponentImpl wrapModel(String name) {
        return new ApplicationInsightsComponentImpl(name, new ApplicationInsightsComponentInner(), this.manager());
    }

    private ComponentPurgeStatusResponseImpl wrapComponentPurgeStatusResponseModel(ComponentPurgeStatusResponseInner inner) {
        return  new ComponentPurgeStatusResponseImpl(inner, manager());
    }

    private Observable<ComponentPurgeStatusResponseInner> getComponentPurgeStatusResponseInnerUsingComponentsInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String resourceName = IdParsingUtils.getValueFromIdByName(id, "components");
        String purgeId = IdParsingUtils.getValueFromIdByName(id, "operations");
        ComponentsInner client = this.inner();
        return client.getPurgeStatusAsync(resourceGroupName, resourceName, purgeId);
    }

    @Override
    public Observable<ComponentPurgeStatusResponse> getPurgeStatusAsync(String resourceGroupName, String resourceName, String purgeId) {
        ComponentsInner client = this.inner();
        return client.getPurgeStatusAsync(resourceGroupName, resourceName, purgeId)
        .flatMap(new Func1<ComponentPurgeStatusResponseInner, Observable<ComponentPurgeStatusResponse>>() {
            @Override
            public Observable<ComponentPurgeStatusResponse> call(ComponentPurgeStatusResponseInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ComponentPurgeStatusResponse)wrapComponentPurgeStatusResponseModel(inner));
                }
            }
       });
    }

}
