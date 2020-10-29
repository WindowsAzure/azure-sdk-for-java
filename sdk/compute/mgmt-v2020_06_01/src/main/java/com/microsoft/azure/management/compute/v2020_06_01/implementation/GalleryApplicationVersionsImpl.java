/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2020_06_01.GalleryApplicationVersions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2020_06_01.GalleryApplicationVersion;

class GalleryApplicationVersionsImpl extends WrapperImpl<GalleryApplicationVersionsInner> implements GalleryApplicationVersions {
    private final ComputeManager manager;

    GalleryApplicationVersionsImpl(ComputeManager manager) {
        super(manager.inner().galleryApplicationVersions());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public GalleryApplicationVersionImpl define(String name) {
        return wrapModel(name);
    }

    private GalleryApplicationVersionImpl wrapModel(GalleryApplicationVersionInner inner) {
        return  new GalleryApplicationVersionImpl(inner, manager());
    }

    private GalleryApplicationVersionImpl wrapModel(String name) {
        return new GalleryApplicationVersionImpl(name, this.manager());
    }

    @Override
    public Observable<GalleryApplicationVersion> listByGalleryApplicationAsync(final String resourceGroupName, final String galleryName, final String galleryApplicationName) {
        GalleryApplicationVersionsInner client = this.inner();
        return client.listByGalleryApplicationAsync(resourceGroupName, galleryName, galleryApplicationName)
        .flatMapIterable(new Func1<Page<GalleryApplicationVersionInner>, Iterable<GalleryApplicationVersionInner>>() {
            @Override
            public Iterable<GalleryApplicationVersionInner> call(Page<GalleryApplicationVersionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GalleryApplicationVersionInner, GalleryApplicationVersion>() {
            @Override
            public GalleryApplicationVersion call(GalleryApplicationVersionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<GalleryApplicationVersion> getAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        GalleryApplicationVersionsInner client = this.inner();
        return client.getAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName)
        .flatMap(new Func1<GalleryApplicationVersionInner, Observable<GalleryApplicationVersion>>() {
            @Override
            public Observable<GalleryApplicationVersion> call(GalleryApplicationVersionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((GalleryApplicationVersion)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String galleryName, String galleryApplicationName, String galleryApplicationVersionName) {
        GalleryApplicationVersionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, galleryName, galleryApplicationName, galleryApplicationVersionName).toCompletable();
    }

}
