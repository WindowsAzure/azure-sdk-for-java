/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mediaservices.v2018_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2018_07_01.Transforms;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2018_07_01.Transform;

class TransformsImpl extends WrapperImpl<TransformsInner> implements Transforms {
    private final MediaManager manager;

    TransformsImpl(MediaManager manager) {
        super(manager.inner().transforms());
        this.manager = manager;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public TransformImpl define(String name) {
        return wrapModel(name);
    }

    private TransformImpl wrapModel(TransformInner inner) {
        return  new TransformImpl(inner, manager());
    }

    private TransformImpl wrapModel(String name) {
        return new TransformImpl(name, this.manager());
    }

    @Override
    public Observable<Transform> listAsync(final String resourceGroupName, final String accountName) {
        TransformsInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<TransformInner>, Iterable<TransformInner>>() {
            @Override
            public Iterable<TransformInner> call(Page<TransformInner> page) {
                return page.items();
            }
        })
        .map(new Func1<TransformInner, Transform>() {
            @Override
            public Transform call(TransformInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Transform> getAsync(String resourceGroupName, String accountName, String transformName) {
        TransformsInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, transformName)
        .flatMap(new Func1<TransformInner, Observable<Transform>>() {
            @Override
            public Observable<Transform> call(TransformInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Transform)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String transformName) {
        TransformsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, transformName).toCompletable();
    }

}
