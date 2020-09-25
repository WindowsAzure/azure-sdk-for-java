/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2019_08_01_preview.BlobServices;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_08_01_preview.BlobServiceProperties;

class BlobServicesImpl extends WrapperImpl<BlobServicesInner> implements BlobServices {
    private final StorageManager manager;

    BlobServicesImpl(StorageManager manager) {
        super(manager.inner().blobServices());
        this.manager = manager;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public BlobServicePropertiesImpl define(String name) {
        return wrapModel(name);
    }

    private BlobServicePropertiesImpl wrapModel(BlobServicePropertiesInner inner) {
        return  new BlobServicePropertiesImpl(inner, manager());
    }

    private BlobServicePropertiesImpl wrapModel(String name) {
        return new BlobServicePropertiesImpl(name, this.manager());
    }

    @Override
    public Observable<BlobServiceProperties> listAsync(String resourceGroupName, String accountName) {
        BlobServicesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMap(new Func1<List<BlobServicePropertiesInner>, Observable<BlobServicePropertiesInner>>() {
            @Override
            public Observable<BlobServicePropertiesInner> call(List<BlobServicePropertiesInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<BlobServicePropertiesInner, BlobServiceProperties>() {
            @Override
            public BlobServiceProperties call(BlobServicePropertiesInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<BlobServiceProperties> getServicePropertiesAsync(String resourceGroupName, String accountName) {
        BlobServicesInner client = this.inner();
        return client.getServicePropertiesAsync(resourceGroupName, accountName)
        .flatMap(new Func1<BlobServicePropertiesInner, Observable<BlobServiceProperties>>() {
            @Override
            public Observable<BlobServiceProperties> call(BlobServicePropertiesInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((BlobServiceProperties)wrapModel(inner));
                }
            }
       });
    }

}
