/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.Datasets;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.DatasetResource;

class DatasetsImpl extends WrapperImpl<DatasetsInner> implements Datasets {
    private final DataFactoryManager manager;

    DatasetsImpl(DataFactoryManager manager) {
        super(manager.inner().datasets());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public DatasetResourceImpl define(String name) {
        return wrapModel(name);
    }

    private DatasetResourceImpl wrapModel(DatasetResourceInner inner) {
        return  new DatasetResourceImpl(inner, manager());
    }

    private DatasetResourceImpl wrapModel(String name) {
        return new DatasetResourceImpl(name, this.manager());
    }

    @Override
    public Observable<DatasetResource> listByFactoryAsync(final String resourceGroupName, final String factoryName) {
        DatasetsInner client = this.inner();
        return client.listByFactoryAsync(resourceGroupName, factoryName)
        .flatMapIterable(new Func1<Page<DatasetResourceInner>, Iterable<DatasetResourceInner>>() {
            @Override
            public Iterable<DatasetResourceInner> call(Page<DatasetResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DatasetResourceInner, DatasetResource>() {
            @Override
            public DatasetResource call(DatasetResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DatasetResource> getAsync(String resourceGroupName, String factoryName, String datasetName) {
        DatasetsInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, datasetName)
        .flatMap(new Func1<DatasetResourceInner, Observable<DatasetResource>>() {
            @Override
            public Observable<DatasetResource> call(DatasetResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DatasetResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String factoryName, String datasetName) {
        DatasetsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, factoryName, datasetName).toCompletable();
    }

}
