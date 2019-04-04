/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.datamigration.v2018_03_31_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.datamigration.v2018_03_31_preview.Services;
import com.microsoft.azure.management.datamigration.v2018_03_31_preview.DataMigrationService;
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
import com.microsoft.azure.management.datamigration.v2018_03_31_preview.DataMigrationServiceStatusResponse;
import com.microsoft.azure.management.datamigration.v2018_03_31_preview.NameAvailabilityResponse;
import com.microsoft.azure.management.datamigration.v2018_03_31_preview.NameAvailabilityRequest;
import com.microsoft.azure.management.datamigration.v2018_03_31_preview.AvailableServiceSku;

class ServicesImpl extends GroupableResourcesCoreImpl<DataMigrationService, DataMigrationServiceImpl, DataMigrationServiceInner, ServicesInner, DataMigrationManager>  implements Services {
    protected ServicesImpl(DataMigrationManager manager) {
        super(manager.inner().services(), manager);
    }

    @Override
    protected Observable<DataMigrationServiceInner> getInnerAsync(String resourceGroupName, String name) {
        ServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ServicesInner client = this.inner();
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
    public PagedList<DataMigrationService> listByResourceGroup(String resourceGroupName) {
        ServicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<DataMigrationService> listByResourceGroupAsync(String resourceGroupName) {
        ServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<DataMigrationServiceInner>, Iterable<DataMigrationServiceInner>>() {
            @Override
            public Iterable<DataMigrationServiceInner> call(Page<DataMigrationServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DataMigrationServiceInner, DataMigrationService>() {
            @Override
            public DataMigrationService call(DataMigrationServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<DataMigrationService> list() {
        ServicesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<DataMigrationService> listAsync() {
        ServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DataMigrationServiceInner>, Iterable<DataMigrationServiceInner>>() {
            @Override
            public Iterable<DataMigrationServiceInner> call(Page<DataMigrationServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DataMigrationServiceInner, DataMigrationService>() {
            @Override
            public DataMigrationService call(DataMigrationServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public DataMigrationServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Observable<DataMigrationServiceStatusResponse> checkStatusAsync(String groupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.checkStatusAsync(groupName, serviceName)
        .map(new Func1<DataMigrationServiceStatusResponseInner, DataMigrationServiceStatusResponse>() {
            @Override
            public DataMigrationServiceStatusResponse call(DataMigrationServiceStatusResponseInner inner) {
                return new DataMigrationServiceStatusResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable startAsync(String groupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.startAsync(groupName, serviceName).toCompletable();
    }

    @Override
    public Completable stopAsync(String groupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.stopAsync(groupName, serviceName).toCompletable();
    }

    @Override
    public Observable<NameAvailabilityResponse> checkChildrenNameAvailabilityAsync(String groupName, String serviceName, NameAvailabilityRequest parameters) {
        ServicesInner client = this.inner();
        return client.checkChildrenNameAvailabilityAsync(groupName, serviceName, parameters)
        .map(new Func1<NameAvailabilityResponseInner, NameAvailabilityResponse>() {
            @Override
            public NameAvailabilityResponse call(NameAvailabilityResponseInner inner) {
                return new NameAvailabilityResponseImpl(inner, manager());
            }
        });
    }

    @Override
    protected DataMigrationServiceImpl wrapModel(DataMigrationServiceInner inner) {
        return  new DataMigrationServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected DataMigrationServiceImpl wrapModel(String name) {
        return new DataMigrationServiceImpl(name, new DataMigrationServiceInner(), this.manager());
    }

    private AvailableServiceSkuImpl wrapAvailableServiceSkuModel(AvailableServiceSkuInner inner) {
        return  new AvailableServiceSkuImpl(inner, manager());
    }

    @Override
    public Observable<AvailableServiceSku> listSkusAsync(final String groupName, final String serviceName) {
        ServicesInner client = this.inner();
        return client.listSkusAsync(groupName, serviceName)
        .flatMapIterable(new Func1<Page<AvailableServiceSkuInner>, Iterable<AvailableServiceSkuInner>>() {
            @Override
            public Iterable<AvailableServiceSkuInner> call(Page<AvailableServiceSkuInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AvailableServiceSkuInner, AvailableServiceSku>() {
            @Override
            public AvailableServiceSku call(AvailableServiceSkuInner inner) {
                return wrapAvailableServiceSkuModel(inner);
            }
        });
    }

    @Override
    public Observable<NameAvailabilityResponse> checkNameAvailabilityAsync(String location, NameAvailabilityRequest parameters) {
        ServicesInner client = this.inner();
        return client.checkNameAvailabilityAsync(location, parameters)
        .map(new Func1<NameAvailabilityResponseInner, NameAvailabilityResponse>() {
            @Override
            public NameAvailabilityResponse call(NameAvailabilityResponseInner inner) {
                return new NameAvailabilityResponseImpl(inner, manager());
            }
        });
    }

}
