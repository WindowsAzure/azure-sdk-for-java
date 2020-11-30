/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.ResourceHealthMetadatas;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appservice.v2019_08_01.ResourceHealthMetadata;

class ResourceHealthMetadatasImpl extends WrapperImpl<ResourceHealthMetadatasInner> implements ResourceHealthMetadatas {
    private final AppServiceManager manager;

    ResourceHealthMetadatasImpl(AppServiceManager manager) {
        super(manager.inner().resourceHealthMetadatas());
        this.manager = manager;
    }

    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ResourceHealthMetadata> listBySiteAsync(final String resourceGroupName, final String name) {
        ResourceHealthMetadatasInner client = this.inner();
        return client.listBySiteAsync(resourceGroupName, name)
        .flatMapIterable(new Func1<Page<ResourceHealthMetadataInner>, Iterable<ResourceHealthMetadataInner>>() {
            @Override
            public Iterable<ResourceHealthMetadataInner> call(Page<ResourceHealthMetadataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceHealthMetadataInner, ResourceHealthMetadata>() {
            @Override
            public ResourceHealthMetadata call(ResourceHealthMetadataInner inner) {
                return new ResourceHealthMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceHealthMetadata> getBySiteAsync(String resourceGroupName, String name) {
        ResourceHealthMetadatasInner client = this.inner();
        return client.getBySiteAsync(resourceGroupName, name)
        .map(new Func1<ResourceHealthMetadataInner, ResourceHealthMetadata>() {
            @Override
            public ResourceHealthMetadata call(ResourceHealthMetadataInner inner) {
                return new ResourceHealthMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceHealthMetadata> listAsync() {
        ResourceHealthMetadatasInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ResourceHealthMetadataInner>, Iterable<ResourceHealthMetadataInner>>() {
            @Override
            public Iterable<ResourceHealthMetadataInner> call(Page<ResourceHealthMetadataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceHealthMetadataInner, ResourceHealthMetadata>() {
            @Override
            public ResourceHealthMetadata call(ResourceHealthMetadataInner inner) {
                return new ResourceHealthMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceHealthMetadata> listByResourceGroupAsync(final String resourceGroupName) {
        ResourceHealthMetadatasInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ResourceHealthMetadataInner>, Iterable<ResourceHealthMetadataInner>>() {
            @Override
            public Iterable<ResourceHealthMetadataInner> call(Page<ResourceHealthMetadataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceHealthMetadataInner, ResourceHealthMetadata>() {
            @Override
            public ResourceHealthMetadata call(ResourceHealthMetadataInner inner) {
                return new ResourceHealthMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceHealthMetadata> listBySiteSlotAsync(final String resourceGroupName, final String name, final String slot) {
        ResourceHealthMetadatasInner client = this.inner();
        return client.listBySiteSlotAsync(resourceGroupName, name, slot)
        .flatMapIterable(new Func1<Page<ResourceHealthMetadataInner>, Iterable<ResourceHealthMetadataInner>>() {
            @Override
            public Iterable<ResourceHealthMetadataInner> call(Page<ResourceHealthMetadataInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ResourceHealthMetadataInner, ResourceHealthMetadata>() {
            @Override
            public ResourceHealthMetadata call(ResourceHealthMetadataInner inner) {
                return new ResourceHealthMetadataImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ResourceHealthMetadata> getBySiteSlotAsync(String resourceGroupName, String name, String slot) {
        ResourceHealthMetadatasInner client = this.inner();
        return client.getBySiteSlotAsync(resourceGroupName, name, slot)
        .map(new Func1<ResourceHealthMetadataInner, ResourceHealthMetadata>() {
            @Override
            public ResourceHealthMetadata call(ResourceHealthMetadataInner inner) {
                return new ResourceHealthMetadataImpl(inner, manager());
            }
        });
    }

}
