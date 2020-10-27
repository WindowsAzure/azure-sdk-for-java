/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.resources.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_05_01.Resources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.resources.v2019_05_01.GenericResourceExpanded;
import com.microsoft.azure.management.resources.v2019_05_01.GenericResource;
import com.microsoft.azure.management.resources.v2019_05_01.ResourcesMoveInfo;

class ResourcesImpl extends WrapperImpl<ResourcesInner> implements Resources {
    private final ResourcesManager manager;

    ResourcesImpl(ResourcesManager manager) {
        super(manager.inner().resources());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    private GenericResourceExpandedImpl wrapModel(GenericResourceExpandedInner inner) {
        return  new GenericResourceExpandedImpl(inner, manager());
    }

    @Override
    public Observable<GenericResourceExpanded> listAsync() {
        ResourcesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<GenericResourceExpandedInner>, Iterable<GenericResourceExpandedInner>>() {
            @Override
            public Iterable<GenericResourceExpandedInner> call(Page<GenericResourceExpandedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GenericResourceExpandedInner, GenericResourceExpanded>() {
            @Override
            public GenericResourceExpanded call(GenericResourceExpandedInner inner) {
                return new GenericResourceExpandedImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Boolean> checkExistenceByIdAsync(String resourceId, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.checkExistenceByIdAsync(resourceId, apiVersion)
    ;}

    @Override
    public Completable deleteByIdAsync(String resourceId, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.deleteByIdAsync(resourceId, apiVersion).toCompletable();
    }

    @Override
    public Observable<GenericResource> createOrUpdateByIdAsync(String resourceId, String apiVersion, GenericResourceInner parameters) {
        ResourcesInner client = this.inner();
        return client.createOrUpdateByIdAsync(resourceId, apiVersion, parameters)
        .map(new Func1<GenericResourceInner, GenericResource>() {
            @Override
            public GenericResource call(GenericResourceInner inner) {
                return new GenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GenericResource> updateByIdAsync(String resourceId, String apiVersion, GenericResourceInner parameters) {
        ResourcesInner client = this.inner();
        return client.updateByIdAsync(resourceId, apiVersion, parameters)
        .map(new Func1<GenericResourceInner, GenericResource>() {
            @Override
            public GenericResource call(GenericResourceInner inner) {
                return new GenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GenericResource> getByIdAsync(String resourceId, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.getByIdAsync(resourceId, apiVersion)
        .map(new Func1<GenericResourceInner, GenericResource>() {
            @Override
            public GenericResource call(GenericResourceInner inner) {
                return new GenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GenericResourceExpanded> listByResourceGroupAsync(final String resourceGroupName) {
        ResourcesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<GenericResourceExpandedInner>, Iterable<GenericResourceExpandedInner>>() {
            @Override
            public Iterable<GenericResourceExpandedInner> call(Page<GenericResourceExpandedInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GenericResourceExpandedInner, GenericResourceExpanded>() {
            @Override
            public GenericResourceExpanded call(GenericResourceExpandedInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Completable moveResourcesAsync(String sourceResourceGroupName, ResourcesMoveInfo parameters) {
        ResourcesInner client = this.inner();
        return client.moveResourcesAsync(sourceResourceGroupName, parameters).toCompletable();
    }

    @Override
    public Completable validateMoveResourcesAsync(String sourceResourceGroupName, ResourcesMoveInfo parameters) {
        ResourcesInner client = this.inner();
        return client.validateMoveResourcesAsync(sourceResourceGroupName, parameters).toCompletable();
    }

    @Override
    public Observable<Boolean> checkExistenceAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.checkExistenceAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion)
    ;}

    @Override
    public Completable deleteAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion).toCompletable();
    }

    @Override
    public Observable<GenericResource> createOrUpdateAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, GenericResourceInner parameters) {
        ResourcesInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion, parameters)
        .map(new Func1<GenericResourceInner, GenericResource>() {
            @Override
            public GenericResource call(GenericResourceInner inner) {
                return new GenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GenericResource> updateAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion, GenericResourceInner parameters) {
        ResourcesInner client = this.inner();
        return client.updateAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion, parameters)
        .map(new Func1<GenericResourceInner, GenericResource>() {
            @Override
            public GenericResource call(GenericResourceInner inner) {
                return new GenericResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GenericResource> getAsync(String resourceGroupName, String resourceProviderNamespace, String parentResourcePath, String resourceType, String resourceName, String apiVersion) {
        ResourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName, apiVersion)
        .map(new Func1<GenericResourceInner, GenericResource>() {
            @Override
            public GenericResource call(GenericResourceInner inner) {
                return new GenericResourceImpl(inner, manager());
            }
        });
    }

}
